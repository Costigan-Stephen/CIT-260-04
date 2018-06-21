/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import java.util.Scanner;

/**
 *
 * @author stephencostigan
 */
public interface ViewInterfaces {
    
    public void display(String type);
    public void displayStart(String inputs);
    public String [] getInputs();
    public String getInputString(String promptMessage);
    public boolean doAction(String[] inputs, String type);
    public boolean doActionName(String inputs);
    
}
