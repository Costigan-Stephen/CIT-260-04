/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.Answers;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Map;
import cit260.pioneertrail.model.Player;
import cit260.pioneertrail.view.StartProgramView;

/**
 *
 * @author maril
 */
public class PioneerTrail {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PioneerTrail.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PioneerTrail.player = player;
    }
    
    
    
}
