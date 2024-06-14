/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author llllllllll
 */
public class DBconnection {
    private Connection conn;
    //static Statement stat=null;
    public void setConnection() {
        try {
            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/admin_home";
            conn = DriverManager.getConnection(url, "root", "");
            System.out.println("Successfully connected with the DB");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   public Statement getStatementConnection() throws SQLException {
        if (conn == null) {
            setConnection();
        }
        return conn.createStatement();
    }

    // Method to close the connection
    public void closeCon() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    // Method to prepare a SQL statement
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        if (conn == null) {
            setConnection();
        }
        return conn.prepareStatement(sql);
    }

    public PreparedStatement prepareStatment(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}