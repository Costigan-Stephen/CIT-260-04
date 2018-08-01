/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Map;
import cit260.pioneertrail.exceptions.MapControlException;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
public class MapControl { // MARILEE

    public static Map createMap(int rowCount, int columnCount, InventoryItem[] items) {

        if (rowCount < 0 || columnCount < 0) { //if noOfRows < 0 OR numOfColumns < 0
            return null;// return null
        }// endif
        if (items == null || items.length < 1) { // if items is null OR its length is < 1
            return null; // RETURN null
        }// endif

        Map map = PioneerTrail.getCurrentGame().getMap(); //Map map = new Map object
        return map;
    }

    // MOVE PLAYER
    public static void movePlayer(String input, Map map, int row, int column) throws MapControlException {
        
        if (!input.isEmpty()){
            checkValidLocation(input); 
        } 
        else {
//           map.getCurrentLocation().setVisited(true);
           map.setCurrentRow(row);
           map.setCurrentColumn(column); 
        }

        
    }
    public static Location moveActor(Actor actor, int newRow, int newColumn) throws MapControlException {

        Game game = PioneerTrail.getCurrentGame();
        Map map = game.getMap();
        Location location = map.getCurrentLocation();

        if (actor == null) {
            throw new MapControlException("Error, actor is empty");
        }
        
        if (newRow < 1 || newRow > map.getRowCount() || newColumn < 1 || newColumn > map.getColumnCount()) {
            throw new MapControlException("Request is outside the borders of the map");
        }

        boolean blocked = isLocationBlocked(newRow, newColumn, game);
        if (blocked == true) {
            throw new MapControlException("The path is blocked, please select another direction.");
        }
        //This doesn't seem like it will do anything since the current setup isn't made that way.
//        int currentRow = game.getPlayer().getCurrentRow();
//        int currentColumn = game.getPlayer().getCurrentColumn();
//        Location oldLocation = game.getLocation(currentRow, currentColumn);
        Location newLocation = game.getMap().getLocations()[newRow][newColumn];

        game.getPlayer().setCurrentColumn(newColumn);
        game.getPlayer().setCurrentRow(newRow);

        return newLocation;
    }

    private static boolean isLocationBlocked(int row, int column, Game game) {
        return game.getMap().getLocations()[row][column].getScene().getBlocked() == true;

    }
    
    private static void checkValidLocation(String input) throws MapControlException{
//      This method is used to move the player if the direction is not blocked/outside of map;

        Game game = PioneerTrail.getCurrentGame();
        Map map = game.getMap();
        
        int row = map.getCurrentRow();
        int col = map.getCurrentColumn();
        
        int newRow = 0, newCol = 0;
        
        switch (input) {
            case "N":
                newCol = col;
                newRow = row - 1;
                break;
            case "S":
                newCol = col;
                newRow = row + 1 ;
                break;
            case "E":
                newCol = col + 1;
                newRow = row;
                break;
            case "W":
                newCol = col - 1;
                newRow = row;
                break;
            case "NW":
                newCol = col - 1;
                newRow = row - 1;
                break;
            case "NE":
                newCol = col + 1;
                newRow = row - 1;
                break;
            case "SE":
                newCol = col + 1;
                newRow = row + 1;
                break;
            case "SW":
                newCol = col - 1;
                newRow = row + 1;
                break;
            default:
                throw new MapControlException("Request could not be read, please enter a direction.");
        }
        
        if ( newRow < 0 || newRow >= map.getRowCount() || newCol < 0 || newCol >= map.getColumnCount()) {
            throw new MapControlException("Request is outside the borders of the map");
        }
        
        boolean blocked = isLocationBlocked(newRow, newCol, game);
        if (blocked == true) {
            throw new MapControlException("Error, location is blocked!");
        }

        map.getCurrentLocation().setVisited(true);
        map.setCurrentColumn(newCol);
        map.setCurrentRow(newRow);

    }
}
