/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author llllllllll
 */
public class CustomerModel {
      private Connection con;
    private PreparedStatement pst;

    public CustomerModel() {
        Connect();
    }

    private void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/checkin", "root", "");
            System.out.println("connected");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void addCustomer(String id, String name, String address, String mobileNo, String nationality, String gender, 
                            String email, String roomType, String roomNo, String bed, String price, Date checkinDate) throws SQLException {
        pst = con.prepareStatement("INSERT INTO customer_details(id,name,address,mobile_no,nationality,gender,email,roomtype,roomno,bed,price,checkindate)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
        pst.setString(1, id);
        pst.setString(2, name);
        pst.setString(3, address);
        pst.setString(4, mobileNo);
        pst.setString(5, nationality);
        pst.setString(6, gender);
        pst.setString(7, email);
        pst.setString(8, roomType);
        pst.setString(9, roomNo);
        pst.setString(10, bed);
        pst.setString(11, price);

        if (checkinDate != null) {
            pst.setDate(12, new java.sql.Date(checkinDate.getTime()));
        } else {
            pst.setNull(12, java.sql.Types.DATE);
        }

        pst.executeUpdate();
    }

    public void updateCustomer(String id, String name, String address, String mobileNo, String nationality, String gender, 
                               String email, String roomType, String roomNo, String bed, String price, Date checkinDate) throws SQLException {
        String query = "UPDATE customer_details SET name=?,address=?, mobile_no=?, nationality=?, gender=?, email=?, roomtype=?, roomno=?, bed=?, price=?, checkindate=? WHERE id = ?";
        pst = con.prepareStatement(query);

        pst.setString(1, name);
        pst.setString(2, address);
        pst.setString(3, mobileNo);
        pst.setString(4, nationality);
        pst.setString(5, gender);
        pst.setString(6, email);
        pst.setString(7, roomType);
        pst.setString(8, roomNo);
        pst.setString(9, bed);
        pst.setString(10, price);

        if (checkinDate != null) {
            pst.setDate(11, new java.sql.Date(checkinDate.getTime()));
        } else {
            pst.setNull(11, java.sql.Types.DATE);
        }

        pst.setString(12, id);
        pst.executeUpdate();
    }

    public void deleteCustomer(String id) throws SQLException {
        String query = "DELETE FROM customer_details WHERE id = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, id);
        pst.executeUpdate();
    }

    public DefaultTableModel getCustomerTableModel() throws SQLException {
        pst = con.prepareStatement("SELECT * FROM customer_details");
        ResultSet Rs = pst.executeQuery();

        ResultSetMetaData RSMD = Rs.getMetaData();
        int CC = RSMD.getColumnCount();
        DefaultTableModel DFT = new DefaultTableModel();

        for (int i = 1; i <= CC; i++) {
            DFT.addColumn(RSMD.getColumnName(i));
        }

        while (Rs.next()) {
            Vector<Object> v2 = new Vector<>();
            for (int ii = 1; ii <= CC; ii++) {
                v2.add(Rs.getObject(ii));
            }
            DFT.addRow(v2);
        }
        return DFT;
    }
}
