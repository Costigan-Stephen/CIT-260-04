/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.MapControl;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Map;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
public class MapView extends View {

    public MapView() {
        
        super("\n"
                + "\n------------------------------------------"
                + "\n Enter your desired location "
                + "\n------------------------------------------");

        Game game = PioneerTrail.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        String rightIndicator = "";
        String leftIndicator = "";

        System.out.print(
                "  |"); // Build the heading of the map
        for (int column = 0;
                column < locations[0].length;
                column++) { // print col numbers to side of map
            System.out.print("  " + column + " |");

            // Now build the map.  For each row, show the column information
            System.out.println();

            for (int row = 0; row < locations.length; row++) {

                System.out.print(row + " "); // print row numbers to side of map
                for (Location item : locations[row]) {
                    // set default indicators as blanks
                    rightIndicator = " ";
                    if (item == map.getCurrentLocation()) {
                        // Set star indicators to show this is the current location.
                        leftIndicator = "*";
                        rightIndicator = "*";
                    } else if (item.isVisited()) {
                        // Set < > indicators to show this location has been visited.
                        leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                        rightIndicator = "<"; // same as above
                    }
                    System.out.print("|"); // start map with a |
                    if (item.getScene() == null) {
                        leftIndicator = null;
                        // No scene assigned here so use ?? for the symbol
                        System.out.print(leftIndicator + "??" + rightIndicator);
                    } else {
                        leftIndicator = null;
                        System.out.print(leftIndicator + item.getScene().getMapSymbol() + rightIndicator);
                    }
                }
                System.out.println("|");
            }
        }

    }
//        promptMessage = GridDraw();
//    private static String GridDraw() {
//        Location location = new Location();
//
//        String mapGrid = "####################################################"
//                + "\n\t\t PIONEER TRAIL MAP ";
//
//        location.row = 45;
//        location.column = 8;
//        int zionX = 4;
//        int zionY = 8;
//        int l = 52;
//        int h = 12;
//        char b = '#'; // Border
//        char t = '.';
//        char c = 'O'; // PLAYER
//        char z = 'Z'; // END POINT, ZION
//        char m;
//        int x;
//        int y = 1;
//
//        mapGrid = "       [" + b + "] - Border  [" + c + "] - Player  [" + z + "] - Zion       \n";
//
//        for (int i = 0; i < h; i++) {
//
//            x = 0;
//            for (int k = 0; k < l; k++) {
//                x++;
//                if (x == location.getRow() && y == location.getColumn()) {
//                    m = c;
//                } else if (x == zionX && y == zionY) {
//                    m = z;
//                } else if (k == (l - 1) || x == 1) {
//                    m = b;
//                } else if (y == 1 || y == h) {
//                    m = b;
//                } else {
//                    m = t;
//                }
////                checklocation(x,y);
////                System.out.print(m);
//                mapGrid += m;
//            }
////            System.out.println();
//            mapGrid += "\n";
//            y++;
//        }
//        mapGrid += "\t    Q - Return to Menu  I - Inventory "
//                + "\n####################################################\n ";
//        return mapGrid;
//    }

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
//    @Override
//    public boolean doAction(String input) {
//
//        switch (input) {
//
//            case "I":
//                displayInventoryView();
//                break;
//        }
//
//        return false;
//
//    }
    @Override
    public boolean doAction(String mapOption) {
        mapOption = mapOption.toUpperCase();
        Game game = PioneerTrail.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[row].length; column++) {
                if (locations[row][column].getScene() != null) {
                    if (mapOption.equals(locations[row][column].getScene().getMapSymbol())) {
                        MapControl.movePlayer(map, row, column);
                        return true;
                    }
                }
            }
        }
        System.out.println("\n*** Invalid selection *** Try Again later");
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
