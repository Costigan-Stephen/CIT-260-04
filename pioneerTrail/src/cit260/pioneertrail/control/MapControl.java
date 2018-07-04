/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.model.ItemReference;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Map;
import cit260.pioneertrail.model.Player;
import cit260.pioneertrail.model.Question;
import cit260.pioneertrail.model.QuestionScene;
import cit260.pioneertrail.model.QuestionType;
import cit260.pioneertrail.model.ResourceScene;
import cit260.pioneertrail.model.Scene;
import cit260.pioneertrail.model.SceneType;
import cit260.pioneettrail.exceptions.MapControlException;
import java.util.ArrayList;
import pioneertrail.PioneerTrail;
import static pioneertrail.PioneerTrail.getCurrentGame;

/**
 *
 * @author Stephen
 */
public class MapControl { // MARILEE

    public static Map createMap(int rowCount, int columnCount, InventoryItem[] items) {

        if (rowCount < 0 || columnCount < 0) { //if noOfRows < 0 OR numOfColumns < 0
            return null;// return null
        }// endif
        if (items == null || items.length < 1) { // if items is null OR its length is < 1
            return null; // RETURN null
        }// endif

        rowCount = 3; // I added this here, but I'm not sure it's right. 
        columnCount = 9; // Where do I say how many columns and rows?

        Map map = PioneerTrail.getCurrentGame().getMap(); //Map map = new Map object
        map.setColumnCount(columnCount);//save the noOfRows in the map
        map.setRowCount(rowCount);//save the noOfColumns in the map
        return map;
    }
    
    //IMPLEMENT CODE STEPHEN
    public static Game compileSceneComponents(Game game) throws MapControlException  {
         
        Scene[] scene = game.getScene();
        
        game.setLocations(createLocations(3,9));        
        assignScenesToLocations(scene, game.getMap());
        assignItemsToScenes(scene);
        
        return game;
    }
    
//CREATE LOCATIONS MARILEE  
    private static Location[][] createLocations(int row, int column) throws MapControlException{
        if (row < 1 || column < 1) { //IF rows < 1 OR columns < 1 THEN
            throw new MapControlException("Rows and Columns must be > 1");
        }//ENDIF

        Location[][] locations = new Location[0][0]; // locations = new two-dimensional Location array

        for (int i = 0; i < locations.length; i++) { //FOR every row in the locations array
            for (int j = 0; j < locations[i].length; j++) { //FOR every column in the locations array
                Location location = new Location();//location = create a new Location object
                location.setColumn(column); //set the row, and column attributes in the location
                location.setRow(row);
                location.setVisited(false);//set visited attribute to false
                locations[row][column] = location;//Assign location to the row, and column in array
            }// ENDFOR

        }
        return locations; // RETURN locations 
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
        //// Assign questions to the first question scene
        //questionScene1 = scenes(indexOfScene)
        //questionsInScene = Create a new Questions array
        //questionsInScene[0] = questions[indexOfQuestion]
        //questionsInScene[1] = questions[indexOfQuestion]
        //…
        //…
        //assign questionsInScene array to questionScene1
        //// Assign questions to the second question scene
        //nextQuestionScene2 = scenes(indexOfScene)
        //questionsInScene = Create a new Questions array
        //questionsInScene[0] = questions[indexOfQuestion]
        //questionsInScene[1] = questions[indexOfQuestion]
        //…
        //…
        //assign questionsInScene array to questionScene2
        //// REPEAT FOR ALL OTHER QUESTION SCENES
        //…
        //…
        //}
    }

//ITEMS TO SCENES MARILEE
    private static void assignItemsToScenes(Scene[] scenes) {

        // Assign items to the first resource scene
        ResourceScene river = (ResourceScene) scenes[SceneType.River.ordinal()];//resourceScene1 = scenes(indexOfScene)
        ArrayList<ItemReference> resourcesInScene = new ArrayList<>(); //resourcesInScene = Create a new InventoryItem ArrayList
        ItemReference[] items = null;
        resourcesInScene.add(items[ItemReference.fish.ordinal()]); //resourcesInScene.add(items[indexOfItem])
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);
//        river.setResource(items);
                
                
                
        ResourceScene lake = (ResourceScene) scenes[SceneType.Lake.ordinal()];
        resourcesInScene.add(items[ItemReference.fish.ordinal()]);
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);

        ResourceScene village = (ResourceScene) scenes[SceneType.Village.ordinal()];
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);
        resourcesInScene.add(items[ItemReference.bullets.ordinal()]);
        resourcesInScene.add(items[ItemReference.flour.ordinal()]);
        resourcesInScene.add(items[ItemReference.oxen.ordinal()]);
        resourcesInScene.add(items[ItemReference.coin.ordinal()]);
        
        ResourceScene town = (ResourceScene) scenes[SceneType.Town.ordinal()];
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);
        resourcesInScene.add(items[ItemReference.bullets.ordinal()]);
        resourcesInScene.add(items[ItemReference.flour.ordinal()]);
        resourcesInScene.add(items[ItemReference.oxen.ordinal()]);
        resourcesInScene.add(items[ItemReference.coin.ordinal()]);
        resourcesInScene.add(items[ItemReference.clothing.ordinal()]);
        resourcesInScene.add(items[ItemReference.wheels.ordinal()]);
        resourcesInScene.add(items[ItemReference.axe.ordinal()]);
        
        ResourceScene encampment = (ResourceScene) scenes[SceneType.Encampment.ordinal()];
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);
        resourcesInScene.add(items[ItemReference.bullets.ordinal()]);
        resourcesInScene.add(items[ItemReference.driedMeat.ordinal()]);

        ResourceScene indianCamp = (ResourceScene) scenes[SceneType.IndianCamp.ordinal()];
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);
        resourcesInScene.add(items[ItemReference.bullets.ordinal()]);
        resourcesInScene.add(items[ItemReference.driedMeat.ordinal()]);
        resourcesInScene.add(items[ItemReference.bison.ordinal()]);
        resourcesInScene.add(items[ItemReference.fish.ordinal()]);
        
        ResourceScene plains = (ResourceScene) scenes[SceneType.Plains.ordinal()];
        resourcesInScene.add(items[ItemReference.bison.ordinal()]);
        resourcesInScene.add(items[ItemReference.deer.ordinal()]);
        resourcesInScene.add(items[ItemReference.squirrel.ordinal()]);
        resourcesInScene.add(items[ItemReference.rabbit.ordinal()]);
        
        ResourceScene mountains = (ResourceScene) scenes[SceneType.Mountain.ordinal()];
        resourcesInScene.add(items[ItemReference.cougar.ordinal()]);
        resourcesInScene.add(items[ItemReference.deer.ordinal()]);
        resourcesInScene.add(items[ItemReference.squirrel.ordinal()]);
        resourcesInScene.add(items[ItemReference.bear.ordinal()]);
        resourcesInScene.add(items[ItemReference.rabbit.ordinal()]);
        
        ResourceScene desert = (ResourceScene) scenes[SceneType.Desert.ordinal()];
        resourcesInScene.add(items[ItemReference.squirrel.ordinal()]);
        resourcesInScene.add(items[ItemReference.rabbit.ordinal()]);
        
        ResourceScene stream = (ResourceScene) scenes[SceneType.Stream.ordinal()];
        resourcesInScene.add(items[ItemReference.fish.ordinal()]);
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);
        
        ResourceScene forest = (ResourceScene) scenes[SceneType.RedForest.ordinal()];
        resourcesInScene.add(items[ItemReference.bear.ordinal()]);
        resourcesInScene.add(items[ItemReference.deer.ordinal()]);
        resourcesInScene.add(items[ItemReference.squirrel.ordinal()]);
        resourcesInScene.add(items[ItemReference.cougar.ordinal()]);
        
        ResourceScene waterfall = (ResourceScene) scenes[SceneType.Waterfall.ordinal()];
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);
        
        



        //assign resourcesInScene array to resourceScene2
        //// REPEAT FOR ALL OTHER QUESTION SCENES
        //…
        //…
    }

//SCENES TO LOCATIONS STEPHEN
    private static void assignScenesToLocations(Scene[] scenes, Map map) {
        System.out.println("assignScenesToLocation called");

        /*
        START       18
        END         27
        BLOCKED:    5, 7, 8, 16, 23, 25,
        
                        SCENES BY LOCATION
             | 00 | 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 
        |----|--------------------------------------------|
          00 | 10 | 21 | 04 | 24 | 12 | 05 | 14 | 01 | 18 |
        |----|----|----|----|----|----|----|----|----|----|
          01 | 15 | 26 | 25 | 07 | 19 | 17 | 13 | 03 | 02 |
        |----|----|----|----|----|----|----|----|----|----|
          02 | 27 | 16 | 22 | 09 | 08 | 23 | 20 | 06 | 11 |
        |----|--------------------------------------------|
         */
        int r, c, s;
        Location[][] locations = map.getLocations();
        
        // -------------------|ROW 1|---------------------------
        
        r = 0;
        c = 0;
        s = SceneType.Tundra.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 1;
        c = 0;
        s = SceneType.IndianCamp.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 2;
        c = 0;
        s = SceneType.Jungle.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 3;
        c = 0;
        s = SceneType.DryRiver.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 4;
        c = 0;
        s = SceneType.CrackedEarth.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 5;
        c = 0;
        s = SceneType.Canyon.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 6;
        c = 0;
        s = SceneType.Desert.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 7;
        c = 0;
        s = SceneType.BushLand.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 8;
        c = 0;
        s = SceneType.Town.ordinal();
        locations[r][c].setScene(scenes[s]);

        // -------------------|ROW 2|---------------------------
        
        r = 0;
        c = 1;
        s = SceneType.Hills.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 1;
        c = 1;
        s = SceneType.MuddyPath.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 2;
        c = 1;
        s = SceneType.Flooded.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 3;
        c = 1;
        s = SceneType.River.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 4;
        c = 1;
        s = SceneType.Village.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 5;
        c = 1;
        s = SceneType.Stream.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 6;
        c = 1;
        s = SceneType.Arid.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 7;
        c = 1;
        s = SceneType.Forest.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 8;
        c = 1;
        s = SceneType.Plains.ordinal();
        locations[r][c].setScene(scenes[s]);

        // -------------------|ROW 3|---------------------------
        
        r = 0;
        c = 2;
        s = SceneType.Zion.ordinal(); //END
        locations[r][c].setScene(scenes[s]);

        r = 1;
        c = 2;
        s = SceneType.Mountain.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 2;
        c = 2;
        s = SceneType.Caves.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 3;
        c = 2;
        s = SceneType.Waterfall.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 4;
        c = 2;
        s = SceneType.Lake.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 5;
        c = 2;
        s = SceneType.Swamp.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 6;
        c = 2;
        s = SceneType.Encampment.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 7;
        c = 2;
        s = SceneType.RedForest.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 8;
        c = 2;
        s = SceneType.Sparse.ordinal();
        locations[r][c].setScene(scenes[s]);

        // -------------------| END |---------------------------
        
    }

// MOVE PLAYER
    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);
        map.setCurrentRow(row);
        map.setCurrentColumn(column);
    }

//CREATE SCENES STEPHEN
    public static Scene[] createScenes() {//scenes = createScenes()

        int s = 27;
        Scene[] scenes = new Scene[s];

        //Scene [01/27]
        int o = SceneType.BushLand.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("BushLand");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ᴥ");
        scenes[o].setActor(getActor(o));
        
        //Scene [02/27]
        o = SceneType.Plains.ordinal();
        scenes[o].setDescription("Plains");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("؀");
        scenes[o].setActor(getActor(o));
        
        //Scene [03/27]
        o = SceneType.Forest.ordinal();
        scenes[o].setDescription("Forest");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ѱ");
        scenes[o].setActor(getActor(o));
        
        //Scene [04/27]
        o = SceneType.Jungle.ordinal();
        scenes[o].setDescription("Jungle");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("∆");
        scenes[o].setActor(getActor(o));

        //Scene [05/27]
        o = SceneType.Canyon.ordinal();
        scenes[o].setDescription("Canyon");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("_");
        scenes[o].setActor(getActor(o));

        //Scene [06/27]
        o = SceneType.RedForest.ordinal();
        scenes[o].setDescription("RedForest");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("▲");
        scenes[o].setActor(getActor(o));

        //Scene [07/27]
        o = SceneType.River.ordinal();
        scenes[o].setDescription("River");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("~");
        scenes[o].setActor(getActor(o));

        //Scene [08/27]
        o = SceneType.Lake.ordinal();
        scenes[o].setDescription("Lake");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("≈");
        scenes[o].setActor(getActor(o));

        //Scene [09/27]
        o = SceneType.Waterfall.ordinal();
        scenes[o].setDescription("Waterfall");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ת");
        scenes[o].setActor(getActor(o));

        //Scene [10/27]
        o = SceneType.Tundra.ordinal();
        scenes[o].setDescription("Tundra");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ﭛ");
        scenes[o].setActor(getActor(o));

        //Scene [11/27]
        o = SceneType.Sparse.ordinal();
        scenes[o].setDescription("Sparse");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol(",");
        scenes[o].setActor(getActor(o));

        //Scene [12/27]
        o = SceneType.CrackedEarth.ordinal();
        scenes[o].setDescription("CrackedEarth");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ﷴ");
        scenes[o].setActor(getActor(o));

        //Scene [13/27]
        o = SceneType.Arid.ordinal();
        scenes[o].setDescription("Arid");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol(".");
        scenes[o].setActor(getActor(o));

        //Scene [14/27]
        o = SceneType.Desert.ordinal();
        scenes[o].setDescription("Desert");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ꞈ");
        scenes[o].setActor(getActor(o));

        //Scene [15/27]
        o = SceneType.Hills.ordinal();
        scenes[o].setDescription("Hills");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("∩");
        scenes[o].setActor(getActor(o));

        //Scene [16/27]
        o = SceneType.Mountain.ordinal();
        scenes[o].setDescription("Mountain");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("˄");
        scenes[o].setActor(getActor(o));

        //Scene [17/27]
        o = SceneType.Stream.ordinal();
        scenes[o].setDescription("Stream");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("-");
        scenes[o].setActor(getActor(o));

        //Scene [18/27]
        o = SceneType.Town.ordinal();
        scenes[o].setDescription("Town");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));

        //Scene [19/27]
        o = SceneType.Village.ordinal();
        scenes[o].setDescription("Village");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));

        //Scene [20/27]
        o = SceneType.Encampment.ordinal();
        scenes[o].setDescription("Encampment");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));

        //Scene [21/27]
        o = SceneType.IndianCamp.ordinal();
        scenes[o].setDescription("IndianCamp");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));

        //Scene [22/27]
        o = SceneType.Caves.ordinal();
        scenes[o].setDescription("Caves");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("₾");
        scenes[o].setActor(getActor(o));

        //Scene [23/27]
        o = SceneType.Swamp.ordinal();
        scenes[o].setDescription("Swamp");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("ʬ");
        scenes[o].setActor(getActor(o));

        //Scene [24/27]
        o = SceneType.DryRiver.ordinal();
        scenes[o].setDescription("DryRiver");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("͜");
        scenes[o].setActor(getActor(o));

        //Scene [25/27]
        o = SceneType.Flooded.ordinal();
        scenes[o].setDescription("Flooded");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("؅");
        scenes[o].setActor(getActor(o));

        //Scene [26/27]
        o = SceneType.MuddyPath.ordinal();
        scenes[o].setDescription("MuddyPath");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("؁");
        scenes[o].setActor(getActor(o));

        //Scene [27/27]
        o = SceneType.Zion.ordinal();
        scenes[o].setDescription("Zion");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("♦");
        scenes[o].setActor(getActor(o));

        return scenes;
    }

    private static Actor getActor(int i) {  //Random actors met on the way
        ArrayList<Actor> actors = new ArrayList<>();
        i += 100; //add 100 so there are no conflicts with player actors and actors not assigned to scenes.
        return actors.get(i);
    }
    
    // public static Location moveActor(actor, newRow, newColumn) {
    // if actor is null then
    // throw MapControlException
    // endIf
    // game = get the currentGame in the main class
    // map = get the map in the game object
    // locations = get the locations in the map
    // if (newRow < 1 OR newRow > noOfRows in map OR
    // newColumn < 1 OR newColumn > noOfColumns in map) then
    // throw MapControlException
    // endIf
    // currentRow = get the row from the actor
    // currentColumn = get the column from the actor
    // oldLocation = get the location from the locations
    // array at the current row and column
    // newLocation = get the location at the new row and column
    // set actor in the oldLocation to null
    // set actor in the newLocation to the actor
    // set row in actor to newRow
    // set column in actor to newColumn
    // return newLocation
    
    public static Location moveActor(Actor actor, int newRow, int newColumn) throws MapControlException {

        if (actor == null){
            throw new MapControlException("Error, actor is empty");
        }
        
        Game game = PioneerTrail.getCurrentGame();
        Map map = game.getMap();
        Location location = map.getCurrentLocation();
        
        if (newRow < 1 || newRow > map.getNoOfRows() || newColumn < 1 || newColumn > map.getNoOfColumns()){
            throw new MapControlException("Request is outside the borders of the map");
        }
        
        isLocationBlocked(newRow, newColumn);
        
        Location currentRow = game.getPlayer().getCurrentRow();
        
        
        return null;
    }

    private static void isLocationBlocked(int newRow, int newColumn) throws MapControlException {
        throw new MapControlException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}