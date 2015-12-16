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
public class LogInTest {
    
    public LogInTest() {
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
     * Test of main method, of class LogIn.
     */
       @Test
    public void testjButton1ActionPerformed() {
        System.out.println("jButton1ActionPerformed");
        java.awt.event.ActionEvent evt;
        LogIn testLogIn =new LogIn();
           // assert(w,testLogIn);
//    if (jTextField1.getText().equals("2")&&jPasswordField1.getText().equals("2"))
//        assertEquals(LogIn.jTextField1.getText(),2);
//          assertEquals(testLogIn.jTextField1.getText().equals("2"),2)
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMain() {
        System.out.println("main");
        LogIn.main();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
