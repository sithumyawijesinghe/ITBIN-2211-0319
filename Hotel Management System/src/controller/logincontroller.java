/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Login;
import view.home;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.DBconnection;
import model.DBsearch;
/**
 *
 * @author llllllllll
 */
public class logincontroller {
    
     public static void login(String usemail, String pass){
           DBconnection dbConnection = new DBconnection();
      try{
          String email = null;
          String password = null;
          ResultSet rs = new DBsearch().searchlogin(usemail);
           
           while (rs.next()){
               email = rs.getString("email");
               password = rs.getString("password");
           }
           if (email != null && password != null){
               if (password.equals(pass)){
                   System.out.println("Login Sucessfull");
                   dbConnection.closeCon();
                   
                   view.Login.getFrames()[0].dispose();
                   new home().setVisible(true);
               }else{
                   JOptionPane.showMessageDialog(null,"please check the credentials", "error",JOptionPane.ERROR_MESSAGE);
               }
           }else{
               JOptionPane.showMessageDialog(null,"please check the credentials", "error",JOptionPane.ERROR_MESSAGE);
               }
           
           rs.close();
           }catch (SQLException ex){
               Logger.getLogger(logincontroller.class.getName()).log(Level.SEVERE,null,ex);
           }
      }
    
}
