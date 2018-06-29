/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.model.ItemReference;
import cit260.pioneertrail.model.Map;
import cit260.pioneertrail.model.Player;
import cit260.pioneertrail.view.MapView;
import java.awt.Point;
import java.sql.Array;
import java.util.ArrayList;
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
        if(player == null){
            return -1;
        }
        Game game = new Game();
        game.setPlayer(player);
        game.setActors(createActors());
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
        return 0;
    }
    public static InventoryItem[] createItems() {
//items = create an array InventoryItem objects
        InventoryItem[] items = new InventoryItem[200];
        items[ItemReference.axe.ordinal()] = new InventoryItem();
        items[ItemReference.axe.ordinal()].setDamageValue(2);
        items[ItemReference.axe.ordinal()].setItemName("axe");
        items[ItemReference.axe.ordinal()].setInventoryType(")inventory");
        items[ItemReference.axe.ordinal()].setItemWeight(4);
        
        items[ItemReference.wheels.ordinal()] = new InventoryItem();
        items[ItemReference.wheels.ordinal()].setDamageValue(0);
//Assign values to each attribute in the InventoryItem object
//Assign items1 to a position in the items array
//item2 = new InventoryItem object
//Assign values to each attribute in the InventoryItem object
//Assign items2 to a position in the items array
//… ax,
//    wheels,
//    oxen,
//    coin,
//    bullets;
////…
//RETURN items 

  return  items;      
        
    }
    
//    public static InventoryItem[] setInventory(){
//        return null;
//    }
    
    public static Map createMap(int noOfRows, int noOfColumns){
        MapView map = new MapView();
        map.setMap();
        map.createMap();
        System.out.println("\nmap called");
        return null;
    }
    
    public static ArrayList<Actor> createActors(){

        ArrayList<Actor> actors = new ArrayList<Actor>();
        actors.add(new Actor("Samantha","Mother", 100.0, "Lead the Family"));
        actors.add(new Actor("Samuel","Father",100.0,"Lead the Family"));
        actors.add(new Actor("Ralph","Son",80.0,"Cause a Ruckus"));
        actors.add(new Actor("Sarah","Daughter",80.0,"Be Daddy's Angel"));
        actors.add(new Actor("Spot","The Doggy",50.0,"Get Belly Rubs"));

        return actors;
    }
    
    public static Game saveGame(String createNewGame) {
        System.out.println("SAVE STUBB");
        return null;
    }

}
