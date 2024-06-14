/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.CustomerModel;
import view.checkIn;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author llllllllll
 */
public class CustomerController {
    private CustomerModel model;
    private checkIn view;

    public CustomerController(checkIn view) {
        this.model = new CustomerModel();
        this.view = view;
    }

    public void addCustomer(String id, String name, String address, String mobileNo, String nationality, String gender, 
                            String email, String roomType, String roomNo, String bed, String price, Date checkinDate) throws Exception {
        model.addCustomer(id, name, address, mobileNo, nationality, gender, email, roomType, roomNo, bed, price, checkinDate);
    }

    public void updateCustomer(String id, String name, String address, String mobileNo, String nationality, String gender, 
                               String email, String roomType, String roomNo, String bed, String price, Date checkinDate) throws Exception {
        model.updateCustomer(id, name, address, mobileNo, nationality, gender, email, roomType, roomNo, bed, price, checkinDate);
    }

    public void deleteCustomer(String id) throws Exception {
        model.deleteCustomer(id);
    }

    public DefaultTableModel getCustomerTableModel() throws Exception {
        return model.getCustomerTableModel();
    }
}
