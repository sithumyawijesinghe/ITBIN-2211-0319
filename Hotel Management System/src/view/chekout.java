/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import model.Select;

/**
 *
 * @author llllllllll
 */
public class chekout extends javax.swing.JFrame {

    /**
     * Creates new form checkout
     */
    public chekout() {
        initComponents();
      //  Connect();
        
        txtrno.setEditable(true);
        txtname.setEditable(false);
        txtcheckin.setEditable(false);
        txtcheckoutdate.setEditable(false);
        txtmobile.setEditable(false);
        txtpriceperday.setEditable(false);
        txtnumofdaysstay.setEditable(false);
        txttotalamount.setEditable(false);
        txtemail.setEditable(false);
    }
    
    
    Connection con;
    PreparedStatement pst;
    
    
    public void Connect(){
      try{
       Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost/checkin","root","");
       System.out.println("connected");
       }catch (ClassNotFoundException | SQLException ex){
           Logger.getLogger(chekout.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(this, ex.getMessage() + "Database connection error");
      }
    }
    
   int id=0;
   String Query;
   String roomType;
   String bed;
   String roomNo;
    
   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtrno = new javax.swing.JTextField();
        btsearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcheckin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcheckoutdate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtpriceperday = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnumofdaysstay = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txttotalamount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btclear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/out.png"))); // NOI18N
        jLabel1.setText("Check-out");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 474, 157));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close11.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1740, 0, 54, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 131, -1, -1));

        txtrno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtrno, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 128, 233, -1));

        btsearch.setBackground(new java.awt.Color(153, 0, 0));
        btsearch.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btsearch.setForeground(new java.awt.Color(255, 255, 255));
        btsearch.setText("Search");
        btsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(927, 127, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 220, -1, -1));

        txtname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 251, 244, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Check-In Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        txtcheckin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtcheckin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 251, 277, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Check Out Date(Today)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 220, -1, -1));

        txtcheckoutdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtcheckoutdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 251, 320, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Mobile No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 220, -1, -1));

        txtmobile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 251, 290, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Price Per Day");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 355, -1, -1));

        txtpriceperday.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtpriceperday, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 386, 244, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Number of Days Stay");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 355, -1, -1));

        txtnumofdaysstay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtnumofdaysstay, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 386, 277, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Total Amount");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 355, -1, -1));

        txttotalamount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txttotalamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 386, 320, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 355, -1, -1));

        txtemail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1062, 386, 360, -1));

        btclear.setBackground(new java.awt.Color(153, 0, 0));
        btclear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btclear.setForeground(new java.awt.Color(255, 255, 255));
        btclear.setText("Clear");
        btclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclearActionPerformed(evt);
            }
        });
        getContentPane().add(btclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 130, 129, -1));

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Mobile no", "Nationality", "Gender", "Email", "Room Type", "Room no", "Bed", "Price", "Check In Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 1758, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkoutbk1.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, 1950, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try{
        ResultSet rs= Select.getData("SELECT * FROM customer_details");
        
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        
            while(rs.next()){
            model.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12)});
            }
            rs.close();
        }catch (Exception e){
          e.printStackTrace();
        }
      
    }//GEN-LAST:event_formComponentShown

    private void btsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchActionPerformed
      String roomNo=txtrno.getText();
        try(ResultSet rs =Select.getData("SELECT * FROM customer_details WHERE roomNo= '"+roomNo+"'")){
            
            if(rs.next())
            {
                txtrno.setEditable(false);             
                txtname.setText(rs.getString(2));
                txtmobile.setText(rs.getString(4));
                txtpriceperday.setText(rs.getString(11));
                txtcheckin.setText(rs.getString(12));
               
                
                SimpleDateFormat dbFormat=new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat displayFormat=new SimpleDateFormat("yyyy/MM/dd");
                Calendar cal=Calendar.getInstance();
                txtcheckoutdate.setText(displayFormat.format(cal.getTime()));
                
                String dateBeforeString=rs.getString(12);
                java.util.Date dateBefore=null;
                try{
                    dateBefore=dbFormat.parse(dateBeforeString);

                }catch(ParseException ex){
                    ex.printStackTrace();
                }
                
                
                java.util.Date dateAfter=cal.getTime();
                long difference=dateAfter.getTime() - dateBefore.getTime();
                int noOfDayStay=(int) (difference / (1000 * 60 * 60 * 24));
                
                if(noOfDayStay==0){
                    noOfDayStay=1;}
                txtnumofdaysstay.setText(String.valueOf(noOfDayStay));
                float price=Float.parseFloat(txtpriceperday.getText());
                
                txttotalamount.setText(String.valueOf(noOfDayStay * price));
                txtemail.setText(rs.getString(7));
                roomType=rs.getString(8);
                bed=rs.getString(10);
                
            }else{
                JOptionPane.showMessageDialog(null, "Room Number is not booked");
            }
        }catch(HeadlessException | NumberFormatException | SQLException e){
          e.printStackTrace();
        }
          
    }//GEN-LAST:event_btsearchActionPerformed

    private void btclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new chekout().setVisible(true);
    }//GEN-LAST:event_btclearActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chekout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chekout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chekout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chekout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chekout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btclear;
    private javax.swing.JButton btsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcheckin;
    private javax.swing.JTextField txtcheckoutdate;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnumofdaysstay;
    private javax.swing.JTextField txtpriceperday;
    private javax.swing.JTextField txtrno;
    private javax.swing.JTextField txttotalamount;
    // End of variables declaration//GEN-END:variables

}
   
