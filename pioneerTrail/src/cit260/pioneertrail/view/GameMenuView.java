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
                + "\n\t    P - Print Party Status "
                + "\n\t    M - Show the Map "
                + "\n\t    G - Gather Resources "
                + "\n\t    R - Repair Wagon "
                + "\n\t    Q - Quit To Main Menu "
                + "\n====================================================\n "
        );

    }

    @Override
    public boolean doAction(String inputs) {
        inputs = inputs.toUpperCase();
        switch (inputs) {

            case "S":
                saveGame();
                break;
            case "L":
                loadGame();
                break;
            case "I":
                displayInventoryView();
                break;
            case "P":
                displayPlayerView();
                break;
            case "M":
                displayMapView();
                break;
            case "G":
                displayGatherView();
                break;

        }

        return false;
    }

    private void displayMapView() { //public void displayMap(){
         MapView mapView = new MapView();
         mapView.displayMap();
         mapView.display();
    }

    private void loadGame() {
        StartExistingGameView loadGame = new StartExistingGameView();
        loadGame.display();
    }

    private void saveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
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

    private void displayPlayerView() {
        PlayerView playerview = new PlayerView();
        playerview.display();
    }

}
