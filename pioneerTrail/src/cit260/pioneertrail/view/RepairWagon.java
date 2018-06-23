/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author stephencostigan
 */
public class RepairWagon extends View {

    public RepairWagon() {
//       String[] sel = { "A", "B", "C", "D", "E", "F", "G", "H" };
        super(
                "==================================================== "
                + "\n\t\t   REPAIR MENU "
                + "\n==================================================== "
                //        showSelection(sel,"menu",0);//A
                //        showSelection(sel,"menu",1); //B  
                //        showSelection(sel,"menu",2); //C         
                //        showSelection(sel,"menu",3); //D           
                //        showSelection(sel,"menu",4); //E           
                //        showSelection(sel,"menu",5); //F          
                //        showSelection(sel,"menu",6); //G  
                //        showSelection(sel,"menu",7); //H  
                //        System.out.println(""
                + "\n==================================================== "
                + "\n    P - Parts Available "
                + "\n    Q - Return to Previous menu "
                + "\n====================================================\n "
        );
    }

    public String repairPart(String input) {
        System.out.println("Let's see if we can fix that!\n");
        showSelection(input, "repairPart", 0);
        System.out.print(" Requires ");
        getPartName(input, 0);
        System.out.print("\nto be fully repaired.  Would you like to use these tools now?"
                + "\n\n\t Y - YES \t N - NO\n\n"
        );

//        display("part");
        return null;
    }

    public void availableParts() {
        System.out.println("\nThese are the available parts");

    }

    public boolean repairYes(String type) {
        System.out.println("\nRepair Successful!  Press Enter to continue...");

//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//        displayMenu(type);
        return true;
    }

//    public String[] showSelection(String input, String type, int x){
    @Override
    public boolean doAction(String type) {

        switch (type) {

            case "A":
                if ("menu".equals(type)) {
                    System.out.print("    A. Left Front Wheel   : 76%");
                } else {
                    System.out.print("Left Front Wheel");
                }
                break;
            case "B":
                if ("menu".equals(type)) {
                    System.out.print("\n    B. Right Front Wheel  : 95%");
                } else {
                    System.out.print("Right Front Wheel");
                }
                break;
            case "C":
                if ("menu".equals(type)) {
                    System.out.print("\n    C. Left Rear Wheel    : 98%");
                } else {
                    System.out.print("Left Rear Wheel");
                }
                break;
            case "D":
                if ("menu".equals(type)) {
                    System.out.print("\n    D. Right Rear Wheel   : 65%");
                } else {
                    System.out.print("Right Rear Wheel");
                }
                break;
            case "E":
                if ("menu".equals(type)) {
                    System.out.print("\n    E. Cabin Floor        : 99%");
                } else {
                    System.out.print("Cabin Floor");
                }
                break;
            case "F":
                if ("menu".equals(type)) {
                    System.out.print("\n    F. Oxen Restraints    : 88%");
                } else {
                    System.out.print("Oxen Restraints");
                }
                break;
            case "G":
                if ("menu".equals(type)) {
                    System.out.print("\n    G. Yoke and Brakes    : 90%");
                } else {
                    System.out.print("Yoke and Brakes");
                }
                break;
            case "H":
                if ("menu".equals(type)) {
                    System.out.print("\n    H. Cart Covering      : 85%");
                } else {
                    System.out.print("Cart Covering");
                }
                break;
        }
        return false;
//        return null;
    }

    private String getPartName(String input, int x) {
        System.out.print("[PartName and Quantity goes here]");
        return null;
    }

    private void showSelection(String input, String repairPart, int i) {
        System.out.print("[Selection goes here]");
    }

}
