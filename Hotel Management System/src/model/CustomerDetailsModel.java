/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author llllllllll
 */
public class CustomerDetailsModel {
    private Connection con;
    private PreparedStatement pst;

    public CustomerDetailsModel() {
        Connect();
    }

    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/checkin", "root", "");
            System.out.println("connected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerDetailsModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet searchCustomerByRoomNo(String roomNo) {
        ResultSet rs = null;
        try {
            pst = con.prepareStatement("SELECT * FROM customer_details WHERE roomNo= ?");
            pst.setString(1, roomNo);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDetailsModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
}
