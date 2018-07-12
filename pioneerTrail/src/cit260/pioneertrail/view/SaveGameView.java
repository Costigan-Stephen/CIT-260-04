/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.GameControl;
import cit260.pioneertrail.model.Game;
import java.io.FileWriter;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
public class SaveGameView extends View{
    
    public SaveGameView() {
        super(
                "==================================================== "
               + "\n Please enter the filename of your save:"
               + "\n==================================================== \n");// Display the instructions  
    }
    
    
    @Override
    public boolean doAction(String filePath) {

        Game game = PioneerTrail.getCurrentGame();
        
        try {
            GameControl.saveGame(game, filePath);
        } catch (Exception e){
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            return false;
        }
        this.console.println("\nGame saved successfully at " + filePath);
        return true;// RETURN false
    }
    
    //    /**
//     *
//     * @param input
//     * @return
//     */
//    public String getInputs(String input) {
//        
////       this.console.println(  "==================================================== "
////                           + "\n Please enter the filename of your save:"
////                           + "\n==================================================== \n");
//       boolean valid = false;
//        try {
//            do {
//                this.console.println(input);
//                input = this.keyboard.readLine();
//                input = input.trim();
//
//                if (input.length() < 1) {
//                    ErrorView.display(this.getClass().getName(), "You must enter a value");
//                    continue;
//                }
//                valid = true;
//            } while (valid == false);
//
//        } catch (Exception e) {
//            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
//        }
////    input1 = getInput(thePromptMessage)
////    save a reference to input1 in the inputs array
//    return input;
//    }

}
