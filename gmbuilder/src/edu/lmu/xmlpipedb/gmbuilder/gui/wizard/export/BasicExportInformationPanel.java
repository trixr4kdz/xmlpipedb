/********************************************************
 * Filename: ExportPanel1.java
 * Author: Joey J. Barrett
 * Program: gmBuilder
 * Description: The first panel displayed in the export
 * wizard.
 *     
 * Revision History:
 * 20060620: Initial Revision.
 * *****************************************************/

package edu.lmu.xmlpipedb.gmbuilder.gui.wizard.export;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.lmu.xmlpipedb.gmbuilder.GenMAPPBuilder;
import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.ExportToGenMAPP;
import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.profiles.DatabaseProfile;
import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.profiles.SpeciesProfile;
import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.profiles.UniProtSpeciesProfile;
import edu.lmu.xmlpipedb.gmbuilder.gui.util.SpringUtilities;

import shag.App;
import shag.LayoutConstants;

/**
 * @author Joey J. Barrett Class: ExportPanel1
 */
public class BasicExportInformationPanel extends JPanel {

    private static final long serialVersionUID = -4815677619866768960L;
    private JComboBox profileComboBox;
    private JTextArea profileDescriptionTextArea;
    private JTextField ownerTextField;
    private JFormattedTextField versionFormattedTextField;
    private JTextField modSystemTextField;
    private JList speciesCheckList;
    private JTextArea speciesDescriptionTextArea;
    private JTextField speciesCustomizeTextField;
    private JFormattedTextField modifyFormattedTextField;
    private JTextArea notesTextArea;

    // RB - Do we want to add logging here?
    // Dondi - Logging is never a bad idea  :)
    private static final Log _Log = LogFactory.getLog(BasicExportInformationPanel.class);

    /**
     * Getter for "descriptor" access.
     */
    protected JTextField getOwnerTextField() {
        return ownerTextField;
    }
    
    /**
     * Getter for "descriptor" access.
     */
    protected JList getSpeciesCheckList() {
        return speciesCheckList;
    }

    /**
     * Constructor.
     */
    protected BasicExportInformationPanel() {
        super();

        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.add(new JLabel("<html><h3>&nbsp;Export to GenMAPP: Basic Information</h3></html>"),
                BorderLayout.CENTER);
        titlePanel.add(new JSeparator(), BorderLayout.SOUTH);

        // This initializes all the fields and puts them in a panel for display
        JPanel contentPanel = getContentPanel(); // method from below
        contentPanel.setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));

        setLayout(new BorderLayout());
        add(titlePanel, BorderLayout.NORTH);
        add(contentPanel, BorderLayout.WEST);

        init();
    }

    /**
     * Init is called from constructor. Does basic pre-setup work.
     * That is: it calls the <i>STATIC</i> ExportToGenMAPP.getAvailableDatabaseProfiles()
     * to add all available DbProfiles to the comboBox. One of these DbProfiles
     * (normally there is only one, I think --JN) will become the basis for 
     * all the export work about to be done.
     */
    // RB - Initialization method to populate Database ComboBox with all 
    // available database profiles of which there is only one - UniProt
    private void init() {
        profileComboBox.removeAllItems();
        for (DatabaseProfile profile: ExportToGenMAPP.getAvailableDatabaseProfiles()) {
            profileComboBox.addItem(profile);
        }
    }

    /**
     * Sets up the content of the panel.
     * 
     * @return
     */
    private JPanel getContentPanel() {
        // Profile | JComboBox | availableDatabaseProfiles | JLabel |
        // Description
        profileComboBox = new JComboBox();
        profileComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                databaseProfileSelected(profileComboBox.getSelectedItem());
            }
        });

        profileDescriptionTextArea = new JTextArea(3, 15);
        profileDescriptionTextArea.setLineWrap(true);
        profileDescriptionTextArea.setWrapStyleWord(true);
        profileDescriptionTextArea.setEditable(false);
        profileDescriptionTextArea.setBackground(new Color(238, 238, 238));

        // Owner | JTextField | empty
        JLabel ownerLabel = new JLabel("Owner:");
        ownerTextField = new JTextField(10);
        String ownerToolTipText = "Enter the name of the person or group building this Gene Database.";
        ownerLabel.setToolTipText(ownerToolTipText);
        ownerTextField.setToolTipText(ownerToolTipText);

        // Version | Calendar | set to today
        versionFormattedTextField = new JFormattedTextField(new SimpleDateFormat("MM/dd/yyyy"));
        versionFormattedTextField.setText(new SimpleDateFormat("MM/dd/yyyy").format(new Date()));

        // MODSystem | JTextfield | set to database profile
        modSystemTextField = new JTextField(10);
        modSystemTextField.setEditable(false);

        // Species Selection | JList | availableSpeciesProfiles | JLabel |
        // Description
        SpeciesListModel speciesListModel = new SpeciesListModel();
        speciesCheckList = new JList(speciesListModel);
        speciesCheckList.setVisibleRowCount(5); // Dondi - This guides the scroll
        // pane and layout manager.

        // register listeners
        speciesCheckList.addListSelectionListener (new ListSelectionListener() {
            // Handle list selection
        	public void valueChanged(ListSelectionEvent listSelectionEvent) {
        	    handleSpeciesProfileSelection(listSelectionEvent);
            }
        });

        speciesDescriptionTextArea = new JTextArea(3, 15);
        speciesDescriptionTextArea.setLineWrap(true);
        speciesDescriptionTextArea.setWrapStyleWord(true);
        speciesDescriptionTextArea.setEditable(true); // RB - true to discover size on panel
        speciesDescriptionTextArea.setBackground(new Color(238, 238, 238));
        Font textAreaDefaultFont = speciesDescriptionTextArea.getFont();
        speciesDescriptionTextArea.setFont(new Font(textAreaDefaultFont.getName(),
                textAreaDefaultFont.getStyle(), textAreaDefaultFont.getSize() * 8 / 10));

        speciesCustomizeTextField = new JTextField(10);

        // Modify | Calendar | set to today
        modifyFormattedTextField = new JFormattedTextField(new SimpleDateFormat("MM/dd/yyyy"));
        modifyFormattedTextField.setText(new SimpleDateFormat("MM/dd/yyyy").format(new Date()));

        // Notes | JTextArea | GenMAPP Builder version
        notesTextArea = new JTextArea("Exported by " + App.get().getAppName() + " " + GenMAPPBuilder.VERSION, 2, 40);
        notesTextArea.setBorder(new EtchedBorder());

        // Dondi - Useful link for figuring out how SpringLayout works:
        //    http://download.oracle.com/javase/tutorial/uiswing/layout/spring.html
        //
        // (cosmetic note: since the list occupies more than one line, you'll want to
        //  find a way to top-align its corresponding "Species:" label)
        JPanel leftPanel = new JPanel(new SpringLayout());
        leftPanel.add(new JLabel("Profile:"));
        leftPanel.add(profileComboBox);
        leftPanel.add(ownerLabel);
        leftPanel.add(ownerTextField);
        leftPanel.add(new JLabel("Version (MM/dd/yyyy):"));
        leftPanel.add(versionFormattedTextField);
        leftPanel.add(new JLabel("MODSystem:"));
        leftPanel.add(modSystemTextField);
        JLabel speciesLabel = new JLabel("Species:");
        speciesLabel.setVerticalAlignment(JLabel.TOP);
        leftPanel.add(speciesLabel);
        leftPanel.add(new JScrollPane(speciesCheckList));
//        leftPanel.add(new JLabel("Customize Name:"));
//        leftPanel.add(speciesCustomizeTextField);
        leftPanel.add(new JLabel("Modify (MM/dd/yyyy):"));
        leftPanel.add(modifyFormattedTextField);

        SpringUtilities.makeCompactGrid(leftPanel,
                leftPanel.getComponentCount() / 2, 2, // rows, cols
                6, 6, // initX, initY
                6, 6); // xPad, yPad

        JPanel rightPanel = new JPanel(new GridLayout(0, 1));
        rightPanel.add(profileDescriptionTextArea);
        rightPanel.add(speciesDescriptionTextArea);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets.left = LayoutConstants.SPACE;
        gbc.insets.top = LayoutConstants.SPACE * 2;
        bottomPanel.add(new JLabel("Notes:"), gbc);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        bottomPanel.add(notesTextArea, gbc);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(leftPanel, BorderLayout.WEST);
        contentPanel.add(rightPanel, BorderLayout.EAST);
        contentPanel.add(bottomPanel, BorderLayout.SOUTH);

        return contentPanel;
    }

    /**
     * Adjusts the dynamic content of speciesCheckBox when a database profile is selected.
     * 
     * @param selectedItem
     */
    protected void databaseProfileSelected(Object selectedItem) {
        if (selectedItem instanceof DatabaseProfile) {
            DatabaseProfile selectedProfile = (DatabaseProfile)selectedItem;
            ExportToGenMAPP.setDatabaseProfile(selectedProfile);
            profileDescriptionTextArea.setText(selectedProfile.getDescription());
            modSystemTextField.setText(selectedProfile.getMODSystem());

            // Dondi - Note how, with the list model properly coded, all of the above becomes
            // this single [nested] statement.
            SpeciesProfile[] speciesProfiles = selectedProfile.getSpeciesProfilesFound();
            Arrays.sort(speciesProfiles);
            ((SpeciesListModel)speciesCheckList.getModel())
                .setSpeciesProfiles(speciesProfiles);
        }
    }

    /**
     * Adjusts the dynamic content when species profiles are selected.
     * Since only UniProt is supported, this selection will always be UniProt.
     * However, the multi-selection of species profiles are set and passed here. 
     * 
     * @param selectedItem
     */
    
    // Dondi - You might not have remembered that one of the things you needed
    // to do with this method was to change the parameters.  The prior version 
    // took the selected item, which, in our case, no longer applies.  Instead, 
    // I'm sending in the entire event. This change also merited a renaming of 
    // the method.
    // RB - Yes I forgot about this. Was hung up on my other problems and 
    // neglected to come back to this altogether. =/

    protected void handleSpeciesProfileSelection(ListSelectionEvent listSelectionEvent) {

        JList list = (JList)listSelectionEvent.getSource();
        StringBuilder speciesTextBuilder = new StringBuilder(list.getSelectedValues().length > 0 ?
                "Info for selected species: " : "(no species selected)");
		List<SpeciesProfile> selectedSpecies = new ArrayList<SpeciesProfile>();
        for (Object selection: list.getSelectedValues()) {

            // A direct class comparison is required here (as opposed to instanceof)
        	// because we are looking specifically for instances of UniProtSpeciesProfile, 
        	// and not any of its subclasses.
            
        	speciesTextBuilder.append("\n")
        	    .append(selection)
        	    .append((selection.getClass() == UniProtSpeciesProfile.class) ?
                    ", generic profile." : ", custom profile.");
        	selectedSpecies.add((SpeciesProfile)selection);
		}

		speciesDescriptionTextArea.setText(speciesTextBuilder.toString());

		_Log.debug(selectedSpecies);
		
        DatabaseProfile databaseProfile = ExportToGenMAPP.getDatabaseProfile();

     // RB - keep this field since tables are populated with this info. 
     // Need to determine how each species should be placed in the tables, 
     // then adjust to populate the selected species.
     // This field MUST be populated or ALL IDs will be pruned regardless of which
     // species are selected in the list. 
     		
     		StringBuilder speciesStringBuilder = new StringBuilder();
             boolean firstSpecies = true;
             for (SpeciesProfile speciesProfile: selectedSpecies) {
                 speciesStringBuilder
                     .append(firstSpecies ? "" : "|")
                     .append(speciesProfile.getSpeciesName());
                 firstSpecies = false;
             }
             speciesCustomizeTextField.setText(speciesStringBuilder.toString());
     		// speciesCustomizeTextField.setText(selectedSpecies.get(0).getName());
        
        
        
// RB - Created setSelectedSpeciesProfiles method to process
// species profiles as SpeciesProfile Collections.
        
        if (!selectedSpecies.isEmpty()) {
            databaseProfile.setSelectedSpeciesProfile(selectedSpecies.get(0));
            databaseProfile.setSelectedSpeciesProfiles(selectedSpecies);
            
            // RB - converts List<SpeciesProfile> to List<Integer> and setTaxonIds.
            databaseProfile.setTaxonIds(DatabaseProfile.taxonsFromSelectedSpeciesList(selectedSpecies));
        }

        ExportToGenMAPP.setDatabaseProfile(databaseProfile);
    }


    /**
     * Checks the required fields for the panel.
     * 
     * @return
     */
    protected boolean isAllInformationEntered() {
        return !"".equals(ownerTextField.getText()) &&             // Owner field cannot be blank.
                (speciesCheckList.getSelectedValues().length > 0); // At least one species selected.
    }

    /**
     * Submits all information collected on the panel to the DatabaseProfile
     * object of the Database that was selected (Uniprot, TIGR, or whatever),
     * then stores this DatabaseProfile back in the ExportToGenMAPP object. 
     * 
     * @throws ParseException
     */
    //FIXME: All this config data should be in an ExportProperties model object
    protected void submitInformationEntered() throws ParseException {
    	/*
    	 * ExportToGenMAPP is not a static class but has some static members and
    	 * static methods. This is used to store the DatabaseProfile without
    	 * passing an instance of the class around.
    	 */
    	// get a reference to the DBProfile
        DatabaseProfile databaseProfile = ExportToGenMAPP.getDatabaseProfile();
        databaseProfile.setOwner(ownerTextField.getText());
        databaseProfile.setVersion(new SimpleDateFormat("MM/dd/yyyy").parse(versionFormattedTextField.getText()));
        databaseProfile.setMODSystem(modSystemTextField.getText());
        // set the species name
        
        // RB - not sure if setSpeciesName needs to be modified??
        // Dondi - This may be the cause of the "extra name" problem in getInfoTableManager.
        //     Calling database.setSpeciesName actually passes that string to the *single*
        //     selected species profile.  Later on, in getInfoTableManager, this is the string
        //     that is used when concatenating the final species string.  But, with the line
        //     below active, then the species name of the first species profile will already
        //     be the concatenated version.  Thus, you get the extra species name.
//        databaseProfile.setSpeciesName(speciesCustomizeTextField.getText());
        databaseProfile.setModify(new SimpleDateFormat("MM/dd/yyyy").parse(modifyFormattedTextField.getText()));
        databaseProfile.setNotes(notesTextArea.getText());
        ExportToGenMAPP.setDatabaseProfile(databaseProfile);
    }

    /**
     * Extend AbstractListModel by adding the mechanisms to supply the list's data.
     * Also, when the array of species profiles changes, listeners are informed
     * by fireContentsChanged.
     * 
     * @author rbrous
     */
    private class SpeciesListModel extends AbstractListModel {

        // The source of the list.
        private SpeciesProfile[] speciesProfiles;

        public void setSpeciesProfiles(SpeciesProfile[] speciesProfiles) {
            this.speciesProfiles = speciesProfiles;

            // Update listeners.
            fireContentsChanged(this, 0, getSize());
        }

        @Override
        public Object getElementAt(int index) {
            return speciesProfiles[index];
        }

        @Override
        public int getSize() {
            return (speciesProfiles != null) ? speciesProfiles.length : 0;
        }

    }
}