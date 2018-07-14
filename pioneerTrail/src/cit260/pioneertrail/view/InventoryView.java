/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.GameControl;
import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.Game;
import java.util.ArrayList;
import java.util.Scanner;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Joseph hughes
 */
//public class InventoryView extends View {
//
//    public InventoryView() {
//        super(
//                "==================================================== "
//                + "\n\t\t   Inventory MENU "
//                + "\n==================================================== "
//                + "\n\t    M - Money "
//                + "\n\t    O - Oxen"
//                + "\n\t    F - Food "
//                + "\n\t    S - Shop "
//                + "\n\t    R - Report"
//                + "\n\t    G - Game Over "
//                + "\n\t    Q - Return to the game "
//                + "\n====================================================\n\n ");
//    }
//
//    @Override
//    public boolean doAction(String inputs) {
//        inputs = inputs.toUpperCase();
//        switch (inputs) {
//
//            case "M":
//                showMoney();
//                break;
//            //Number of Oxen
//            case "O":
//                showOxen();
//                break;
//            case "F":
//                showFood();
//                break;
//            case "G":
//                displayEndGameView();
//                break;
//            case "R":
//                displayReportView();
//            case "S":
//                displayShopView();
//                break;
//        }
//        return true;
//    }
//    
//    
//    @Override
//    public boolean doAction(String filePath) {
//        String formatting = "%n%-20s%-20s%-10s%-30s";
//        String output = String.format(formatting,"","   List of Actors in Game","","");
//        output += String.format(formatting, "--------------------", "--------------------", "----------", "------------------------------" );
//        output += String.format(formatting, "Name", "Description", "Health", "Purpose" );
//        output += String.format(formatting, "--------------------", "--------------------", "----------", "------------------------------" );
////        actors.add(new Actor(0, "Samantha", "Mother", 100.0, "Lead the Family"));
//        Game game = PioneerTrail.getCurrentGame();
//        ArrayList<Actor> actor = game.getActors();
//        
//        for (int i=0; i<actor.size(); i++) {
//            double health = actor.get(i).getHealth();
//            output += String.format(formatting, actor.get(i).getName(), actor.get(i).getDescription(), Double.toString(health), actor.get(i).getPurpose());
//        }
//        
//        this.console.println(output);
//        
//        try {
//            GameControl.saveFile(output, filePath);
//        } catch (Exception e){
//            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
//            return false;
//        }
//        this.console.println("File saved successfully at " + filePath);
//        return true;// RETURN false
//    }
//}
//
//        
//        
//    }
//    static int showMoney() {
//
//        return 100;
//    }
//
//    static int showOxen() {
//
//        return 12;
//    }
//
//    static void showFood() {
//
//    }
//
//    private void displayEndGameView() {
//        EndGameView endGameView = new EndGameView();
//        endGameView.display();
//    }
//
//    private void displayShopView() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//}
public class InventoryView extends View {

    public InventoryView() {
        super(
                "==================================================== "
               + "\n Please enter the filename of your report:"
               + "\n==================================================== \n");// Display the instructions  
        
    }
    
    
    @Override
    public boolean doAction(String filePath) {
        String formatting = "%n%-20s%-20s%-10s%-30s";
        String output = String.format(formatting,"","   List of Items in Game","","");
        output += String.format(formatting, "--------------------", "--------------------", "----------", "------------------------------" );
        output += String.format(formatting, "Item",  "Weight", "Type", "Number" );
        output += String.format(formatting, "--------------------", "--------------------", "----------", "------------------------------" );
        output +=String.format(formatting, "Ox", "200", "Inventory", "four");
        output +=String.format(formatting, "Wheel", "20", "Inventory", "five");
        output +=String.format(formatting, "Ax", "2", "Inventory", "two");
       
        Game game = PioneerTrail.getCurrentGame();
//        ArrayList<Actor> actor = game.getActors();
//        
//        for (int i=0; i<actor.size(); i++) {
//            double health = actor.get(i).getHealth();
//            output += String.format(formatting, actor.get(i).getName(), actor.get(i).getDescription(), Double.toString(health), actor.get(i).getPurpose());
//        }
        
        this.console.println(output);
        
        try {
            GameControl.saveFile(output, filePath);
        } catch (Exception e){
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            return false;
        }
        this.console.println("File saved successfully at " + filePath);
        return true;// RETURN false
    }
}
