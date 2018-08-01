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
public class GatherView extends View {

    public GatherView() {
        super(
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

    @Override
    public boolean doAction(String inputs) {

        inputs = inputs.toUpperCase();
        // menuItem = first element in inputs array
        // convert menuItem to upper case

        switch (inputs) {// SWITCH menuItem
            case "A":
                getAnimals();
                break;
            case "T":
                displayTradeView();
            case "I":
                displayInventoryView();
                break;
            case "H":
                getHelp();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "Invalid Menu Item");

        }// ENDSWITCH  

        return false;// RETURN false
    }

    private void getHelp() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void getAnimals() {
        HuntAnimalsView huntAnimalsView = new HuntAnimalsView();
        huntAnimalsView.display();
    }

    private void displayGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    void displayInventoryView() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.display();
    }

    private void displayTradeView() {
        TradeView tradeView = new TradeView();
        tradeView.display();
    }

}
