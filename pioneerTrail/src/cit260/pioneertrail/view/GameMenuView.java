/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

/**
 *
 * @author Stephen
 */
class GameMenuView extends View{

    public GameMenuView(){
        
    }
    
    public static void main(String[] args){ //Temporary incorporated to see it working and until it is implemented elsewhere!  Will be connected to inventory.
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
        
    }
    
    public void displayGameMenu() {
        System.out.println(
        "==================================================== "
        + "\n\t\t   GAME MENU "
        + "\n==================================================== "
        + "\n\t    S - Save your Game " 
        + "\n\t    L - Load a Saved Game " 
        + "\n\t    I - View Inventory "
        + "\n\t    M - Show the Map "
        + "\n\t    G - Gather Resources "
        + "\n\t    R - Repair Wagon "
        + "\n\t    E - Exit and Return to Game "
        + "\n\t    Q - Quit To Main Menu "
        + "\n====================================================\n\n "
        );
    }
    
    public void displayGameMenuView(){
        
        display("game");
        
    }

    void displayMapView() {
        MapView mapview = new MapView();
        mapview.displayMapView();
    }

    void loadGame() {
        System.out.println("Loading Game...");
        
        displayGameMenu();
    }

    void saveGame() {
        System.out.println("Game Saved...");
        
        displayGameMenu();
    }

    void mainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }

    void displayInventoryView() {
        InventoryView inventory = new InventoryView();
        inventory.displayInventoryView();
    }

    void displayGatherView() {
        GatherView gatherView = new GatherView();
        gatherView.displayGatherView();
    }
    
    void displayRepairView() {
        RepairWagon repairView = new RepairWagon();
        repairView.displayRepairView();
    }

}
