/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.model.Location;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
public class MapView extends View {

    public MapView() {
        promptMessage = GridDraw();

    }

    private static String GridDraw() {
        Location location = new Location();

        String mapGrid = "####################################################"
                + "\n\t\t PIONEER TRAIL MAP ";

        location.row = 45;
        location.column = 8;
        int zionX = 4;
        int zionY = 8;
        int l = 52;
        int h = 12;
        char b = '#'; // Border
        char t = '.';
        char c = 'O'; // PLAYER
        char z = 'Z'; // END POINT, ZION
        char m;
        int x;
        int y = 1;

        mapGrid = "       [" + b + "] - Border  [" + c + "] - Player  [" + z + "] - Zion       \n";

        for (int i = 0; i < h; i++) {

            x = 0;
            for (int k = 0; k < l; k++) {
                x++;
                if (x == location.getRow() && y == location.getColumn()) {
                    m = c;
                } else if (x == zionX && y == zionY) {
                    m = z;
                } else if (k == (l - 1) || x == 1) {
                    m = b;
                } else if (y == 1 || y == h) {
                    m = b;
                } else {
                    m = t;
                }
//                checklocation(x,y);
//                System.out.print(m);
                mapGrid += m;
            }
//            System.out.println();
            mapGrid += "\n";
            y++;
        }
        mapGrid += "\t    Q - Return to Menu  I - Inventory "
                + "\n####################################################\n ";
        return mapGrid;
    }

    //    private String[] getInputs() {
//        
//        boolean valid = false;
//        String[] inputs = new String[1];
//
//        do {     
//
//            Scanner scanner = new Scanner(System.in);
//            String input = scanner.nextLine();
//            input = input.trim();
//            input = input.toUpperCase();
//
//            //Put input into String
//            char y;
//            y = input.charAt(0);
//            inputs[0] = Character.toString(y);
//            
//            if(input.length() < 1){
//                System.out.println("Invalid value entered");
//                System.out.println("You must enter a non-blank value");
//                continue;
//            } 
//
//             valid = true;
//        
//        } while (valid == false);
//        return inputs;
//    }
    @Override
    public boolean doAction(String input) {

        switch (input) {

            case "I":
                displayInventoryView();
                break;
        }

        return false;

    }

    void displayInventoryView() {
        InventoryView inventoryview = new InventoryView();
        inventoryview.display();
    }

    public void setMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void createMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
