/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import cit260.pioneertrail.model.Answers;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.model.Question;
import cit260.pioneertrail.model.QuestionScene;
import cit260.pioneertrail.model.QuestionType;
import cit260.pioneertrail.model.Scene;
import cit260.pioneertrail.model.SceneType;
import cit260.pioneertrail.model.Status;

/**
 *
 * @author Stephen
 */
public class InterviewControl extends SceneControl{
        
    
    
    public static Scene[] createSceneQuestions(Scene[] scenes){
        
        String question, ans, result; //Answer, one of potentially more.  Multiple answers can be asked per scene.
        int i = 0;
        int o = 1;
        
        Question[] questions = new Question[27];
        
                //    Questions about each scene
        // ----------------------------------------------------------------------------------------------------------
        //    01 BushLand,
        // ----------------------------------------------------------------------------------------------------------
        question = "";
        ans = "";
        result = "";
//        scenes[o].setQuestion(questions); 
        scenes[o].getQuestion(o).setQuestionText(question);
        setAnswers(scenes, o, i, ans, result);
        
        // ----------------------------------------------------------------------------------------------------------
        //    02 Plains,
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "You look out over a wide open field.  The sun is shining and a pleasant aroma" 
                + "\nfills the air.  There is a trampled path to the right and a path to the left"
                + "\nWhat do you do?";
        ans = "Take the left path";
        result = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        ans = "Take the right path";
        result = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    03 Forest, 1 Question, 2 answers        - STEVE 
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "You find youself in a dense forest.  There are two paths before you," 
                + "\n one to your right, the other to your left.  The left trail has a fresh"
                + "\n set of footprints, the other appears to be overgrown.  You...";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "Take the left path";
        result = "you are ambushed by a pair of highwaymen, who run off with a portion of your food";
        //ADD ITEM, they took 20% of food (-20%)
        //reward(item, false, -20%); 
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        ans = "Take the right path";
        result = "The path is windy at first, but you soon make it to the remains of an old campsite."
                + "\n Searching briefly, you find a spare wheel.";
        //ADD ITEMS
        //reward(item, true, 1);
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    04 Jungle,
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    05 Canyon, [BLOCKED]
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    06 RedForest,
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    07 River,
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    08 Lake, [BLOCKED]
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    09 Waterfall, [BLOCKED]
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    10 Tundra,
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    11 Sparse,
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    12 CrackedEarth,
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    13 Arid,
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    14 Desert,
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    15 Hills,
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    16 Mountain, [BLOCKED]
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    17 Stream,
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "You come to a running stream.  The water looks cool and inviting, you are exhausted"
                + "\n and could really use a dip to cool off.  You... ";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "Take a dip";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        ans = "Don't take a dip";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    18 Town, [START] -- SHOP
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    19 Village, -- SHOP 
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    20 Encampment,  -- SHOP 
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    21 IndianCamp, -- SHOP 
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    22 Caves, 
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    23 Swamp, [BLOCKED]
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    24 DryRiver,
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    25 Flooded, [BLOCKED]
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    26 MuddyPath,
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        //    27 Zion; [END]
        // ----------------------------------------------------------------------------------------------------------
        o += 1;
        question = "";
        scenes[o].getQuestion(o).setQuestionText(question);
        ans = "";
        result = "";
        setAnswers(scenes, o, i, ans, result);
        i += 1;
        // ----------------------------------------------------------------------------------------------------------
        
        return scenes;
    }

    private static Scene[] setAnswers(Scene[] scenes, int o, int i, String answer, String result) {
        String question = scenes[o].setQuestion(o).getQuestionText();
        scenes[o].getAnswers(o).setQuestion(question); //transfer question to the appropriate Answer
        scenes[o].getAnswers(o).setAnswer(answer);
        scenes[o].getAnswers(o).setResultOfAnswer(result);
        return scenes;
    }
    
    private static InventoryItem reward(InventoryItem item, Boolean rewardTrue, int quantity){ //Boolean to track if item is added or removed
        
        //WE NEED ITEM LIST TO BE BUILT FOR THIS TO WORK
        if (rewardTrue == true){ //ADD ITEM
            
        } else { //REMOVE ITEM
            
        }
        
        return item;
        
    }
    
    private static Status statusEffect(Status status, Boolean rewardTrue, int damage){ //Boolean to track if status effect is added or removed
        
        if (rewardTrue == true){ //ADD STATUS
            status.getType(); 
            status.getDuration(); 
            status.getDescription(); 
        } else { //REMOVE STATUS
            
        }
        
        return status;
        
    }
    
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
//    
//    //CREATE QUESTIONS JOSEPH
    public static Answers[] createQuestion() {
        Answers[] question = new Answers[200];
        question[QuestionType.buying.ordinal()] = new Answers();
        question[QuestionType.buying.ordinal()].setAnswer("Here you go");
        question[QuestionType.buying.ordinal()].setQuestion("What do you want?");
        question[QuestionType.buying.ordinal()].setResultOfAnswer("You bought item");
        
        question[QuestionType.injury.ordinal()].setAnswer("You broke your leg");
        question[QuestionType.injury.ordinal()].setResultOfAnswer("You should rest");
        question[QuestionType.injury.ordinal()].setQuestion("What is your injury?");

        question[QuestionType.geography.ordinal()].setQuestion("Where are we?");
        question[QuestionType.geography.ordinal()].setAnswer("Yes");
        question[QuestionType.geography.ordinal()].setResultOfAnswer("This is where you are!");

        question[QuestionType.findFood.ordinal()].setQuestion("Do you want to look for food?");
        question[QuestionType.findFood.ordinal()].setAnswer("Yes");
        question[QuestionType.findFood.ordinal()].setResultOfAnswer("You found food!");

        question[QuestionType.actor.ordinal()].setQuestion("What is this character?");
        question[QuestionType.actor.ordinal()].setResultOfAnswer("Thank you for this info");
        question[QuestionType.actor.ordinal()].setAnswer("This is what I am");

        question[QuestionType.weather.ordinal()].setQuestion("What is the weather");
        question[QuestionType.weather.ordinal()].setAnswer("The sky is clear");
        question[QuestionType.weather.ordinal()].setResultOfAnswer("Her it is");
        return question;
    }
    
    //QUESTIONS TO SCENES JOSEPH
    private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes) {
        System.out.println("assignQuestionsToScenes called");

        QuestionScene questionScene1 = (QuestionScene) scenes[SceneType.Arid.ordinal()];
        Question[] fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene1.setQuestion(fun);

        QuestionScene questionScene2 = (QuestionScene) scenes[SceneType.BushLand.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene2.setQuestion(fun);

        QuestionScene questionScene3 = (QuestionScene) scenes[SceneType.Canyon.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene3.setQuestion(fun);

        QuestionScene questionScene4 = (QuestionScene) scenes[SceneType.Caves.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene4.setQuestion(fun);

        QuestionScene questionScene5 = (QuestionScene) scenes[SceneType.CrackedEarth.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene5.setQuestion(fun);

        QuestionScene questionScene6 = (QuestionScene) scenes[SceneType.Desert.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene6.setQuestion(fun);

        QuestionScene questionScene7 = (QuestionScene) scenes[SceneType.DryRiver.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene7.setQuestion(fun);

        QuestionScene questionScene8 = (QuestionScene) scenes[SceneType.Encampment.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene8.setQuestion(fun);

        QuestionScene questionScene9 = (QuestionScene) scenes[SceneType.Flooded.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene9.setQuestion(fun);

        QuestionScene questionScene10 = (QuestionScene) scenes[SceneType.Forest.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene10.setQuestion(fun);

        QuestionScene questionScene11 = (QuestionScene) scenes[SceneType.Hills.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene11.setQuestion(fun);

        QuestionScene questionScene12 = (QuestionScene) scenes[SceneType.IndianCamp.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene12.setQuestion(fun);

        QuestionScene questionScene13 = (QuestionScene) scenes[SceneType.Jungle.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene13.setQuestion(fun);

        QuestionScene questionScene14 = (QuestionScene) scenes[SceneType.Lake.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene14.setQuestion(fun);

        QuestionScene questionScene15 = (QuestionScene) scenes[SceneType.Mountain.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene15.setQuestion(fun);

        QuestionScene questionScene16 = (QuestionScene) scenes[SceneType.MuddyPath.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene16.setQuestion(fun);

        QuestionScene questionScene17 = (QuestionScene) scenes[SceneType.Plains.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene17.setQuestion(fun);

        QuestionScene questionScene18 = (QuestionScene) scenes[SceneType.RedForest.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene18.setQuestion(fun);

        QuestionScene questionScene19 = (QuestionScene) scenes[SceneType.River.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene19.setQuestion(fun);

        QuestionScene questionScene20 = (QuestionScene) scenes[SceneType.Sparse.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene20.setQuestion(fun);

        QuestionScene questionScene21 = (QuestionScene) scenes[SceneType.Stream.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene21.setQuestion(fun);

        QuestionScene questionScene22 = (QuestionScene) scenes[SceneType.Swamp.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene22.setQuestion(fun);

        QuestionScene questionScene23 = (QuestionScene) scenes[SceneType.Town.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene23.setQuestion(fun);

        QuestionScene questionScene24 = (QuestionScene) scenes[SceneType.Tundra.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene24.setQuestion(fun);

        QuestionScene questionScene25 = (QuestionScene) scenes[SceneType.Village.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene25.setQuestion(fun);

        QuestionScene questionScene26 = (QuestionScene) scenes[SceneType.Waterfall.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene26.setQuestion(fun);

        QuestionScene questionScene27 = (QuestionScene) scenes[SceneType.Zion.ordinal()];
        fun = new Question[30];
        fun[0] = questions[QuestionType.actor.ordinal()];
        fun[1] = questions[QuestionType.findFood.ordinal()];
        questionScene27.setQuestion(fun);

    }
    
}
