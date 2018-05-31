/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Stephen
 */
public class InventoryItem implements Serializable{
 
    private String inventoryType;
    private int quantityOfItems;
    private double itemWeight;
    private double damageValue;
    private double weightRemaining;
    private String itemName;

    public InventoryItem() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantityOfItems() {
        return quantityOfItems;
    }

    public void setQuantityOfItems(int quantityOfItems) {
        this.quantityOfItems = quantityOfItems;
    }

    public double getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(double itemWeight) {
        this.itemWeight = itemWeight;
    }

    public double getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(double damageValue) {
        this.damageValue = damageValue;
    }

    public double getWeightRemaining() {
        return weightRemaining;
    }

    public void setWeightRemaining(double weightRemaining) {
        this.weightRemaining = weightRemaining;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.inventoryType);
        hash = 11 * hash + this.quantityOfItems;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.itemWeight) ^ (Double.doubleToLongBits(this.itemWeight) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.damageValue) ^ (Double.doubleToLongBits(this.damageValue) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.weightRemaining) ^ (Double.doubleToLongBits(this.weightRemaining) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.itemName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantityOfItems != other.quantityOfItems) {
            return false;
        }
        if (Double.doubleToLongBits(this.itemWeight) != Double.doubleToLongBits(other.itemWeight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.damageValue) != Double.doubleToLongBits(other.damageValue)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weightRemaining) != Double.doubleToLongBits(other.weightRemaining)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", quantityOfItems=" + quantityOfItems + ", itemWeight=" + itemWeight + ", damageValue=" + damageValue + ", weightRemaining=" + weightRemaining + ", itemName=" + itemName + '}';
    }
    
    
}
