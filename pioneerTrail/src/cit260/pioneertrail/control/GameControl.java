/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import cit260.pioneertrail.model.Game;
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

    public static void createNewGame(Player player) {
        System.out.println("START NEW GAME");
    }

    public static Game saveGame(String createNewGame) {
        System.out.println("SAVE STUBB");
        return null;
    }

}
