/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.model.Answer;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Player;
import cit260.pioneertrail.model.Question;
import cit260.pioneertrail.model.Scene;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
public class SceneView extends View{
    
    public SceneView() {
        
        promptMessage = "==================================================== ";
        Location location = PioneerTrail.getCurrentGame().getMap().getCurrentLocation();
        Scene scene = location.getScene();
        if (!scene.getDescription().isEmpty()){
            promptMessage += "\nNow entering " + scene.getDescription();
        }
        promptMessage += displayQuestion();
        if(canExit){
            promptMessage += "\n==================================================== ";
            promptMessage += "\nPress Q to return to the game menu";
        }
    }
    
    
    @Override
    public boolean doAction(String input) {
        Location location = PioneerTrail.getCurrentGame().getMap().getCurrentLocation();
        Scene scene = location.getScene();
        Question question = scene.getQuestion();
        int choice = -1;
        try {
            choice = Integer.parseInt(input);
        }
        catch (NumberFormatException ex){
            
        }
        if(choice > 0 && question != null && choice <= question.getAnswers().length){
            choice--;
            Player player = PioneerTrail.getPlayer();
            
            player.setHealth(player.getHealth() + question.getAnswers()[choice].getPlayerHealthEffect());
            this.console.println(question.getAnswers()[choice].getResultOfAnswer());
            this.console.println("Player health is now: " + player.getHealth());
            return true;
        }

        return false;// RETURN false
    }
    
    String displayQuestion() {
        String out = "";
        if(!getQuestion().isEmpty()){
            out = ("\n====================================================\n"
                    + getQuestion() 
                    + "\n----------------------------------------------------"
                    + getAnswers()
                    + "\n====================================================\n"); 
        }
        return out;
    }
    
    public String getQuestion(){
        String questionText = "";
        Location location = PioneerTrail.getCurrentGame().getMap().getCurrentLocation();
        Scene scene = location.getScene();
        Question question = scene.getQuestion();
        if(question != null){
            questionText = question.getQuestionText();
            canExit = false;
        }
        
        return questionText;
    }

//    private String getSceneName() {
//        Location location = PioneerTrail.getCurrentGame().getMap().getCurrentLocation();
//        String scene = location.getScene().getDescription();
//        return scene;
//    }

    public String getAnswers(){
        String questionText = "";
        Location location = PioneerTrail.getCurrentGame().getMap().getCurrentLocation();
        Scene scene = location.getScene();
        if(scene.getQuestion() != null){
            Answer[] answers = scene.getQuestion().getAnswers();
            for(Answer answer : answers){
                questionText += "\n" + answer.getAnswer();
            }
        }
        
        return questionText;
    }
}
