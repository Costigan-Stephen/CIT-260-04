/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;
import static cit260.pioneertrail.control.GameControl.createActors;
import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.Status;
import java.util.ArrayList;

/**
 *
 * @author Stephen
 */
public class HealthControl {
    
    public static double calcStatusDuration(int movementSpeed, int hunger, Status status) {
        
        //Begin
        //If (movementSpeed < 0) { Return -1 }
        //If (movementSpeed > 3) { Return -2 }
        //If (hunger < 0) { Return -3 }
        //If (hunger > 5) { Return -4 }
        //If (status.type < 0) { Return -5 }
        //If (status.type = 0) { Return -6 } //healthy
        //Else
        //addDuration = movementSpeed + hunger
        //return  status.duration + addDuration
        //End
        if (movementSpeed < 0){ return -1;}
        if (movementSpeed > 3){ return -2;}
        if (hunger < 0){ return -3;}
        if (hunger > 5){ return -4;}
        if (status.type < 0){ return -5;}
        if (status.type == 0){ return -6;} // Healthy, needs no duration
        else {
            double addDuration = movementSpeed + hunger;
            return status.duration + addDuration;
        }
        
    }
    
    public static double calcHealthRemaining(int index){
        
        Game game = new Game();
        game.setActors(createActors()); // <---- TEMPORARY.  If this wasn't included it wouldn't work as this assignment menu appears before a game is made.
        ArrayList <Actor> actors = new ArrayList<>();
        
        actors = game.getActors();
        Actor value = null;
        
        double health = 0;
        
        for (int i = 0; i < actors.size(); i++) {
            if (i == index){
                value = actors.get(i);
                System.out.println("\n"+ value.getName() + " has " + value.getHealth() + " health remaining.\n");
                health = value.getHealth();
            }
        }
        return health; //use elsewhere.
    }
    
    //This would likely never be used, but who knows
    public static Actor showAllHealth(){
        ArrayList <Actor> actors = new ArrayList<>();
        
        for (Actor i: actors){
            System.out.println(i);
        }
        return null;
    }
    
}
