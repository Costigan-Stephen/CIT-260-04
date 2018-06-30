/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.model;

/**
 *
 * @author hughe
 */
public class QuestionScene extends Scene {
    private Answers[] question;
    public QuestionScene(){
        
        
    }

    @Override
    public Scene getScene(int r, int c) {
        System.out.println("");
        return null;
    }
    
    public Answers[] getQuestion() {
        return question;
    }
    public void setAnswer(Answers[] question){
        this.question = question;
    }
}
