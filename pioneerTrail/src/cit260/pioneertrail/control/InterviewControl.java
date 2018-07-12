/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import cit260.pioneertrail.model.Question;
import cit260.pioneertrail.model.QuestionType;

/**
 *
 * @author Stephen
 */
public class InterviewControl {
        
    //CREATE QUESTIONS MARILEE
    private static Question[] createQuestions() {

        Question[] questions = new Question[6];//questions = Create an array Question objects

        questions[QuestionType.buying.ordinal()] = new Question(); //question1 = Create a new Question object
        questions[QuestionType.buying.ordinal()].setQuestionText("Would you "
                + "like to buy some food? \nVisit the Nauvoo Store Location.");

        questions[QuestionType.findFood.ordinal()] = new Question(); //question2 = Create a new Question object
        questions[QuestionType.findFood.ordinal()].setQuestionText("Are you "
                + "hungry? Would you like to go hunt for animals? "
                + "\nCheck your inventory for bullets to choose how many to use.");

        questions[QuestionType.injury.ordinal()] = new Question();
        questions[QuestionType.injury.ordinal()].setQuestionText("You are injured! "
                + "Would you like to rest in this location? \nTrade with local natives for help.");

        questions[QuestionType.weather.ordinal()] = new Question();
        questions[QuestionType.weather.ordinal()].setQuestionText("Storm clouds "
                + "approach. Do you want to stop and rest? \nFind shelter soon.");

        questions[QuestionType.actor.ordinal()] = new Question();
        questions[QuestionType.actor.ordinal()].setQuestionText("The dog is barking. "
                + "Do you want to find out why? \nThere may be trouble.");

        questions[QuestionType.geography.ordinal()] = new Question();
        questions[QuestionType.geography.ordinal()].setQuestionText("Rough Terrain"
                + "lies ahead. Do you want to purchase supplies? \nVisit the store"
                + "or trade with natives to perpare");

        return questions;
    }
    //    public static Answers[] createQuestion() {
//        Answers[] question = new Answers[200];
//        question[QuestionType.buying.ordinal()] = new Answers();
//        question[QuestionType.buying.ordinal()].setAnswer("Here you go");
//        question[QuestionType.buying.ordinal()].setQuestion("What do you want?");
//        question[QuestionType.buying.ordinal()].setResultOfAnswer("You bought item");
//        
//        question[QuestionType.injury.ordinal()].setAnswer("You broke your leg");
//        question[QuestionType.injury.ordinal()].setResultOfAnswer("You should rest");
//        question[QuestionType.injury.ordinal()].setQuestion("What is your injury?");
//
//        question[QuestionType.geography.ordinal()].setQuestion("Where are we?");
//        question[QuestionType.geography.ordinal()].setAnswer("Yes");
//        question[QuestionType.geography.ordinal()].setResultOfAnswer("This is where you are!");
//
//        question[QuestionType.findFood.ordinal()].setQuestion("Do you want to look for food?");
//        question[QuestionType.findFood.ordinal()].setAnswer("Yes");
//        question[QuestionType.findFood.ordinal()].setResultOfAnswer("You found food!");
//
//        question[QuestionType.actor.ordinal()].setQuestion("What is this character?");
//        question[QuestionType.actor.ordinal()].setResultOfAnswer("Thank you for this info");
//        question[QuestionType.actor.ordinal()].setAnswer("This is what I am");
//
//        question[QuestionType.weather.ordinal()].setQuestion("What is the weather");
//        question[QuestionType.weather.ordinal()].setAnswer("The sky is clear");
//        question[QuestionType.weather.ordinal()].setResultOfAnswer("Her it is");
//        return question;
//    }
}
