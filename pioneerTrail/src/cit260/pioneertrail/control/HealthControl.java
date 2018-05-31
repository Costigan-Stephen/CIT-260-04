/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;
import cit260.pioneertrail.model.Status;

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
    
}
