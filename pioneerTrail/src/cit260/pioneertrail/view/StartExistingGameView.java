/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.GameControl;
import cit260.pioneertrail.model.Game;

/**
 *
 * @author Stephen
 */
class StartExistingGameView extends View{

    public StartExistingGameView() {
        super("Load Game?");        
        //STUFF
    }
    @Override
    public boolean doAction(String input) {

        String createNewGame = null;

        createNewGame = input;
//            playerName = playerName.substring(0, playerName.length() - 1).replace("null", "").replace(",", "").replace("[", "").replace("]", "").replace(" ", "").replace("_", " ");
        Game game = GameControl.saveGame(createNewGame);

        System.out.print("\033[H\033[2J"); //Clears Screen
        System.out.println(
                "\n==================================================== "
                + "\n\t      You've started a new game!"
        );

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

        return true;
    }
    }

