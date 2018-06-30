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
import cit260.pioneertrail.model.QuestionType;
import cit260.pioneertrail.model.Scene;
import cit260.pioneertrail.model.SceneType;

/**
 *
 * @author Stephen
 */
public class MapControl {

    public static Map createMap(int noOfRows, int noOfColumns, InventoryItem[] items) {
        if (noOfRows < 0 || noOfColumns < 0) { //if noOfRows < 0 OR numOfColumns < 0
            return null;// return null
        }// endif
        if (items == null || items.length < 1) { // if items is null OR its length is < 1
            return null; // RETURN null
        }// endif

        Map map = new Map(); //Map map = new Map object
        noOfRows = 0;//save the noOfRows in the map
        noOfColumns = 0;//save the noOfColumns in the map
        return map; //???
    }

    private static Location[][] createLocations(int rows, int columns) {
        if(rows < 1 || columns < 1) { //IF rows < 1 OR columns < 1 THEN
            return null;// RETURN null
        }//ENDIF
        
        Location[][] locations = new Location[9][3]; // locations = new two-dimensional Location array
            
        
        for (int i = 0; i < rows.length; i++) { //FOR every row in the locations array
                    for (int j = 0 < columns[i].length; j++) { //FOR every column in the locations array
                        Location location = new Location();//location = create a new Location object
        
        
        //set the row, and column attributes in the location
        //set visited attribute to false
        //Assign location to the row, and column in array
        // ENDFOR
        // RETURN locations 

        
    private static QuestionType[] createQuestions() {
        System.out.println("createQuestions called");
        return null;  
       
            //questions = Create an array Question objects
            //question1 = Create a new Question object
            //Assign values to each attribute in the Question object
            //Assign question1 to its position in the questions array
            //question2 = Create a new Question object
            //Assign values to each attribute in the Question object
            //Assign question2 to its position in the questions array
            //…
            //…
            //RETURN questions 
    }

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
        
    private static void assignScenesToLocations(Scene[] scenes, Location[][] location) {
        System.out.println("assignScenesToLocation called");
    }

    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);
        map.setCurrentRow(row);
        map.setCurrentColumn(column);
    }

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
        scenes[o].setDescription("Plains");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("؀");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Forest.ordinal();
        scenes[o].setDescription("Forest");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ѱ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Jungle.ordinal();
        scenes[o].setDescription("Jungle");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("∆");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Canyon.ordinal();
        scenes[o].setDescription("Canyon");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("_");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.RedForest.ordinal();
        scenes[o].setDescription("RedForest");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("▲");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.River.ordinal();
        scenes[o].setDescription("River");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("-");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Lake.ordinal();
        scenes[o].setDescription("Lake");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("~");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Waterfall.ordinal();
        scenes[o].setDescription("Waterfall");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ת");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Tundra.ordinal();
        scenes[o].setDescription("Tundra");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("*");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Sparse.ordinal();
        scenes[o].setDescription("Sparse");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol(",");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.CrackedEarth.ordinal();
        scenes[o].setDescription("CrackedEarth");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ﷴ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Arid.ordinal();
        scenes[o].setDescription("Arid");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol(".");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Desert.ordinal();
        scenes[o].setDescription("Desert");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ꞈ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Hills.ordinal();
        scenes[o].setDescription("Hills");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("˄");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Mountain.ordinal();
        scenes[o].setDescription("Mountain");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("۸");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Stream.ordinal();
        scenes[o].setDescription("Stream");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("¬");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Town.ordinal();
        scenes[o].setDescription("Town");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Village.ordinal();
        scenes[o].setDescription("Village");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Encampment.ordinal();
        scenes[o].setDescription("Encampment");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.IndianCamp.ordinal();
        scenes[o].setDescription("IndianCamp");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Caves.ordinal();
        scenes[o].setDescription("Caves");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("Ὧ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Swamp.ordinal();
        scenes[o].setDescription("Swamp");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("ʬ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.DryRiver.ordinal();
        scenes[o].setDescription("DryRiver");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("͜");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Flooded.ordinal();
        scenes[o].setDescription("Flooded");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("؅");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.MuddyPath.ordinal();
        scenes[o].setDescription("MuddyPath");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("B");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        o = SceneType.Zion.ordinal();
        scenes[o].setDescription("Zion");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("♦");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));

        return scenes;
    }

    private static Actor getActor(int i) {  //Random actors met on the way
        return null;//Actor names and locations.
    }

    private static Actor getItem(int i) {   //Random items found on the way
        return null;//Item names and locations
    }

}
