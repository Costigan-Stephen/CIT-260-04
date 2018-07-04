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
import cit260.pioneettrail.exceptions.HealthControlException;
import java.util.ArrayList;

/**
 *
 * @author Stephen
 */
public class HealthControl {
    
    public static double calcStatusDuration(int movementSpeed, int hunger, Status status) throws HealthControlException {
        
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
        if (movementSpeed < 0){ 
            throw new HealthControlException("Movement Speed cannot be less than 0");
        }
        if (movementSpeed > 3){ 
            throw new HealthControlException("Movement Speed cannot be greater than 3");
        }
        if (hunger < 0){ 
            throw new HealthControlException("Hunger cannot be less than 0");
        }
        if (hunger > 5){ 
            throw new HealthControlException("Hunger cannot be greater than 5");
        }
        if (status.type < 0){ 
            throw new HealthControlException("Status type cannot be empty");
        }
        if (status.type == 0){ 
            throw new HealthControlException("Character is healthy");
        } // Healthy, needs no duration
        else {
            double addDuration = movementSpeed + hunger;
            return status.duration + addDuration;
        }
        
    }
    
    public static double calcHealthRemaining(int index) throws HealthControlException{
        
        Game game = new Game();
        game.setActors(createActors()); // <---- TEMPORARY.  If this wasn't included it wouldn't work as this assignment menu appears before a game is made.
        ArrayList <Actor> actors = game.getActors();
        
//        actors = game.getActors();
        Actor value = null;
        
        if (index < 0){
            throw new HealthControlException("Index cannot be less than 0");
        } else if (index > 127) {  //Highest actor possibility based on current setup is 127.
            throw new HealthControlException("Index cannot be greater than 27");
        }
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
