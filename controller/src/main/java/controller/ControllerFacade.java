package controller;

import java.sql.SQLException;

import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Groupe BINARD BOUCHARD-VW FERAT GENTILS
 * @version 1.0
 */
public class ControllerFacade implements IController {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    
    
    public void start() throws SQLException {

        this.getView().displayMessage(this.getModel().getMapById(5).toString());
       
//        this.getView().displayMessage(this.getModel().getMapById(2).toString());

//       this.getView().displayMessage(this.getModel().getMapById(3).toString());
        
//        this.getView().displayMessage(this.getModel().getMapById(4).toString());
        
//        this.getView().displayMessage(this.getModel().getMapById(5).toString());

//        final List<Map> maps = this.getModel().getAllMaps();
//        final StringBuilder message = new StringBuilder();
//        for (final Map map : maps) {
//            message.append(map);
//            message.append('\n');
//        }
        
//        this.getView().displayMessage(message.toString());
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }

    /**
     * Initializes the control.
     */
	@Override
	public void control() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * (non-javadoc)
	 * Command effect
	 * @param controllerCommand.
	 * 			the controller command.
	 */
	@Override
	public void CommandEffect(ControllerCommand controllerCommand) {
		switch (controllerCommand) {
/*		case Map1:
			this.model.loadMap("MAP1");
			break;
		case Map2:
			this.model.loadMap("MAP2");
			break;
		case Map3:
			this.model.loadMap("MAP3");
			break;
		case Map4:
			this.model.loadMap("MAP4");
			break;
		case Map5:
			this.model.loadMap("MAP5");
			break;
			*/
		case Up:
			break;
		case Down:
			break;
		case Right:
			break;
		case Left:
			break;
		case Shot:
			break;
		case Error:
			break;
		default:
			break;
		}
	}
}