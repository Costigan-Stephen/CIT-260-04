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
 * @author Stephen
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcWeightRemaining method, of class InventoryControl.
     */
    @Test
    public void testCalcWeightRemaining() {
        
        // ===================================================
        // TEST CASE 1
        // ===================================================
        
        
        double weightRemaining = 30.0;
        InventoryItem item = new InventoryItem();
        item.itemWeight = 10;
        item.quantityOfItems = 3;
        InventoryControl instance = new InventoryControl();
        int testnum = 1;
        System.out.println("Test Case #" + testnum);
        
        double expResult = 0.0;
        double result = instance.calcWeightRemaining(weightRemaining, item);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 2
        // ===================================================
        
        weightRemaining = 50.0;
        item.itemWeight = -1;
        item.quantityOfItems = 20;
        testnum += 1;
        System.out.println("Test Case #" + testnum);
        
        expResult = -1.0;
        result = instance.calcWeightRemaining(weightRemaining, item);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 3
        // ===================================================
        
        weightRemaining = 40.0;
        item.itemWeight = 3.0;
        item.quantityOfItems = 25;
        testnum += 1;
        System.out.println("Test Case #" + testnum);
        
        expResult = 1.0;
        result = instance.calcWeightRemaining(weightRemaining, item);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 4
        // ===================================================
        
        weightRemaining = 60.0;
        item.itemWeight = 5.0;
        item.quantityOfItems = -5;
        testnum += 1;
        System.out.println("Test Case #" + testnum);
        
        expResult = -2.0;
        result = instance.calcWeightRemaining(weightRemaining, item);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 5
        // ===================================================
        
        weightRemaining = 10.0;
        item.itemWeight = 1.5;
        item.quantityOfItems = 20;
        testnum += 1;
        System.out.println("Test Case #" + testnum);
        
        expResult = 1.0;
        result = instance.calcWeightRemaining(weightRemaining, item);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 6
        // ===================================================
        
        weightRemaining = 55.0;
        item.itemWeight = 4;
        item.quantityOfItems = 21;
        testnum += 1;
        System.out.println("Test Case #" + testnum);
        
        expResult = 3.0;
        result = instance.calcWeightRemaining(weightRemaining, item);
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
        
        // ===================================================
        // TEST CASE 7
        // ===================================================
        
        weightRemaining = 0.0;
        item.itemWeight = 4;
        item.quantityOfItems = 5;
        testnum += 1;
        System.out.println("Test Case #" + testnum);
        
        expResult = -3.0;
        result = instance.calcWeightRemaining(weightRemaining, item);
        assertEquals(expResult, result, 0.01);
        
        if (result != expResult){
            System.out.println("\tTest case #" + testnum + " Failed. Returned: " + result + ", expexted: " + expResult);
        }else{
            System.out.println("\ttest case #" + testnum + " succeeded, returned: " + result);
        }
    }
    
}
