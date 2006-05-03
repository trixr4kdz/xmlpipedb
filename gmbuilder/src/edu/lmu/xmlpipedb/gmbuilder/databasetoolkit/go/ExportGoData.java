/********************************************************
 * Filename: ExportGoData.java
 * Author: LMU
 * Program: gmBuilder
 * Description: Export the data to the access database.    
 * Revision History:
 * 20060422: Initial Revision.
 * *****************************************************/

package edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.go;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.xml.sax.SAXException;

import edu.lmu.xmlpipedb.gmbuilder.GenMAPPBuilder;
import edu.lmu.xmlpipedb.gmbuilder.databasetoolkit.AccessFileCreator;
import generated.impl.IdImpl;
import generated.impl.IsAImpl;
import generated.impl.NameImpl;
import generated.impl.NamespaceImpl;
import generated.impl.RelationshipImpl;
import generated.impl.TermImpl;
import generated.impl.ToImpl;

public class ExportGoData {

	private Connection connection 	= null;
	private File outputFile 		= null;
	private Go 		 godb;
	private HashMap<String, String> namespace;
	private HashMap<String, Integer> goCount;
	
	// GO DB variables 
	private int orderNo 			= 1;
	
	/**
	 *  Constructor 
	 *  
	 * @param outputFile 
	 * 			The genMAPP file to populate
	 * @throws IOException
	 * 			I/O error
	 */
	public ExportGoData(File outputFile) throws IOException {
		this.outputFile = outputFile;
		godb 		= new Go();
		namespace 	= new HashMap<String, String>();
		goCount		= new HashMap<String, Integer>();
		createNamespaceMappings();
	}
	
	/**
	 * Staring point for exporing go data to genMAPP 
	 *  
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws HibernateException
	 * @throws SAXException
	 * @throws IOException
	 * @throws JAXBException
	 */
	public void export() throws ClassNotFoundException, 
			SQLException, HibernateException, 
			SAXException, IOException, JAXBException {
		
		String Date = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
		
		openConnection();
		godb.createTables(connection);
		populateGoTables();
		godb.updateSystemsTable(connection, Date, "T");
		closeConnection();
	}
	
	/**
	 * A mapping from obo.xml namespaces to GO types 
	 *
	 */
	private void createNamespaceMappings() {
		namespace.put("biological_process", "P");
		namespace.put("molecular_function", "F");
		namespace.put("cellular_component", "C");
	}
	
	/**
	 * Populate genMAPP's GO tables
	 * 
	 * @throws SQLException
	 * @throws HibernateException
	 * @throws SAXException
	 * @throws IOException
	 * @throws JAXBException
	 */
	private void populateGoTables() throws SQLException, 
			HibernateException, SAXException, IOException, 
			JAXBException {
		
		Configuration hibernateConfiguration = GenMAPPBuilder.createHibernateConfiguration();
    	SessionFactory sessionFactory = hibernateConfiguration.buildSessionFactory();
		Session session = sessionFactory.openSession(); // open Hibernate session

		populateGeneOntologyTable(session);
		populateGeneOntologyTree();
		populateGeneOntologyCount();
		populateUniprotGoTable();
		
		
		session.close();		
		
	}
	
	/**
	 * Populate genMAPP's Uniprot-GeneOntology table
	 * 
	 * @throws IOException
	 * @throws SQLException
	 */
	private void populateUniprotGoTable() throws IOException, SQLException {

		File file = new File("src/edu/lmu/xmlpipedb/gmbuilder/resource/GoAssociations/associations.txt");
		BufferedReader in = new BufferedReader(new FileReader(file.getCanonicalPath()));
		String line = null;
	    while ((line = in.readLine()) != null) {
	    	// Grab the Uniprot ID 
	    	Matcher m = Pattern.compile("UniProtKB/[\\w-]+:(\\w+)").matcher(line);
	        if (m.find()) {
	            String Up_ID = m.group(1);
	            // Grab the GO ID(s) 
	            Matcher match  = Pattern.compile("GO:(\\w+)").matcher(line);
	            while (match.find()) {
	            	String[] values = new String[] {Up_ID, match.group(1), "En"};
	            	godb.insert(connection,Go.Uniprot_Go, values);
	            }
	        }
	     }
	}		
	
	
	/**
	 *  Populate genMAPP's GeneOntologyTable
	 *  
	 * @param session
	 * 				A hibernate session (needed for HQL queries)
	 * @throws SQLException
	 */
	private void populateGeneOntologyTable (Session session) throws SQLException {
    	Iterator iter	= null;
    	Iterator myiter = null;
    	
    	String Species = null;
    	String Remarks = null;
    	
    	// Get today's date
    	String Date	   = new SimpleDateFormat("MM/dd/yyyy").format(new Date()); 
    	
    	// Grab all term object
    	iter = session.createQuery(  "from generated.impl.TermImpl" ).iterate();
    		
    	while( iter.hasNext() ) {
			TermImpl term = (TermImpl) iter.next();
			
			// Each term may contain a number of objects
			myiter = term.getContent().iterator();
	    	String Id = "";
	    	String Name = "";
	    	String Type = "";
	    	String Parent = "";
	    	String Relation = "";
	    	boolean is_root = false;
			/*
			 *  Each Term may have more than one parent (is_a) and a part_of. In that
			 *  case, create an entry for each object. Thus each term may have more than one
			 *  entry
			 */
	    	while (myiter.hasNext()) {
				Object o = myiter.next();
				if (o instanceof generated.impl.IdImpl) {
					Id = (((IdImpl)o).getContent()).substring(3); // Strip off "GO:" from ID 
				} else if(o instanceof generated.impl.NameImpl) {
					Name = ((NameImpl)o).getContent();
				} else if(o instanceof generated.impl.NamespaceImpl) {
					Type = namespace.get(((NamespaceImpl)o).getContent());
				} else if(o instanceof generated.impl.IsRootImpl) {
					is_root = true;
				} else if(o instanceof generated.impl.IsAImpl) {
					Parent = (((IsAImpl)o).getContent()).substring(3); // Strip off "GO:" from parent 
					Relation = "%";
				} else if(o instanceof generated.impl.RelationshipImpl) {
					ToImpl to = (ToImpl)((RelationshipImpl)o).getContent().get(1);
					Parent = (to.getContent()).substring(3);
					Relation = "<";
					
				}
				if (Id != "" && Name != "" && Type != "") {
					if (is_root) {
						// create root ID entry
						String[] values = {Id, Name, Type, null, null, null, Date, null};
						godb.insert(connection,Go.GeneOntology, values);
						is_root = false;
					} else if (Parent != "" && Relation != "" ) { 
						// create child ID 
						String[] values = {Id, Name, Type, Parent, Relation, Species, Date, Remarks};
						godb.insert(connection,Go.GeneOntology, values);
						Relation = "";
					}
				}
			}  
    	} 
    }
	
	/**
	 * Populate genMAPP's GeneOntologyTree
	 * 
	 * @throws SQLException
	 */
	private void populateGeneOntologyTree () throws SQLException {
		String[] root_ids	= {"0003674", "0005575", "0008150" };
		String[] names 		= {"molecular_function", "cellular_component", "biological_process"};
		
		// Traverse the graph beginning with each root ID
		for (int index = 0; index < root_ids.length; index++) {
			String id 	= root_ids[index];
			String name = names[index];
			goCount.put(id, 1);
			godb.insert(connection, Go.GeneOntologyTree, new String[]{orderNo++ + "", 1+"" ,id, name});
			insertChildren(id, 2);
			
		}
	}
	
	/**
	 * Populate genMAPP's populateGeneOntologyCount
	 * 
	 * @throws SQLException
	 */
	private void populateGeneOntologyCount() throws SQLException {
		Iterator iter = goCount.keySet().iterator();
		String id;
		int count;
		while (iter.hasNext()) {
			id = (String)iter.next();
			count = goCount.get(id);
			godb.insert(connection, Go.GeneOntologyCount, new String[]{id, count + ""});
		}
	}
	
	/**
	 * A recursive fucntion that traverse each branch
	 * 
	 * @param parent
	 * 			The parent ID 
	 * @param level
	 * 			The level in the tree
	 * @throws SQLException
	 */
	private void insertChildren(String parent, int level) throws SQLException {
		Statement s = connection.createStatement();
		String sql = "SELECT name,id from " + Go.GeneOntology + " where parent = '" + parent + "' order by parent";
		ResultSet results = s.executeQuery(sql);
		while(results.next()) {
			String name = results.getString(1);
			String id	= results.getString(2);
			// Keep a track of how many time each ID shows up in the tree
			if (goCount.containsKey(id)) {
				int count = goCount.get(id);
				goCount.put(id, count + 1);
			} else {
				goCount.put(id, 1);
			}
			godb.insert(connection, Go.GeneOntologyTree, new String[]{orderNo++ + "", level+"" ,id, name});
			// Used for feedback; should be replaced with something else
			//System.out.println(orderNo);
			insertChildren(id, level + 1);
		}
		s.close();
	}
	
	/**
	 * Open connection to the access database  
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * @throws IOException 
	 */
	private void openConnection() throws ClassNotFoundException, 
			SQLException, IOException {     
        connection = AccessFileCreator.openConnection(outputFile);
	}
	/**
	 * Close database connection
	 * 
	 * @throws SQLException
	 */
	private void closeConnection() throws SQLException {
		connection.close();
	}
}
