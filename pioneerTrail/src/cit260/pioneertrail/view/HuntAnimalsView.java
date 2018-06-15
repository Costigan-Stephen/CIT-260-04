/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;
import cit260.pioneertrail.control.ResourceControl;
import cit260.pioneertrail.model.InventoryItem;
import java.util.Scanner;
import pioneertrail.PioneerTrail;

/**
 *
 * @author maril
 */
public class HuntAnimalsView {
    
    public HuntAnimalsView(){
    }

    public void displayHuntAnimalsView() {
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
        System.out.println(""
            + "WELCOME TO THE HUNT!:"
            + "\nIn this location you can fire your weapon and have the "
            + "\nopportunity to find food for your family. You'll need to "
            + "\nfirst choose how many bullets you would like to use. Once"
            + "\npress enter, your weapon will fire and the result of your"
            + "\nhunt will be displayed.");
        
        String[] inputs = new String[4];// inputs = new String array whose length = no. of inputs

        System.out.println(
            "==================================================== "
            + "\n\t\t   HUNTING MENU "
            + "\n===================================================="
            + "\n\t B - Enter number of bullets to use " 
            + "\n\t I - See inventory " 
            + "\n\t H - Get help on how to play the game " 
            + "\n\t Q - Quit Hunt "
            + "\n====================================================\n ");// Display the instructions

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

    private boolean doAction(String[] inputs) { //doAction(inputs): boolean {
        String menuItem = inputs[0].toUpperCase(); // menuItem = first element in inputs array & convert menuItem to upper case   
 
            if (menuItem == "B") {
                startNewHunt(); //Call a Control Layer method to perform the action 
            }   
            else if (menuItem == "I") {
                displayInventoryView();
            }
            else if (menuItem == "H") {
                displayHelpMenuView();
            }
            else if (menuItem == "Q") {
                displayMainMenuView();
            } 
            else {
                System.out.println("Invalid value. Please try again.");
                return true;
            }  
        return false;// RETURN false
        //ENDIF
    }
    
    
        //IF the Control Layer method returns an error then
        // display an error message
        //System.out.println("Sucess Message"); //DISPLAY a success message
        //IF a new view is to be displayed THEN
        // Create the new View
        // Display the new view
        //ENDIF
        //RETURN true  

    private void startNewHunt() {
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.setItemName("Bullets"); //needs to get the name from inventory. This is a placeholder
        inventoryItem.setQuantityOfItems(2); //needs to check the inventory of the player This is a placeholder
        inventoryItem.setInventoryType("Ammo"); //needs to get type from inventory this is a placeholder
        double result = ResourceControl.calcHuntingResource(PioneerTrail.getPlayer().getHunger(), inventoryItem); //calls the control layer and should output the result to the screen
        System.out.println(result);
    }

    private void displayInventoryView() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.displayInventoryView();
    }

    private void displayHelpMenuView() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    } 

    private void displayMainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
}    
            
            

 