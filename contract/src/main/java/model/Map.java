package model;

/**
 * <h1>The Class Map.</h1>
 *
 * @author Alyssa
 * @version 1.0
 */

public class Map {

	private final int id;

	private String key;

	private String map;

	public Map(final int id, final String key, final String map) {
		super();
		this.id = id;
		this.key = key;
		this.map = map;
	}

	public int getId() {
		return this.id;
	}

	public String getKey() {
		return this.key;
	}

	public String getMap() {
		return this.map;
	}

	public void setMap(final String map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return this.getId() + " : " + this.getMap();
	}
}
