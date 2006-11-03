// Created for xmlpipedb, Oct 29, 2006.
package edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.profiles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.hibernate.cfg.Configuration;
import org.junit.Test;

import edu.lmu.xmlpipedb.gmbuilder.GenMAPPBuilder;
import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.ExportToGenMAPP;
import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.TableCoordinator;
import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.tables.TableManager;
import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.tables.TableManager.Row;
import edu.lmu.xmlpipedb.gmbuilder.gui.wizard.export.ExportWizard;
import edu.lmu.xmlpipedb.gmbuilder.util.GenMAPPBuilderUtilities;
import edu.lmu.xmlpipedb.gmbuilder.util.GenMAPPBuilderUtilities.SystemTablePair;
import edu.lmu.xmlpipedb.util.engines.ConfigurationEngine;

/**
 * @author   Jeffrey Nicholas
 * @version  $Revision$ $Date$
 */
public class GenMAPPBuilderSpeciesProfileTest {

	
	/* **** class vars **** */
    private String _jaxbContextPath;
    private Configuration _hibernateConfiguration = GenMAPPBuilder.createHibernateConfiguration();
	private ConfigurationEngine _configEng;
	private File _xmlFile;
	
	/**
	 * Test method for {@link edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.profiles.EscherichiaColiUniProtSpeciesProfile#getRelationsTableManagerCustomizations(String, String, Map, TableManager)}.
	 * Ensure that the number and type of records returned are correct.
	 * 
	 * Compared to what??? Not sure.
	 * Based on what input??? Not sure.
	 */
	@Test
	public void testGetRelationsTableManager() throws FileNotFoundException {
        Row[] r = null;
		
		// setup environment
		DatabaseProfile dp = doSetupOfExportEnvironment();
		
		// do tests
//      This uses SpeciesProfile
        TableManager tmB = dp.getRelationsTableManager();
        r = tmB.getRows();

        TableManager tmD = dp.getSystemsTableManager();
        r = tmB.getRows();
        
        try {
			TableManager tmF = dp.getSystemTableManager();
			r = tmB.getRows();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        try {
			List<TableManager> tmG = dp.getRelationshipTableManager();
			r = tmB.getRows();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
	}// end testGetReleations...
	
	/**
	 * The purpose of this method is to create and pre-populate a DbProfile
	 * so that any subsequent tests can use this without duplicating the code.
	 * 
	 * @return DatabaseProfile
	 */
	private DatabaseProfile doSetupOfExportEnvironment(){
		DatabaseProfile result = null;
		// do stuff
			// Copied from ExportPanel1.init()
			// The method ExportToGenMAPP.getAvailableDatabaseProfiles() is STATIC
		 	for (DatabaseProfile profile : ExportToGenMAPP.getAvailableDatabaseProfiles()) {
	            // Find the first occurance that is UniProt, grab it, and jump out
		 		if( profile.toString().equalsIgnoreCase("org.uniprot.uniprot.Uniprot")){
	            	result = profile;
	            	break;
	            }
	        }
		 	
		 	// populate dbProfile with everything it needs
		       try {
		    	    // from ExportPanel1
					result.setOwner("Unit Test -- JN");
		
					result.setVersion(new SimpleDateFormat("MM/dd/yyyy")
							.parse("1/1/1776"));
		
					result.setMODSystem("UniProt");
					// set the species name
					result.setSpeciesName("Escherichia Coli");
					result.setModify(new SimpleDateFormat("MM/dd/yyyy")
							.parse("1/1/1888"));
					result.setNotes("This test better work");
		
					// from ExportPanel2
					result.setDatabaseProperties(
							"./unitTest.gdb",
							null,
							null); // we are not doing GO, so no need for a GO file
					
					// from ExportPanel3
					String[] proper = {"UniProt", "EchoBASE", "Blattner", "EcoGene"};
					String[] improper = {"GeneOntology", "EMBL", "PDB", "Pfam", "InterPro"};
					result.setTableProperties(proper, improper);
					
					// from ExportPanel4
					List<String> relationshipTables = new ArrayList<String>();
					for (String relationshipTable : result.getAvailableRelationshipTables()) {
			            relationshipTables.add(relationshipTable);
			        }
					result.setRelationshipTableProperties(relationshipTables.toArray(new String[0]));
					
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		       
		       
		       // Note To Self: This call will move up to the calling method...
		       //ExportToGenMAPP.setDatabaseProfile(result);
		
		return result;
	}// end doSetup...
	
    /**
     * Test method for {@link edu.lmu.xmlpipedb.gmbuilder.util.GenMAPPBuilderUtilities#getDefaultGDBFilename(java.lang.String, java.util.Date)}.
     * Ensure that the GMBUtilities getDefaultGDBFilename method works
     * correctly. Specifically:
     * - given a species and date, acorrect file name is returned
     * - null is not accepted for the species name
     * - null is not accepted for the date
     */
/*    @Test
    public void testGetDefaultGDBFilename() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1999);
        c.set(Calendar.MONTH, Calendar.FEBRUARY);
        c.set(Calendar.DATE, 14);
        assertEquals("Ec-Std_19990214.gdb", GenMAPPBuilderUtilities.getDefaultGDBFilename("e. coli", c.getTime()));
        c.set(Calendar.YEAR, 2006);
        c.set(Calendar.MONTH, Calendar.JUNE);
        c.set(Calendar.DATE, 6);
        assertEquals("Pp-Std_20060606.gdb", GenMAPPBuilderUtilities.getDefaultGDBFilename("pseudomonas putida", c.getTime()));
        assertEquals("-Std_20060606.gdb", GenMAPPBuilderUtilities.getDefaultGDBFilename("", c.getTime()));
        try {
            GenMAPPBuilderUtilities.getDefaultGDBFilename(null, c.getTime());
            fail("getDefaultGDBFilename() should not accept nulls");
        } catch(NullPointerException npexc) {
            // This is what we expect.
        }
        try {
            GenMAPPBuilderUtilities.getDefaultGDBFilename("escherichia coli", null);
            fail("getDefaultGDBFilename() should not accept nulls");
        } catch(NullPointerException npexc) {
            // This is what we expect.
        }
    }*/

    /**
     * Test method for {@link edu.lmu.xmlpipedb.gmbuilder.util.GenMAPPBuilderUtilities#getGenusName(java.lang.String)}.
     * Ensure that the GMBUtilities getGenusName method works
     * correctly. Specifically:
     * - empty string returns empty string (not a failure)
     * - given a full genus and species name, the correct genus name is returned
     * - null is not accepted as input
     */
/*    @Test
    public void testGetGenusName() {
        assertEquals("", GenMAPPBuilderUtilities.getGenusName(""));
        assertEquals("escherichia", GenMAPPBuilderUtilities.getGenusName("escherichia coli"));
        assertEquals("homo", GenMAPPBuilderUtilities.getGenusName("homo sapiens superior"));
        try {
            GenMAPPBuilderUtilities.getGenusName(null);
            fail("getGenusName() doesn't accept nulls");
        } catch(NullPointerException npexc) {
            // This is what we expect.
        }
    }*/

    /**
     * Test method for {@link edu.lmu.xmlpipedb.gmbuilder.util.GenMAPPBuilderUtilities#getSpeciesName(java.lang.String)}.
     * Ensure that the GMBUtilities getSpeciesName method works
     * correctly. Specifically:
     * - empty string returns empty string (not a failure)
     * - given a genus only, empty string is returned for the species
     * - given a full genus and species name, the correct species name is returned
     * - null is not accepted as input
     */
/*    @Test
    public void testGetSpeciesName() {
        assertEquals("", GenMAPPBuilderUtilities.getSpeciesName(""));
        assertEquals("", GenMAPPBuilderUtilities.getSpeciesName("thisOneJustHasAGenus"));
        assertEquals("coli", GenMAPPBuilderUtilities.getSpeciesName("escherichia coli"));
        assertEquals("sapiens", GenMAPPBuilderUtilities.getSpeciesName("homo sapiens superior"));
        try {
            GenMAPPBuilderUtilities.getSpeciesName(null);
            fail("getSpeciesName() doesn't accept nulls");
        } catch(NullPointerException npexc) {
            // This is what we expect.
        }
    }*/

    /**
     * Test method for {@link edu.lmu.xmlpipedb.gmbuilder.util.GenMAPPBuilderUtilities#parseRelationshipTableName(java.lang.String)}.
     * 
     * I'll leave the details to Jeffrey  :)
     */
/*    @Test
    public void testParseRelationshipTableName() {
        SystemTablePair stp = GenMAPPBuilderUtilities.parseRelationshipTableName("UniProt-EMBL");
        assertEquals("UniProt", stp.systemTable1);
        assertEquals("EMBL", stp.systemTable2);
        
        try {
            stp = GenMAPPBuilderUtilities.parseRelationshipTableName("NotAValidRelationshipTableName");
            fail("parseRelationshipTableName() assumes a valid relationship table name");
        } catch(ArrayIndexOutOfBoundsException aioobexc) {
            // This is what we expect.
        }
        
        try {
            stp = GenMAPPBuilderUtilities.parseRelationshipTableName("");
            fail("parseRelationshipTableName() assumes a valid relationship table name");
        } catch(ArrayIndexOutOfBoundsException aioobexc) {
            // This is what we expect.
        }
        
        try {
            stp = GenMAPPBuilderUtilities.parseRelationshipTableName(null);
            fail("parseRelationshipTableName() assumes a valid relationship table name");
        } catch(NullPointerException npexc) {
            // This is what we expect.
        }
    }*/
    
    /**
     * Test method for {@link edu.lmu.xmlpipedb.gmbuilder.util.GenMAPPBuilderUtilities#getSystemsDateString(java.util.Date)}.
     */
/*    @Test
    public void testGetSystemsDateString() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1999);
        c.set(Calendar.MONTH, Calendar.FEBRUARY);
        c.set(Calendar.DATE, 14);
        assertEquals("02/14/1999", GenMAPPBuilderUtilities.getSystemsDateString(c.getTime()));
        c.set(Calendar.YEAR, 2006);
        c.set(Calendar.MONTH, Calendar.JUNE);
        c.set(Calendar.DATE, 6);
        assertEquals("06/06/2006", GenMAPPBuilderUtilities.getSystemsDateString(c.getTime()));
    }*/

    /**
     * Test method for {@link edu.lmu.xmlpipedb.gmbuilder.util.GenMAPPBuilderUtilities#straightToCurly(String)}.
     */
/*    @Test
    public void testGetStraightToCurly() {
        assertNull(GenMAPPBuilderUtilities.straightToCurly(null));
        assertEquals("no apostrophes here", GenMAPPBuilderUtilities.straightToCurly("no apostrophes here"));
        assertEquals("\u2019apostrophe in the beginning", GenMAPPBuilderUtilities.straightToCurly("'apostrophe in the beginning"));
        assertEquals("two \u2019apostrophes\u2019 here", GenMAPPBuilderUtilities.straightToCurly("two 'apostrophes' here"));
        assertEquals("more than \u2019two\u2019 apos\u2019tro\u2019phe\u2019s", GenMAPPBuilderUtilities.straightToCurly("more than 'two' apos'tro'phe's"));
    }*/
} // end class