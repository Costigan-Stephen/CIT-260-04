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
    public void display(String type) {  
        
        if(!"part".equals(type)) { //Repair part
           displayMenu(type); 
        }
        
        boolean endOfView = false; 
        
        do { 
            String[] inputs = this.getInputs(type); 
            endOfView = doAction(inputs, type);
            
        }while (endOfView != true); 
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
    public String[] getInputs(String type) { //One character menu entries
            boolean valid = false;
            String[] inputs = new String[1];

            do {     
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                input = input.trim();
                input = input.toUpperCase();

                if(input.length() < 1){
                    System.out.print("");//simply reprint menu
                    displayMenu(type);
                } else {
                    char y;
                    y = input.charAt(0);
                    inputs[0] = Character.toString(y);
                    
                    valid = true;
                }

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
<<<<<<< HEAD
                repair  =   RepairView
                gather  =   GatherView
=======
                repair  =   RepairWagon
                part    =   RepairWagon -> Part
>>>>>>> 439ebd273d0d6127f7aa58e53a4a2313e500f651
            */
            
        case "A": inputs[0] = "A";
            if("repair".equals(type)){
                RepairWagon repairPart = new RepairWagon();
                repairPart.repairPart(inputs);
                break;
            }else if(type=="gather"){
                HuntAnimalsView huntAnimalsView = new HuntAnimalsView();
                huntAnimalsView.displayHuntAnimalsView();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "B": inputs[0] = "B";
            if("repair".equals(type)){
                RepairWagon repairPart = new RepairWagon();
                repairPart.repairPart(inputs);
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "C": inputs[0] = "C";
            if("repair".equals(type)){
                RepairWagon repairPart = new RepairWagon();
                repairPart.repairPart(inputs);
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "D": inputs[0] = "D";
            if("help".equals(type)){
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.displayWarehouse();
                break;
            }else if("repair".equals(type)){
                RepairWagon repairPart = new RepairWagon();
                repairPart.repairPart(inputs);
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "E": inputs[0] = "E";
            if("help".equals(type)){
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.displayEstimate();
                break;
            }else if("game".equals(type)){
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.displayRepairView();
                return true;
            }else if("repair".equals(type)){
                RepairWagon repairPart = new RepairWagon();
                repairPart.repairPart(inputs);
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "F": inputs[0] = "F";
            if("repair".equals(type)){
                RepairWagon repairPart = new RepairWagon();
                repairPart.repairPart(inputs);
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "G": inputs[0] = "G";
            if("help".equals(type)){
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.displayGoal();
                break;
            }else if("game".equals(type)){
                GameMenuView gameMenuView = new GameMenuView(); 
                gameMenuView.displayGatherView();
                break;
            }else if(type=="gather"){
                GatherView gatherView = new GatherView();
                gatherView.displayGatherView();
                break;
            }else if("repair".equals(type)){
                RepairWagon repairPart = new RepairWagon();
                repairPart.repairPart(inputs);
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "H": inputs[0] = "H";
            if("help".equals(type)){
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.displayHarvest();
                break;
            }else if("main".equals(type)){
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.displayHelpMenuView();
                break;
            }else if(type=="repair"){
                HelpMenuView helpMenuView = new HelpMenuView();// helpMenuView = Create a new HelpMenuView
                helpMenuView.displayHelpMenuView();
                break; 
            }else if(type=="gather"){
                HelpMenuView helpMenuView = new HelpMenuView();// helpMenuView = Create a new HelpMenuView
                helpMenuView.displayHelpMenuView();

            }else if("repair".equals(type)){
                RepairWagon repairPart = new RepairWagon();
                repairPart.repairPart(inputs);
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "I": inputs[0] = "I";
            if("game".equals(type)){
                GameMenuView gameMenuView = new GameMenuView(); 
                gameMenuView.displayInventoryView();
                break;
            }else if("map".equals(type)){
                GameMenuView gameMenuView = new GameMenuView(); 
                gameMenuView.displayInventoryView();
                break;
           }else if(type=="gather"){
                GatherView gatherView = new GatherView();
                gatherView.displayInventoryView();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "L": inputs[0] = "L";
            if("game".equals(type)){
                GameMenuView gameMenuView = new GameMenuView(); 
                gameMenuView.loadGame();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "M": inputs[0] = "M";
            if("help".equals(type)){
                HelpMenuView helpMenuView = new HelpMenuView();
                helpMenuView.displayMove();
                break;
            }else if("game".equals(type)){
                GameMenuView gameMenuView = new GameMenuView();
                gameMenuView.displayMapView();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "N": inputs[0] = "N";
            if("main".equals(type)){
                GameMenuView gameMenuView = new GameMenuView(); 
                gameMenuView.displayGameMenuView();
                break;
            }else if("part".equals(type)){
                System.out.println("Returning to repair menu...");
                parentMenu(type);
                return true;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "P": inputs[0] = "P";
            if("repair".equals(type)){
                RepairWagon repairPart = new RepairWagon();
                repairPart.availableParts();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "R": inputs[0] = "R";
            if("main".equals(type)){
                StartExistingGameView startExistingGameView = new StartExistingGameView();
                startExistingGameView.displayStartExistingGameView();
                GameControl.createNewGame(PioneerTrail.getPlayer());//Create a new game
                break;
            }else if("game".equals(type)){
                GameMenuView gameMenuView = new GameMenuView(); 
                gameMenuView.displayRepairView();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "S": inputs[0] = "S";
            if("game".equals(type)){
                GameMenuView gameMenuView = new GameMenuView(); 
                gameMenuView.saveGame();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }         
        case "T": inputs[0] = "T";
            if(type == "gather"){
                TradeView tradeView = new TradeView();
                tradeView.displayTradeView();
                break;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }
        case "Y": inputs[0] = "Y";
            if("part".equals(type)){
                RepairWagon repair = new RepairWagon(); 
                repair.repairYes(type);
                displayMenu(type);
                return true;
            }else{
                System.out.println("Invalid value entered");
                displayMenu(type);
                break;
            }

        //////////--------------QUIT/RETURN------------/////////
        case "Q": inputs[0] = "Q";
            if("main".equals(type)){
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

            MainMenuView mainMenuView = new MainMenuView(); 
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
                repair  =   RepairMenu
                gather  =   GatherView
            */
        
        
        switch (type){
            case "main": type = "main";
                MainMenuView mainMenuView = new MainMenuView(); 
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
            case "repair": type = "repair";
                RepairWagon repair = new RepairWagon();
                repair.displayRepairMenu();
                break;
            case "help": type = "help";
                HelpMenuView helpView = new HelpMenuView();
                helpView.displayMenu();
                break;
            case "gather": type = "gather";
                GatherView gatherView = new GatherView();
                gatherView.displayGatherView();
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
                repair  =   RepairMenu
                gather  =   GatherView
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
            case "repair": type = "repair";
                displayMenu("game");
                break;
            case "part": type = "part";
                displayMenu("repair");
                break;
            case "help": type = "help";
                displayMenu("main");
                break;
            case "gather": type = "gather";
                displayMenu("gather");
                break;
        }
    }
}

    
    
    

