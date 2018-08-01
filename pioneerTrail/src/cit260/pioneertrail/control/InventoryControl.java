/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.exceptions.GameControlException;
import cit260.pioneertrail.model.ItemReference;

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
    
        public static InventoryItem[] createItems() {

        InventoryItem[] items = new InventoryItem[200];
        int i = 0;

        i = ItemReference.axe.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(2);
        items[i].setInventoryType("inventory");
        items[i].setItemWeight(4);
        items[i].setItemName("axe");

        i = ItemReference.wheels.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(10);
        items[i].setItemName("Wheel");

        i = ItemReference.oxen.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(20);
        items[i].setItemName("Oxen");

        i = ItemReference.coin.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(0);
        items[i].setItemName("coin");

        i = ItemReference.bullets.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(10);
        items[i].setItemName("bullets");

        i = ItemReference.fish.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(5);
        items[i].setItemName("fish");

        i = ItemReference.freshWater.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(0);
        items[i].setItemName("freshWater");

        i = ItemReference.flour.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(30);
        items[i].setItemName("flour");

        i = ItemReference.squirrel.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(2);
        items[i].setItemName("squirrel");

        i = ItemReference.rabbit.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(5);
        items[i].setItemName("rabbit");

        i = ItemReference.deer.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(100);
        items[i].setItemName("deer");

        i = ItemReference.cougar.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(150);
        items[i].setItemName("cougar");

        i = ItemReference.bear.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(200);
        items[i].setItemName("bear");

        i = ItemReference.bison.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(300);
        items[i].setItemName("bison");

        i = ItemReference.driedMeat.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(5);
        items[i].setItemName("driedMeat");

        i = ItemReference.clothing.ordinal();
        items[i] = new InventoryItem();
        items[i].setDamageValue(0);
        items[i].setInventoryType("Inventory");
        items[i].setItemWeight(5);
        items[i].setItemName("clothing");

        return items;

    }
}

