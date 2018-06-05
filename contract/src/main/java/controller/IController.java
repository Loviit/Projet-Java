package controller;

/**
 * <h1>The Interface IController.</h1>
 * 
 * @author Groupe BINARD BOUCHARD-VW FERAT GENTILS
 * @version 1.0
 */
public interface IController {
	/**
	 * Control.
	 */
	public void control();

	/**
	 * Command Effect.
	 *
	 * @param controllerCommand
	 *          the controller command
	 */
	public void CommandEffect(ControllerCommand controllerCommand);
}
