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
public class MainMenuView {
    
    public MainMenuView() {
    }
        
    public void displayMainMenuView() {  //displayStartProgramView() {
                
            boolean endOfView = false; //    endOfView = false
        
        do { //DO
            String[] inputs = this.getInputs(); //inputs = getInputs()
                        
            if (inputs.length < 1 || inputs[0].toUpperCase() == "Q"){ 
            //IF no inputs were entered OR the first input is Q
                return; //RETURN
            } //ENDIF
 
            endOfView = doAction(inputs);
            
        }while (endOfView != true); //WHILE endOfView != true
    }
        private String[] getInputs() { //    getInputs(): String[] {
       
            String[] inputs = new String[4];// inputs = new String array whose length = no. of inputs

                System.out.println(
            "========================================= "
            + "\n\t   MAIN MENU "
            + "\n========================================="
            + "\n N - Start new game " 
            + "\n R - Restart an existing game " 
            + "\n H - Get help on how to play the game " 
            + "\n Q - Quit game "
            + "\n=========================================\n ");// Display the instructions

            boolean valid = false; //valid = false

            while (valid == false) { //WHILE valid == false (while input value is not valid)
                System.out.println("**** Please make a selection ***"); //Display the prompt message
                Scanner inFile; //Get the value entered from the keyboard
                    inFile = new Scanner(System.in);
                    inputs[0] = inFile.nextLine().trim(); //Trim off leading and trailing blanks from the value

                    if (inputs[0].length() < 1) {//IF length of the value < 1 then
                       System.out.println("**** No selection was made ***"); //Display "You must enter a value.”
                       continue; //Continue
                    }//ENDIF
                    //Assign value to the next position in the inputs array          
            valid = true; //valid = true
            } //ENDWHILE
            return inputs;//RETURN inputs
        }

    private boolean doAction(String[] inputs) { // doAction(inputs): boolean {

        String menuItem = inputs[0].toUpperCase(); 
        // menuItem = first element in inputs array
        // convert menuItem to upper case

        switch(menuItem) {// SWITCH menuItem
            case "N": menuItem = "N";
                startNewGame(); // “N”: startNewGame()
                break;
            case "R": menuItem = "R";
                restartGame();// “R”: restartGame()
                break;
            case "H": menuItem = "H";
                getHelp();// “H”: getHelp()
                break;
            case "Q": menuItem = "Q";
                return true;// "Q" RETURN TRUE
            default: System.out.println("Invalid Menu item.");// DEFAULT: DISPLAY “Invalid menu item.”
        }// ENDSWITCH    
        return false;// RETURN false
    }

    private void startNewGame() {// startNewGame(): void {
        GameControl.createNewGame(PioneerTrail.getPlayer());//Create a new game
        
        GameMenuView gameMenuView = new GameMenuView(); // gameMenuView = create a new GameMenuView object
        gameMenuView.displayGameMenuView();// gameMenuView.displayGameMenuView();     
    }

    private void restartGame() {// restartNewGame(): void {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
        // startExistingGameView = Create a new StartExistingGameView
        // startExistingGameView.displayStartExistingGameView();
    }

    private void getHelp() { //getHelp(): void {
        HelpMenuView helpMenuView = new HelpMenuView();// helpMenuView = Create a new HelpMenuView
        helpMenuView.displayHelpMenuView();
        // helpMenuView.displayHelpMenuView();
    }

}