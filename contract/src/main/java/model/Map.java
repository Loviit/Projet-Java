package model;

/**
 * <h1>The Class Map allows character retrieval.</h1>
 *
 * @author Alyssa
 * @version 1.0
 */

public class Map {

	/** The id. */
	private final int id;

	/** The key. */
	private String key;

	/** The map. */
	private String map;

	/**
	 * Instantiates a new map.
	 * 
	 * @param id
	 *            the id
	 * @param key
	 *            the key
	 * @param map
	 *            the map
	 */
	public Map(final int id, final String key, final String map) {
		super();
		this.id = id;
		this.key = key;
		this.map = map;
	}

	/**
	 * Get Id
	 * 
	 * @return id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Get Key
	 * 
	 * @return key
	 */
	public String getKey() {
		return this.key;
	}

	/**
	 * Get Map
	 * 
	 * @return map
	 */
	public String getMap() {
		return this.map;
	}

	/**
	 * Set Map
	 * 
	 * @param map
	 */
	public void setMap(final String map) {
		this.map = map;
	}

	/**
	 * (non-javadoc) toString Allows you to display the map.
	 */
	@Override
	public String toString() {
		System.out.println("- Recuperation des caracteres");
		return this.getId() + " : " + this.getMap();

	}
}
