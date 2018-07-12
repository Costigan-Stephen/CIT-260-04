/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.GameControl;
import cit260.pioneertrail.model.Player;
import cit260.pioneertrail.exceptions.MapControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pioneertrail.PioneerTrail;

/**
 *
 * @author maril
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super(
                "==================================================== "
                + "\n\t\t   MAIN MENU "
                + "\n===================================================="
                + "\n\t N - Start new game "
                + "\n\t R - Resume an existing game "
                + "\n\t H - Get help on how to play the game "
//                + "\n\t I - Week 10 Individual Assignments "
                + "\n\t Q - Quit game "
                + "\n====================================================\n ");// Display the instructions
    }

    @Override
    public boolean doAction(String inputs) {

        inputs = inputs.toUpperCase();
        // menuItem = first element in inputs array
        // convert menuItem to upper case

        switch (inputs) {// SWITCH menuItem
            case "N":
                {
                    try {
                        startNewGame(); // “N”: startNewGame()
                    } catch (MapControlException ex) {
                        ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
                    }
                }
                break;
            case "R":
                resumeGame();// “R”: resumeGame()
                break;
            case "H":
                getHelp();// “H”: getHelp()
                break;
//            case "I":
//                individual();// “H”: getHelp()
//                break;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid Menu item.");
        }// ENDSWITCH    
        return false;// RETURN false
    }

    private void startNewGame() throws MapControlException {// startNewGame(): void {
        GameControl.createNewGame(PioneerTrail.getPlayer());//Create a new game

        GameMenuView gameMenuView = new GameMenuView(); // gameMenuView = create a new GameMenuView object
        gameMenuView.display();// gameMenuView.displayGameMenuView();     
    }

    private void resumeGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.display();
        // startExistingGameView = Create a new StartExistingGameView
        // startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() { //getHelp(): void {
        HelpMenuView helpMenuView = new HelpMenuView();// helpMenuView = Create a new HelpMenuView
        helpMenuView.display();
        // helpMenuView.displayHelpMenuView();
    }

    private void individual() {
        IndividualAssignments view = new IndividualAssignments();// helpMenuView = Create a new HelpMenuView
        view.display();
    }
}
