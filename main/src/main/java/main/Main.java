package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Groupe BINARD BOUCHARD-VW FERAT GENTILS
 * @version 1.0
 * @see ControllerFacade
 * @see ModelFacade
 * @see ViewFacade
 */
public abstract class Main {


    public static void main(final String[] args) 
    {
        final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }

}