/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import java.util.Scanner;

/**
 *
 * @author Joseph hughes
 */
public class InventoryView {
    
   public static void displayInventoryView() {
        System.out.println(
        "==================================================== "
        + "\n\t\t   Inventory MENU "
        + "\n==================================================== "
        + "\n\t    M - Money " 
        + "\n\t    O - Oxen" 
        + "\n\t    F - Food " 
        + "\n\t    Q - Return to the game "
        + "\n====================================================\n\n "
        );
    }
   int showMoney(){

       return 100;
   }
   int showOxen(){
       
       
      return 12;
   }
   void showFood(){
   
   
   }
    private String[] getInputs() {
        boolean valid = false;
        String[] inputs = new String[1];

        do {     

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            input = input.trim();
            input = input.toUpperCase();

            //Put input into String
            char y;
            y = input.charAt(0);
            inputs[0] = Character.toString(y);
            
            if(input.length() < 1){
                System.out.println("Invalid value entered");
                System.out.println("You must enter a non-blank value");
                continue;
            } 

             valid = true;
        
        } while (valid == false);
        return inputs;
    }

        //STUFF
    
    private boolean doAction(String[] inputs) {
      
      switch (inputs[0]){
      
        case "S":
            break;
        case "M":
            showMoney();
            break;
            //Number of Oxen
        case "O": 
            showOxen();
            ;
            break;
        case "F":
            showFood();
            break;
        case "Q": inputs[0] = "Q";
            System.out.println("Returning to Game");
            return true;
      }  
      return true;  
     }
}
