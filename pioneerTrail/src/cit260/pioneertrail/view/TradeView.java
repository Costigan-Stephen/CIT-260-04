/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

/**
 *
 * @author maril
 */
class TradeView extends View {

    public TradeView() {
        super("WELCOME TO THE TRADE!:\n"
                + "\nIn this location you can trade with natives to get needed"
                + "\nsupplies for your journey. If you have items that are "
                + "\nuseful to bargin with, you will be able to trade.\n"
                + "==================================================== "
                + "\n\t\t   TRADING MENU "
                + "\n===================================================="
                + "\n\t T - Trade an Item "
                + "\n\t I - See inventory "
                + "\n\t H - Get help on how to play the game"
                + "\n\t L - Print Locations with Resources "
                + "\n\t Q - Quit Hunt "
                + "\n====================================================\n ");
    }

    @Override
    public boolean doAction(String inputs) {
        inputs = inputs.toUpperCase();
        
        switch (inputs) {

            case "T":
                getTrade();
                break;
            case "I":
                displayInventoryView();
                break;
            case "L":
                displaySceneReportView();
            case "H":
                displayMapView();
                break;
        }

        return false;
    }

    private void displayInventoryView() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.display();
    }

    private void displayMapView() {
        MapView mapview = new MapView();
        mapview.display();
    }

    private void getTrade() {
        this.console.println("This calls a fictional TradeControl");
    }

    private void displaySceneReportView() {
//        SceneReportView sceneReportView = new SceneReportView();
//        sceneReportView.display();
    }


}
