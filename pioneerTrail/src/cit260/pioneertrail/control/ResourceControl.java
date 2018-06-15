/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.model.Player;

/**
 * * @author Marilee
 */
public class ResourceControl {
    
        public static void createNewHunt(Player player){
        System.out.println("START NEW HUNT");
    }
    
    public static double calcHuntingResource(int hunger, InventoryItem item, int randomNumber) {
    
        //If (itemQuantity<1)
        //	return -1
        //if (itemQuantity>100)
        //	return -2
        //if (hunger < 0) 
        //	return -3
        //if  (hunger > 5) 
        //	return -4
        //if (randomNumber < 1)
        //	return -5
        //if (randomNumber > 20)
        //	return -6
        //Double result  = ((itemQuantity + hunger) / randomNumber)
        //	return result.intValue();
        
        // FUNCTION FOR GENERATING RANDOM NUMBER
        // import java.util.Random;
        // int randomNumber = randomrand = newRandom();
	// int n = rand.nestInt(20) + 1;
        
        if (item.quantityOfItems < 1) {return -1;}
        if (item.quantityOfItems > 100) {return -2;}
        if  (hunger < 0) {return -3;}        
        if (hunger > 5) {return -4;}
        if (randomNumber < 1) {return -5;}
        if (randomNumber > 20) {return -6;}

        int result = ((item.quantityOfItems + hunger) / randomNumber);
        return result;
    }
    

    
    
}
