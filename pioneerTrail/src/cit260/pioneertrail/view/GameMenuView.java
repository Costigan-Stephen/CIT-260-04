/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

;

/**
 *
 * @author Stephen
 */
class GameMenuView extends View {

    public GameMenuView() {
        super(
                "==================================================== "
                + "\n\t\t   GAME MENU "
                + "\n==================================================== "
                + "\n\t    S - Save your Game "
                + "\n\t    L - Load a Saved Game "
                + "\n\t    I - View Inventory "
                + "\n\t    M - Show the Map "
                + "\n\t    G - Gather Resources "
                + "\n\t    R - Repair Wagon "
                + "\n\t    Q - Quit To Main Menu "
                + "\n====================================================\n\n "
        );

    }

    @Override
    public boolean doAction(String input) {
        switch (input) {

            case "S":
                saveGame();
                break;
            case "L":
                loadGame();
                break;
            case "I":
                displayInventoryView();
                break;
            case "M":
                displayMapView();
                break;
            case "G":
                displayGatherView();
                break;
//       case "R":
//           displayRepairWagon();
//           break;

        }

        return false;
    }

    private void displayMapView() { //public void displayMap(){
         MapView mapView = new MapView();
         mapView.display();
    }

    private void loadGame() {
        System.out.println("Loading Game...");
    }

    private void saveGame() {
        System.out.println("Game Saved...");

    }

    private void displayInventoryView() {
        InventoryView inventory = new InventoryView();
        inventory.display();
    }

    private void displayGatherView() {
        GatherView gatherView = new GatherView();
        gatherView.display();
    }

    private void displayRepairView() {
        RepairWagon repairView = new RepairWagon();
        repairView.display();
    }

}
