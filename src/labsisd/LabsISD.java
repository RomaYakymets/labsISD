/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsisd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Initial class
 * @author user
 */
public class LabsISD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogIn.main();
       //RegistrationForm.main(args);
       //ManagerFrame.main(args);
       //EmployeeFrame.main(args);
    }
   /**
 * This method created for example testing
 *
 * @param  s1  Parameter that will be added
 * @param  s2  Parameter that will be added
 * @return     The sum of these parameter
 */
     public int add(String s1,String s2){
         int int1 =Integer.parseInt(s1);
         int int2 =Integer.parseInt(s2);
         return int1+int2;
     }
}
