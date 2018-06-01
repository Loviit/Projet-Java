package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Map;

/**
 * <h1>The Class MapDAO.</h1>
 *
 * @author Alyssa
 * @version 1.0
 */

public class MapDAO extends AbstractDAO {
	 /** The sql example by id. */
    private static String sqlMapById   = "{call findMapById(?)}";
    
    /** The sql example by key. */
    private static String sqlMapByKey   = "{call findMapByKey(?)}";

    /** The sql example by map. */
    private static String sqlMapByMap = "{call findMapByMap(?)}";

    /** The sql all examples. */
    private static String sqlAllMaps   = "{call findAllMaps()}";

    /** The id column index. */
    private static int    idColumnIndex    = 1;
    
    /** The id column index. */
    private static int    keyColumnIndex    = 2;

    /** The name column index. */
    private static int    mapColumnIndex  = 3;

    /**
     * Gets the map by id.
     *
     * @param id
     *            the id
     * @return the map by id
     * @throws SQLException
     *             the SQL exception
     */
    public static Map getMapById(final int id) throws SQLException {
        System.out.println("- ouverture DAO");
        final CallableStatement callStatement = prepareCall(sqlMapById);
        Map map = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                map = new Map(result.getInt(idColumnIndex), result.getString(keyColumnIndex),result.getString(mapColumnIndex));
            }
            result.close();
        }
        return map;
    }
    
    /**
     * Gets the map by key.
     *
     * @param key
     *            the key
     * @return the map by key
     * @throws SQLException
     *             the SQL exception
     */
    public static Map getMapByKey(final String key) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlMapByKey);
        Map map = null;

        callStatement.setString(1, key);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                map = new Map(result.getInt(idColumnIndex), result.getString(keyColumnIndex),result.getString(mapColumnIndex));
            }
            result.close();
        }
        return map;
    }
    /**
     * Gets the map by map.
     *
     * @param map
     *            the map
     * @return the map by map
     * @throws SQLException
     *             the SQL exception
     */
    public static Map getMapByMap(final String map) throws SQLException {
        final CallableStatement callStatement = prepareCall(sqlMapByMap);
        Map map1 = null;

        callStatement.setString(1, map);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                map1 = new Map(result.getInt(idColumnIndex), result.getString(keyColumnIndex),result.getString(mapColumnIndex));
            }
            result.close();
        }
        return map1;
    }

    /**
     * Gets the all maps.
     *
     * @return the all maps
     * @throws SQLException
     *             the SQL exception
     */
    public static List<Map> getAllMaps() throws SQLException {
        final ArrayList<Map> maps = new ArrayList<Map>();
        final CallableStatement callStatement = prepareCall(sqlAllMaps);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
                maps.add(new Map(result.getInt(idColumnIndex), result.getString(keyColumnIndex),result.getString(mapColumnIndex)));
            }
            result.close();
        }
        return maps;
    }
}