/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import java.util.Scanner;


/**
 *
 * @author Stephen
 */
class HelpMenuView extends View {

 
public void displayHelpMenuView() {
         
    display("help");
              
}

    void displayGoal() {
        System.out.println("This is the goal of the game!"
                + "\n\nPress Enter to return to menu...");
    
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        displayMenu();
    }

    void displayMove() {
        System.out.println(
    "\nThe program displays a message prompting the player "
    + "\nto enter the direction and distance to move. If either"
    + "\nof the player’s input is are invalid, the program will"
    + "\nshow a message and prompt the player to reenter the values.\n"
    + "\nIf the coordinates are correct, the computer will move "
    + "\nthe player to the selected location. If an obstacle is "
    + "\nencountered along the way, the player is moved to the "
    + "\nlocation and a message is displayed stating what the "
    + "\nobstacle is and the location of the obstacle on the map. "
    + "\nThe amount of the time taken to travel to the new location "
    + "\nis calculated and added to the total time taken. The map "
    + "\nand game menu are then redisplayed.\n\nPress Enter to return to menu...");
    
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        
        displayMenu();
    
//        displayMenu();
    }

    void displayEstimate() {
        System.out.println(
        "The player selects a resource by entering the "
        + "\nrepresentative letter and hitting Enter.  Upon "
        + "\nreceiving an input, the computer then displays"
        + "\na prompt asking the player how much of that "
        + "\nresource they will take with them.  \n" 
        + "\nThe player has a weight limit of 500 pounds, "
        + "\nbut that weight can be compiled of anything in the"
        + "\nlist until that 500 pounds is met. Each item will"
        + "\na weight associated with it. The computer will "
        + "\ncalculate the amount of each item that is added "
        + "\nto the inventory. If the player is above the weight "
        + "\nlimit, the computer will display an error message"
        + "\nprompting the user to enter an amount. \n\nPress Enter to return to menu...");
    
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        displayMenu();
    }

    void displayHarvest() {
        System.out.println(
        "If the current location has no resources, a message "
        + "\nis displayed indicating that there are no resources "
        + "\nto be collected. Then display the game menu.\n"
        + "\n If this location contains resources, a message "
        + "\nwill be displayed and the user can choose what time "
        + "\nof resource they would like to gather or return "
        + "\nthe desired resource to be collected or go back to"
        + "\nthe game menu. If the player selects a resource the"
        + "\nprogram checks the inventory for the necessary tools"
        + "\nto harvest each resource. If the player is missing "
        + "\nthe required tools the program will display a message"
        + "\nindicating that it is not possible to obtain the resource.\n" 
        + "\nIf the player has the tools, the program displays a "
        + "\nmessage that the harvested amount of the selected"
        + "\nresource has been added to the inventory. If the sum "
        + "\nof the harvested resource plus the existing stock of"
        + "\nthat item, surpass the item maximum load capacity,"
        + "\na message will be displayed to the user stating that"
        + "\nthe item stock is full.\n\nPress Enter to return to menu...");
    
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        
        displayMenu();
    }

    void displayWarehouse() {
        System.out.println("Warehouse is full!"
                + "\n\nPress Enter to return to menu...");
    
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        displayMenu();
    }

    public void displayMenu() {
       System.out.println(
        "==================================================== "
        + "\n\t\t   HELP MENU "
        + "\n==================================================== "
        + "\n    G - What is the goal of the game? " 
        + "\n    M - How to move " 
        + "\n    E - Estimate the number of resources " 
        + "\n    H - Harvest resources "
        + "\n    D - Delivering resources to warehouse "
        + "\n    Q - Quit game "
        + "\n====================================================\n\n "
        ); 
    }

    private void displayMainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }


    
}
