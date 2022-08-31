/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author princenagac
 */
public class MyConnection {
     public static Connection getConnection(){
        
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "");
        }
        return con;
    }
    
}
