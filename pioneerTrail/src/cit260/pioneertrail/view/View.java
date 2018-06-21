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
 * @author stephencostigan
 */
        
public abstract class View implements ViewInterfaces {
    
    public View(){  
    }
        
    @Override
    public void display(String type) {  //displayStartProgramView() {
        
        displayMenu(type);

        boolean endOfView = false; //    endOfView = false
        
        do { //DO
            String[] inputs = this.getInputs(); //inputs = getInputs()
                        
            if (inputs.length < 1 || inputs[0].toUpperCase() == "Q"){ 
            //IF no inputs were entered OR the first input is Q
                return; //RETURN
            } //ENDIF
 
            endOfView = doAction(inputs, type);
            
        }while (endOfView != true); //WHILE endOfView != true
    }
        
    @Override
    public void displayStart(String inputs){
            boolean endOfView = false;
            
            do{
                inputs = this.getInputString("\nPlease enter your name: ");
                endOfView = doActionName(inputs);
            }while (endOfView == false);
        }
                  
    @Override
    public String[] getInputs() { //One character menu entries
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
        
    @Override 
    public String getInputString(String promptMessage) { //More than one character
        
        boolean valid = false;
        String inputs = "";

        do {     
            System.out.println(promptMessage);
            Scanner scanner = new Scanner(System.in);
            inputs = scanner.nextLine();

            if(inputs.length() < 1){
                System.out.println("Invalid value entered, You must enter a non-blank value");
            } else {
            return inputs;
        }  
        
        } while (valid == false);
        
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs, String type) {
        switch (inputs[0]){
            
            /*TYPE BREAKDOWN BY CLASS
                main    =   MainMenuView
                help    =   HelpMenuView
                game    =   GameMenuView
                map     =   MapView
            */
        
        case "D": inputs[0] = "D";
            if(type == "help"){
                HelpMenuView helpMenuView = new HelpMenuView();// helpMenuView = Create a new HelpMenuView
                helpMenuView.displayWarehouse();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "E": inputs[0] = "E";
            if(type == "help"){
                HelpMenuView helpMenuView = new HelpMenuView();// helpMenuView = Create a new HelpMenuView
                helpMenuView.displayEstimate();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "G": inputs[0] = "G";
            if(type == "help"){
                HelpMenuView helpMenuView = new HelpMenuView();// helpMenuView = Create a new HelpMenuView
                helpMenuView.displayGoal();
                break;
            }else if(type=="game"){
                GameMenuView gameMenuView = new GameMenuView(); // gameMenuView = create a new GameMenuView object
                gameMenuView.displayGatherView();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "H": inputs[0] = "H";
            if(type == "help"){
                HelpMenuView helpMenuView = new HelpMenuView();// helpMenuView = Create a new HelpMenuView
                helpMenuView.displayHarvest();
                break;
            }else if(type == "main"){
                HelpMenuView helpMenuView = new HelpMenuView();// helpMenuView = Create a new HelpMenuView
                helpMenuView.displayHelpMenuView();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "I": inputs[0] = "I";
            if(type == "game"){
                GameMenuView gameMenuView = new GameMenuView(); // gameMenuView = create a new GameMenuView object
                gameMenuView.displayInventoryView();
                break;
            }else if(type=="map"){
                GameMenuView gameMenuView = new GameMenuView(); // gameMenuView = create a new GameMenuView object
                gameMenuView.displayInventoryView();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "L": inputs[0] = "L";
            if(type == "game"){
                GameMenuView gameMenuView = new GameMenuView(); // gameMenuView = create a new GameMenuView object
                gameMenuView.loadGame();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "M": inputs[0] = "M";
            if(type == "help"){
                HelpMenuView helpMenuView = new HelpMenuView();// helpMenuView = Create a new HelpMenuView
                helpMenuView.displayMove();
                break;
            }else if(type == "game"){
                GameMenuView gameMenuView = new GameMenuView(); // gameMenuView = create a new GameMenuView object
                gameMenuView.displayMapView();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "N": inputs[0] = "N";
            if(type == "main"){
                GameMenuView gameMenuView = new GameMenuView(); // gameMenuView = create a new GameMenuView object
                gameMenuView.displayGameMenuView();// gameMenuView.displayGameMenuView();   
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "R": inputs[0] = "R";
            if(type == "main"){
                StartExistingGameView startExistingGameView = new StartExistingGameView();
                startExistingGameView.displayStartExistingGameView();
                GameControl.createNewGame(PioneerTrail.getPlayer());//Create a new game
                break;
            }else if(type=="game"){
                System.out.println("Returning to Game");
                return true;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "S": inputs[0] = "S";
            if(type == "game"){
                GameMenuView gameMenuView = new GameMenuView(); // gameMenuView = create a new GameMenuView object
                gameMenuView.saveGame();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
            
        //////////QUIT/RETURN, CATCH MISSED QUIT STATEMENTS/////////
        case "Q": inputs[0] = "Q";
            if(type == "main"){
                System.out.println("Exiting Game...");
                System.exit(0);
            }else{
                System.out.println("Returning to Previous Menu...");
                parentMenu(type); //Display parent menu to show options to player.
            }
            return true;
            
        default:
            System.out.println("Invalid value entered");
            displayMenu(type);
            break;
        }
        
        return false;
    }
    
    @Override
    public boolean doActionName(String inputs) {

            String playerName = null;
            if (playerName == null){
                playerName = inputs;

                Player player = GameControl.savePlayer(playerName);

            } else {
                return false;
            }
            System.out.println(
            "\n========================================= " +
            "\n\tWelcome aboard " + playerName + "!"   
            );

            MainMenuView mainMenuView = new MainMenuView(); // gameMenuView = create a new GameMenuView object
            mainMenuView.displayMainMenuView();

            return true;

        }
    
    //SHOW MENU OF THE CURRENT LAYOUT
    private void displayMenu(String type){  //Displays main menu
        
            /*TYPE BREAKDOWN BY CLASS
                main    =   MainMenuView
                help    =   HelpMenuView
                game    =   GameMenuView
                map     =   MapView
            */
        
        
        switch (type){
            case "main": type = "main";
                MainMenuView mainMenuView = new MainMenuView(); // gameMenuView = create a new GameMenuView object
                mainMenuView.viewMenu();
                break;
            case "game": type = "game";
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.displayGameMenu();
                break;
            case "map": type = "map";
                MapView mapView = new MapView();
                mapView.displayMap();
                break;
            case "help": type = "help";
                HelpMenuView helpView = new HelpMenuView();
                helpView.displayMenu();
                break;
        }
    }

    //SHOW MENU OF THE PREVIOUS LAYOUT    
    private void parentMenu(String type){  //Displays main menu
        
            /*TYPE BREAKDOWN BY CLASS
                main    =   MainMenuView
                help    =   HelpMenuView
                game    =   GameMenuView
                map     =   MapView
            */
        
        
        switch (type){
            case "main": type = "main";
                //MAIN DOES NOT HAVE A PARENT MENU
                break;
            case "game": type = "game";
                displayMenu("main");
                break;
            case "map": type = "map";
                displayMenu("game");
                break;
            case "help": type = "help";
                displayMenu("main");
                break;
        }
    }
}

    
    
    

