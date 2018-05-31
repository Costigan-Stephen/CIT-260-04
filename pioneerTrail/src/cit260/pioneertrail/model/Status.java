/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.model;
import java.io.Serializable;

/**
 *
 * @author Stephen
 */
public enum Status {
    
    Healthy     (0,0,"Healthy"),

    Feverish    (1,10,"Feverish"),
    Chills      (2,10,"Chills"),
    Flu         (3,20,"Influenza"),
    SmallPox    (4,25,"Small Pox"),
    YellowFever (5,30,"Yellow Fever"), 

    BrokenArm   (6,15,"Broken Arm"),
    BrokenLeg   (7,20,"Broken Leg"),

    SpiderBite  (8,10,"Spider Bite"),
    SnakeBite   (9,15,"Snake Bite"),

    Appendicitis(10,20,"Appendicitis"),
    PersistentCough  (11,20,"PersistentCough"),
    Bronchitis  (12,25,"Bronchitis"),
    StomachBug  (13,5,"Stomach Bug"),
    TornLigament(14,18,"Torn Ligament");
    
    public final int type; //0 - infinity, different number for each different type
    public final double duration;
    public final String description;

    private Status(int type, double duration, String description) {
        this.type = type;
        this.duration = duration;
        this.description = description;
    }

    public static Status getHealthy() {
        return Healthy;
    }

    public static Status getFeverish() {
        return Feverish;
    }

    public static Status getChills() {
        return Chills;
    }

    public static Status getFlu() {
        return Flu;
    }

    public static Status getSmallPox() {
        return SmallPox;
    }

    public static Status getYellowFever() {
        return YellowFever;
    }

    public static Status getBrokenArm() {
        return BrokenArm;
    }

    public static Status getBrokenLeg() {
        return BrokenLeg;
    }

    public static Status getSpiderBite() {
        return SpiderBite;
    }

    public static Status getSnakeBite() {
        return SnakeBite;
    }

    public static Status getAppendicitis() {
        return Appendicitis;
    }

    public static Status getPersistentCough() {
        return PersistentCough;
    }

    public static Status getBronchitis() {
        return Bronchitis;
    }

    public static Status getStomachBug() {
        return StomachBug;
    }

    public static Status getTornLigament() {
        return TornLigament;
    }

    public int getType() {
        return type;
    }

    public double getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Status{" + "type=" + type + ", duration=" + duration + ", description=" + description + '}';
    }
    
}
