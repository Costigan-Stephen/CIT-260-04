/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.ResourceControl;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneettrail.exceptions.ResourceControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pioneertrail.PioneerTrail;

/**
 *
 * @author maril
 */
public class HuntAnimalsView extends View {

    public HuntAnimalsView() {
        super("WELCOME TO THE HUNT!:\n"
                + "\nIn this location you can fire your weapon and have the "
                + "\nopportunity to find food for your family. You'll need to "
                + "\nfirst choose how many bullets you would like to use. Once"
                + "\npress enter, your weapon will fire and the result of your"
                + "\nhunt will be displayed.\n"
                + "==================================================== "
                + "\n\t\t   HUNTING MENU "
                + "\n===================================================="
                + "\n\t B - Enter number of bullets to use "
                + "\n\t I - See inventory "
                + "\n\t H - Get help on how to play the game "
                + "\n\t Q - Quit Hunt "
                + "\n====================================================\n ");// Display the instructions
    }

    @Override
    public boolean doAction(String input)  { //doAction(inputs): boolean {
        String menuItem = input.toUpperCase(); // menuItem = first element in inputs array & convert menuItem to upper case   

        if (menuItem.equals("B")) {
            startNewHunt(); //Call a Control Layer method to perform the action 
        } else if (menuItem.equals("I")) {
            displayInventoryView();
        } else if (menuItem.equals("H")) {
            displayHelpMenuView();
        } else {
            System.out.println("Invalid value. Please try again.");
            return true;
        }
        return false;// RETURN false
        //ENDIF
    }

    private void startNewHunt() {
        InventoryItem inventoryItem = new InventoryItem();
        inventoryItem.setItemName("Bullets"); //needs to get the name from inventory. This is a placeholder
        inventoryItem.setQuantityOfItems(2); //needs to check the inventory of the player This is a placeholder
        inventoryItem.setInventoryType("Ammo"); //needs to get type from inventory this is a placeholder
        double result = 0;
        try {
            result = ResourceControl.calcHuntingResource(PioneerTrail.getPlayer().getHunger(), inventoryItem); //calls the control layer and should output the result to the screen
        } catch (ResourceControlException ex) {
            System.out.println(ex.getMessage());;
        }
        System.out.println(result);
    }

    private void displayInventoryView() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.display();
    }

    private void displayHelpMenuView() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void displayMainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}
