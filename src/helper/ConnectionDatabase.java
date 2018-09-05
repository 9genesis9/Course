/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author revanthane
 */
public class ConnectionDatabase {
    private static Connection connection;
    
    public static Connection getConnection(){
        
        if (connection == null){
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Course", "root", "");
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
            
            }
        }
        
        return connection;
    }
    
}