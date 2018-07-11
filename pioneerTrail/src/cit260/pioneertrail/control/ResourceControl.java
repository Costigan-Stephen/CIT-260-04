/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.model.Player;
import cit260.pioneertrail.exceptions.ResourceControlException;
import java.util.Random;

/**
 * * @author Marilee
 */
public class ResourceControl {
    
    
    public static double calcHuntingResource(int hunger, InventoryItem item, int randomNumber) throws ResourceControlException {
    
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
        
        if (item.quantityOfItems < 1) {
            throw new ResourceControlException("Item quantity cannot be less than 1");
        }
        if (item.quantityOfItems > 100) {
            throw new ResourceControlException("Item quantity cannot be greater than 100");
        }
        if (hunger < 0) {
            throw new ResourceControlException("Hunger cannot be less than 0");
        }        
        if (hunger > 5) {
            throw new ResourceControlException("Hunger cannot be greater than 5");
        }    
        if (randomNumber < 1) {
            throw new ResourceControlException("Random Number cannot be less than 1");
        }
        if (randomNumber > 20) {
            throw new ResourceControlException("Random Number cannot be greater than 20");
        }

        int result = ((item.quantityOfItems + hunger) / randomNumber);
        return result;
    }
    
    // Wrapper function to include a random calculation
    public static double calcHuntingResource(int hunger, InventoryItem item) throws ResourceControlException { 
//        Random rn = new Random();
//        
//        int randomNumber = randomrand = newRandom();
//	int n = rand.nestInt(20) + 1;
        int rnd = (int) Math.random() * 20;
        rnd++;
        return calcHuntingResource(hunger, item, rnd);
}
    
    
}
