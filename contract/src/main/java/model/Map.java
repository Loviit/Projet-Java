package model;
/**
 * <h1>The Class Map.</h1>
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
     * Instantiates a new example.
     *
     * @param id
     *            the id
     * @param name
     *            the name
     */
    public Map(final int id, final String key, final String map) {
        super();
        this.id = id;
        this.key = key;
        this.map = map;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets the key.
     *
     * @return the key
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Gets the map.
     *
     * @return the map
     */
    public String getMap() {
        return this.map;
    }

    /**
     * Sets the map.
     *
     * @param map
     *            the new map
     */
    public void setMap(final String map) {
        this.map = map;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return this.getId() + " : " + this.getMap();
    }
}
