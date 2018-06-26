/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

/**
 *
 * @author stephencostigan
 */
public interface ViewInterfaces {

    public void display();
//    public void displayStart(String inputs);

    public String getInputs();

    public String getInput(String menuStr);

    public boolean doAction(String inputs);
//    public boolean doActionName(String inputs);

}
