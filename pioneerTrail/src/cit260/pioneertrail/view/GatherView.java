/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;
import cit260.pioneertrail.control.ResourceControl;
import java.util.Scanner;
import pioneertrail.PioneerTrail;

/**
 *
 * @author maril
 */
public class GatherView extends View{
    
    public GatherView() {
    }     
       
    public void displayMenu() {        
            System.out.println(
            "==================================================== "
            + "\n\t      GATHER RESOURCES MENU "
            + "\n\t  You have reached a location with "
            + "\n\t  available resources."
            + "\n===================================================="
            + "\n\t A - Hunt for animals " 
            + "\n\t T - Trade with Natives "
            + "\n\t I - View Inventory " 
            + "\n\t H - Help "
            + "\n\t Q - Quit "
            + "\n====================================================\n ");// Display the instructions     
    }
    
        public void displayGatherView(){
        display("gather");
        
    }

//    private boolean doAction(String[] inputs) {
//        
//       String menuItem = inputs[0].toUpperCase(); 
//        // menuItem = first element in inputs array
//        // convert menuItem to upper case
//
//        switch(menuItem) {// SWITCH menuItem
//            case "A": 
//                getAnimals();
//                break;
//            case "T": 
//                System.out.println("**** Possible Scene/Control for Trading ***");
//                break;
//            case "I": 
//                getInventory();
//                break;
//            case "H": 
//                getHelp();
//                break;
//            default: System.out.println("Invalid Menu item.");// DEFAULT: DISPLAY “Invalid menu item.”
//            
//        }// ENDSWITCH  
//        
//        return false;// RETURN false
//    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }

    private void getInventory() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.displayInventoryView();
    }

    private void getAnimals() {         
        HuntAnimalsView huntAnimalsView = new HuntAnimalsView();
        huntAnimalsView.displayHuntAnimalsView();
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    void displayInventoryView() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.displayInventoryView();
    }
    
}
