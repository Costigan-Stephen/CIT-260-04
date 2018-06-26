/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.GameControl;
import cit260.pioneertrail.model.Player;
import java.util.Scanner;
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
                + "\n\t R - Restart an existing game "
                + "\n\t H - Get help on how to play the game "
                + "\n\t Q - Quit game "
                + "\n====================================================\n ");// Display the instructions
    }

    @Override
    public boolean doAction(String input) {

        String menuItem = input.toUpperCase();
        // menuItem = first element in inputs array
        // convert menuItem to upper case

        switch (menuItem) {// SWITCH menuItem
            case "N":
                startNewGame(); // “N”: startNewGame()
                break;
            case "R":
                restartGame();// “R”: restartGame()
                break;
            case "H":
                getHelp();// “H”: getHelp()
                break;
            default:
                System.out.println("Invalid Menu item.");// DEFAULT: DISPLAY “Invalid menu item.”
        }// ENDSWITCH    
        return false;// RETURN false
    }

    private void startNewGame() {// startNewGame(): void {
        GameControl.createNewGame(PioneerTrail.getPlayer());//Create a new game

        GameMenuView gameMenuView = new GameMenuView(); // gameMenuView = create a new GameMenuView object
        gameMenuView.display();// gameMenuView.displayGameMenuView();     
    }

    private void restartGame() {// restartNewGame(): void {
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
}
