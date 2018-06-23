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
public class ShopView extends View {
    
    public ShopView() {
        super(
                "==================================================== "
                + "\n\t\t   Shop View"
                + "\n==================================================== "
                + "\n\t    A - Ammo "
                + "\n\t    F - Food "
                + "\n\t    M - Medicine "
                + "\n\t    I - Inventory "
                + "\n====================================================\n\n ");
    }
    
    @Override
    public boolean doAction(String input) {
        String menuItem = input.toUpperCase(); // menuItem = first element in inputs array & convert menuItem to upper case   
        
        if (menuItem.equals("A")) {
            System.out.println("valid value entered");
            return true;
        } else if (menuItem.equals("B")) {
            System.out.println("valid value entered");
            return true;
        } else if (menuItem.equals("M")) {
            System.out.println("valid value entered");
            return true;
        } else if (menuItem.equals("I")) {
            System.out.println("valid value entered");
            return true;
        } else {
            System.out.println("Invalid value. Please try again.");
            return true;
        }
//        return false;// RETURN false
//        //ENDIF
    }
}
