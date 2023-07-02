/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.transportationmanagementsystemgui;

/**
 *
 * @author Btrlp8
 */
public class CompanySub2AddNewVehicle extends javax.swing.JFrame {

    /**
     * Creates new form CompanySub2AddNewVehicle
     */
    public CompanySub2AddNewVehicle() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxVehicleType = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        vehicleID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxDay = new javax.swing.JComboBox<>();
        jComboBoxMonth = new javax.swing.JComboBox<>();
        jComboBoxYear = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        destination1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        destination2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        seatPrice = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Return = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        baggageInfo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Vehicle Type :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(62, 45, 93, 24);

        jComboBoxVehicleType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bus", "Train", "Plane" }));
        getContentPane().add(jComboBoxVehicleType);
        jComboBoxVehicleType.setBounds(167, 47, 81, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Vehicle ID :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(274, 45, 74, 24);

        vehicleID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleIDActionPerformed(evt);
            }
        });
        getContentPane().add(vehicleID);
        vehicleID.setBounds(354, 47, 80, 22);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Date :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(62, 129, 41, 26);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Day");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(124, 95, 26, 26);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Month");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(189, 95, 56, 26);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Year");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(276, 95, 41, 26);

        jComboBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(jComboBoxDay);
        jComboBoxDay.setBounds(109, 132, 51, 22);

        jComboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "March" }));
        getContentPane().add(jComboBoxMonth);
        jComboBoxMonth.setBounds(172, 132, 72, 22);

        jComboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023" }));
        getContentPane().add(jComboBoxYear);
        jComboBoxYear.setBounds(262, 132, 72, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Route :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(62, 173, 47, 26);

        destination1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destination1ActionPerformed(evt);
            }
        });
        getContentPane().add(destination1);
        destination1.setBounds(115, 176, 85, 22);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("to");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(207, 173, 14, 26);
        getContentPane().add(destination2);
        destination2.setBounds(227, 176, 85, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Seat Price :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(62, 217, 75, 26);
        getContentPane().add(seatPrice);
        seatPrice.setBounds(149, 220, 70, 22);

        Submit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(149, 289, 93, 34);

        Return.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Return.setText("Return");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        getContentPane().add(Return);
        Return.setBounds(291, 289, 93, 34);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Baggage Info :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(236, 217, 98, 26);

        baggageInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baggageInfoActionPerformed(evt);
            }
        });
        getContentPane().add(baggageInfo);
        baggageInfo.setBounds(340, 220, 70, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vehicleIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleIDActionPerformed

    private void destination1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destination1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destination1ActionPerformed

    private void baggageInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baggageInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baggageInfoActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new CompanySubVehicleList().toFront();
        new CompanySubVehicleList().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_ReturnActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        //System.out.println("please enter  vehicle Type  :");
        boolean flag2 = true;
        String vehicleType = (String)jComboBoxVehicleType.getSelectedItem();
        //System.out.println("please enter  vehicleCode  :");
        if(vehicleID.getText().equals("")){
            flag2 = false;
        }
        String vehicleCode = vehicleID.getText();
        //System.out.println("please enter travel date  :");
        String day2 = (String)jComboBoxDay.getSelectedItem() ; String month2 = (String)jComboBoxMonth.getSelectedItem() ; String year2 = (String)jComboBoxYear.getSelectedItem() ;
        String date = day2 + "/" + month2 + "/" + year2 ;
        //System.out.println("please enter travel route :");
        if(destination1.getText().equals("") && destination2.getText().equals("")){
            flag2 = false;
        }
        String route = destination1.getText() + "-" + destination2.getText();
        int price = 0;
        int baggageInformation= 0;
        //System.out.println("please enter price of travel :");
        if(seatPrice.getText().equals("") && baggageInfo.getText().equals("")){
            flag2 = false;
        }
        else{
            price = Integer.parseInt(seatPrice.getText());
        //System.out.println("please enter baggage weight:");
            baggageInformation = Integer.parseInt(baggageInfo.getText());
            
        }
        
        if(flag2 == true){
            main.companyelementtemp1.addVehicle(main.vehicleFactory.getVehicle(vehicleType, main.companyelementtemp1.getName(), vehicleCode, date, route, price, baggageInformation));
            main.vehicle.add(main.vehicleFactory.getVehicle(vehicleType, main.companyelementtemp1.getName(), vehicleCode, date, route, price, baggageInformation));
            this.toBack();
            setVisible(false);
            CompanySubVehicleList tempframe1 = new CompanySubVehicleList();                        
            tempframe1.setState(java.awt.Frame.NORMAL);
            tempframe1.setLocationRelativeTo(null);
            tempframe1.setVisible(true);
            tempframe1.toFront();
            
        }
        else{
            jOptionPane1.showMessageDialog(null,"You entered wrong information");
        }
        

    }//GEN-LAST:event_SubmitActionPerformed

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
            java.util.logging.Logger.getLogger(CompanySub2AddNewVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompanySub2AddNewVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompanySub2AddNewVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompanySub2AddNewVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompanySub2AddNewVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Return;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField baggageInfo;
    private javax.swing.JTextField destination1;
    private javax.swing.JTextField destination2;
    private javax.swing.JComboBox<String> jComboBoxDay;
    private javax.swing.JComboBox<String> jComboBoxMonth;
    private javax.swing.JComboBox<String> jComboBoxVehicleType;
    private javax.swing.JComboBox<String> jComboBoxYear;
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
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JTextField seatPrice;
    private javax.swing.JTextField vehicleID;
    // End of variables declaration//GEN-END:variables
}