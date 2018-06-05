package model;

import java.sql.SQLException;
import java.util.List;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Groupe BINARD BOUCHARD-VW FERAT GENTILS
 * @version 1.0
 */
public interface IModel {

    /**
     * Gets the map by id.
     *
     * @param id
     *            the id
     * @return the map by id
     * @throws SQLException
     *             the SQL exception
     */
    Map getMapById(int id) throws SQLException;

    /**
     * Gets the map by key.
     *
     * @param name
     *            the key
     * @return the map by key
     * @throws SQLException
     *             the SQL exception
     */
    Map getMapByKey(String key) throws SQLException;
    
    /**
     * Gets the map by map.
     *
     * @param map
     *            the map
     * @return the map by map
     * @throws SQLException
     *             the SQL exception
     */
    Map getMapByMap(String map) throws SQLException;

    /**
     * Gets the all Maps.
     *
     * @return the all maps
     * @throws SQLException
     *             the SQL exception
     */
    List<Map> getAllMaps() throws SQLException;
}
