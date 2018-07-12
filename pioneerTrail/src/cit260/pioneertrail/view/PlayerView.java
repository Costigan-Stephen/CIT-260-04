/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

/**
 *
 * @author Stephen
 */
public class PlayerView extends View {

    public PlayerView() {
        super(
                "==================================================== "
                + "\n\t\t   PLAYER MENU "
                + "\n==================================================== "
                + "\n\t    S - Save your Game "
                + "\n\t    L - Load a Saved Game "
                + "\n\t    I - View Inventory "
                + "\n\t    P - Show Party Status "
                + "\n\t    M - Show the Map "
                + "\n\t    G - Gather Resources "
                + "\n\t    R - Repair Wagon "
                + "\n\t    Q - Quit To Main Menu "
                + "\n====================================================\n\n "
        );

    }

    @Override
    public boolean doAction(String inputs) {
        inputs = inputs.toUpperCase();
        switch (inputs) {

            case "S":

                break;
            case "L":

                break;
            case "I":

                break;
            case "P":

                break;
            case "M":

                break;
            case "G":

                break;
//       case "R":
//           displayRepairWagon();
//           break;

        }

        return false;
    }
}
