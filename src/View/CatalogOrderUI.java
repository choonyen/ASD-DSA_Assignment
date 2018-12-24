/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DA.CatalogDA;
import DA.CountDA;
import DA.CustomerDA;
import DA.CustomerOrderDA;
import DA.DeliveryDA;
import DA.CustomerOrderDA;
import DA.OrderListDA;
import DA.OrderPickupDA;
import Model.Catalog;
import Model.Consumer;
import Model.CorporateCustomer;
import Model.Customer;
import Model.CustomerOrder;
import Model.Delivery;
import Model.OrderList;
import Model.OrderPickup;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Model.*;

import Control.CatalogOrderControl;
import Model.CatalogInterface;
import Model.List;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class CatalogOrderUI extends javax.swing.JFrame {

    /**
     * Creates new form catOrderUI
     */
    Iterator<CatalogInterface> catalog;
    CatalogOrderControl control;

    public CatalogOrderUI(CatalogOrderControl control) {
        initComponents();
        this.setLocationRelativeTo(null);

        //CatalogDA da = new CatalogDA();
        this.control = control;

        List<CatalogInterface> result = control.getAllCatalog();

        DefaultTableModel model = (DefaultTableModel) jTableShowCatalog.getModel();

        catalog = control.getAllCatalog().getIterator();
        while (catalog.hasNext()) {
            CatalogInterface c = catalog.next();
            if (c.getStock() != 0) {
                Object[] row = {c.getProdID(), c.getName(), c.getType(), c.getPrice() + "", c.getDescription(), c.getStock(), 0, 0};
                model.addRow(row);
            }
        }
        jTableShowCatalog.setModel(model);

        for (int i = 0; i < 60; i++) {
            if (i < 10) {
                jComboBoxMinute.addItem("0" + i);

            } else {
                jComboBoxMinute.addItem(i + "");
            }
        }

        jTextFieldAddress.setText("");
        jTextFieldAddress.setEnabled(false);
        jTextFieldPostCode.setText("");
        jTextFieldPostCode.setEnabled(false);
        dateChooserDeliveryDate.setEnabled(false);
        dateChooserDeliveryDate.setText("");

        dateChooserPickUpDate.setEnabled(false);
        jComboBoxHour.setEnabled(false);
        jComboBoxMinute.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentBtnGroup = new javax.swing.ButtonGroup();
        jlblTitle = new javax.swing.JLabel();
        jlblHeader = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlblProdID = new javax.swing.JLabel();
        jlblOrderID = new javax.swing.JLabel();
        jlblAddress = new javax.swing.JLabel();
        codBtn = new javax.swing.JRadioButton();
        pickUpBtn = new javax.swing.JRadioButton();
        csIdTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableShowCatalog = new javax.swing.JTable();
        jlblPostCode = new javax.swing.JLabel();
        jTextFieldPostCode = new javax.swing.JTextField();
        jlblDeliveryDate = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateChooserPickUpDate = new datechooser.beans.DateChooserCombo();
        dateChooserDeliveryDate = new datechooser.beans.DateChooserCombo();
        jComboBoxHour = new javax.swing.JComboBox<>();
        btnSearchCustomer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextFieldAddress = new javax.swing.JTextArea();
        jPanelShowCustomerInfo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jlblName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlbllCreditLimit = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlblRemainingCreditLimit = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlblCustomerType = new javax.swing.JLabel();
        dateChooserOrderDate = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxMinute = new javax.swing.JComboBox<>();
        submitBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlblTitle.setForeground(new java.awt.Color(102, 0, 0));
        jlblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitle.setText("Fiore Flowershop");
        getContentPane().add(jlblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 944, -1));

        jlblHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblHeader.setForeground(new java.awt.Color(153, 0, 0));
        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("Add Catalog Order");
        getContentPane().add(jlblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 65, 944, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 0, 51));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, 944, -1));

        jlblProdID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblProdID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblProdID.setText("Customer ID :");
        getContentPane().add(jlblProdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 195, 77));

        jlblOrderID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblOrderID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblOrderID.setText("Payment Method :");
        getContentPane().add(jlblOrderID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 98));

        jlblAddress.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblAddress.setText("Address :");
        getContentPane().add(jlblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 205, 50));

        paymentBtnGroup.add(codBtn);
        codBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codBtn.setText("Cash On Delivery");
        codBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codBtnActionPerformed(evt);
            }
        });
        getContentPane().add(codBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 160, 40));

        paymentBtnGroup.add(pickUpBtn);
        pickUpBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pickUpBtn.setText("Pick Up");
        pickUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickUpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(pickUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 110, 40));

        csIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csIdTxtActionPerformed(evt);
            }
        });
        getContentPane().add(csIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 130, 40));

        jTableShowCatalog.setBorder(new javax.swing.border.MatteBorder(null));
        jTableShowCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Type", "Price", "Description", "Stock", "Amount", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableShowCatalog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableShowCatalogMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableShowCatalog);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 940, 140));

        jlblPostCode.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblPostCode.setText("Post Code :");
        getContentPane().add(jlblPostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 140, 30));
        getContentPane().add(jTextFieldPostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, 210, 40));

        jlblDeliveryDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblDeliveryDate.setText("Delivery Date :");
        getContentPane().add(jlblDeliveryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, -1, -1));

        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.setBorder(new javax.swing.border.MatteBorder(null));
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 860, 120, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Pick Up Date :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Pick Up Time :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        dateChooserPickUpDate.setCalendarPreferredSize(new java.awt.Dimension(350, 300));
        getContentPane().add(dateChooserPickUpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 210, 40));

        dateChooserDeliveryDate.setCalendarPreferredSize(new java.awt.Dimension(350, 300));
        getContentPane().add(dateChooserDeliveryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, 210, 40));

        jComboBoxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        jComboBoxHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHourActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 100, 40));

        btnSearchCustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearchCustomer.setText("Search ");
        btnSearchCustomer.setBorder(new javax.swing.border.MatteBorder(null));
        btnSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 90, 40));

        jTextFieldAddress.setColumns(20);
        jTextFieldAddress.setRows(5);
        jTextFieldAddress.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextFieldAddress);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 210, 70));

        jPanelShowCustomerInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelShowCustomerInfo.setLayout(new java.awt.GridLayout(4, 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText(" Name");
        jPanelShowCustomerInfo.add(jLabel5);

        jlblName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelShowCustomerInfo.add(jlblName);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText(" Credit Limit");
        jPanelShowCustomerInfo.add(jLabel6);

        jlbllCreditLimit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelShowCustomerInfo.add(jlbllCreditLimit);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText(" Remaining Credit Limit");
        jPanelShowCustomerInfo.add(jLabel8);

        jlblRemainingCreditLimit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelShowCustomerInfo.add(jlblRemainingCreditLimit);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText(" Customer Type");
        jPanelShowCustomerInfo.add(jLabel10);

        jlblCustomerType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelShowCustomerInfo.add(jlblCustomerType);

        getContentPane().add(jPanelShowCustomerInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 280, 220));

        dateChooserOrderDate.setCalendarPreferredSize(new java.awt.Dimension(350, 300));
        dateChooserOrderDate.setLocked(true);
        getContentPane().add(dateChooserOrderDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 210, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Order Date :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jComboBoxMinute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMinuteActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMinute, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 90, 40));

        submitBtn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitBtn1.setText("Back");
        submitBtn1.setBorder(new javax.swing.border.MatteBorder(null));
        submitBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 860, 120, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codBtnActionPerformed
        // TODO add your handling code here:
        jTextFieldAddress.setEnabled(true);
        jTextFieldPostCode.setEnabled(true);
        dateChooserDeliveryDate.setEnabled(true);

        dateChooserPickUpDate.setEnabled(false);
        jComboBoxHour.setEnabled(false);
        jComboBoxMinute.setEnabled(false);
    }//GEN-LAST:event_codBtnActionPerformed

    private void pickUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickUpBtnActionPerformed
        // TODO add your handling code here:
        jTextFieldAddress.setText("");
        jTextFieldAddress.setEnabled(false);
        jTextFieldPostCode.setText("");
        jTextFieldPostCode.setEnabled(false);
        dateChooserDeliveryDate.setEnabled(false);
        dateChooserDeliveryDate.setText("");

        dateChooserPickUpDate.setEnabled(true);
        jComboBoxHour.setEnabled(true);
        jComboBoxMinute.setEnabled(true);
    }//GEN-LAST:event_pickUpBtnActionPerformed

    private void jTableShowCatalogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableShowCatalogMouseClicked

        if (evt.getClickCount() == 2 && jTableShowCatalog.getSelectedRow() != -1) {

            String unitStr = JOptionPane.showInputDialog(
                    this,
                    "Please insert amount you would like to purchase",
                    "Order",
                    JOptionPane.QUESTION_MESSAGE
            );

            Double unitPrice = Double.parseDouble((String) jTableShowCatalog.getValueAt(jTableShowCatalog.getSelectedRow(), 3));
            int stock = Integer.parseInt(jTableShowCatalog.getValueAt(jTableShowCatalog.getSelectedRow(), 5).toString());

            int unit = Integer.parseInt(unitStr);
            if (unit > stock) {
                JOptionPane.showMessageDialog(this, "Insufficient Stock", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                Double total = unitPrice * unit;
                jTableShowCatalog.setValueAt(unit, jTableShowCatalog.getSelectedRow(), 6);
                jTableShowCatalog.setValueAt(total, jTableShowCatalog.getSelectedRow(), 7);
            }

        }

    }//GEN-LAST:event_jTableShowCatalogMouseClicked

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed

        String csId = csIdTxt.getText();
        Date d = dateChooserOrderDate.getSelectedDate().getTime();
        String paymentMethod = codBtn.isSelected() ? "Cash on delivery" : "Pick up";

        double total = 0;
        
        String orderPK = "O" + control.getOrderCount();
        
        
        int catalogCount = 0;
        
        for (int i = 0; i < jTableShowCatalog.getRowCount(); i++) {
            int amount = Integer.parseInt(jTableShowCatalog.getValueAt(i, 6).toString());

            if (amount > 0) {
                String prodId = jTableShowCatalog.getValueAt(i, 0).toString();
                Double price = Double.parseDouble(jTableShowCatalog.getValueAt(i, 3).toString());
                double subTotal = price * amount;
                total += subTotal;

                OrderList s = new OrderList(orderPK, prodId, amount, (double) subTotal);
                control.addOrderList(s);
                catalogCount++;
            }
        }
        
        if (csId.equals("")) {
            JOptionPane.showMessageDialog(this, "No Customer Info!!!!", "Failure", JOptionPane.ERROR_MESSAGE);
        }
        else if(codBtn.isSelected() && jTextFieldAddress.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Address cannot be empty!! ", "Failure", JOptionPane.ERROR_MESSAGE);
        }
        
        else if (jTextFieldPostCode.getText().length() > 5) {
            JOptionPane.showMessageDialog(this, "PostCode's FieldText Cannot More than 5 digits, please input again", "Failure", JOptionPane.ERROR_MESSAGE);
        }
        else if (catalogCount == 0) {
            JOptionPane.showMessageDialog(this, "No item is ordered", "Invalid Order!!!", JOptionPane.ERROR_MESSAGE);
        } else {
            CustomerOrderInterface customerOrder = new CustomerOrder(orderPK, csId, total, d);
            control.addCustomerOrder(customerOrder);
            if (codBtn.isSelected()) {
                String deliveryAddress = jTextFieldAddress.getText();
                String deliveryPostcode = jTextFieldPostCode.getText();
                Date deliveryDate = dateChooserDeliveryDate.getSelectedDate().getTime();

                String deliveryPK = "D" + control.getDeliveryCount();
                Delivery delivery = new Delivery(deliveryPK, orderPK, deliveryDate, deliveryAddress, deliveryPostcode);
                control.addDelivery(delivery);
            } else if (pickUpBtn.isSelected()) {
                Date pickUpDate = dateChooserPickUpDate.getSelectedDate().getTime();
                String time = jComboBoxHour.getSelectedItem().toString() + ":" + jComboBoxMinute.getSelectedItem().toString() + ":00";

                SimpleDateFormat format = new SimpleDateFormat("HH:mm");

                String pickUpPK = "P" + control.getPickupCount();
                OrderPickup pickUp;
                try {
                    pickUp = new OrderPickup(pickUpPK, orderPK, pickUpDate, new Time(format.parse(time).getTime()));

                    control.addPickUp(pickUp);
                } catch (ParseException ex) {
                    Logger.getLogger(CatalogOrderUI.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if (jlblCustomerType.getText().toString().equalsIgnoreCase("Corporate Customer")) {



                control.updateCorporateCustomerCredit(csId, total);

            }

            JOptionPane.showMessageDialog(this, "Done");

            this.dispose();
        }


    }//GEN-LAST:event_submitBtnActionPerformed

    private void btnSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustomerActionPerformed
        // TODO add your handling code here:
        //CustomerDA customerDA = new CustomerDA();

        String custId = csIdTxt.getText();

        if (control.custIdValidation(custId) == false) {
            JOptionPane.showMessageDialog(this, "Customer ID Format Wrong! Please input in correct format!", "Failure", JOptionPane.ERROR_MESSAGE);
        } else {

            if (custId.charAt(0) == 'C') {
                CustomerInterface c = control.getConsumerById(custId);
                if (c == null) {
                    JOptionPane.showMessageDialog(this, "Customer Not Exist! Please input again!", "Failure", JOptionPane.ERROR_MESSAGE);
                } else {
                    jlblName.setText(c.getName());
                    jlbllCreditLimit.setText("Not available");
                    jlblRemainingCreditLimit.setText("Not available");
                    jlblCustomerType.setText("Normal Customer");
                }
            } else if (custId.charAt(0) == 'V') {

                CorporateCustomerInterface cc = control.getCorporateCustomerById(custId);
                if (cc == null) {
                    JOptionPane.showMessageDialog(this, "Customer Not Exist! Please input again!", "Failure", JOptionPane.ERROR_MESSAGE);
                } 
                else if(cc.getRemainingCreditLimit() == 0){
                     JOptionPane.showMessageDialog(this, "Corporate Customer's Credit Limit Insufficient!!!", "Failure", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    jlblName.setText(cc.getName());
                    jlbllCreditLimit.setText(cc.getCreditLimit() + "");
                    jlblRemainingCreditLimit.setText(cc.getRemainingCreditLimit() + "");
                    jlblCustomerType.setText("Corporate Customer");
                }
            }
        }
    }//GEN-LAST:event_btnSearchCustomerActionPerformed

    private void csIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csIdTxtActionPerformed

    private void jComboBoxHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHourActionPerformed

    private void jComboBoxMinuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMinuteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMinuteActionPerformed

    private void submitBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_submitBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(CatalogOrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogOrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogOrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogOrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogOrderUI(new CatalogOrderControl()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JRadioButton codBtn;
    private javax.swing.JTextField csIdTxt;
    private datechooser.beans.DateChooserCombo dateChooserDeliveryDate;
    private datechooser.beans.DateChooserCombo dateChooserOrderDate;
    private datechooser.beans.DateChooserCombo dateChooserPickUpDate;
    private javax.swing.JComboBox<String> jComboBoxHour;
    private javax.swing.JComboBox<String> jComboBoxMinute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelShowCustomerInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableShowCatalog;
    private javax.swing.JTextArea jTextFieldAddress;
    private javax.swing.JTextField jTextFieldPostCode;
    private javax.swing.JLabel jlblAddress;
    private javax.swing.JLabel jlblCustomerType;
    private javax.swing.JLabel jlblDeliveryDate;
    private javax.swing.JLabel jlblHeader;
    private javax.swing.JLabel jlblName;
    private javax.swing.JLabel jlblOrderID;
    private javax.swing.JLabel jlblPostCode;
    private javax.swing.JLabel jlblProdID;
    private javax.swing.JLabel jlblRemainingCreditLimit;
    private javax.swing.JLabel jlblTitle;
    private javax.swing.JLabel jlbllCreditLimit;
    private javax.swing.ButtonGroup paymentBtnGroup;
    private javax.swing.JRadioButton pickUpBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton submitBtn1;
    // End of variables declaration//GEN-END:variables

}