/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.GameControl;
import cit260.pioneertrail.model.Game;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
class StartExistingGameView extends View {

    public StartExistingGameView() {
        super( "==================================================== "
               + "\n Please enter the filename of your save:"
               + "\n==================================================== \n");
        //STUFF
    }

    @Override
    public boolean doAction(String filePath) {

        try {
            GameControl.loadGame(filePath);
        } catch (Exception e){
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            return false;
        }
        this.console.println("\nGame loaded successfully at " + filePath);
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
        return true;
    }
}
