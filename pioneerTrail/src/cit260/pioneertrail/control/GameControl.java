/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import static cit260.pioneertrail.control.MapControl.compileSceneComponents;
import static cit260.pioneertrail.control.MapControl.movePlayer;
import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.model.ItemReference;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Map;
import cit260.pioneertrail.model.Player;
import cit260.pioneertrail.view.MapView;
import cit260.pioneettrail.exceptions.MapControlException;
import java.util.ArrayList;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
public class GameControl {

    public static Player savePlayer(String playerName) {

        Player player = new Player();
        player.setName(playerName);

        PioneerTrail.setPlayer(player);
        return player;
//        System.out.println("*** savePlayer() called ***");
//        System.out.println("Value input: " + name);
//        return new Player();
    }

    public static int createNewGame(Player player) throws MapControlException {
        if (player == null) {
            return -1;
        }
        Game game = new Game();
        game.setPlayer(player);
        game.setActors(createActors());
        game.setItems(createItems());
        game.setMap(createMap(3,9)); //3 Rows, 9 columns
        compileSceneComponents(game);
        
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

    public static void movePlayerToStartingLocation(Map map) {
        // If starting location is not supposed to be 0,0 then use the correct values here.
        movePlayer(map, 0, 0); // or instead of 0,0 you can select a different starting location
    }

    public static InventoryItem[] createItems() {

        InventoryItem[] items = new InventoryItem[200];
        int i = 0;
        
        i = ItemReference.axe.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(2);
        items[i].setInventoryType("inventory");
        items[i].setItemWeight(4);
        items[i].setItemName("axe");
        
        i = ItemReference.wheels.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(10);
        items[i].setItemName("Wheel");
        
        i = ItemReference.oxen.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(20);
        items[i].setItemName("Oxen");
        
        i = ItemReference.coin.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(0);
        items[i].setItemName("coin");
        
        i = ItemReference.bullets.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(10);
        items[i].setItemName("bullets");
        
        i = ItemReference.fish.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(5);
        items[i].setItemName("fish");

        
        i = ItemReference.freshWater.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(0);
        items[i].setItemName("freshWater");

        
        i = ItemReference.flour.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(30);
        items[i].setItemName("flour");

        
        i = ItemReference.squirrel.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(2);
        items[i].setItemName("squirrel");

        
        i = ItemReference.rabbit.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(5);
        items[i].setItemName("rabbit");

        
        i = ItemReference.deer.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(100);
        items[i].setItemName("deer");

        
        i = ItemReference.cougar.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(150);
        items[i].setItemName("cougar");

        
        i = ItemReference.bear.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(200);
        items[i].setItemName("bear");

        
        i = ItemReference.bison.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(300);
        items[i].setItemName("bison");

        i = ItemReference.driedMeat.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(5);
        items[i].setItemName("driedMeat");

        i = ItemReference.clothing.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(5);
        items[i].setItemName("clothing");


        return items;

    }

    public static Map createMap(int noOfRows, int noOfColumns) {
        MapView map = new MapView();
        map.setMap();
        map.createMap();
        System.out.println("\nmap called");
        return null;
    }

    public static ArrayList<Actor> createActors() {

        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor(0,"Samantha", "Mother", 100.0, "Lead the Family"));
        actors.add(new Actor(1,"Samuel", "Father", 100.0, "Lead the Family"));
        actors.add(new Actor(2, "Ralph", "Son", 80.0, "Cause a Ruckus"));
        actors.add(new Actor(3, "Sarah", "Daughter", 80.0, "Be Daddy's Angel"));
        actors.add(new Actor(4, "Spot", "The Dog", 50.0, "Get Belly Rubs"));
        
        //NPC ACTORS.  Add 100 to the scene so there are no conflicts with player actors.
        actors.add(new Actor(121, "Hoskininni", "Indian Chief", 100.0, "Leader of the Navajo indian tribe"));    // SCENE 21 (technically resided further south, but whatever.  Has a cool story)
        actors.add(new Actor(120, "Jacob J. Brown", "Major", 100.0, "Major general of NY Militia"));             // SCENE 20 (US Major General at the time in NY)
        actors.add(new Actor(127, "Brigham Young", "Prophet", 100.0, "Leader of the Church"));                   // SCENE 27 END
        actors.add(new Actor(118, "George Brown", "Shop Keeper", 100.0, "Owner of the general store"));          // SCENE 18 START
        actors.add(new Actor(119, "Henry Lewis", "Local Trader", 100.0, "Acquirer of goods and services"));      // SCENE 19
        return actors;
    }

//    public static Answers[] createQuestion() {
//        Answers[] question = new Answers[200];
//        question[QuestionType.buying.ordinal()] = new Answers();
//        question[QuestionType.buying.ordinal()].setAnswer("Here you go");
//        question[QuestionType.buying.ordinal()].setQuestion("What do you want?");
//        question[QuestionType.buying.ordinal()].setResultOfAnswer("You bought item");
//        
//        question[QuestionType.injury.ordinal()].setAnswer("You broke your leg");
//        question[QuestionType.injury.ordinal()].setResultOfAnswer("You should rest");
//        question[QuestionType.injury.ordinal()].setQuestion("What is your injury?");
//
//        question[QuestionType.geography.ordinal()].setQuestion("Where are we?");
//        question[QuestionType.geography.ordinal()].setAnswer("Yes");
//        question[QuestionType.geography.ordinal()].setResultOfAnswer("This is where you are!");
//
//        question[QuestionType.findFood.ordinal()].setQuestion("Do you want to look for food?");
//        question[QuestionType.findFood.ordinal()].setAnswer("Yes");
//        question[QuestionType.findFood.ordinal()].setResultOfAnswer("You found food!");
//
//        question[QuestionType.actor.ordinal()].setQuestion("What is this character?");
//        question[QuestionType.actor.ordinal()].setResultOfAnswer("Thank you for this info");
//        question[QuestionType.actor.ordinal()].setAnswer("This is what I am");
//
//        question[QuestionType.weather.ordinal()].setQuestion("What is the weather");
//        question[QuestionType.weather.ordinal()].setAnswer("The sky is clear");
//        question[QuestionType.weather.ordinal()].setResultOfAnswer("Her it is");
//        return question;
//    }

    public static Location[][] createLocation(int rows, int columns) {

        Location[][] locations = new Location[rows][columns];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                locations[r][c] = (new Location(r, c));
            }
        }
        return locations;
    }

//    public static ArrayList<Double> maxHealth(ArrayList<Actor> actor){
//
//        ArrayList<Double> maxValue = new ArrayList<>();
//        for(Actor person: actor){
//            if (actor.getHealth() > maxValue){
//                maxValue = actor.getHealth();
//            } 
//        }
//        return maxValue;
//    }
    
    public static Game saveGame(String createNewGame) {
        System.out.println("SAVE STUBB");
        return null;
    }
}
