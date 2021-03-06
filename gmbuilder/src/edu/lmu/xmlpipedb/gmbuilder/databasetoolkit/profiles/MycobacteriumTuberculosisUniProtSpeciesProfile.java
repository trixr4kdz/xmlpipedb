package edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.profiles;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.ConnectionManager;
import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.tables.TableManager;
import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.tables.TableManager.QueryType;
import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.tables.TableManager.Row;
import edu.lmu.xmlpipedb.util.exceptions.InvalidParameterException;

public class MycobacteriumTuberculosisUniProtSpeciesProfile extends UniProtSpeciesProfile {

    public MycobacteriumTuberculosisUniProtSpeciesProfile() {
        super("Mycobacterium tuberculosis", 1773,
              "This profile customizes the GenMAPP Builder export for Mycobacterium Tuberculosis data loaded from a UniProt XML file.");
    }

    @Override
    public TableManager getSystemsTableManagerCustomizations(TableManager tableManager, DatabaseProfile dbProfile) {
        super.getSystemsTableManagerCustomizations(tableManager, dbProfile);
        tableManager.submit("Systems", QueryType.update, new String[][] {
            { "SystemCode", "N" }, { "Species", "|" + getSpeciesName() + "|" }
        });

        tableManager.submit("Systems", QueryType.update, new String[][] {
            { "SystemCode", "N" }, { "Link", "http://tuberculist.epfl.ch/quicksearch.php?gene+name=~" }
        });

        return tableManager;
    }

    /**
     * @see edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.profiles.UniProtSpeciesProfile#getSystemTableManagerCustomizations(edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.tables.TableManager, edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.tables.TableManager, java.util.Date)
     */
    @Override
    public TableManager getSystemTableManagerCustomizations(TableManager tableManager,
            TableManager primarySystemTableManager, Date version) throws SQLException, InvalidParameterException {
        // Build the base query; we use 'ordered locus' and 'ORF' and ids that
        // begin with "Rv."
        PreparedStatement ps = ConnectionManager.getRelationalDBConnection().prepareStatement("SELECT value, type " +
            "FROM genenametype INNER JOIN genetype " +
            "ON (genetype_name_hjid = genetype.hjid) " + "WHERE (type = 'ordered locus' or type = 'ORF') and (value like 'Rv%'and not value = 'Rv3346/55c') and entrytype_gene_hjid = ?");

        ResultSet result;
        for (Row row: primarySystemTableManager.getRows()) {
            ps.setInt(1, Integer.parseInt((String)row.getValue("UID")));
            result = ps.executeQuery();

            // We actually want to keep the case where multiple names appear.
            while (result.next()) {
                // We want this name to appear in the OrderedLocusNames
                // system table.
                for (String id: result.getString("value").split("/")) {
                    tableManager.submit("OrderedLocusNames", QueryType.insert, new Object[][] {
                        { "ID", id },
                        { "Species", "|" + getSpeciesName() + "|" },
                        { "Date", version },
                        { "UID", row.getValue("UID") }
                    });
                }
            }
        }

        return tableManager;
    }
}
