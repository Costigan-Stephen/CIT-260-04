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
public class InventoryView extends View {

    public InventoryView() {
        super(
                "==================================================== "
                + "\n\t\t   Inventory MENU "
                + "\n==================================================== "
                + "\n\t    M - Money "
                + "\n\t    O - Oxen"
                + "\n\t    F - Food "
                + "\n\t    S - Shop "
                + "\n\t    Q - Return to the game "
                + "\n====================================================\n\n "
        );
    }

    @Override
    public boolean doAction(String input) {
        switch (input) {

            case "M":
                showMoney();
                break;
            //Number of Oxen
            case "O":
                showOxen();
                break;
            case "F":
                showFood();
                break;
            case "S":
                displayShopView();
                break;
        }
        return true;
    }

    static int showMoney() {

        return 100;
    }

    static int showOxen() {

        return 12;
    }

    static void showFood() {

    }

    private static void displayShopView() {
        System.out.println("Hello");
        ShopView shop = new ShopView();
        shop.display();
    }
}
