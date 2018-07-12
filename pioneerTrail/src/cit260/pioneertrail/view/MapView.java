/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.MapControl;
import cit260.pioneertrail.exceptions.MapControlException;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
public class MapView extends View {

    public MapView() {

        super("\t\tPlease enter your desired direction of travel: ");
    }

    public void displayMap() {

        String rightIndicator = "";
        String leftIndicator = "";
        Game game = PioneerTrail.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map

        // Build the heading of the map     
        System.out.print("\n======================================================================================\n        |");
        for (int column = 0; column < locations[0].length; column++) {
            System.out.print("  " + column + " |");
            if(column == (locations[0].length - 1)){
                System.out.print("    [ ] - Blocked Location ");
            }
            
        }
        // Now build the map.  For each row, show the column information
        System.out.println();
        for (int row = 0; row < locations.length; row++) {
            System.out.print("      " + row + " "); // print row numbers to side of map
            for (int column = 0; column < locations[row].length; column++) {
                // set default indicators as blanks
                rightIndicator = " ";
                leftIndicator = " ";
                if (locations[row][column] == map.getCurrentLocation()) {
                    // Set star indicators to show this is the current location.
                    leftIndicator = "*";
                    rightIndicator = "*";
                } else if (locations[row][column].isVisited()) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = "+"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "+"; // same as above
                } else if ("ZN".equals(locations[row][column].getScene().getSymbol())) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "<"; // same as above
                } else if (locations[row][column].getScene().getBlocked() == true) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = "["; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "]"; // same as above
                }
                System.out.print("|"); // start map with a |
                if (locations[row][column].getScene() == null) {
                    System.out.print(leftIndicator + "??" + rightIndicator);
                } else {
                    System.out.print(leftIndicator
                            + locations[row][column].getScene().getSymbol()
                            + rightIndicator);
                }
            }
//            System.out.println("|");
            switch (row) {
                case 0:
                    System.out.println("|    * * - Current Location ");
                    break;
                case 1:
                    System.out.println("|    + + - Visited ");
                    break;
                case 2:
                    System.out.println("|    > < - End Location ");
                    break;
                default:
                    break;
            }
        }
        System.out.println(showMapLegend(locations[map.getCurrentRow()][map.getCurrentColumn()], map.getCurrentRow(), map.getCurrentColumn()));
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
                        try {
                            MapControl.movePlayer(mapOption, map, row, column);
                        } catch (MapControlException ex) {
                            Logger.getLogger(MapView.class.getName()).log(Level.SEVERE, null, ex);
                        }
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

//    public void setMap() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void createMap() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    private String showMapLegend(Location locations, int row, int column) {

        String scene;
        scene = locations.getScene().getDescription();
        
        String out = "======================================================================================"
                +  "\n\t\tCurrent Scene: " + scene + ",     Coordinates: [" + row + "," + column + "]"
                +  "\n======================================================================================"
                +  "\n NW  N  NE   AR - Arid         EN - Encampment   MN - Mountain   SW - Swamp"
                +  "\n     |       BL - Bushland     FL - Flooded      MP - MuddyPath  TN - Town"
                +  "\n W - O - E   CN - Canyon       FO - Forest       PL - Plains     TU - Tundra"
                +  "\n     |       CA - Caves        HL - Hills        RF - RedForest  VL - Village"
                +  "\n SW  S  SE   CE - CrackedEarth IC - IndianCamp   RV - River      WF - Waterfall"
                +  "\n             DE - Desert       JG - Jungle       SP - Sparse     ZN - Zion"
                +  "\n Q - Quit    DR - DryRiver     LK - Lake         ST - Stream"
                +  "\n======================================================================================";
        return out;

    }
    
    
    
}
