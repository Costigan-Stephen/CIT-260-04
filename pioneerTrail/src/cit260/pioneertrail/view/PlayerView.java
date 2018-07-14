/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.GameControl;
import cit260.pioneertrail.model.Actor;
import cit260.pioneertrail.model.Game;
import java.util.ArrayList;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
public class PlayerView extends View {

    public PlayerView() {
        super(
                "==================================================== "
               + "\n Please enter the filename of your report:"
               + "\n==================================================== \n");// Display the instructions  
        
    }
    
    
    @Override
    public boolean doAction(String filePath) {
        String formatting = "%n%-20s%-20s%-10s%-30s";
        String output = String.format(formatting,"","   List of Actors in Game","","");
        output += String.format(formatting, "--------------------", "--------------------", "----------", "------------------------------" );
        output += String.format(formatting, "Name", "Description", "Health", "Purpose" );
        output += String.format(formatting, "--------------------", "--------------------", "----------", "------------------------------" );
//        actors.add(new Actor(0, "Samantha", "Mother", 100.0, "Lead the Family"));
        Game game = PioneerTrail.getCurrentGame();
        ArrayList<Actor> actor = game.getActors();
        
        for (int i=0; i<actor.size(); i++) {
            double health = actor.get(i).getHealth();
            output += String.format(formatting, actor.get(i).getName(), actor.get(i).getDescription(), Double.toString(health), actor.get(i).getPurpose());
        }
        
        this.console.println(output);
        
        try {
            GameControl.saveFile(output, filePath);
        } catch (Exception e){
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            return false;
        }
        this.console.println("File saved successfully at " + filePath);
        return true;// RETURN false
    }
}
