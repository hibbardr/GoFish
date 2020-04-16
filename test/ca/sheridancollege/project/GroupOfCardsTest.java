/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rache
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void testGetSizeGood() {
        System.out.println("getSize");
        GroupOfCards instance = null;
        int expResult = 5;
        int result = instance.getSize();
        assertEquals(expResult, result);
       
    }
     @Test
    public void testGetSizeBad() {
        System.out.println("getSize");
        GroupOfCards instance = null;
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
       
    }
     @Test
    public void testGetSizeBoundary() {
        System.out.println("getSize");
        GroupOfCards instance = null;
        int expResult = -8;
        int result = instance.getSize();
        assertEquals(expResult, result);
       
    }

    
}
