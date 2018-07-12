package cit260.pioneertrail.control;

import static cit260.pioneertrail.control.MapControl.movePlayer;
import cit260.pioneertrail.model.Game;
import cit260.pioneertrail.model.InventoryItem;
import cit260.pioneertrail.model.ItemReference;
import cit260.pioneertrail.model.Location;
import cit260.pioneertrail.model.Map;
import cit260.pioneertrail.model.Question;
import cit260.pioneertrail.model.QuestionScene;
import cit260.pioneertrail.model.QuestionType;
import cit260.pioneertrail.model.Scene;
import cit260.pioneertrail.model.SceneType;
import cit260.pioneertrail.exceptions.MapControlException;
import cit260.pioneertrail.model.Actor;
import java.util.ArrayList;
import pioneertrail.PioneerTrail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Stephen
 */
public class SceneControl extends MapControl {

    //IMPLEMENT CODE STEPHEN
    public static Game compileSceneComponents(Game game) throws MapControlException {
        game.setScenes(createScenes());
        Scene[] scenes = game.getScenes();

        game.getMap().setLocations(createLocations());
        assignScenesToLocations(scenes, game.getMap());
        assignItemsToScenes(scenes);
        movePlayer("", game.getMap(), 0, 8); //Starting location

        return game;
    }

    private static Actor getActor(int i) {  //Random actors met on the way
        ArrayList<Actor> actors = PioneerTrail.getCurrentGame().getActors();
//        i += 100; //add 100 so there are no conflicts with player actors and actors not assigned to scenes.
// Commented this out because the Actor array list only has 9 elements.
        if (i >= actors.size()) {
            return new Actor(i, "nobody", "", 0, "no purpose");
        }
        return actors.get(i);
    }

//CREATE LOCATIONS MARILEE  
    private static Location[][] createLocations() throws MapControlException {
        Map map = PioneerTrail.getCurrentGame().getMap();
        if (map.getRowCount() < 1 || map.getColumnCount() < 1) { //IF rows < 1 OR columns < 1 THEN
            throw new MapControlException("Rows and Columns must be > 1");
        }//ENDIF

        Location[][] locations = new Location[map.getRowCount()][map.getColumnCount()]; // locations = new two-dimensional Location array

        for (int i = 0; i < map.getRowCount(); i++) { //FOR every row in the locations array
            for (int j = 0; j < map.getColumnCount(); j++) { //FOR every column in the locations array
                Location location = new Location();//location = create a new Location object
                location.setVisited(false);//set visited attribute to false
                locations[i][j] = location;//Assign location to the row, and column in array
            }// ENDFOR

        }
        return locations; // RETURN locations 
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

//ITEMS TO SCENES MARILEE
    private static void assignItemsToScenes(Scene[] scenes) {

        // Assign items to the first resource scene
        Scene river = scenes[SceneType.River.ordinal()];//resourceScene1 = scenes(indexOfScene)
        ArrayList<InventoryItem> resourcesInScene = new ArrayList<InventoryItem>(); //resourcesInScene = Create a new InventoryItem ArrayList
        InventoryItem[] items = PioneerTrail.getCurrentGame().getItems();
        resourcesInScene.add(items[ItemReference.fish.ordinal()]); //resourcesInScene.add(items[indexOfItem])
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);
//        river.setResource(items);

        Scene lake = scenes[SceneType.Lake.ordinal()];
        resourcesInScene.add(items[ItemReference.fish.ordinal()]);
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);

        Scene village = scenes[SceneType.Village.ordinal()];
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);
        resourcesInScene.add(items[ItemReference.bullets.ordinal()]);
        resourcesInScene.add(items[ItemReference.flour.ordinal()]);
        resourcesInScene.add(items[ItemReference.oxen.ordinal()]);
        resourcesInScene.add(items[ItemReference.coin.ordinal()]);

        Scene town = scenes[SceneType.Town.ordinal()];
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);
        resourcesInScene.add(items[ItemReference.bullets.ordinal()]);
        resourcesInScene.add(items[ItemReference.flour.ordinal()]);
        resourcesInScene.add(items[ItemReference.oxen.ordinal()]);
        resourcesInScene.add(items[ItemReference.coin.ordinal()]);
        resourcesInScene.add(items[ItemReference.clothing.ordinal()]);
        resourcesInScene.add(items[ItemReference.wheels.ordinal()]);
        resourcesInScene.add(items[ItemReference.axe.ordinal()]);

        Scene encampment = scenes[SceneType.Encampment.ordinal()];
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);
        resourcesInScene.add(items[ItemReference.bullets.ordinal()]);
        resourcesInScene.add(items[ItemReference.driedMeat.ordinal()]);

        Scene indianCamp = scenes[SceneType.IndianCamp.ordinal()];
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);
        resourcesInScene.add(items[ItemReference.bullets.ordinal()]);
        resourcesInScene.add(items[ItemReference.driedMeat.ordinal()]);
        resourcesInScene.add(items[ItemReference.bison.ordinal()]);
        resourcesInScene.add(items[ItemReference.fish.ordinal()]);

        Scene plains = scenes[SceneType.Plains.ordinal()];
        resourcesInScene.add(items[ItemReference.bison.ordinal()]);
        resourcesInScene.add(items[ItemReference.deer.ordinal()]);
        resourcesInScene.add(items[ItemReference.squirrel.ordinal()]);
        resourcesInScene.add(items[ItemReference.rabbit.ordinal()]);

        Scene mountains = scenes[SceneType.Mountain.ordinal()];
        resourcesInScene.add(items[ItemReference.cougar.ordinal()]);
        resourcesInScene.add(items[ItemReference.deer.ordinal()]);
        resourcesInScene.add(items[ItemReference.squirrel.ordinal()]);
        resourcesInScene.add(items[ItemReference.bear.ordinal()]);
        resourcesInScene.add(items[ItemReference.rabbit.ordinal()]);

        Scene desert = scenes[SceneType.Desert.ordinal()];
        resourcesInScene.add(items[ItemReference.squirrel.ordinal()]);
        resourcesInScene.add(items[ItemReference.rabbit.ordinal()]);

        Scene stream = scenes[SceneType.Stream.ordinal()];
        resourcesInScene.add(items[ItemReference.fish.ordinal()]);
        resourcesInScene.add(items[ItemReference.freshWater.ordinal()]);

        Scene forest = scenes[SceneType.RedForest.ordinal()];
        resourcesInScene.add(items[ItemReference.bear.ordinal()]);
        resourcesInScene.add(items[ItemReference.deer.ordinal()]);
        resourcesInScene.add(items[ItemReference.squirrel.ordinal()]);
        resourcesInScene.add(items[ItemReference.cougar.ordinal()]);

        Scene waterfall = scenes[SceneType.Waterfall.ordinal()];
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
        BLOCKED:    05, 08, 09, 16, 22, 23, 25, 27
        
                        SCENES BY LOCATION
             | 00 | 01 | 02 | 03 | 04 | 05 | 06 | 07 | 08 | 
        |----|--------------------------------------------|
          00 | 10 | 21 | 04 | 24 | 12 | 05 | 14 | 01 | 18 |
        |----|----|----|----|----|----|----|----|----|----|
          01 | 15 | 26 | 25 | 07 | 19 | 17 | 13 | 03 | 02 |
        |----|----|----|----|----|----|----|----|----|----|
          02 | 27 | 16 | 22 | 09 | 08 | 11 | 20 | 06 | 23 |
        |----|--------------------------------------------|
         */
        int r, c, s;
        Location[][] locations = map.getLocations();

        // -------------------|ROW 1|---------------------------
        r = 0;
        c = 0;
        s = SceneType.Tundra.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 0;
        c = 1;
        s = SceneType.IndianCamp.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 0;
        c = 2;
        s = SceneType.Jungle.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 0;
        c = 3;
        s = SceneType.DryRiver.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 0;
        c = 4;
        s = SceneType.CrackedEarth.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 0;
        c = 5;
        s = SceneType.Canyon.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 0;
        c = 6;
        s = SceneType.Desert.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 0;
        c = 7;
        s = SceneType.BushLand.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 0;
        c = 8;
        s = SceneType.Town.ordinal();
        locations[r][c].setScene(scenes[s]);

        // -------------------|ROW 2|---------------------------
        r = 1;
        c = 0;
        s = SceneType.Hills.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 1;
        c = 1;
        s = SceneType.MuddyPath.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 1;
        c = 2;
        s = SceneType.Flooded.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 1;
        c = 3;
        s = SceneType.River.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 1;
        c = 4;
        s = SceneType.Village.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 1;
        c = 5;
        s = SceneType.Stream.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 1;
        c = 6;
        s = SceneType.Arid.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 1;
        c = 7;
        s = SceneType.Forest.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 1;
        c = 8;
        s = SceneType.Plains.ordinal();
        locations[r][c].setScene(scenes[s]);

        // -------------------|ROW 3|---------------------------
        r = 2;
        c = 0;
        s = SceneType.Zion.ordinal(); //END
        locations[r][c].setScene(scenes[s]);

        r = 2;
        c = 1;
        s = SceneType.Mountain.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 2;
        c = 2;
        s = SceneType.Caves.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 2;
        c = 3;
        s = SceneType.Waterfall.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 2;
        c = 4;
        s = SceneType.Lake.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 2;
        c = 5;
        s = SceneType.Sparse.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 2;
        c = 6;
        s = SceneType.Encampment.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 2;
        c = 7;
        s = SceneType.RedForest.ordinal();
        locations[r][c].setScene(scenes[s]);

        r = 2;
        c = 8;
        s = SceneType.Swamp.ordinal();
        locations[r][c].setScene(scenes[s]);

        System.out.println("assignScenesToLocation done");
        // -------------------| END |---------------------------
    }

//CREATE SCENES STEPHEN
    public static Scene[] createScenes() {//scenes = createScenes()

        Scene[] scenes = new Scene[27];

        //Scene [01/27]
        int o = SceneType.BushLand.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("BushLand");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("BL");
        scenes[o].setActor(getActor(o));

        //Scene [02/27]
        o = SceneType.Plains.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Plains");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("PL");
        scenes[o].setActor(getActor(o));

        //Scene [03/27]
        o = SceneType.Forest.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Forest");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("FO");
        scenes[o].setActor(getActor(o));

        //Scene [04/27]
        o = SceneType.Jungle.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Jungle");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("JG");
        scenes[o].setActor(getActor(o));

        //Scene [05/27]
        o = SceneType.Canyon.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Canyon");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("CN");
        scenes[o].setActor(getActor(o));

        //Scene [06/27]
        o = SceneType.RedForest.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("RedForest");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("RF");
        scenes[o].setActor(getActor(o));

        //Scene [07/27]
        o = SceneType.River.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("River");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("RV");
        scenes[o].setActor(getActor(o));

        //Scene [08/27]
        o = SceneType.Lake.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Lake");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("LK");
        scenes[o].setActor(getActor(o));

        //Scene [09/27]
        o = SceneType.Waterfall.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Waterfall");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("WF");
        scenes[o].setActor(getActor(o));

        //Scene [10/27]
        o = SceneType.Tundra.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Tundra");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("TU");
        scenes[o].setActor(getActor(o));

        //Scene [11/27]
        o = SceneType.Sparse.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Sparse");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("SP");
        scenes[o].setActor(getActor(o));

        //Scene [12/27]
        o = SceneType.CrackedEarth.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("CrackedEarth");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("CE");
        scenes[o].setActor(getActor(o));

        //Scene [13/27]
        o = SceneType.Arid.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Arid");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("AR");
        scenes[o].setActor(getActor(o));

        //Scene [14/27]
        o = SceneType.Desert.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Desert");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("DE");
        scenes[o].setActor(getActor(o));

        //Scene [15/27]
        o = SceneType.Hills.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Hills");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("HL");
        scenes[o].setActor(getActor(o));

        //Scene [16/27]
        o = SceneType.Mountain.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Mountain");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("MN");
        scenes[o].setActor(getActor(o));

        //Scene [17/27]
        o = SceneType.Stream.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Stream");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ST");
        scenes[o].setActor(getActor(o));

        //Scene [18/27]
        o = SceneType.Town.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Town");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("TN");
        scenes[o].setActor(getActor(o));

        //Scene [19/27]
        o = SceneType.Village.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Village");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("VL");
        scenes[o].setActor(getActor(o));

        //Scene [20/27]
        o = SceneType.Encampment.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Encampment");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("EN");
        scenes[o].setActor(getActor(o));

        //Scene [21/27]
        o = SceneType.IndianCamp.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("IndianCamp");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("IC");
        scenes[o].setActor(getActor(o));

        //Scene [22/27]
        o = SceneType.Caves.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Caves");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("CA");
        scenes[o].setActor(getActor(o));

        //Scene [23/27]
        o = SceneType.Swamp.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Swamp");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("SW");
        scenes[o].setActor(getActor(o));

        //Scene [24/27]
        o = SceneType.DryRiver.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("DryRiver");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("DR");
        scenes[o].setActor(getActor(o));

        //Scene [25/27]
        o = SceneType.Flooded.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Flooded");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("FL");
        scenes[o].setActor(getActor(o));

        //Scene [26/27]
        o = SceneType.MuddyPath.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("MuddyPath");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("MP");
        scenes[o].setActor(getActor(o));

        //Scene [27/27]
        o = SceneType.Zion.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("Zion");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ZN");
        scenes[o].setActor(getActor(o));

        return scenes;
    }

}
