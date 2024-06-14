/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.ResultSet;

/**
 *
 * @author llllllllll
 */
public class DBsearch {
    private DBconnection dbConnection;

    public DBsearch() {
        dbConnection = new DBconnection();
        dbConnection.setConnection();
    }

    public ResultSet searchLogin(String usemail) {
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM admin_login WHERE email = ?";
            PreparedStatement pst = dbConnection.prepareStatement(sql);
            pst.setString(1, usemail);
            rs = pst.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet searchlogin(String usemail) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
