/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;
import cit260.pioneertrail.model.InventoryItem;

/**
 * @author Stephen
 */
public class InventoryControl {
    
    public static double calcWeightRemaining (double weightRemaining, InventoryItem item){

//        Begin
//          If (item.weight < 0) //item.quantity can’t be 0, this tests for invalid inputs
//        	Return -1
//          If (item.quantity < 1)
//        	Return -2
//          If (item.weight * item.quantity > weightRemaining) 
//        	addQuantity = math.trim(weightRemaining/item.weight)// # of Quantity to add to inventory
//        	If (addQuantity = 0) 
//        		Return -3	
//        	Item.quantity = addQuantity
//        	Return weightRemaining - (item.weight * addQuantity)
//          Else
//        	Return weightRemaining - (item.weight * item.quantity)
//        End

        if (item.itemWeight < 0.0){
            return -1;
        }
        if (item.quantityOfItems < 1){
            return -2;
        }    
        if (item.itemWeight * item.quantityOfItems > weightRemaining){
            double addQuantity = Math.round((weightRemaining/item.itemWeight)*100)/100;
            if(addQuantity == 0){
                return -3;
            }
            item.quantityOfItems = (int) addQuantity;
            return weightRemaining - (item.itemWeight * addQuantity);
        } else {
            return weightRemaining - (item.itemWeight * item.quantityOfItems);
        }       
    }
}

