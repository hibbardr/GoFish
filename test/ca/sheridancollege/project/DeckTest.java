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
public class DeckTest {
    
    public DeckTest() {
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
     * Test of getCards method, of class Deck.
     */

    /**
     * Test of moveCardToDeck method, of class Deck.
     */
    @Test
    public void testMoveCardToDeckGood() {
        System.out.println("moveCardToDeck");
        int index = 5;
        Deck deck = null;
        Deck instance = null;
        instance.moveCardToDeck(index, deck);
        // TODO review the generated test code and remove the default call to fail.
       
    }
     @Test
    public void testMoveCardToDeckBad() {
        System.out.println("moveCardToDeck");
        int index = -5;
        Deck deck = null;
        Deck instance = null;
        instance.moveCardToDeck(index, deck);
        // TODO review the generated test code and remove the default call to fail.
       
    
    }
     @Test
    public void testMoveCardToDeckBoundary() {
        System.out.println("moveCardToDeck");
        int index = 0;
        Deck deck = null;
        Deck instance = null;
        instance.moveCardToDeck(index, deck);
        // TODO review the generated test code and remove the default call to fail.
       
    }


    
}
