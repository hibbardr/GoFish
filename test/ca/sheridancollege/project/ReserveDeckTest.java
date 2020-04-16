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
public class ReserveDeckTest {
    
    public ReserveDeckTest() {
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
     * Test of distributeToPlayers method, of class ReserveDeck.
     */
    @Test
    public void testDistributeToPlayersGood() {
        System.out.println("distributeToPlayers");
        ArrayList<FPlayer> players = null;
        int noOfPlayers = 2;
        ReserveDeck instance = null;
        instance.distributeToPlayers(players, noOfPlayers);
        
    }
    @Test
    public void testDistributeToPlayersBad() {
        System.out.println("distributeToPlayers");
        ArrayList<FPlayer> players = null;
        int noOfPlayers = 0;
        ReserveDeck instance = null;
        instance.distributeToPlayers(players, noOfPlayers);
        
    }
    @Test
    public void testDistributeToPlayersBoundary() {
        System.out.println("distributeToPlayers");
        ArrayList<FPlayer> players = null;
        int noOfPlayers = -5;
        ReserveDeck instance = null;
        instance.distributeToPlayers(players, noOfPlayers);
        
    }
    
}
