
package cit260.pioneertrail.model;

import java.io.Serializable;
import java.util.Objects;

public class Location implements Serializable{
    
    private String name;
    private int row;
    private int column;
    private int amountRemaining;

    public Location() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.row;
        hash = 41 * hash + this.column;
        hash = 41 * hash + this.amountRemaining;
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + ", row=" + row + ", column=" + column + ", amountRemaining=" + amountRemaining + '}';
    }



    
}