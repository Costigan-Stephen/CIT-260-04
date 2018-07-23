/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import cit260.pioneertrail.model.Answer;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Question;
import cit260.pioneertrail.model.QuestionType;
import cit260.pioneertrail.model.Scene;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
public class InterviewControl extends SceneControl{
        
    
    
    public static void createSceneQuestions(Scene[] scenes){
        
        
//        String question, ans, result; //Answer, one of potentially more.  Multiple answers can be asked per scene.
        int sceneNum = 0;
        int answerCount = 0;
        int counter = 0;
        String questionText = "";
        String[] AnswerArray = new String[0];
        String[] ResultArray = new String[0];
        Double[] healthLoss = new Double[0];
        
                //    Questions about each scene
        // ----------------------------------------------------------------------------------------------------------
        //    01 BushLand,
        // ----------------------------------------------------------------------------------------------------------
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You star your journey in a bushland. The area is rough "
                + "\nand cruel. It will be a long journey. Do you head off on your "
                + "\nadventure to Zion or give up?";
        
        //Answer 1
        AnswerArray[counter] = "1. Go foward.";
        ResultArray[counter] = "Congratulations. You are headed to Zion.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Give up.";
        ResultArray[counter] = "You don't seem to get the point of the game, do you?";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

        // ----------------------------------------------------------------------------------------------------------
        //    02 Plains, --Steve
        // ----------------------------------------------------------------------------------------------------------
        
        sceneNum++;
          
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You look out over a wide open field.  The sun is shining and a pleasant aroma" 
                + "\nfills the air.  There is a trampled path to the right and a path to the left"
                + "\nWhat do you do?";
        
        //Answer 1
        AnswerArray[counter] = "1. Take the right path";
        ResultArray[counter] = "The field is full of grasshoppers and other insects. Run as quickly as you can!";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Take the left path";
        ResultArray[counter] = "It's going to be a great day to travel. The end of the field"
                + "\nreveals a hidden stream where you can water your animals and refresh your water suuply.";
        healthLoss[counter] = 0.0;

        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

        // ----------------------------------------------------------------------------------------------------------
        //    03 Forest, 1 Question, 2 answers        - STEVE 
        // ----------------------------------------------------------------------------------------------------------
        
                sceneNum++;
          
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You find youself in a dense forest.  There are two paths before you," 
                + "\n one to your right, the other to your left.  The left trail has a fresh"
                + "\n set of footprints, the other appears to be overgrown.  You...";
        
        //Answer 1
        AnswerArray[counter] = "1. Take the right path";
        ResultArray[counter] = "The path is windy at first, but you soon make it to the remains of an old campsite."
                + "\n Searching briefly, you find a spare wheel.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Take the left path";
        ResultArray[counter] = "you are ambushed by a pair of highwaymen, who run off with a portion of your food";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        //    04 Jungle,
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "The air is filled with bugs and the air is humid."
                +"\n Do you look for food or move forward?";
        
        //Answer 1
        AnswerArray[counter] = "1. Look forward";
        ResultArray[counter] = "Theh mosquitos bite you and you scratch an itch";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Move forward.";
        ResultArray[counter] = "You find three melons.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);
        
//        // ----------------------------------------------------------------------------------------------------------
//        //    05 Canyon, [BLOCKED]
//        // ----------------------------------------------------------------------------------------------------------
        sceneNum += 1;
//        // ----------------------------------------------------------------------------------------------------------
//        //    06 RedForest,
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You come to a large forest. The trees are taller than anything "
                + "\nyou could imagine. Do you chop some down for wood or gather"
                + "\nsticks on the ground.";
        
        //Answer 1
        AnswerArray[counter] = "1. Chop tree.";
        ResultArray[counter] = "The forest goes silent as you ax bites into the tree.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Gather dead wood.";
        ResultArray[counter] = "You gather wood on the forest floor and keep your ax sharp.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);
        
//        // ----------------------------------------------------------------------------------------------------------
//        //    07 River,
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You come to a large river. do you ford here or try to find a shallower place?";
        
        //Answer 1
        AnswerArray[counter] = "1. Ford here.";
        ResultArray[counter] = "It's harrowing, but you make it across safely.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Ford downstream.";
        ResultArray[counter] = "It takes a bit more time, but you make it across safely.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);
        
//        // ----------------------------------------------------------------------------------------------------------
//        //    08 Lake, [BLOCKED]
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum += 1;
        
//        // ----------------------------------------------------------------------------------------------------------
//        //    09 Waterfall, [BLOCKED]
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum += 1;
        
//        // ----------------------------------------------------------------------------------------------------------
//        //    10 Tundra,
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You come to the Tundra and see this will not be easy to get"
                + "\nthrough. Do you stop and make camp or move forward?";
        
        //Answer 1
        AnswerArray[counter] = "1. Make camp.";
        ResultArray[counter] = "You feel well rested and ready for another tough day.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Move forward.";
        ResultArray[counter] = "You journey through the night, but you got out of the Tundra.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);
        
//        // ----------------------------------------------------------------------------------------------------------
//        //    11 Sparse,
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "There is nothing as far as the eye can see. Do you camp "
                + "\nhere for the night or move on?";
        
        //Answer 1
        AnswerArray[counter] = "1. Stay here.";
        ResultArray[counter] = "You feel well rested and ready for another tough day.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Move forward.";
        ResultArray[counter] = "You journey through the night, but you got out "
                + "\nof this ugly area.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);
        
//        // ----------------------------------------------------------------------------------------------------------
//        //    12 CrackedEarth,
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "The earth is cracked an steam shoots forth out of it. Your "
                + "\noxen nervously paw the ground. Look into the steam or move away? ";
        
        //Answer 1
        AnswerArray[counter] = "1. Look into the steam.";
        ResultArray[counter] = "You look into the steam, burn your face and recoil screaming.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Turn away from the steam.";
        ResultArray[counter] = "You look away from the steam and try to leave as quickly as possible.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        //    13 Arid,
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "The land is arid and it seems that you will never reach"
                + "\nZion. You see a caravan in the distance. Do you approach"
                + "\nor turn away?";
        
        //Answer 1
        AnswerArray[counter] = "1. Approach.";
        ResultArray[counter] = "You see a lot of strange faces, but they are friendly. "
                + "\nThey sing and dance with you all.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Turn away.";
        ResultArray[counter] = "You move away and take the safe route.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        //    14 Desert,
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "There is sand everywhere now that you are in the desert."
                + "\nIt seems to stretch forever. Look for water or move forward?";
        
        //Answer 1
        AnswerArray[counter] = "1. Look for water.";
        ResultArray[counter] = "You look long and hard, but you don't find any"
                + "\nwater in this harsh landscape.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Continue onward.";
        ResultArray[counter] = "You move forward knowing there is little chance"
                + "\nof finding water in this harsh landscape.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        //    15 Hills,
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You come to the hills and they look large. Go around or over?";
        
        //Answer 1
        AnswerArray[counter] = "1. Go Around.";
        ResultArray[counter] = "Sure, it takes a while going around, but it "
                + "\nactually saves time.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. You go over.";
        ResultArray[counter] = "You go over because you want a challenge. You enjoy"
                + "\nthe sweat on your brow.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        //    16 Mountain, [BLOCKED]
//        // ----------------------------------------------------------------------------------------------------------
        sceneNum += 1;
//        // ----------------------------------------------------------------------------------------------------------
//        //    17 Stream,
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You come to a stream. Do you ford here or try a shallower place?";
        
        //Answer 1
        AnswerArray[counter] = "1. Ford here.";
        ResultArray[counter] = "It's harrowing, but you make it across safely.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Ford downstream.";
        ResultArray[counter] = "It takes a bit more time, but you make it across safely.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        //    18 Town, [START] -- SHOP
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You come to a town. Would you like to stop and buy goods?";
        
        //Answer 1
        AnswerArray[counter] = "1. Yes.";
        ResultArray[counter] = "They show you their wares and you purchase goods.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. No.";
        ResultArray[counter] = "The shop owner shakes his head, but your purse stays the same.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        //    19 Village, -- SHOP 
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You come to a village. Would you like to stop and buy goods?";
        
        //Answer 1
        AnswerArray[counter] = "1. Yes.";
        ResultArray[counter] = "They show you their wares and you purchase goods.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. No.";
        ResultArray[counter] = "The shop owner shakes his head, but your purse stays the same.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        //    20 Encampment,  -- SHOP 
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You come to a encampment. Would you like to stop and buy goods?";
        
        //Answer 1
        AnswerArray[counter] = "1. Yes.";
        ResultArray[counter] = "They show you their wares and you purchase goods.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. No.";
        ResultArray[counter] = "The shop owner shakes his head, but your purse stays the same.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        //    21 IndianCamp, -- SHOP 
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You come to a indian village. Would you like to stop and buy goods?";
        
        //Answer 1
        AnswerArray[counter] = "1. Yes.";
        ResultArray[counter] = "They show you their wares and you purchase goods.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. No.";
        ResultArray[counter] = "The shop owner shakes his head, but your purse stays the same.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        //    22 Caves, 
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You walk along and find a dark cave. Do you explore or rest in it?";
        
        //Answer 1
        AnswerArray[counter] = "1. Explore.";
        ResultArray[counter] = "You go forward and bats swirl about. You find some"
                + "\nmushrooms that taste funny";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Stay here.";
        ResultArray[counter] = "You feel well rested and ready for another tough day.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        //    23 Swamp, [BLOCKED]
//        // ----------------------------------------------------------------------------------------------------------
//        sceneNum += 1;
//        // ----------------------------------------------------------------------------------------------------------
//        //    24 DryRiver,
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "Your oxen sniff the air sadly as they come a dry river."
                + "\n will you give them some of your own water or move on?";
        
        //Answer 1
        AnswerArray[counter] = "1. Stop and give your oxen some of your own water.";
        ResultArray[counter] = "They drink greedily draining your water supplies "
                + "\nbut it keeps them strong.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Keep going forward and don't give them water.";
        ResultArray[counter] = "The oxen move slowly and you begin to see yellow "
                + "\nput coming out of their eyes.";
        healthLoss[counter] = 0.0;
        
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        //    25 Flooded, [BLOCKED]
//        // ----------------------------------------------------------------------------------------------------------
//        sceneNum += 1;
//        // ----------------------------------------------------------------------------------------------------------
//        //    26 MuddyPath,
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "You come to a muddy path. The mud cakes your wagon wheels.";
        
        //Answer 1
        AnswerArray[counter] = "1. Knock off the mud.";
        ResultArray[counter] = "The mud falls off and you push forward.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Move forward.";
        ResultArray[counter] = "The mud causes a wheel to break wasting valuable time.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        //    27 Zion; [END]
//        // ----------------------------------------------------------------------------------------------------------

        sceneNum++;
        
        answerCount = 2;  ///CHANGE THIS ONE
        AnswerArray = new String[answerCount];
        ResultArray = new String[answerCount];
        healthLoss = new Double[answerCount];
        counter = 0;
        
        //Question
        questionText = "Congratulations! You have won the game!";
        
        //Answer 1
        AnswerArray[counter] = "1. Dance.";
        ResultArray[counter] = "Your family dances for joy.";
        healthLoss[counter] = 0.0;
        counter++;
        
        //Answer 2
        AnswerArray[counter] = "2. Sing.";
        ResultArray[counter] = "Your family sings for joy.";
        healthLoss[counter] = 0.0;
        
        setAnswer(AnswerArray, ResultArray, healthLoss, scenes, questionText, sceneNum, counter);

//        // ----------------------------------------------------------------------------------------------------------
//        

    }
//
    
     private static void setAnswer(String[] AnswerArray, String[] ResultArray, Double[] healthLoss, Scene[] scenes, String questionText, int sceneNum, int counter) {
        Question question = new Question();
        question.setQuestionText(questionText);
        question.setCorrectAnswer(1);
        scenes[sceneNum].setQuestion(question);

        String answerText = "";
        String resultText = "";
        Double health = 0.0;
        Answer[] answers = new Answer[counter];
        
        
        for(int i = 0; i < AnswerArray.length ; i++){
            answerText = AnswerArray[i];
            resultText = ResultArray[i];
            health = healthLoss[i];
            
            answers[i] = new Answer();
            answers[i].setAnswer(answerText);
            answers[i].setResultOfAnswer(resultText);
            answers[i].setPlayerHealthEffect(health);
            i++;
        }
        
        question.setAnswers(answers);
        

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
////    //CREATE QUESTIONS JOSEPH
//    public static Answer[] createQuestion() {
//        Answer[] question = new Answer[200];
//        question[QuestionType.buying.ordinal()] = new Answer();
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
//    
//    //QUESTIONS TO SCENES JOSEPH
//    private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes) {
//        System.out.println("assignQuestionsToScenes called");
//
//        QuestionScene questionScene1 = (QuestionScene) scenes[SceneType.Arid.ordinal()];
//        Question[] fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene1.setQuestion(fun);
//
//        QuestionScene questionScene2 = (QuestionScene) scenes[SceneType.BushLand.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene2.setQuestion(fun);
//
//        QuestionScene questionScene3 = (QuestionScene) scenes[SceneType.Canyon.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene3.setQuestion(fun);
//
//        QuestionScene questionScene4 = (QuestionScene) scenes[SceneType.Caves.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene4.setQuestion(fun);
//
//        QuestionScene questionScene5 = (QuestionScene) scenes[SceneType.CrackedEarth.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene5.setQuestion(fun);
//
//        QuestionScene questionScene6 = (QuestionScene) scenes[SceneType.Desert.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene6.setQuestion(fun);
//
//        QuestionScene questionScene7 = (QuestionScene) scenes[SceneType.DryRiver.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene7.setQuestion(fun);
//
//        QuestionScene questionScene8 = (QuestionScene) scenes[SceneType.Encampment.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene8.setQuestion(fun);
//
//        QuestionScene questionScene9 = (QuestionScene) scenes[SceneType.Flooded.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene9.setQuestion(fun);
//
//        QuestionScene questionScene10 = (QuestionScene) scenes[SceneType.Forest.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene10.setQuestion(fun);
//
//        QuestionScene questionScene11 = (QuestionScene) scenes[SceneType.Hills.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene11.setQuestion(fun);
//
//        QuestionScene questionScene12 = (QuestionScene) scenes[SceneType.IndianCamp.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene12.setQuestion(fun);
//
//        QuestionScene questionScene13 = (QuestionScene) scenes[SceneType.Jungle.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene13.setQuestion(fun);
//
//        QuestionScene questionScene14 = (QuestionScene) scenes[SceneType.Lake.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene14.setQuestion(fun);
//
//        QuestionScene questionScene15 = (QuestionScene) scenes[SceneType.Mountain.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene15.setQuestion(fun);
//
//        QuestionScene questionScene16 = (QuestionScene) scenes[SceneType.MuddyPath.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene16.setQuestion(fun);
//
//        QuestionScene questionScene17 = (QuestionScene) scenes[SceneType.Plains.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene17.setQuestion(fun);
//
//        QuestionScene questionScene18 = (QuestionScene) scenes[SceneType.RedForest.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene18.setQuestion(fun);
//
//        QuestionScene questionScene19 = (QuestionScene) scenes[SceneType.River.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene19.setQuestion(fun);
//
//        QuestionScene questionScene20 = (QuestionScene) scenes[SceneType.Sparse.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene20.setQuestion(fun);
//
//        QuestionScene questionScene21 = (QuestionScene) scenes[SceneType.Stream.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene21.setQuestion(fun);
//
//        QuestionScene questionScene22 = (QuestionScene) scenes[SceneType.Swamp.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene22.setQuestion(fun);
//
//        QuestionScene questionScene23 = (QuestionScene) scenes[SceneType.Town.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene23.setQuestion(fun);
//
//        QuestionScene questionScene24 = (QuestionScene) scenes[SceneType.Tundra.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene24.setQuestion(fun);
//
//        QuestionScene questionScene25 = (QuestionScene) scenes[SceneType.Village.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene25.setQuestion(fun);
//
//        QuestionScene questionScene26 = (QuestionScene) scenes[SceneType.Waterfall.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene26.setQuestion(fun);
//
//        QuestionScene questionScene27 = (QuestionScene) scenes[SceneType.Zion.ordinal()];
//        fun = new Question[30];
//        fun[0] = questions[QuestionType.actor.ordinal()];
//        fun[1] = questions[QuestionType.findFood.ordinal()];
//        questionScene27.setQuestion(fun);
//
//    }
//    
}
