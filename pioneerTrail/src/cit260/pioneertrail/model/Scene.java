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
    
    private SceneType scene;
    private String description;
    private long travelTime;
    private boolean blocked;
    private String symbol;
    private Actor actor;
    private InventoryItem resource;
    private QuestionType questionType;
    private Location[][] locations;
    private Question[] question;

    public Scene() {

    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
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
    
    public Scene getScene(int r, int c) {
        System.out.println("location at [" + r + "," + c + "]");
        return null;
    }
    
    public SceneType getScene() {
        return scene;
    }

    public void setScene(SceneType scene) {
        this.scene = scene;
    }
    
    public InventoryItem getResource() {
        return resource;
    }

    public void setResource(InventoryItem resource) {
        this.resource = resource;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
 
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
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
