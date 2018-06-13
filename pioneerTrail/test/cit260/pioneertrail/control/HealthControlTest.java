/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import cit260.pioneertrail.model.Status;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stephen
 */
public class HealthControlTest {
    
    public HealthControlTest() {
    }

    /**
     * Test of calcStatusDuration method, of class HealthControl.
     */
    @Test
    public void testCalcStatusDuration() {
        System.out.println("calcStatusDuration");
        
        //          FROM STATUS:
        //    0  Healthy     (0,0,"Healthy"),
        //    1  Feverish    (1,10,"Feverish"),
        //    2  Chills      (2,10,"Chills"),
        //    3  Flu         (3,20,"Influenza"),
        //    4  SmallPox    (4,25,"Small Pox"),
        //    5  YellowFever (5,30,"Yellow Fever"), 
        //    6  BrokenArm   (6,15,"Broken Arm"),
        //    7  BrokenLeg   (7,20,"Broken Leg"),
        //    8  SpiderBite  (8,10,"Spider Bite"),
        //    9  SnakeBite   (9,15,"Snake Bite"),
        //    10 Appendicitis(10,20,"Appendicitis"),
        //    11 PersistentCough  (11,20,"PersistentCough"),
        //    12 Bronchitis  (12,25,"Bronchitis"),
        //    13 StomachBug  (13,5,"Stomach Bug"),
        //    14 TornLigament(14,18,"Torn Ligament");

        
        // ===================================================
        // TEST CASE 1
        // ===================================================
        
        int testnum = 1;
        System.out.println("Test Case #" + testnum);
        
        int movementSpeed = 2;
        int hunger = 7;
        Status status = Status.SmallPox;
        double expResult = -4.0;
        double result = HealthControl.calcStatusDuration(movementSpeed, hunger, status);
        assertEquals(expResult, result, 0.01);

        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 2
        // ===================================================
        
        testnum += 1;
        System.out.println("Test Case #" + testnum);
        
        movementSpeed = 2;
        hunger = 4;
        status = Status.BrokenLeg;
        expResult = 26.0;
        result = HealthControl.calcStatusDuration(movementSpeed, hunger, status);
        assertEquals(expResult, result, 0.01);

        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 3
        // ===================================================
        
        testnum += 1;
        System.out.println("Test Case #" + testnum);
        
        movementSpeed = 0;
        hunger = 1;
        status = Status.Feverish;
        expResult = 11.0;
        result = HealthControl.calcStatusDuration(movementSpeed, hunger, status);
        assertEquals(expResult, result, 0.01);

        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 4
        // ===================================================
        
        testnum += 1;
        System.out.println("Test Case #" + testnum);
        
        movementSpeed = 4;
        hunger = 2;
        status = Status.SmallPox;
        expResult = -2.0;
        result = HealthControl.calcStatusDuration(movementSpeed, hunger, status);
        assertEquals(expResult, result, 0.01);

        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 5
        // ===================================================
        
        testnum += 1;
        System.out.println("Test Case #" + testnum);
        
        movementSpeed = 3;
        hunger = 3;
        status = Status.BrokenArm;
        expResult = 21.0;
        result = HealthControl.calcStatusDuration(movementSpeed, hunger, status);
        assertEquals(expResult, result, 0.01);

        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 6
        // ===================================================
        
        testnum += 1;
        System.out.println("Test Case #" + testnum);
        
        movementSpeed = 1;
        hunger = 2;
        status = Status.Healthy;
        expResult = -6.0;
        result = HealthControl.calcStatusDuration(movementSpeed, hunger, status);
        assertEquals(expResult, result, 0.01);

        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 7
        // ===================================================
        
        testnum += 1;
        System.out.println("Test Case #" + testnum);
        
        movementSpeed = 3;
        hunger = 5;
        status = Status.PersistentCough;
        expResult = 28.0;
        result = HealthControl.calcStatusDuration(movementSpeed, hunger, status);
        assertEquals(expResult, result, 0.01);

        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
    }
    
}
