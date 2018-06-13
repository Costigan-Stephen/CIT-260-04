/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import cit260.pioneertrail.model.InventoryItem;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marilee
 */
public class ResourceControlTest {
    
    public ResourceControlTest() {
    }

    /**
     * Test of calcHuntingResource method, of class ResourceControl.
     */
    @Test
    public void testCalcHuntingResource() {
        System.out.println("calcHuntingResource");
        
        
        // ===================================================
        // TEST CASE 1
        // ===================================================    
   
        int hunger = 5;
        InventoryItem item = new InventoryItem();
        item.quantityOfItems = 10;
        int randomNumber = 15;
        double expResult = 1; 
        double result = ResourceControl.calcHuntingResource(hunger, item, randomNumber);
        assertEquals(expResult, result, 0.0);

        int testnum = 1;  
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }
         else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 2
        // ===================================================
        
        hunger = 2;
        item.quantityOfItems = -1;
        randomNumber = 6;
        expResult = -1; 
        result = ResourceControl.calcHuntingResource(hunger, item, randomNumber);
        assertEquals(expResult, result, 0.0);

        testnum = 2;  
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }
         else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 3
        // ===================================================
        
        hunger = 6;
        item.quantityOfItems = 45;
        randomNumber = 18;
        expResult = -4; 
        result = ResourceControl.calcHuntingResource(hunger, item, randomNumber);
        assertEquals(expResult, result, 0.0);

        testnum = 3;  
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }
         else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 4
        // ===================================================
        
        hunger = 3;
        item.quantityOfItems = 72;
        randomNumber = -1;
        expResult = -5; 
        result = ResourceControl.calcHuntingResource(hunger, item, randomNumber);
        assertEquals(expResult, result, 0.0);

        testnum = 4;  
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }
         else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 5
        // ===================================================
        
        hunger = 0;
        item.quantityOfItems = 1;
        randomNumber = 5;
        expResult = 0; 
        result = ResourceControl.calcHuntingResource(hunger, item, randomNumber);
        assertEquals(expResult, result, 0.0);

        testnum = 5;  
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }
         else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 6
        // ===================================================
        
        hunger = 4;
        item.quantityOfItems = 100;
        randomNumber = 20;
        expResult = 5; 
        result = ResourceControl.calcHuntingResource(hunger, item, randomNumber);
        assertEquals(expResult, result, 0.0);

        testnum = 6;  
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }
         else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 7
        // ===================================================
        
        hunger = 5;
        item.quantityOfItems = 50;
        randomNumber = 6;
        expResult = 9; 
        result = ResourceControl.calcHuntingResource(hunger, item, randomNumber);
        assertEquals(expResult, result, 0.0);

        testnum = 7;  
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }
         else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
    }
    
}
