/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import java.util.Scanner;

/**
 *
 * @author Stephen
 */
public class StartProgramView {
    
    public StartProgramView(){
    
    }
    
    public void displayStartProgramView() {

        boolean endOfView = false;
        String[] inputs = this.getInputs();
        do{
            endOfView = doAction(inputs);
         
        }while (endOfView == false);
    }
    
    private String[] getInputs() {
        
        boolean valid = false;
        String[] inputs = new String[10];

        do {     
            
            System.out.print("\033[H\033[2J"); //Clears Screen
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            input = input.trim();
            
            System.out.println("You entered: " + input);

            //TRIM BY FORCED CLIPPING
            char y;
            for(int x=0;x<input.length();x++){
               y = input.charAt(x);
               inputs[x] = Character.toString(y);
            }

            if(inputs.length < 1){
                System.out.println("Invalid value entered");
                System.out.println("You must enter a non-blank value");
            } else if (input.matches ("q") || input.matches ("Q")){
                System.out.println("Returning to previous menu");
                return inputs;
            } 
        
        } while (valid == false);
        return inputs;
    }
    
    private boolean doAction(String[] inputs) {
        System.out.println("doAction() method has been called");
        System.out.println("\tinputs = " + inputs[0]);
        return true;
    }
    
}

