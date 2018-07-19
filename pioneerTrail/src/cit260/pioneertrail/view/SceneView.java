/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.GameControl;
import cit260.pioneertrail.model.Answers;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Question;
import cit260.pioneertrail.model.Scene;
import cit260.pioneertrail.model.SceneType;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
public class SceneView extends View{
    
    public SceneView() {
        super(
                "==================================================== "
               + "\n Moving to a new location..." );// Display the instructions  
    }
    
    
    @Override
    public boolean doAction(String filePath) {

        Game game = PioneerTrail.getCurrentGame();
        displayQuestion();
        
        try {
            GameControl.saveGame(game, filePath);
        } catch (Exception e){
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            return false;
        }
        this.console.println("\nGame saved successfully at " + filePath);
        return true;// RETURN false
    }
    
    private String displayQuestion() {
        String out = "\n====================================================\n"
                    + getQuestion() 
                    + "\n----------------------------------------------------\n"
                    + getAnswers()
                    + "\n====================================================\n"; 
        return out;
    }
    
    public Question getQuestion(){
        Location location = PioneerTrail.getCurrentGame().getMap().getCurrentLocation();
        int index = location.getScene().getIndex();
        Question question = location.getScene().getQuestion(index);
        return question;
    }

    private String getSceneName() {
        Location location = PioneerTrail.getCurrentGame().getMap().getCurrentLocation();
        String scene = location.getScene().getDescription();
        return scene;
    }

    public Answers getAnswers(){
        Location location = PioneerTrail.getCurrentGame().getMap().getCurrentLocation();
        int index = location.getScene().getIndex();
        Answers answer = location.getScene().getAnswers(index);
        return answer;
    }
}
