/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hughe
 */
public class CharismaControlTest {
    
    public CharismaControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateCharisma method, of class CharismaControl.
     */
    @Test
    public void testCalculateCharisma() {
        System.out.println("calculateCharisma");
        System.out.println("\tTest case 1");
        boolean gender = false;
        char occupation = 'f';
        double money = 0.0;
        CharismaControl instance = new CharismaControl();
        boolean expResult = false;
        boolean result = instance.calculateCharisma(gender, occupation, money);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a failure and so are you.");
         System.out.println("calculateCharisma");
        System.out.println("\tTest case 2");
         gender = false;
         occupation = 'f';
         money = 5.0;
         expResult = false;
         result = instance.calculateCharisma(gender, occupation, money);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a fail and so are you.");
        System.out.println("calculateCharisma");
        System.out.println("\tTest case 1");
        gender = true;
        occupation = 'l';
        money = 20.0;
        expResult = true;
        result = instance.calculateCharisma(gender, occupation, money);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
