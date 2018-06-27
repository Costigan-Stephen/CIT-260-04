/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.model.Map;
import cit260.pioneertrail.model.Player;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
public class GameControl {

    public static Player savePlayer(String playerName) {
//        if (name == null) {
//            return null;
//        }

        Player player = new Player();
        player.setName(playerName);

        PioneerTrail.setPlayer(player);
        return player;
//        System.out.println("*** savePlayer() called ***");
//        System.out.println("Value input: " + name);
//        return new Player();
    }

   
    public static int createNewGame(Player player) {
        if(player == null)
            return -1;
       Game game = new Game();
        game.setPlayer(player);
        PioneerTrail.setCurrentGame(game);
       // Actor actor = Actor();
       // actor.set
        
//actors = createActors()
//Save the list of actors in the Game object
//Assign an actor to the player
//items = createItems()
//Save the list of items in the game
//map = createMap(noOfRows, noOfColumns, items)
//IF map == null THEN
// RETURN -1
//ENDIF
//Assign the map to the game
//RETURN 1 // indicates success

        System.out.println("START NEW GAME");
    }
    public static InventoryItem[] createItems(){

        
    }
    public static Map createMap(int noOfRows, int noOfColumns){
        
    }
    public static Game saveGame(String createNewGame) {
        System.out.println("SAVE STUBB");
        return null;
    }

}
