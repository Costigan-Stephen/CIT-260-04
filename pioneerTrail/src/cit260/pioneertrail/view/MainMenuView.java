/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.GameControl;
import cit260.pioneertrail.model.Player;
import java.util.Arrays;
import java.util.Scanner;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
public class MainMenuView {

    public MainMenuView() {
    }
    
    public static void displayMainMenu() {
        System.out.println(
        "==================================================== "
        + "\n\t\t   MAIN MENU "
        + "\n==================================================== "
        + "\n\t    N - Start new game " 
        + "\n\t    R - Restart an existing game " 
        + "\n\t    H - Get help on how to play the game " 
        + "\n\t    Q - Quit game "
        + "\n====================================================\n\n "
        );
    }
    
    void displayMainMenuView() {
        boolean endOfView = false;
        
        displayMainMenu();
        
        do{
           String[] inputs = this.getInputs();
           endOfView = doAction(inputs); 
        }while (endOfView == false);
    }
    
    private String[] getInputs() {
        
        boolean valid = false;
        String[] inputs = new String[1];

        do {     

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            input = input.trim();
            input = input.toUpperCase();

            //Put input into String
            char y;
            y = input.charAt(0);
            inputs[0] = Character.toString(y);
            
            if(input.length() < 1){
                System.out.println("Invalid value entered");
                System.out.println("You must enter a non-blank value");
                continue;
            } 

             valid = true;
        
        } while (valid == false);
        return inputs;
    }
    private boolean doAction(String[] inputs) {
      
      switch (inputs[0]){
      
        case "N": inputs[0] = "N";
            startNewGame();
            break;
        case "R": inputs[0] = "R";
            restartGame();
            break;
        case "H": inputs[0] = "H";
            getHelp();
            break;
        case "Q": inputs[0] = "Q";
            System.out.println("Quitting Game");
            return true;
      }  
        
      return false;

    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }

    private void restartGame() {
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
    }

    private void startNewGame() {
        GameControl.createNewGame(PioneerTrail.getPlayer());
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

}
