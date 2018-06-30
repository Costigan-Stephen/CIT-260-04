/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import static cit260.pioneertrail.control.MapControl.movePlayer;
import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.Answers;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.model.ItemReference;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Map;
import cit260.pioneertrail.model.Player;
import cit260.pioneertrail.model.QuestionType;
import cit260.pioneertrail.model.Scene;
import cit260.pioneertrail.view.MapView;
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

    public static int createNewGame(Player player) {
        if (player == null) {
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

    public static void movePlayerToStartingLocation(Map map) {
        // If starting location is not supposed to be 0,0 then use the correct values here.
        movePlayer(map, 0, 0); // or instead of 0,0 you can select a different starting location
    }

    public static InventoryItem[] createItems() {

        InventoryItem[] items = new InventoryItem[200];
        items[ItemReference.axe.ordinal()] = new InventoryItem();
        items[ItemReference.axe.ordinal()].setDamageValue(2);
        items[ItemReference.axe.ordinal()].setItemName("axe");
        items[ItemReference.axe.ordinal()].setInventoryType("inventory");
        items[ItemReference.axe.ordinal()].setItemWeight(4);

        items[ItemReference.wheels.ordinal()] = new InventoryItem();
        items[ItemReference.wheels.ordinal()].setDamageValue(0);
        items[ItemReference.wheels.ordinal()].setInventoryType("Inventory");
        items[ItemReference.wheels.ordinal()].setItemWeight(10);
        items[ItemReference.wheels.ordinal()].setItemName("Wheel");

        items[ItemReference.oxen.ordinal()] = new InventoryItem();
        items[ItemReference.oxen.ordinal()].setDamageValue(0);
        items[ItemReference.oxen.ordinal()].setInventoryType("Inventory");
        items[ItemReference.oxen.ordinal()].setItemWeight(20);
        items[ItemReference.oxen.ordinal()].setItemName("Oxen");

        items[ItemReference.coin.ordinal()] = new InventoryItem();
        items[ItemReference.coin.ordinal()].setDamageValue(0);
        items[ItemReference.coin.ordinal()].setInventoryType("Inventory");
        items[ItemReference.coin.ordinal()].setItemWeight(0);
        items[ItemReference.coin.ordinal()].setItemName("coin");

        items[ItemReference.bullets.ordinal()] = new InventoryItem();
        items[ItemReference.bullets.ordinal()].setDamageValue(0);
        items[ItemReference.bullets.ordinal()].setInventoryType("Inventory");
        items[ItemReference.bullets.ordinal()].setItemWeight(10);
        items[ItemReference.bullets.ordinal()].setItemName("bullets");

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

        ArrayList<Actor> actors = new ArrayList<Actor>();
        actors.add(new Actor("Samantha", "Mother", 100.0, "Lead the Family"));
        actors.add(new Actor("Samuel", "Father", 100.0, "Lead the Family"));
        actors.add(new Actor("Ralph", "Son", 80.0, "Cause a Ruckus"));
        actors.add(new Actor("Sarah", "Daughter", 80.0, "Be Daddy's Angel"));
        actors.add(new Actor("Spot", "The Dog", 50.0, "Get Belly Rubs"));

        return actors;
    }

    public static Answers[] createQuestion() {
        Answers[] question = new Answers[200];
        question[QuestionType.buying.ordinal()] = new Answers();
        question[QuestionType.buying.ordinal()].setAnswer("Here you go");
        question[QuestionType.buying.ordinal()].setQuestion("What do you want?");
        question[QuestionType.buying.ordinal()].setResultOfAnswer("You bought item");

        question[QuestionType.injury.ordinal()].setAnswer("You broke your leg");
        question[QuestionType.injury.ordinal()].setResultOfAnswer("You should rest");
        question[QuestionType.injury.ordinal()].setQuestion("What is your injury?");

        question[QuestionType.geography.ordinal()].setQuestion("Where are we?");
        question[QuestionType.geography.ordinal()].setAnswer("Yes");
        question[QuestionType.geography.ordinal()].setResultOfAnswer("This is where you are!");

        question[QuestionType.findFood.ordinal()].setQuestion("Do you want to look for food?");
        question[QuestionType.findFood.ordinal()].setAnswer("Yes");
        question[QuestionType.findFood.ordinal()].setResultOfAnswer("You found food!");

        question[QuestionType.actor.ordinal()].setQuestion("What is this character?");
        question[QuestionType.actor.ordinal()].setResultOfAnswer("Thank you for this info");
        question[QuestionType.actor.ordinal()].setAnswer("This is what I am");

        question[QuestionType.weather.ordinal()].setQuestion("What is the weather");
        question[QuestionType.weather.ordinal()].setAnswer("The sky is clear");
        question[QuestionType.weather.ordinal()].setResultOfAnswer("Her it is");
        return question;
    }

    public static Location[][] createLocation(int rows, int columns) {

        Location[][] locations = new Location[rows][columns];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                locations[r][c] = (new Location(r, c));
            }
        }
        return locations;
    }

    //  public static ArrayList<Double> maxHealth(ArrayList<Actor> actor){
//    BEGIN
//     ArrayList<Double> maxValue = new ArrayList<>();
//    for(Actor person: actor){
//      if (person.getHealth()> maxValue)
//      maxValue = person.getHealth();
//    }
//    return maxValue;
    //}
    public static Game saveGame(String createNewGame) {
        System.out.println("SAVE STUBB");
        return null;
    }
}
