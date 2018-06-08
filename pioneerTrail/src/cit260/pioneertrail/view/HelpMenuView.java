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

/**
 *
 * @author Stephen
 */
class HelpMenuView {

    void displayHelpMenuView() {
        boolean endOfView = false;
        
        displayMenu();
        
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
      
        case "G": inputs[0] = "G";
            displayGoal();
            break;
        case "M": inputs[0] = "M";
            displayMove();
            break;
        case "E": inputs[0] = "E";
            displayEstimate();
            break;
        case "H": inputs[0] = "H";
            displayHarvest();
            break;
        case "D": inputs[0] = "D";
            displayWarehouse();
            break;
        case "Q": inputs[0] = "Q";
            MainMenuView.displayMainMenu();
            return true;
        }  
        
        return false;
    }

    private void displayGoal() {
        System.out.println("This is the goal of the game!");
        displayMenu();
    }

    private void displayMove() {
        System.out.println("This is how you move!");
        displayMenu();
    }

    private void displayEstimate() {
        System.out.println("We have SO many resources!");
        displayMenu();
    }

    private void displayHarvest() {
        System.out.println("Harvesting Stuff");
        displayMenu();
    }

    private void displayWarehouse() {
        System.out.println("Warehouse is full!");
        displayMenu();
    }

    private void displayMenu() {
       System.out.println(
        "==================================================== "
        + "\n\t\t   HELP MENU "
        + "\n==================================================== "
        + "\n\t    G - What is the goal of the game? " 
        + "\n\t    M - How to move " 
        + "\n\t    E - Estimate the number of resources " 
        + "\n\t    H - Harvest resources "
        + "\n\t    D - Delivering resources to warehouse "
        + "\n\t    Q - Quit game "
        + "\n====================================================\n\n "
        ); 
    }
    
}
