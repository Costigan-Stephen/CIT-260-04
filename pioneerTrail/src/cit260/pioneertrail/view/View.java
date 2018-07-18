/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import pioneertrail.PioneerTrail;

/**
 *
 * @author stephencostigan
 */
public abstract class View implements ViewInterfaces {

    protected String promptMessage;

    protected final BufferedReader keyboard = PioneerTrail.getInFile();
    protected final PrintWriter console = PioneerTrail.getOutFile();

    public View() {
    }

    public View(String menuPrompt) {
        promptMessage = menuPrompt;
    }

    @Override
    public void display() {
        boolean endOfView = false;
        do {
            String input = this.getInputs();
            if (input.toUpperCase().equals("Q")) {
                return;
            }
            
            //Test for game over
            if (PioneerTrail.getCurrentGame().isGameOver() == true){
                displayGameOver();
                return;
            }

            endOfView = doAction(input);

        } while (endOfView != true);
    }

    @Override
    public String getInputs() {
        return getInput(promptMessage);
    }

    @Override
    public String getInput(String menuStr) { //One character menu entries
        boolean valid = false;
        String input = "";
        try {
            do {
                this.console.println(menuStr);
                input = this.keyboard.readLine();
                input = input.trim();

                if (input.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "You must enter a value");
                    continue;
                }
                valid = true;
            } while (valid == false);

        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return input;
    }

    public void displayGameOver() {
        EndGameView gameOver = new EndGameView();
        gameOver.display();
    }
}
