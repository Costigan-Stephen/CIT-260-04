/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pioneertrail;

import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.Player;

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
        
        System.out.println(playerOne.toString());
        
        System.out.println(Actor.Dog.toString());
        
        
    }
    
}
