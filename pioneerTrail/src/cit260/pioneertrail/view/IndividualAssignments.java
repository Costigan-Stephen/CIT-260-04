/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import cit260.pioneertrail.control.HealthControl;
import cit260.pioneertrail.exceptions.HealthControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stephen
 */
public class IndividualAssignments extends View {

    public IndividualAssignments() {
        super("========================================= "
                + "\n\t   Individual Assignments "
                + "\n========================================="
                + "\n S - Steve's Assignment "
                + "\n M - Marilee's Assignment "
                + "\n J - Joseph's Assignment "
                + "\n Q - Quit game "
                + "\n=========================================\n ");
    }

    @Override
    public boolean doAction(String inputs) {

        switch (inputs) {
            case "S":
                {
                    try {
                        calcHealthRemaining();
                    } catch (HealthControlException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                break;
            case "M":
//                MainMenuView chuck = new MainMenuView();
//                chuck.display();
                break;
            case "J":
//                MainMenuView chuck = new MainMenuView();
//                chuck.display();
                break;
            case "Q":
                MainMenuView fun = new MainMenuView();
                fun.display();
                return true;
        }
        return true;
    }

    private void calcHealthRemaining() throws HealthControlException {
        System.out.println("\nDisplaying Health remaining for Actor: Spot (the dog): ...");
        int actorNumber = 4;
        HealthControl.calcHealthRemaining(actorNumber); 
    }

}
