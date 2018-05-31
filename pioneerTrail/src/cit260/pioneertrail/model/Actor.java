/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.model;

import java.awt.Point;

/**
 *
 * @author Stephen
 */
public enum Actor {
    
    Mother("Samantha","The Mother", new Point(1,1),"Lead the Family"),
    Father("Samuel","The Father", new Point(1,1),"Lead the Family"),
    ChildMale("Ralph","Son", new Point(1,2),"Cause a Ruckus"),
    ChildFemale("Sarah","Daughter", new Point(1,2),"Be Daddy's Angel"),
    Dog("Spot","The Doggy", new Point(1,3),"Get Belly Rubs");
    
    private final String name;
    private final String description;
    private final Point coordinates;
    private final String purpose;

    Actor(String name, String description, Point coordinates, String purpose) {
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
        this.purpose = purpose;
    }

    public static Actor getMother() {
        return Mother;
    }

    public static Actor getFather() {
        return Father;
    }

    public static Actor getChildMale() {
        return ChildMale;
    }

    public static Actor getChildFemale() {
        return ChildFemale;
    }

    public static Actor getDog() {
        return Dog;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public String getPurpose() {
        return purpose;
    }
    
    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + ", purpose=" + purpose + '}';
    }

}
