/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.sql.*;

/**
 *
 * @author Prodip Datta
 */
public class ConnectionProvider {
    public static Connection getCon() {
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/lms?"+"user=root&password=Pr0d1p@Mysql");
         return con ; 
     }
     catch(Exception e) {
         System.out.println(e);
         return null ;
     }
    }
}
