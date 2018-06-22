/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.GameControl;
import cit260.pioneertrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author Stephen
 */
public class StartProgramView extends View {
    
    public StartProgramView(){
        
    }
    
    public void displayStartProgramView() {
        
        System.out.print("\033[H\033[2J"); //Clears Screen
        System.out.println("\n"
        + " _______   _                                        _                   _   __  \n" +
"|_   __ \\ (_)                                      / |_                (_) [  | \n" +
"  | |__) |__   .--.   _ .--.  .---.  .---.  _ .--.`| |-'_ .--.  ,--.   __   | | \n" +
"  |  ___/[  |/ .'`\\ \\[ `.-. |/ /__\\\\/ /__\\\\[ `/'`\\]| | [ `/'`\\]`'_\\ : [  |  | | \n" +
" _| |_    | || \\__. | | | | || \\__.,| \\__., | |    | |, | |    // | |, | |  | | \n" +
"|_____|  [___]'.__.' [___||__]'.__.' '.__.'[___]   \\__/[___]   \\'-;__/[___][___]"
        + "\n==================================================== " 
        + "\n BY Marilee Austin, Joseph Hughes, and Stephen Costigan"
        + "\n\nPress Enter to continue...");
    
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        
        System.out.println("\n\t    Welcome to our game [1/3]"
        + "\n==================================================== " 
        + "\nThe Pioneer Trail game is a text based role playing game. "
        + "\nIn this game, you will be a pioneer family who leads a "
        + "\nwagon train preparing to go west. You have suffered "
        + "\nconstant religious persecution and wish to find freedom" 
        + "\nand a new life in a better place. You have heard of a place"
        + "\ncalled Zion in the mountains that offers such freedom and "
        + "\nare eager to start your journey."
        + "\n\nPress Enter to continue...");
    
        scanner = new Scanner(System.in);
        scanner.nextLine(); 
        
        System.out.println("\n\t    Welcome to our game [2/3]"
        + "\n==================================================== "        
        + "\n...Your family is composed of both parents and three children."
        + "\nBefore starting the long journey of 1,500 miles, you must "
        + "\nbuy a series of items necessary for the trip, such as: "
        + "\nclothing, food, water, tools, spare parts for the wagon, "
        + "\nweapons, ammunition, etc. You must plan carefully so that "
        + "\nyou will have the items you need before you begin your journey."
        + "\nProblems may arise during the trip, such as illness or "
        + "\ndeath of family members, etc."
        + "\n\nPress Enter to continue...");
    
        scanner = new Scanner(System.in);
        scanner.nextLine(); 
        
        System.out.println("\n\t    Welcome to our game [3/3]"
        + "\n==================================================== "  
        + "\n...You will have the opportunity to hunt if you have "
        + "\nweapons and ammunition when you spot a bison, or an elk. "
        + "\nThis will be a perilous journey; If you have the needed "
        + "\nsupplies you could repair your damaged wagon, and fish when "
        + "\narriving at a lake or river. You will also have to stop to "
        + "\nrest from time to time, due to weak animals or to obtain food. "
        + "\nThe game is over when at least two family members have reached "
        + "\nZion.  Are you up for this tremendous undertaking?"    
        + "\n\nPress Enter to get started!");
        
        scanner = new Scanner(System.in);
        scanner.nextLine();
        String inputs = "";
        
        displayStart(inputs);
        
        
    }
    
}

