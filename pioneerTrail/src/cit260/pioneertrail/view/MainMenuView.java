/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;
import cit260.pioneertrail.control.GameControl;
import cit260.pioneertrail.model.Player;
import java.util.Scanner;
import pioneertrail.PioneerTrail;

/**
 *
 * @author maril
 */
public class MainMenuView extends View{
    
    public MainMenuView() {
    }
        
    public void displayMainMenuView() {  //displayStartProgramView() {
//        viewMenu();
        display("main");
    }

    public void viewMenu() {
        System.out.println(
            "========================================= "
            + "\n\t   MAIN MENU "
            + "\n========================================="
            + "\n N - Start new game " 
            + "\n R - Restart an existing game " 
            + "\n H - Get help on how to play the game " 
            + "\n Q - Quit game "
            + "\n=========================================\n ");// Display the instructions
    }

}