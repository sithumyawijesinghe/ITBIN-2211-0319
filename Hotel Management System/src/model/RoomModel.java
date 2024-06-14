/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author llllllllll
 */
public class RoomModel {
           private Connection con;
    private PreparedStatement pst;

    public RoomModel() {
        Connect();
    }

    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/room", "root", "");
            System.out.println("connected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RoomModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Vector<Vector<Object>> getAllRooms() {
        Vector<Vector<Object>> data = new Vector<>();
        try {
            pst = con.prepareStatement("SELECT * FROM roomsmanage");
            ResultSet rs = pst.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                for (int i = 1; i <= columnCount; i++) {
                    row.add(rs.getObject(i));
                }
                data.add(row);
            }
        } catch (SQLException e) {
            Logger.getLogger(RoomModel.class.getName()).log(Level.SEVERE, null, e);
        }
        return data;
    }

    public void addRoom(String roomNumber, String roomType, String bed, String price) throws SQLException {
        pst = con.prepareStatement("INSERT INTO roomsmanage(room_number, room_type, bed, price) VALUES(?, ?, ?, ?)");
        pst.setString(1, roomNumber);
        pst.setString(2, roomType);
        pst.setString(3, bed);
        pst.setString(4, price);
        pst.executeUpdate();
    }

    public void updateRoom(String roomNumber, String roomType, String bed, String price, String originalRoomNumber) throws SQLException {
        pst = con.prepareStatement("UPDATE roomsmanage SET room_number=?, room_type=?, bed=?, price=? WHERE room_number=?");
        pst.setString(1, roomNumber);
        pst.setString(2, roomType);
        pst.setString(3, bed);
        pst.setString(4, price);
        pst.setString(5, originalRoomNumber);
        pst.executeUpdate();
    }

    public void deleteRoom(String roomNumber) throws SQLException {
        pst = con.prepareStatement("DELETE FROM roomsmanage WHERE room_number=?");
        pst.setString(1, roomNumber);
        pst.executeUpdate();
    }
        
}
