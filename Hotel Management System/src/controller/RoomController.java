/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.RoomModel;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author llllllllll
 */
public class RoomController {
     private RoomModel model;

    public RoomController() {
        model = new RoomModel();
    }

    public Vector<Vector<Object>> getAllRooms() {
        return model.getAllRooms();
    }

    public void addRoom(String roomNumber, String roomType, String bed, String price) throws SQLException {
        model.addRoom(roomNumber, roomType, bed, price);
    }

    public void updateRoom(String roomNumber, String roomType, String bed, String price, String originalRoomNumber) throws SQLException {
        model.updateRoom(roomNumber, roomType, bed, price, originalRoomNumber);
    }

    public void deleteRoom(String roomNumber) throws SQLException {
        model.deleteRoom(roomNumber);
    }
}
