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
public class StartProgramView {
    
    public StartProgramView(){
        
    }
    
    public void displayStartProgramView() {
        
        System.out.print("\033[H\033[2J"); //Clears Screen
        System.out.println(
        "\n==================================================== " 
        + "\n\t    Welcome to our game "
        + "\nThe Pioneer Trail game is a text based role playing game. "
        + "\nIn this game, you will be a pioneer family who leads a "
        + "\nwagon train preparing to go west. You have suffered "
        + "\nconstant religious persecution and wish to find freedom" 
        + "\nand a new life in a better place. You have heard of a place"
        + "\ncalled Zion in the mountains that offers such freedom and "
        + "\nare eager to start your journey." 
                
        + "\n\nYour family is composed of both parents and three children."
        + "\nBefore starting the long journey of 1,500 miles, you must "
        + "\nbuy a series of items necessary for the trip, such as: "
        + "\nclothing, food, water, tools, spare parts for the wagon, "
        + "\nweapons, ammunition, etc. You must plan carefully so that "
        + "\nyou will have the items you need before you begin your journey."

        + "\n\nProblems may arise during the trip, such as illness or "
        + "\ndeath of family members, snake bites, broken wagons, "
        + "\nadverse weather conditions, etc. You will have the "
        + "\nopportunity to hunt if you have weapons and ammunition "
        + "\nwhen you spot a bison, or an elk. If you have the needed "
        + "\nsupplies you could repair your damaged wagon, and fish when "
        + "\narriving at a lake or river. You will also have to stop to "
        + "\nrest from time to time, due to weak animals or to obtain food. "
        + "\nThe game is over when at least two family members have reached "
        + "\nZion." +    
        "\n====================================================\n\n "
        );
        
        boolean endOfView = false;
        String[] inputs = this.getInputs();
        do{
            endOfView = doAction(inputs);
        }while (endOfView == false);
    }
    
    private String[] getInputs() {
        
        boolean valid = false;
        String[] inputs = new String[16];

        do {     
            
            System.out.println("Please enter your name:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            input = input.trim().replace(" ", "_");

            //TRIM BY FORCED CLIPPING
            char y;
            for(int x=0;x<input.length()&&x<16;x++){
               y = input.charAt(x);
               inputs[x] = Character.toString(y);
            }

            if(input.length() < 1){
                System.out.println("Invalid value entered, You must enter a non-blank value");
            } else {
            return inputs;
        }  
        
        } while (valid == false);
        return inputs;
    }
    
    private boolean doAction(String[] inputs) {
        
        String playerName = null;
        if (playerName == null){
            playerName = Arrays.toString(inputs);
            playerName = playerName.substring(0, playerName.length()-1).replace("null", "").replace(",", "").replace("[", "").replace("]", "").replace(" ", "").replace("_", " ");
            
            Player player = GameControl.savePlayer(playerName);
            
        } else {
          return false;
        }
        System.out.print("\033[H\033[2J"); //Clears Screen
        System.out.println(
        "\n==================================================== " +
        "\n\t      Welcome aboard " + playerName + "!"   
        );
            
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
            
        return true;

    }
    
}

