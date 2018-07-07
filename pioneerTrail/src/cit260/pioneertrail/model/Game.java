/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import pioneertrail.PioneerTrail;
import static pioneertrail.PioneerTrail.getCurrentGame;

/**
 *
 * @author Stephen
 */
public class Game implements Serializable{
    
    private long totalTime;
//    private int noPeople;
    private Player player;
    private ArrayList<Actor> actors;
    public static Map map;
    public Scene[] scenes;
    private InventoryItem[] items;
    private Location[][] locations;
    private Question[] question;
    
    public Game() {
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Question[] getQuestion() {
        return question;
    }

    public void setQuestion(Question[] question) {
        this.question = question;
    }

    public Scene[] getScenes() {
        return scenes;
    }

    public void setScenes(Scene[] scenes) {
        this.scenes = scenes;
    }

    public InventoryItem[] getItems() {
        return items;
    }

    public void setItems(InventoryItem[] items) {
        this.items = items;
    }
    
    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
        Game.map = map;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }
    
    public long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(long totalTime) {
        this.totalTime = totalTime;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + (int) (this.totalTime ^ (this.totalTime >>> 32));
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
        final Game other = (Game) obj;
        if (this.totalTime != other.totalTime) {
            return false;
        }
        return true;
    }

    public Game GetCurrentGame() {
        Game current = PioneerTrail.getCurrentGame();
        return current;
    }
    
    public Location getLocation(int row, int column) {
        return locations[row][column];
    }
    
}
