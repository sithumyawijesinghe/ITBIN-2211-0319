/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.CustomerDetailsModel;
import model.Select;

/**
 *
 * @author llllllllll
 */
public class customerDetailsBill extends javax.swing.JFrame {
    private CustomerDetailsModel model;
    private Select selectModel;
    /**
     * Creates new form customerDetailsBill
     */
    public customerDetailsBill() {
        initComponents();
         selectModel = new Select();
   
        txtrno.setEditable(true);
        txtname.setEditable(false);
        txtcheckindate.setEditable(false);
        txtcheckoutdate.setEditable(false);
        txtmobile.setEditable(false);
        txttotal.setEditable(false);
          
    }
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtrno = new javax.swing.JTextField();
        btsearch = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcheckindate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcheckoutdate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btprint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        btclear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtnoOfDaystay = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtperdayprice = new javax.swing.JTextField();
        btgenerate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/receipt_printer1.png"))); // NOI18N
        jLabel1.setText("Customer Details Bill");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 16, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Room No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 161, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 261, -1, -1));

        txtrno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtrno, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 193, 234, -1));

        btsearch.setBackground(new java.awt.Color(0, 0, 153));
        btsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btsearch.setForeground(new java.awt.Color(255, 255, 255));
        btsearch.setText("Search");
        btsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 120, 40));

        txtname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 292, 300, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Mobile no:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 346, -1, -1));

        txtmobile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 377, 300, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Check In Date:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 439, -1, -1));

        txtcheckindate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtcheckindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 470, 290, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Checkout Date:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 536, -1, -1));

        txtcheckoutdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtcheckoutdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 567, 280, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Total:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 635, -1, -1));

        txttotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 667, 280, -1));

        btprint.setBackground(new java.awt.Color(204, 0, 0));
        btprint.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btprint.setForeground(new java.awt.Color(255, 255, 255));
        btprint.setText("Print");
        btprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btprintActionPerformed(evt);
            }
        });
        getContentPane().add(btprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, 160, 50));

        area.setColumns(20);
        area.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        area.setRows(5);
        area.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 616, 685));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close11.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 0, 50, 50));

        btclear.setBackground(new java.awt.Color(0, 0, 153));
        btclear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btclear.setForeground(new java.awt.Color(255, 255, 255));
        btclear.setText("Clear");
        btclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclearActionPerformed(evt);
            }
        });
        getContentPane().add(btclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 110, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Number of days stay:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        txtnoOfDaystay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtnoOfDaystay, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 210, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Per day price:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, 20));

        txtperdayprice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(txtperdayprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 200, -1));

        btgenerate.setBackground(new java.awt.Color(204, 0, 0));
        btgenerate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btgenerate.setForeground(new java.awt.Color(255, 255, 255));
        btgenerate.setText("Generate Receipt");
        btgenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgenerateActionPerformed(evt);
            }
        });
        getContentPane().add(btgenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, -1, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/billbk.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new customerDetailsBill().setVisible(true);
    }//GEN-LAST:event_btclearActionPerformed

    private void btsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchActionPerformed
           String roomNo = txtrno.getText();
        try {
            // Check if the model object is null
            if (selectModel == null) {
                // If null, initialize it
                selectModel = new Select();
            }
            
            // Use the model object to get data
            ResultSet rs = selectModel.getData("SELECT * FROM customer_details WHERE roomNo= '" + roomNo + "'");
            if (rs != null && rs.next()) {
                txtrno.setEditable(false);
                txtname.setText(rs.getString(2));
                txtmobile.setText(rs.getString(4));
                txtcheckindate.setText(rs.getString(12));
                txtperdayprice.setText(rs.getString(11));

                SimpleDateFormat dbFormat = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat displayFormat = new SimpleDateFormat("yyyy/MM/dd");
                Calendar cal = Calendar.getInstance();
                txtcheckoutdate.setText(displayFormat.format(cal.getTime()));

                String dateBeforeString = rs.getString(12);
                java.util.Date dateBefore = null;
                try {
                    dateBefore = dbFormat.parse(dateBeforeString);

                } catch (ParseException ex) {
                    ex.printStackTrace();
                }

                java.util.Date dateAfter = cal.getTime();
                long difference = dateAfter.getTime() - dateBefore.getTime();
                int noOfDayStay = (int) (difference / (1000 * 60 * 60 * 24));

                if (noOfDayStay == 0) {
                    noOfDayStay = 1;
                }
                txtnoOfDaystay.setText(String.valueOf(noOfDayStay));
                float price = Float.parseFloat(txtperdayprice.getText());

                txttotal.setText(String.valueOf(noOfDayStay * price));

            } else {
                JOptionPane.showMessageDialog(null, "Room Number is not booked");
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            e.printStackTrace();
        }
           
    }//GEN-LAST:event_btsearchActionPerformed

    private void btgenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgenerateActionPerformed
        // TODO add your handling code here:
        area.setText("              ***************************************************\n");
        area.setText(area.getText()+"                *        THE ROYAL HEVAN HOTEL        *\n");
        area.setText(area.getText()+"                             Contact - 011 2356789        \n");
        area.setText(area.getText()+"                       Email - royalhaven12@gmail.com        \n");
        area.setText(area.getText()+"            ***************************************************\n\n");
        
        Date obj = new Date();
        String date = obj.toString();
        area.setText(area.getText()+"   Date: "+date+"\n\n\n");
        area.setText(area.getText()+"   Room No:"+txtrno.getText()+"\n\n");
        area.setText(area.getText()+"   Name: "+txtname.getText()+"\n\n");
        area.setText(area.getText()+"   Mobile NO: "+txtmobile.getText()+"\n\n");
        area.setText(area.getText()+"   Check-In Date: "+txtcheckindate.getText()+"\n\n");
        area.setText(area.getText()+"   Checkout Date: "+txtcheckoutdate.getText()+"\n\n\n");
        area.setText(area.getText()+"   Total Amount: "+txttotal.getText()+"\n\n\n");
        
       area.setText(area.getText()+"                                *****THANK YOU*****\n\n");
        
    }//GEN-LAST:event_btgenerateActionPerformed

    private void btprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btprintActionPerformed
        try {
            // TODO add your handling code here:

            area.print();
        } catch (PrinterException ex) {
      
        }
    }//GEN-LAST:event_btprintActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(customerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerDetailsBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton btclear;
    private javax.swing.JButton btgenerate;
    private javax.swing.JButton btprint;
    private javax.swing.JButton btsearch;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcheckindate;
    private javax.swing.JTextField txtcheckoutdate;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnoOfDaystay;
    private javax.swing.JTextField txtperdayprice;
    private javax.swing.JTextField txtrno;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
