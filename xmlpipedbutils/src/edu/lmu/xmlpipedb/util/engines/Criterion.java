package edu.lmu.xmlpipedb.util.engines;

import java.util.ArrayList;
import java.util.HashMap;

import edu.lmu.xmlpipedb.util.exceptions.InvalidParameterException;

public class Criterion {

	/**
	 * Sets the fields named with the values passed in. Uses the setQuery method
	 * to set the query, which then also sets the table name(s). 
	 * 
	 * @param name
	 * @param path
	 * @param query
	 * @throws InvalidParameterException 
	 */
	public Criterion( String name, String path, String query ) throws InvalidParameterException {
		
		_name = name;
		setTable(name);
		
		if( path == null && query == null )
			throw new InvalidParameterException("Both path and query were null, one of them must be non-null.");
		
		if(path != null )
			_digesterPath = path;
		
		if( query != null )
			this.setQuery( query );
	}
	
	/** 
	 * @param c The criterion to add
	 */
	public void addSubCriterion(Criterion c) {
		
		if(_subCriteria == null) {
			_subCriteria = new ArrayList<Criterion>();
			
			// Once we establish an addition of a sub criterion,
			// the containing object automatically becomes a sub criterion
			// as well
			_subCriteria.add(this);
		} 
		
		_subCriteria.add(c);
	}
	
	public ArrayList<Criterion> getSubCriteria() {
		return _subCriteria;
	}

	/**
	 * @return Returns the digesterPath.
	 */
	public String getDigesterPath() {
		return _digesterPath;
	}
	/**
	 * @param path The digesterPath to set.
	 */
	public void setDigesterPath(String path) {
		_digesterPath = path;
	}
	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return _name;
	}
	/**
	 * @param name The name to set.
	 */
	public void setName(String _name) {
		this._name = _name;
	}
	/**
	 * @return Returns the table.
	 */
	public String getTable() {
		return _table;
	}
	/**
	 * @param table The table to set.
	 */
	public void setTable(String table) {
		this._table = table;
	}
	
	/**
	 * @return the _query
	 */
	public String getQuery() {
		return _query;
	}

	/**
	 * Sets the query field to be the String passed in. 
	 * 
	 * @param _query the _query to set
	 */
	public void setQuery(String _query) {

		this._query = _query;
	}
	
	/**
	 * @return Returns the Database record count for the table specified. If
	 * no table has been specified or this count has not been obtained, the
	 * value will be -1.
	 */
	public int getDbCount() {
		return _dbCount;
	}
	/**
	 * @param Count The count to set.
	 */
	public void setDbCount(int count) {
		this._dbCount = count;
	}
	
	/**
	 * @return Returns the Database record count for the table specified. If
	 * no table has been specified or this count has not been obtained, the
	 * value will be -1.
	 */
	public int getXmlCount() {
		return _xmlCount;
	}
	/**
	 * Sets the count to the value passed in. The caller must be aware that
	 * the initial count is set to -1, so if getXmlCount is being called and
	 * incremented by 1 before calling setXmlCount, the count may be off by 1
	 * unless the count was initialized to 0 by the caller before the series
	 * was started.
	 * 
	 * @param Count The count to set.
	 */
	public void setXmlCount(int count) {
		this._xmlCount = count;
	}

	/**
	 * @return Returns the flag that lets any parser know that this
	 * specific instance requires an attribute look up as well. 
	 */
	public boolean getAttributeAware() {
		return this._attributeAware;
	}
	
	/**
	 * @param Flag The value to set.
	 */
	public void setAttributeAware(boolean flag) {
		this._attributeAware = flag;
	}
	
	/**
	 * @return A map of the attributes that are required to 
	 * match the Criterion with an XML file.
	 */
	public HashMap<String, String> getAtrributes() {
		return this._attributes;
	}
	
	/**
	 * Sets the map that allows a parser to search a 
	 * nodes attribute for a successful match.
	 *  
	 * @param attributes The map to set
	 */
	public void setAttributes(HashMap<String, String> attributes) {
		this.setAttributeAware(true);
		this._attributes = attributes;
	}
	
	/**
	 * 
	 * @param type Sets the rule associated with
	 * the xml path.
	 */
	public void setRuleType(RuleType type) {
		this._ruleType = type;
	}
	
	/**
	 * @return The type of rule associeated with
	 * the xml path
	 */
	public RuleType getRuleType() {
		return this._ruleType;
	}	

	// CLASS MEMBERS
	private String _name = null;
	private String _digesterPath = null;
	private String _table = null;
	private String _query = null;
	private int _dbCount = -1;
	private int _xmlCount = -1;
	private ArrayList<Criterion> _subCriteria = null;
	private RuleType _ruleType;
	private boolean _attributeAware = false;
	private HashMap<String, String> _attributes = null;
	public enum Type { DATABASE, XML }

	
	
}
