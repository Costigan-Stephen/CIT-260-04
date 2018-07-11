
package cit260.pioneertrail.model;

import java.io.Serializable;
import java.sql.Array;
import java.util.Objects;

public class Location implements Serializable{
    
    private Scene scene;
    private boolean visited;
    
    public Location() {
        visited = false;
        scene = null;
    }
 
//    public Location [][] locations(Scene scene, int rows, int columns, boolean visited){
//        
//        int w = 9;
//        int h = 3;
//        
//        if (rows < 1 || columns < 1) {
//            return null;
//        }
//        Location[][] locations = null;
//        
////        for (int r = 0; r < h; r++) {
////            for (int c = 0; c < w; c++) {
////                locations[rows][columns] = (new Location(r, c));
////            }
////        }
//        return locations;
//    }

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

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.scene);
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

        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "scene=" + scene + "}";
    }



    
}