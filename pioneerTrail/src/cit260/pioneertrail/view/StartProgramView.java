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
        + "\n\t    Welcome to our game " + 
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

