package edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.profiles;

import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.tables.TableManager;
import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.tables.TableManager.QueryType;

public class MycobacteriumSmegmatisUniProtSpeciesProfile extends UniProtSpeciesProfile {
	public MycobacteriumSmegmatisUniProtSpeciesProfile() {
	    super("Mycobacterium smegmatis",
	       "This profile customizes the GenMAPP Builder export for Genus species data loaded from a UniProt XML file.");
	}
	@Override
	public TableManager getSystemsTableManagerCustomizations(TableManager tableManager, DatabaseProfile dbProfile) {
	    super.getSystemsTableManagerCustomizations(tableManager, dbProfile);
	    tableManager.submit("Systems", QueryType.update, new String[][] {
	        { "SystemCode", "N" },
	        { "Species", "|" + getSpeciesName() + "|" }
	    });

	    tableManager.submit("Systems", QueryType.update, new String[][] {
	        { "SystemCode", "N" },
	        { "Link", "http://cmr-jvci.org/cgi-bin/CMR/shared/GenePage.cgi?locus=~" }
	    });

	    return tableManager;
	}
}