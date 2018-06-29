
package cit260.pioneertrail.model;

import java.io.Serializable;
import java.sql.Array;
import java.util.Objects;

public class Location implements Serializable{
    
    private Scene scene;
    public int row;
    public int column;
    private int amountRemaining;
    private boolean visited;
    
    public Location() {
    }
    
    public Location [][] createLocation(int rows, int columns){
        
//        public static Location[][] createLocations(int rows, int columns) {
//        IF rows < 1 OR columns < 1 THEN
//          RETURN null
//        ENDIF
//        locations = new two-dimensional Location array
//        FOR every row in the locations array
//          FOR every column in the locations array
//              location = create a new Location object
//              set the row, and column attributes in the location
//              set visited attribute to false
//              Assign location to the row, and column in array
//          ENDFOR
//        RETURN locations
//        }
        
        int w = 15;
        int h = 15;
        
        if (rows < 1 || columns < 1) {
            return null;
        }
        String[][] location = null;
        for (int i = 0; i < h; i++) {
            for (int k = 0; k < w; k++) {
                location[i][k] = "String[row:"+i+",column:"+k+",column:false]";
            }
        }
        return null;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
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
        hash = 41 * hash + Objects.hashCode(this.scene);
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
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "scene=" + scene + ", row=" + row + ", column=" + column + ", amountRemaining=" + amountRemaining + '}';
    }



    
}