/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.GameControl;
import static cit260.pioneertrail.view.MainMenuView.displayMainMenu;
import java.util.Scanner;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
class GameMenuView {

    public GameMenuView(){
        
    }
    
    public static void main(String[] args){ //Temporary incorporated to see it working and until it is implemented elsewhere!  Will be connected to inventory.
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
    }
    
    public static void displayGameMenu() {
        System.out.println(
        "==================================================== "
        + "\n\t\t   Game MENU "
        + "\n==================================================== "
        + "\n\t    S - Save your Game " 
        + "\n\t    L - Load a Saved Game " 
        + "\n\t    I - View Inventory "
        + "\n\t    M - Show the Map "
        + "\n\t    Q - Quit To Main Menu "
        + "\n\t    R - Return to Game "
        + "\n====================================================\n\n "
        );
    }
    
    void displayGameMenuView() {
        boolean endOfView = false;
        
        displayGameMenu();
        
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
      
        case "S": inputs[0] = "S";
            saveGame();
            break;
        case "L": inputs[0] = "L";
            loadGame();
            break;
        case "I": inputs[0] = "I";
            displayInventoryView();
            break;
        case "M": inputs[0] = "M";
            displayMapView();
            break;
        case "Q": inputs[0] = "Q";
            mainMenu();
            return true;
        case "R": inputs[0] = "R";
            System.out.println("Returning to Game");
            return true;
      }  
        
      return false;

    }

    private void displayMapView() {
        MapView mapview = new MapView();
        mapview.displayMapView();
    }

    private void loadGame() {
        System.out.println("Loading Game...");
        
        displayGameMenu();
    }

    private void saveGame() {
        System.out.println("Game Saved...");
        
        displayGameMenu();
    }

    private void mainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }

    private void displayInventoryView() {
        InventoryView inventory = new InventoryView();
        inventory.displayInventoryView();
    }
}
