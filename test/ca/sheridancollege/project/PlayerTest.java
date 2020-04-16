/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getPlayerID method, of class Player.
     */

    /**
     * Test of setPlayerID method, of class Player.
     */
    @Test
    public void testSetPlayerIDGood() {
        System.out.println("setPlayerID");
        String givenID = "Rachel";
        Player instance = null;
        instance.setPlayerID(givenID);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    @Test
     public void testSetPlayerIDBad() {
        System.out.println("setPlayerID");
        String givenID = "555";
        Player instance = null;
        instance.setPlayerID(givenID);
        // TODO review the generated test code and remove the default call to fail.
   
    }
     @Test
      public void testSetPlayerIDBoundary() {
        System.out.println("setPlayerID");
        String givenID = "";
        Player instance = null;
        instance.setPlayerID(givenID);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    
}
