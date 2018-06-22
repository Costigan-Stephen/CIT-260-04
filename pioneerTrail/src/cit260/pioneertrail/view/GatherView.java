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
public class GatherView {
    
    public GatherView() {
    }
    
    public void displayGatherView() {
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

    private String[] getInputs() {
                    String[] inputs = new String[5];// inputs = new String array whose length = no. of inputs

                System.out.println(
            "==================================================== "
            + "\n\t      GATHER RESOURCES MENU "
            + "\n\t  You have reached a location with "
            + "\n\t  available resources."
            + "\n===================================================="
            + "\n\t A - Hunt for animals " 
            + "\n\t G - Gather firewood " 
            + "\n\t T - Trade with Natives "
            + "\n\t I - View Inventory " 
            + "\n\t H - Help "
            + "\n\t Q - Quit "
            + "\n====================================================\n ");// Display the instructions

            boolean valid = false; //valid = false

            while (valid == false) { //WHILE valid == false (while input value is not valid)
                System.out.println("**** Please make a selection ***"); //Display the prompt message
                Scanner inFile; //Get the value entered from the keyboard
                    inFile = new Scanner(System.in);
                    inputs[0] = inFile.nextLine().trim(); //Trim off leading and trailing blanks from the value

                    if (inputs[0].length() < 1) {//IF length of the value < 1 then
                       System.out.println("**** You must enter a value ***"); //Display "You must enter a value.”
                       continue; //Continue
                    }//ENDIF
                    //??? Assign value to the next position in the inputs array  ????        
            valid = true; //valid = true
            } //ENDWHILE
            return inputs;//RETURN inputs
    }

    private boolean doAction(String[] inputs) {
        
       String menuItem = inputs[0].toUpperCase(); 
        // menuItem = first element in inputs array
        // convert menuItem to upper case

        switch(menuItem) {// SWITCH menuItem
            case "A": 
                getAnimals();
                break;
            case "G": 
                System.out.println("**** Possilbe Scene/Control for Gathering ***");
                break;
            case "T": 
                System.out.println("**** Possible Scene/Control for Trading ***");
                break;
            case "I": 
                getInventory();
                break;
            case "H": 
                getHelp();
                break;
            default: System.out.println("Invalid Menu item.");// DEFAULT: DISPLAY “Invalid menu item.”
            
        }// ENDSWITCH  
        
        return false;// RETURN false
    }

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
    
}
