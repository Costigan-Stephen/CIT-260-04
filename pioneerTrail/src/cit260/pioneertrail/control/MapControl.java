/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Map;
import cit260.pioneertrail.model.Player;
import cit260.pioneertrail.model.QuestionType;
import cit260.pioneertrail.model.Scene;
import cit260.pioneertrail.model.SceneType;
import pioneertrail.PioneerTrail;

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

//CREATE LOCATIONS MARILEE  
    private static Location[][] createLocations(int row, int column) {
        if (row < 1 || column < 1) { //IF rows < 1 OR columns < 1 THEN
            return null;// RETURN null
        }//ENDIF

        Location[][] locations = new Location[3][9]; // locations = new two-dimensional Location array

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
    private static QuestionType[] createQuestions() {

        QuestionType[] questions = new QuestionType[2];//questions = Create an array Question objects
        questions[0] = new QuestionType( //question1 = Create a new Question object
                //Assign values to each attribute in the Question object
                //Assign question1 to its position in the questions array
                "Are you hungry? Would you like to go hunt for animals?",
                "Check your inventory for bullets to choose how many to use.");
        questions[1] = new QuestionType( //question2 = Create a new Question object
                //Assign values to each attribute in the Question object
                //Assign question2 to its position in the questions array
                "You are injured! Would you like to rest in this location?",
                "Trade with local natives for help.");

        return questions;
    }

//QUESTIONS TO SCENES JOSEPH
    private static void assignQuestionsToScenes(QuestionType[] questions, Scene[] scenes) {
        System.out.println("assignQuestionsToScenes called");

        // Question[] questions,
        // Scene[] scenes) {
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

//ITEMS TO SCENES
    private static void assignItemsToScenes(InventoryItem[] items, Scene[] scenes) {
        System.out.println("assignItemsToScenes called");

        // InventoryItem[] items,
        // Scene[] scenes) {
        //// Assign items to the first resource scene
        //resourceScene1 = scenes(indexOfScene)
        //resourcesInScene = Create a new InventoryItem ArrayList
        //resourcesInScene.add(items[indexOfItem])
        //resourcesInScene.add(items[indexOfItem])
        //…
        //…
        //assign resourcesInScene array to resourceScene1
        //// Assign items to the second resource scene
        //resourceScene2 = scenes(indexOfScene)
        //resourcesInScene = Create a new InventoryItem ArrayList
        //resourcesInScene.add(items[indexOfItem])
        //resourcesInScene.add(items[indexOfItem])
        //…
        //…
        //assign resourcesInScene array to resourceScene2
        //// REPEAT FOR ALL OTHER QUESTION SCENES
        //…
        //…
    }

//SCENES TO LOCATIONS 
    private static void assignScenesToLocations(Scene[] scenes, Location[][] location) {
        System.out.println("assignScenesToLocation called");
    }

// MOVE PLAYER
    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);
        map.setCurrentRow(row);
        map.setCurrentColumn(column);
    }

//CREATE SCENES
    public static Scene[] createScenes() {//scenes = createScenes()

        int s = 27;
        Scene[] scenes = new Scene[s];

        int o = SceneType.BushLand.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("BushLand");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ᴥ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Plains.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Plains");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("؀");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Forest.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Forest");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ѱ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Jungle.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Jungle");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("∆");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Canyon.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Canyon");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("_");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.RedForest.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("RedForest");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("▲");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.River.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("River");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("~");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Lake.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Lake");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("≈");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Waterfall.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Waterfall");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ת");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Tundra.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Tundra");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ﭛ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Sparse.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Sparse");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol(",");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.CrackedEarth.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("CrackedEarth");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ﷴ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Arid.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Arid");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol(".");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Desert.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Desert");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ꞈ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Hills.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Hills");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("∩");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Mountain.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Mountain");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("˄");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Stream.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Stream");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("-");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Town.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Town");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Village.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Village");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Encampment.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Encampment");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.IndianCamp.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("IndianCamp");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Caves.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Caves");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("₾");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Swamp.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Swamp");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("ʬ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.DryRiver.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("DryRiver");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("͜");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Flooded.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Flooded");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("؅");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.MuddyPath.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("MuddyPath");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("؁");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Zion.ordinal();
        scenes[o].setQuestion(getQuestion(o));
        scenes[o].setDescription("Zion");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("♦");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        return scenes;
    }

    private static Actor getActor(int i) {  //Random actors met on the way
        return null;
    }

    private static Actor getItem(int i) {   //Random items found on the way
        return null;
    }

    private static QuestionType getQuestion(int i) {   //Random question found on the way
        return null;
    }

}
