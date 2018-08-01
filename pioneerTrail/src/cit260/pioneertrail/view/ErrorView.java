/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.view;

import java.io.PrintWriter;
import pioneertrail.PioneerTrail;

/**
 *
 * @author Stephen
 */
public class ErrorView {
    private static final PrintWriter console = PioneerTrail.getOutFile();
    private static final PrintWriter log = PioneerTrail.getLogFile();

    public ErrorView() {
    }
    
    public static void display(String className, String errorMessage){
        console.println(
                "\n--- ERROR -------------------------------------------" +
                "\n" + errorMessage +
                "\n-----------------------------------------------------\n");
        
        log.printf("%n%n%s", className + " - " + errorMessage);
    }
}
