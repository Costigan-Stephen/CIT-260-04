/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.GameControl;
import cit260.pioneertrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author Stephen
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super("\n"
                + " _______   _                                        _                   _   __  \n"
                + "|_   __ \\ (_)                                      / |_                (_) [  | \n"
                + "  | |__) |__   .--.   _ .--.  .---.  .---.  _ .--.`| |-'_ .--.  ,--.   __   | | \n"
                + "  |  ___/[  |/ .'`\\ \\[ `.-. |/ /__\\\\/ /__\\\\[ `/'`\\]| | [ `/'`\\]`'_\\ : [  |  | | \n"
                + " _| |_    | || \\__. | | | | || \\__.,| \\__., | |    | |, | |    // | |, | |  | | \n"
                + "|_____|  [___]'.__.' [___||__]'.__.' '.__.'[___]   \\__/[___]   \\'-;__/[___][___]"
                + "\n================================================================================ "
                + "\n\t   BY Marilee Austin, Joseph Hughes, and Stephen Costigan"
                + "\n================================================================================ "
                + "\nThe Pioneer Trail game is a text based role playing game. "
                + "\nIn this game, you will be a pioneer family who leads a "
                + "\nwagon train preparing to go west. You have heard of a place"
                + "\ncalled Zion in the mountains.You will have the opportunity "
                + "\nto hunt if you have weapons and ammunition."
                + "\nThis will be a perilous journey; If you have the needed "
                + "\nsupplies you could repair your damaged wagon, and fish when "
                + "\narriving at a lake or river. You will also have to stop to "
                + "\nrest from time to time, due to weak animals or to obtain food. "
                + "\nThe game is over when at least two family members have reached "
                + "\nZion.  Are you up for this tremendous undertaking?"
                + "\n\nPlease Enter Your Name:\n");

    }

    @Override
    public boolean doAction(String input) {

        String playerName;

        playerName = input;
//            playerName = playerName.substring(0, playerName.length() - 1).replace("null", "").replace(",", "").replace("[", "").replace("]", "").replace(" ", "").replace("_", " ");
        Player player = GameControl.savePlayer(playerName);

        System.out.print("\033[H\033[2J"); //Clears Screen
        System.out.println(
                "\n==================================================== "
                + "\n\t      Welcome aboard " + playerName + "!"
        );

        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();

        return true;
    }
}

