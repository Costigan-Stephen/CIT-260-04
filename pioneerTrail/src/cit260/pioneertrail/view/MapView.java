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
        String lineSeparator = "\n      --|----|----|----|----|----|----|----|----|----|";

        // Build the heading of the map     
        this.console.print("\n======================================================================================\n        |");
        for (int column = 0; column < locations[0].length; column++) {
            this.console.print("  " + column + " |");
            if(column == (locations[0].length - 1)){
                this.console.print("    [ ] - Blocked Location " + lineSeparator);
            }
            
        }
        // Now build the map.  For each row, show the column information
        this.console.println();
        for (int row = 0; row < locations.length; row++) {
            this.console.print("      " + row + " "); // print row numbers to side of map
            for (int column = 0; column < locations[row].length; column++) {
                // set default indicators as blanks
                rightIndicator = " ";
                leftIndicator = " ";
                if (locations[row][column] == map.getCurrentLocation()) {
                    // Set star indicators to show this is the current location.
                    leftIndicator = ">";
                    rightIndicator = "<";
                } else if (locations[row][column].isVisited()) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = "+"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "+"; // same as above
                } else if ("ZN".equals(locations[row][column].getScene().getSymbol())) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = "#"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "#"; // same as above
                } else if (locations[row][column].getScene().getBlocked() == true) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = "["; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "]"; // same as above
                }
                this.console.print("|"); // start map with a |
                if (locations[row][column].getScene() == null) {
                    this.console.print(leftIndicator + "??" + rightIndicator);
                } else {
                    this.console.print(leftIndicator
                            + locations[row][column].getScene().getSymbol()
                            + rightIndicator);
                }
            }
            switch (row) {
                case 0:
                    this.console.println("|    > < - Current Location " + lineSeparator);
                    break;
                case 1:
                    this.console.println("|    + + - Visited " + lineSeparator);
                    break;
                case 2:
                    this.console.println("|    # # - End Location ");
                    break;
                default:
                    break;
            }
        }
        this.console.println(showMapLegend(locations[map.getCurrentRow()][map.getCurrentColumn()], map.getCurrentRow(), map.getCurrentColumn()));
    }

    @Override
    public boolean doAction(String mapOption) {
        mapOption = mapOption.toUpperCase();
        Game game = PioneerTrail.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        try {
            MapControl.movePlayer(mapOption, map, map.getCurrentRow(), map.getCurrentColumn());
            displayScene();
            return true;
        } catch (MapControlException ex) {
            ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try Again later");
            return false;
        }
    }

    void displayInventoryView() {
        InventoryView inventoryview = new InventoryView();
        inventoryview.display();
    }

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

    private void displayScene() {
        SceneView scene = new SceneView();
        scene.display();
    }
    
    
    
}
