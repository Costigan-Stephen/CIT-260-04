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
                "  |"); 
        // Build the heading of the map
        for (int column = 0;
                column < locations[0].length;
                column++) {
            System.out.print("  " + column + " |");
        } 
        //Print out map
        for (int row = 0;
                row < locations.length;
                row++) { // print col numbers to side of map
//            System.out.print("  " + column + " |");

            // Now build the map.  For each row, show the column information
            System.out.println();

            for (int column = 0; column < locations[0].length; row++) {

                System.out.print(row + " "); // print row numbers to side of map
                Location item = locations[row][column];
//                for (Location item : locations[row]) {
                    // set default indicators as blanks
                    rightIndicator = " ";
                    leftIndicator = " ";
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
//                        leftIndicator = null;
                        // No scene assigned here so use ?? for the symbol
                        System.out.print(leftIndicator + "??" + rightIndicator);
                    } else {
//                        leftIndicator = null;
                        System.out.print(leftIndicator + item.getScene().getSymbol() + rightIndicator);
                    }
//                }
                System.out.println("|");
            }
        }

    }

    @Override
    public boolean doAction(String mapOption) {
        mapOption = mapOption.toUpperCase();
        Game game = PioneerTrail.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        for (int row = 0; row < locations.length; row++) {
            for (int column = 0; column < locations[row].length; column++) {
                if (locations[row][column].getScene() != null) {
                    if (mapOption.equals(locations[row][column].getScene().getSymbol())) {
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
