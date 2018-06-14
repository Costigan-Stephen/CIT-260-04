/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import java.util.Scanner;

/**
 *
 * @author Hughes
 */
public class ShopView {
    
    void displayShopView() {
        //STUFF  System.out.print("\033[H\033[2J"); //Clears Screen
       System.out.println(
        "==================================================== "
        + "\n\t\t   Shop View"
        + "\n==================================================== "
        + "\n\t    A - Ammo " 
        + "\n\t    F - Food " 
        + "\n\t    M - Medicine " 
        + "\n\t    I - Inventory "
        + "\n====================================================\n\n ");
    }
    

 private String[] getInputs() {
        boolean valid = false;
        String[] inputs = new String[1];

        while (valid == false){
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
            if(input == "A"){
                System.out.println("valid value entered");
                valid = true;
            }
            
            else  if(input == "B"){
                System.out.println("valid value entered");
                valid = true;
            }
            else  if(input == "M"){
                System.out.println("valid value entered");
                valid = true;
            }
            else  if(input == "I"){
                System.out.println("valid value entered");
                valid = true;
            }
            else {
                valid = false;
            }
       }
        
        return inputs;
    }
}
            