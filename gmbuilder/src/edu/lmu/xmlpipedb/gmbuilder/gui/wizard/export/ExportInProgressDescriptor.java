/********************************************************
 * Filename: ExportPanel5Descriptor.java
 * Author: Joey J. Barrett
 * Program: gmBuilder
 * Description: A subclass of WizardPanelDescriptor which
 * outlines provides the nessecary requirements for
 * creating a wizard panel.
 *
 * Revision History:
 * 20060620: Initial Revision.
 * *****************************************************/
package edu.lmu.xmlpipedb.gmbuilder.gui.wizard.export;

import java.awt.Cursor;
import java.io.IOException;
import java.sql.SQLException;

import javax.xml.bind.JAXBException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.xml.sax.SAXException;

import com.nexes.wizard.WizardPanelDescriptor;

import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.ExportToGenMAPP;
import edu.lmu.xmlpipedb.util.exceptions.InvalidParameterException;


/**
 * @author Joey J. Barrett
 */
public class ExportInProgressDescriptor extends WizardPanelDescriptor {

    public static final String IDENTIFIER = "EXPORT_IN_PROGRESS_PANEL";

    ExportInProgressPanel exportInProgressPanel;

    public ExportInProgressDescriptor() {
        exportInProgressPanel = new ExportInProgressPanel();
        setPanelDescriptorIdentifier(IDENTIFIER);
        setPanelComponent(exportInProgressPanel);
    }

    @Override
    public Object getNextPanelDescriptor() {
        return FINISH;
    }

    @Override
    public Object getBackPanelDescriptor() {
        return null;
    }

    @Override
    public void aboutToDisplayPanel() {
        exportInProgressPanel.setProgress(0, "Preparing for export...");
        getWizard().setNextFinishButtonEnabled(false);
        getWizard().setBackButtonEnabled(false);

    }

    /**
     * @see com.nexes.wizard.WizardPanelDescriptor#displayingPanel()
     */
    public void displayingPanel() {
        Thread t = new Thread() {
            public void run() {
                try {
                    getWizard().getDialog().setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    ExportToGenMAPP.export(exportInProgressPanel);
                    exportInProgressPanel.setProgress(100, "Export completed successfully.");
                    getWizard().setNextFinishButtonEnabled(true);
                } catch(HibernateException e) {
                    LOG.fatal("Export problem", e);
                } catch(ClassNotFoundException e) {
                    LOG.fatal("Export problem", e);
                } catch(SQLException e) {
                    LOG.fatal("Export problem", e);
                } catch(SAXException e) {
                    LOG.fatal("Export problem", e);
                } catch(IOException e) {
                    LOG.fatal("Export problem", e);
                } catch(JAXBException e) {
                    LOG.fatal("Export problem", e);
                } catch (InvalidParameterException e) {
                	LOG.fatal("Export problem", e);
				} finally {
                    getWizard().getDialog().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                }
            }
        };

        t.start();
    }

    private static final Log LOG = LogFactory.getLog(ExportInProgressDescriptor.class);
}
