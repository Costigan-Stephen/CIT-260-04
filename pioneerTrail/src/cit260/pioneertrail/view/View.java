/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.view.ViewInterfaces;
import java.util.Scanner;

/**
 *
 * @author stephencostigan
 */
        
public abstract class View implements ViewInterfaces {
    
        public View(){  
        }
        
        @Override
        public void display() {  //displayStartProgramView() {
                
        boolean endOfView = false; //    endOfView = false
        
        do { //DO
            String[] inputs = this.getInputs(); //inputs = getInputs()
                        
            if (inputs.length < 1 || inputs[0].toUpperCase() == "Q"){ 
            //IF no inputs were entered OR the first input is Q
                return; //RETURN
            } //ENDIF
 
            endOfView = ViewInterfaces.doAction(inputs);
            
        }while (endOfView != true); //WHILE endOfView != true
    }
        
        @Override
        public String[] getInputs(String promptMessage) { //One character menu entries
            boolean valid = false;
            String[] inputs = new String[1];

            do {     
                System.out.println(promptMessage);
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                input = input.trim();
                input = input.toUpperCase();

                //Put input into String
                char y;
                y = input.charAt(0);
                inputs[0] = Character.toString(y);

                if(input.length() < 1){
                    System.out.println("Invalid value entered");
                    System.out.println("You must enter a non-blank value");
                    continue;
                } 

                 valid = true;

            } while (valid == false);
            return inputs;
        }
        
    @Override 
    public String[] getInputString(String promptMessage) { //More than one character
        
        boolean valid = false;
        String[] inputs = new String[16];

        do {     
            System.out.println(promptMessage);
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            input = input.trim().replace(" ", "_");

            //TRIM BY FORCED CLIPPING
            char y;
            for(int x=0;x<input.length()&&x<16;x++){
               y = input.charAt(x);
               inputs[x] = Character.toString(y);
            }

            if(input.length() < 1){
                System.out.println("Invalid value entered, You must enter a non-blank value");
            } else {
            return inputs;
        }  
        
        } while (valid == false);
        
        
        return inputs;
    }
}

    
    
    

