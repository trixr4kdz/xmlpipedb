// Created by xmlpipedb, Jul 3, 2006.
package edu.lmu.xmlpipedb.gmbuilder.util;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.healthmarketscience.jackcess.Column;
import com.healthmarketscience.jackcess.ColumnBuilder;
import com.healthmarketscience.jackcess.DataType;
import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.PropertyMap;
import com.healthmarketscience.jackcess.TableBuilder;

/**
 * GenMAPPBuilderUtilities is a general placeholder for standalone utility
 * methods needed by GenMAPP Builder.
 * 
 * @author xmlpipedb
 * @version $Revision$ $Date$
 */
public class GenMAPPBuilderUtilities {
    /**
     * Returns the default filename for the given information.
     * 
     * @param fullSpeciesName
     *            The full species name to use
     * @param creationDate
     *            The date to include
     * @return The default filename for the Gene Database to be generated with
     *         the given parameters
     */
    public static String getDefaultGDBFilename(String fullSpeciesName, Date creationDate) {
        String genusName = getGenusName(fullSpeciesName);
        String speciesName = getSpeciesName(fullSpeciesName);

        StringBuffer sb = new StringBuffer();
        sb.append("".equals(genusName) ? "" : genusName.substring(0, 1).toUpperCase());
        sb.append("".equals(speciesName) ? "" : speciesName.substring(0, 1).toLowerCase());
        sb.append("-Std_");
        sb.append(GDB_DF.format(creationDate));
        sb.append(".gdb");
        return sb.toString();
    }
    
    /**
     * Extracts the genus name of the given species name. If a genus name is not
     * found, then an empty string is returned.
     * 
     * @param speciesName
     *            The full species name from which to extract the genus
     * @return The name of the genus
     */
    public static String getGenusName(String speciesName) {
        // This current implementation only returns the first token in the string.
        StringTokenizer st = new StringTokenizer(speciesName);
        if (st.countTokens() > 0) {
            return st.nextToken();
        } else {
            return "";
        }
    }

    /**
     * Extracts the (specific) species name of the given (full) species name. If
     * a species name is not found, then an empty string is returned.
     * 
     * @param fullSpeciesName
     *            The full species name from which to extract the species
     * @return The (specific) name of the species
     */
    public static String getSpeciesName(String fullSpeciesName) {
        // This current implementation only returns the second token in the string.
        StringTokenizer st = new StringTokenizer(fullSpeciesName);
        if (st.countTokens() > 1) {
            st.nextToken();
            return st.nextToken();
        } else {
            return "";
        }
    }

    /**
     * Helper class for holding a pair of system table names.
     */
    public static class SystemTablePair {
        public String systemTable1;
        public String systemTable2;
    }
    
    /**
     * Takes a relationship table name and returns the two system table names
     * involved in this relationship.
     * 
     * @param relationshipTableName
     *            The relationship table name (e.g., UniProt-EMBL)
     * @return Object holding the two system table names derived from the given
     *         relationship table name
     */
    public static SystemTablePair parseRelationshipTableName(String relationshipTableName) {
        String[] splits = relationshipTableName.split("-");
        SystemTablePair result = new SystemTablePair();
        result.systemTable1 = splits[0];
        result.systemTable2 = splits[1];
        return result;
    }

    /**
     * Returns a formatted string for the given date that follows the date
     * format expected in the Gene Database Systems table Date field.
     * 
     * @param d
     *            The date to format
     * @return The formatted string for that date
     */
    public static String getSystemsDateString(Date d) {
        return SYSTEMS_DF.format(d);
    }

    /**
     * Replaces all occurrences of the "straight" apostrophe (') in the given
     * String with its "curly" equivalent (&rsquo;).
     * 
     * @param s
     *            The String to process
     * @return The same String but with "straights turned into "curlies"
     */
    public static String straightToCurly(String s) {
        return (s != null) ? s.replace('\'', '\u2019') : null;
    }

    /**
     * Removes any trailing ".n" suffixes from the given string.
     */
    public static String getNonVersionedID(String s) {
        Matcher m = VERSION_PATTERN.matcher(s);
        if (m.find()) {
            return s.substring(0, m.start());
        } else {
            return s;
        }
    }

    /**
     * A helper function for eliminated a ".n" suffix, if applicable.
     */
    public static String checkAndPruneVersionSuffix(String systemName, String id) {
        // Catch nulls here, because we'll call trim() later.
        if (id == null) {
            LOG.warn("A null ID was passed for " + systemName);
            return id;
        }

        // Ditch leading and trailing spaces.
        String trimmedID = id.trim();
        
        // The "exception clause" for RefSeq (and maybe others one day).
        if ("RefSeq".equals(systemName)) {
            LOG.debug("Pruning .n version from [" + trimmedID + "]");
            // Prevent possible exceptions from halting the export.
            try {
                return getNonVersionedID(trimmedID);
            } catch(RuntimeException rtexc) {
                LOG.error("Runtime exception: returning ID [" + trimmedID + "] unmodified", rtexc);
                return trimmedID;
            }
        } else {
            return trimmedID;
        }
    }
    
    /**
     * Jackcess support methods.
     */
    private static final Pattern NOT_NULL_PATTERN = Pattern.compile("not null", Pattern.CASE_INSENSITIVE |
            Pattern.UNICODE_CASE);
    private static final Pattern LENGTH_PATTERN = Pattern.compile("\\((\\d+)\\)");

    public static DataType getDataType(String typeSpec) {
        String type = typeSpec.split("\\(")[0];
        return "VARCHAR".equalsIgnoreCase(type) || "CHAR".equalsIgnoreCase(type) ? DataType.TEXT :
            ("DATE".equalsIgnoreCase(type) ? DataType.SHORT_DATE_TIME : DataType.valueOf(type.toUpperCase()));
    }

    public static boolean specifiesDataTypeNotNull(String typeSpec) {
        return NOT_NULL_PATTERN.matcher(typeSpec).find();
    }

    public static Integer getDataTypeLength(String typeSpec) {
        Matcher lengthMatcher = LENGTH_PATTERN.matcher(typeSpec);
        if (lengthMatcher.find()) {
            return Integer.valueOf(lengthMatcher.group(1));
        } else {
            return null;
        }
    }

    public static Map<String, String> string2DArrayToMap(String[][] mapAsArray) {
        Map<String, String> result = new LinkedHashMap<String, String>();

        for (int i = 0; i < mapAsArray.length; i++) {
            if (mapAsArray[i].length != 2) {
                throw new IllegalArgumentException("Incorrect number of arguments");
            }

            result.put(mapAsArray[i][0], mapAsArray[i][1]);
        }
        
        return result;
    }

    public static void createAccessTableDirectly(Database database, String tableName,
            Map<String, String> columnsToTypes) throws IOException {
        TableBuilder tableBuilder = new TableBuilder(tableName);
        for (String columnName: columnsToTypes.keySet()) {
            String typeSpec = columnsToTypes.get(columnName);
            ColumnBuilder columnBuilder = new ColumnBuilder(columnName, GenMAPPBuilderUtilities.getDataType(typeSpec));
            if (GenMAPPBuilderUtilities.getDataTypeLength(typeSpec) != null) {
                columnBuilder.setLengthInUnits(GenMAPPBuilderUtilities.getDataTypeLength(typeSpec).intValue());
            }
            tableBuilder.addColumn(columnBuilder);
        }

        // FIXME Jackcess property-setting appears to corrupt the table. Need to revisit sometime.
        com.healthmarketscience.jackcess.Table table = tableBuilder.toTable(database);
        for (Column column: table.getColumns()) {
            if (GenMAPPBuilderUtilities.specifiesDataTypeNotNull(columnsToTypes.get(column.getName()))) {
                PropertyMap propertyMap = column.getProperties();
                propertyMap.put(PropertyMap.REQUIRED_PROP, DataType.BOOLEAN, Boolean.TRUE);
                propertyMap.save();
            }
        }
    }

    public static void insertAccessRowDirectly(Database database, String tableName,
            Map<String, Object> columnsToValues) throws IOException {
        com.healthmarketscience.jackcess.Table table = database.getTable(tableName);
        List<Object> valuesInOrder = new ArrayList<Object>();
        for (Column column: table.getColumns()) {
            valuesInOrder.add(columnsToValues.get(column.getName()));
        }
        table.addRow(valuesInOrder.toArray());
    }

    /**
     * The log object for GenMAPPBuilderUtilities.
     */
    private static final Log LOG = LogFactory.getLog(GenMAPPBuilderUtilities.class);

    /**
     * Date format used for default GDB filenames.
     */
    private static final DateFormat GDB_DF = new SimpleDateFormat("yyyyMMdd");
    
    /**
     * Date format used for the Date field in the Systems table.
     */
    private static final DateFormat SYSTEMS_DF = new SimpleDateFormat("MM/dd/yyyy");
    
    /**
     * Pattern used for extracting generic ".n" suffixes.
     */
    private static final Pattern VERSION_PATTERN = Pattern.compile("\\.[0-9]+$");
}
