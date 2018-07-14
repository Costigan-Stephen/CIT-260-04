/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import static cit260.pioneertrail.control.SceneControl.compileSceneComponents;
import cit260.pioneertrail.exceptions.GameControlException;
import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.model.ItemReference;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Map;
import cit260.pioneertrail.model.Player;
import cit260.pioneertrail.exceptions.MapControlException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        PioneerTrail.setCurrentGame(game);
        game.setPlayer(player);
        game.setActors(createActors());
        game.setItems(InventoryControl.createItems());
        game.setMap(createMap(3, 9));
        compileSceneComponents(game);

        System.out.println("START NEW GAME");
        return 0;
    }

    public static Map createMap(int noOfRows, int noOfColumns) {
        Map map = new Map();
        map.setRowCount(noOfRows);
        map.setColumnCount(noOfColumns);
        return map;
    }
    
   
    public static ArrayList<Actor> createActors() {

        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor(0, "Samantha", "Mother", 100.0, "Lead the Family"));
        actors.add(new Actor(1, "Samuel", "Father", 100.0, "Lead the Family"));
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

    public static Location[][] createLocation(int rows, int columns) {

        Location[][] locations = new Location[rows][columns];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                locations[r][c] = (new Location());
            }
        }
        return locations;
    }

    public static void saveGame(Game game, String filepath) throws GameControlException {
//        System.out.println("Game was saved, filename is: " + filepath);
        if (!filepath.contains(".")) {
            filepath += ".txt";
        }

        if (filepath == null) {
            throw new GameControlException("Game could not be saved");
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filepath))) {
            out.writeObject(game);
        } catch (Exception ex) {
            throw new GameControlException("Game could not be saved.  Error code: " + ex.getMessage());
        }
    }

    public static void loadGame(String filepath) throws GameControlException {
        if (!filepath.contains(".")) {
            filepath += ".txt";
        }

        Game game = null;
        try (FileInputStream fis = new FileInputStream(filepath)) {
            ObjectInputStream savedGame = new ObjectInputStream(fis);

            game = (Game) savedGame.readObject();

        } catch (Exception ex) {
            throw new GameControlException("Game could not be loaded.  Error code: " + ex.getMessage());
        }
//        System.out.println("Game was saved, filename is: " + filepath);
        if (filepath == null) {
            throw new GameControlException("Game could not be Loaded, filename is empty. ");
        }

        PioneerTrail.setCurrentGame(game);

    }

    // This will work for any output file string.
    // Stephen
    public static void saveFile(String output, String filepath) throws GameControlException {
        PrintStream myOut = null;
        if (filepath == null) {
            throw new GameControlException("Error: Filepath is empty");
        }
        if (!filepath.contains(".")) {
            filepath += ".txt";
        }

        try {
            myOut = new PrintStream(new File(filepath));
            System.setOut(myOut);
            myOut.print(output);

        } catch (FileNotFoundException ex) {
            throw new GameControlException("File could not be saved.  Error code: " + ex.getMessage());
        } finally {
            myOut.close();
        }
    }
}
