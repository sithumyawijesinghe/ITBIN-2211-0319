/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.CustomerDetailsModel;
import view.customerDetailsBill;
/**
 *
 * @author llllllllll
 */
public class CustomerDetailsController {
    private CustomerDetailsModel model;
    private customerDetailsBill view;

    public CustomerDetailsController(customerDetailsBill view) {
        this.view = view;
        this.model = new CustomerDetailsModel();
    }
    
}
