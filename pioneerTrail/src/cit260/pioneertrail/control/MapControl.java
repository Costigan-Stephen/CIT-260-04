/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.QuestionType;
import cit260.pioneertrail.model.Scene;
import cit260.pioneertrail.model.SceneType;

/**
 *
 * @author Stephen
 */
public class MapControl {

    public static Scene[] createScenes(){
        
        int s = 27;
        Scene[] scenes = new Scene[s];
        
        int o = SceneType.BushLand.ordinal();
        scenes[o] = new Scene();
        scenes[o].setDescription("BushLand");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ᴥ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Plains.ordinal();
        scenes[o].setDescription("Plains");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("؀");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Forest.ordinal();
        scenes[o].setDescription("Forest");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ѱ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Jungle.ordinal();
        scenes[o].setDescription("Jungle");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("∆");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Canyon.ordinal();
        scenes[o].setDescription("Canyon");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("_");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.RedForest.ordinal();
        scenes[o].setDescription("RedForest");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("▲");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.River.ordinal();
        scenes[o].setDescription("River");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("~");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Lake.ordinal();
        scenes[o].setDescription("Lake");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("≈");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Waterfall.ordinal();
        scenes[o].setDescription("Waterfall");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ת");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Tundra.ordinal();
        scenes[o].setDescription("Tundra");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ﭛ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
         
        o = SceneType.Sparse.ordinal();
        scenes[o].setDescription("Sparse");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol(",");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
         
        o = SceneType.CrackedEarth.ordinal();
        scenes[o].setDescription("CrackedEarth");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ﷴ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
         
        o = SceneType.Arid.ordinal();
        scenes[o].setDescription("Arid");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol(".");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Desert.ordinal();
        scenes[o].setDescription("Desert");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("ꞈ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Hills.ordinal();
        scenes[o].setDescription("Hills");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("∩");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Mountain.ordinal();
        scenes[o].setDescription("Mountain");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("˄");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Stream.ordinal();
        scenes[o].setDescription("Stream");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("-");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Town.ordinal();
        scenes[o].setDescription("Town");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Village.ordinal();
        scenes[o].setDescription("Village");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Encampment.ordinal();
        scenes[o].setDescription("Encampment");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.IndianCamp.ordinal();
        scenes[o].setDescription("IndianCamp");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("◊");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Caves.ordinal();
        scenes[o].setDescription("Caves");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("₾");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Swamp.ordinal();
        scenes[o].setDescription("Swamp");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("ʬ");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.DryRiver.ordinal();
        scenes[o].setDescription("DryRiver");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("͜");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Flooded.ordinal();
        scenes[o].setDescription("Flooded");
        scenes[o].setBlocked(true);
        scenes[o].setSymbol("؅");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.MuddyPath.ordinal();
        scenes[o].setDescription("MuddyPath");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("؁");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
        o = SceneType.Zion.ordinal();
        scenes[o].setDescription("Zion");
        scenes[o].setBlocked(false);
        scenes[o].setSymbol("♦");
        scenes[o].setActor(getActor(o));
        scenes[o].setActor(getItem(o));
        scenes[o].setQuestion(getQuestion(o));
        
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
