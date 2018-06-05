package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.MapDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Groupe BINARD
 * @version 1.0
 * @see SQLException
 * @see List
 * @see MapDAO
 */
public final class ModelFacade implements IModel {

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getMapById(int)
     */
    @Override
    public Map getMapById(final int id) throws SQLException {
        return MapDAO.getMapById(id);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getMapByKey(java.lang.String)
     */
    @Override
    public Map getMapByKey(final String key) throws SQLException {
        return MapDAO.getMapByKey(key);
    }
    /*
     * (non-Javadoc)
     * @see model.IModel#getMapByMap(java.lang.String)
     */
    @Override
    public Map getMapByMap(final String map) throws SQLException {
        return MapDAO.getMapByMap(map);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllMaps()
     */
    @Override
    public List<Map> getAllMaps() throws SQLException {
        return MapDAO.getAllMaps();
    }

}