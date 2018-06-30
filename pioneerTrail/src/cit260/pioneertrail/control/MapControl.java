/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.Scene;
import cit260.pioneertrail.model.SceneType;

/**
 *
 * @author Stephen
 */
public class MapControl {
    
//    public static Scene[] createScenes() {
//scenes = Create an array Scene objects
//scene1 = Create a new Scene object
//Assign values to each attribute in the Scene object
//Assign scene1 to its position in the scenes array
//scene2 = Create a new ConstructionScene object
//Assign values to each attribute in the Scene object
//Assign scene2 to its position in the scenes array
//scene2 = Create a new ResourceScene object
//Assign values to each attribute in the Scene object
//Assign scene2 to its position in the scenes array
//…
//…
//…
//RETURN scenes
//}
    
    /* 
    River,
    Lake,
    Waterfall,
    Tundra,
    Sparse,
    CrackedEarth,
    Arid,
    Desert,
    Hills,
    Mountain,
    Stream,
    Town,
    Village,
    Encampment,
    IndianCamp,
    Caves,
    Swamp,
    DryRiver,
    Flooded,
    MuddyPath,
    Zion;
    */
    
    public static Scene[] createScenes(){
        
//        private SceneType scene;
//    private InventoryItem resource;
        
        
        int s = 27;
        Scene[] scenes = new Scene[s];
        
        int i = 0;
        scenes[SceneType.BushLand.ordinal()] = new Scene();
        scenes[SceneType.BushLand.ordinal()].setDescription("BushLand");
        scenes[SceneType.BushLand.ordinal()].setBlocked(false);
        scenes[SceneType.BushLand.ordinal()].setSymbol("B");
        scenes[SceneType.BushLand.ordinal()].setActor(getActor(i));
        scenes[SceneType.BushLand.ordinal()].setActor(getItem(i));
        
        i += 1;
        scenes[SceneType.Plains.ordinal()].setDescription("Plains");
        scenes[SceneType.Plains.ordinal()].setBlocked(false);
        scenes[SceneType.Plains.ordinal()].setSymbol("P");
        scenes[SceneType.Plains.ordinal()].setActor(getActor(i));
        scenes[SceneType.Plains.ordinal()].setActor(getItem(i));
        
        i += 1;
        scenes[SceneType.Forest.ordinal()].setDescription("Forest");
        scenes[SceneType.Forest.ordinal()].setBlocked(false);
        scenes[SceneType.Forest.ordinal()].setSymbol("B");
        scenes[SceneType.Forest.ordinal()].setActor(getActor(i));
        scenes[SceneType.Forest.ordinal()].setActor(getItem(i));
        
        i += 1;
        scenes[SceneType.Jungle.ordinal()].setDescription("Jungle");
        scenes[SceneType.Jungle.ordinal()].setBlocked(false);
        scenes[SceneType.Jungle.ordinal()].setSymbol("B");
        scenes[SceneType.Jungle.ordinal()].setActor(getActor(i));
        scenes[SceneType.Jungle.ordinal()].setActor(getItem(i));
        
        i += 1;
        scenes[SceneType.Canyon.ordinal()].setDescription("Canyon");
        scenes[SceneType.Canyon.ordinal()].setBlocked(false);
        scenes[SceneType.Canyon.ordinal()].setSymbol("B");
        scenes[SceneType.Canyon.ordinal()].setActor(getActor(i));
        scenes[SceneType.Canyon.ordinal()].setActor(getItem(i));
        
        i += 1;
        scenes[SceneType.RedForest.ordinal()].setDescription("RedForest");
        scenes[SceneType.RedForest.ordinal()].setBlocked(false);
        scenes[SceneType.RedForest.ordinal()].setSymbol("B");
        scenes[SceneType.RedForest.ordinal()].setActor(getActor(i));
        scenes[SceneType.RedForest.ordinal()].setActor(getItem(i));
                
        return scenes;
    }

    private static Actor getActor(int i) {  //Random actors met on the way
        return null;//Actor names and locations.
    }

    private static Actor getItem(int i) {   //Random items found on the way
        return null;//Item names and locations
    }
    
    
}
