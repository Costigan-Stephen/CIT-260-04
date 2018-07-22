/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.model.Answers;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Question;
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
        displayQuestion();
    }
    
    
    @Override
    public boolean doAction(String filePath) {

        Game game = PioneerTrail.getCurrentGame();
        displayQuestion();
        
        return true;// RETURN false
    }
    
    void displayQuestion() {
        this.console.println("\n====================================================\n"
//                    + getQuestion() 
                    + "\n----------------------------------------------------\n"
//                    + getAnswers()
                    + "\n====================================================\n"); 
        
    }
    
    public Question getQuestion(){
        Location location = PioneerTrail.getCurrentGame().getMap().getCurrentLocation();
        int index = location.getScene().getIndex();
        Question question = location.getScene().getQuestion(index);
        return question;
    }

//    private String getSceneName() {
//        Location location = PioneerTrail.getCurrentGame().getMap().getCurrentLocation();
//        String scene = location.getScene().getDescription();
//        return scene;
//    }

    public Answers getAnswers(){
        Location location = PioneerTrail.getCurrentGame().getMap().getCurrentLocation();
        int index = location.getScene().getIndex();
        Answers answer = location.getScene().getAnswers(index);
        return answer;
    }
}
