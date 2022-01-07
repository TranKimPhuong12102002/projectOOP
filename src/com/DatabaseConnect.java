/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentdb.connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class DatabaseConnect {
   public static Connection getConnection() {
          Connection sqlconn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlconn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","12102002"); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sqlconn;
    }
   public static void main(String[] args) throws SQLException {
        Connection c = getConnection();
        System.out.println(c.getCatalog());
    }
}
