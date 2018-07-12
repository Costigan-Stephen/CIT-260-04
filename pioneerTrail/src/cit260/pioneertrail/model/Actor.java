/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.model;

import java.awt.Point;
import java.io.Serializable;
import java.sql.Array;

/**
 *
 * @author Stephen
 */
public class Actor implements Serializable{
    
//    Mother("Samantha","The Mother", new Point(1,1),"Lead the Family"),
//    Father("Samuel","The Father", new Point(1,1),"Lead the Family"),
//    ChildMale("Ralph","Son", new Point(1,2),"Cause a Ruckus"),
//    ChildFemale("Sarah","Daughter", new Point(1,2),"Be Daddy's Angel"),
//    Dog("Spot","The Doggy", new Point(1,3),"Get Belly Rubs"), ActorNames;
    
    public int index;
    private String name;
    private double health;
    private String description;
//    private Point coordinates;
    private String purpose;

    public Actor(int index, String name, String description, double health, String purpose) {
        this.index = index;
        this.name = name;
        this.description = description;
        this.health = health;
        this.purpose = purpose;
    }
    
    public Actor(){
    
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Point getCoordinates() {
//        return coordinates;
//    }
//
//    public void setCoordinates(Point coordinates) {
//        this.coordinates = coordinates;
//    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", health=" + health + ", description=" + description + ", purpose=" + purpose + '}';
    }

}
