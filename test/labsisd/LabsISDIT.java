/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsisd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class LabsISDIT {
    
    public LabsISDIT() {
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
@Test
    public void testAdd2() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "2";
        LabsISD instance =new  LabsISD();
        int expResult =4;   
        int result = instance.add(s1,s2);
        assertEquals(expResult, result);
      }
    /**
     * Test of main method, of class LabsISD.
     */
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LabsISD.main(args);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
