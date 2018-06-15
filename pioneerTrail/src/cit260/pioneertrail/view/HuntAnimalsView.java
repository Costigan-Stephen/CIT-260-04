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

    private boolean doAction(String[] inputs) {
                String menuItem = inputs[0].toUpperCase(); 
        // menuItem = first element in inputs array
        // convert menuItem to upper case

        switch(menuItem) {// SWITCH menuItem
            case "B": menuItem = "B";
                startNewHunt();
                break;
            case "I": menuItem = "I";
                getInventory();// “R”: restartGame()
                break;
            case "H": menuItem = "H";
                getHelp();// “H”: getHelp()
                break;
            case "Q": menuItem = "Q";
                return true;// “E”: RETURN true
            default: System.out.println("Invalid Menu item.");// DEFAULT: DISPLAY “Invalid menu item.”
        }// ENDSWITCH    
        return false;// RETURN false
    }

    private void getInventory() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.displayInventoryView();
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();
    }

    private void startNewHunt() {
        ResourceControl.createNewHunt(PioneerTrail.getPlayer());
    }
}


    