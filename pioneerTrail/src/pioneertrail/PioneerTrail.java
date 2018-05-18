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
import cit260.pioneertrail.model.Scene;

/**
 *
 * @author maril
 */
public class PioneerTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Something");
        playerOne.setGender(true);
        playerOne.setHealth(100.0);
        playerOne.setStatus("Healthy");
       
        /*
        String playerOneName = playerOne.getName();
        Boolean playerOneGender = playerOne.getGender();
        Double playerOneHealth = playerOne.getHealth ();
        String playerOneStatus = playerOne.getStatus();
        
        
        System.out.println("Name : " + playerOneName +
                            ", Gender : " + playerOneGender + 
                            ", Health : " + playerOneHealth + 
                            ", Status : " + playerOneStatus);
        */
        
        /* START STEVE */
        InventoryItem hammer = new InventoryItem();
        hammer.setInventoryType("tool");
        hammer.setQuantityOfItems(1);
        hammer.setItemWeight(10.0);
        hammer.setDamageValue(100.0);
        hammer.setWeightRemaining(100);/* Need to attach to a class to calculate in future compared to rest of inventory*/
        hammer.setItemName("Hammer");
        
        Answers randomEncounter = new Answers();
        randomEncounter.setQuestion("One of your Wagon wheels buckles, you...");
        randomEncounter.setAnswer("Use hammer to straighten it"); /* This could potentially be used multiple times with varying results*/
        randomEncounter.setResultOfAnswer("The wheel snaps from the force of the hammer.  It must be replaced.");
        /* END STEVE */
        
        
        /* START MARILEE */
        Location nauvoo = new Location();
            nauvoo.setName("Nauvoo");
            nauvoo.setRow(1);
            nauvoo.setColumn(1);
            nauvoo.setAmountRemaining(24);
            
        Map testMap = new Map();
            testMap.setDescription("This is where the location names will be listed");
            testMap.setRowCount(5);
            testMap.setColumnCount(5);
            testMap.setCurrentRow(1);
            testMap.setCurrentColumn(1);
         /* END MARILEE*/
        
        System.out.println(playerOne.toString());
        System.out.println(Actor.Dog.toString());
        System.out.println(randomEncounter.toString());   /* STEVE */
        System.out.println(hammer.toString());            /* STEVE */
        System.out.println(nauvoo.toString());            /* MARILEE */
        System.out.println(testMap.toString());           /* MARILEE */
    }
    
}
