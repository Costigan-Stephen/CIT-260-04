package cit260.pioneertrail.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Joseph
 */

public class Scene implements Serializable {
    private String description;
    private long travelTime;
    private boolean blocked;


    public Scene() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(long travelTime) {
        this.travelTime = travelTime;
    }

    public boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
