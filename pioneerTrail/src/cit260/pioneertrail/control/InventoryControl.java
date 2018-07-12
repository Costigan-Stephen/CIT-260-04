/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.exceptions.GameControlException;

/**
 * @author Stephen
 */
public class InventoryControl {
    
    public static double calcWeightRemaining (double weightRemaining, InventoryItem item) throws GameControlException{

        if (item.itemWeight < 0.0){
            throw new GameControlException("Item weight cannot be less than 0");
        }
        if (item.quantityOfItems < 1){
            throw new GameControlException("Item Quantity cannot be less than 1");
        }    
        if (item.itemWeight * item.quantityOfItems > weightRemaining){
            double addQuantity = Math.round((weightRemaining/item.itemWeight)*100)/100;
            if(addQuantity == 0){
                
            }
            item.quantityOfItems = (int) addQuantity;
            return weightRemaining - (item.itemWeight * addQuantity);
        } else {
            return weightRemaining - (item.itemWeight * item.quantityOfItems);
        }       
    }
}

