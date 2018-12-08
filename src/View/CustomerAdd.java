/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.CustomerMaintenanceControl;
import Model.*;
import DA.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class CustomerAdd extends javax.swing.JFrame {
    private CustomerMaintenanceControl control;
    /**
     * Creates new form CustomerMaintenance
     */
    public CustomerAdd() {
        initComponents();
        jlblCreditLimit.setVisible(false);
        jtfCreditLimit.setVisible(false);
        jlblCompanyName.setVisible(false);
        jtfCompanyName.setVisible(false);
        jlblLocation.setVisible(false);
        jtaLocation.setVisible(false);
        jScrollPane1.setVisible(false);
        
    }
    
    public CustomerAdd(CustomerMaintenanceControl control) {
        initComponents();
        jlblCreditLimit.setVisible(false);
        jtfCreditLimit.setVisible(false);
        jlblCompanyName.setVisible(false);
        jtfCompanyName.setVisible(false);
        jlblLocation.setVisible(false);
        jtaLocation.setVisible(false);
        jScrollPane1.setVisible(false);
        this.control = control;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblTitle = new javax.swing.JLabel();
        jlblHeader = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlblName = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jlblGender = new javax.swing.JLabel();
        jlblContact = new javax.swing.JLabel();
        jcbGender = new javax.swing.JComboBox<>();
        jtfContact = new javax.swing.JTextField();
        jbAdd = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jcboxCorporateCustomer = new javax.swing.JCheckBox();
        jlblCreditLimit = new javax.swing.JLabel();
        jtfCompanyName = new javax.swing.JTextField();
        jlblIC = new javax.swing.JLabel();
        jtfIC = new javax.swing.JTextField();
        jlblLocation = new javax.swing.JLabel();
        jlblCompanyName = new javax.swing.JLabel();
        jtfCreditLimit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaLocation = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jlblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlblTitle.setForeground(new java.awt.Color(102, 0, 0));
        jlblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitle.setText("Fiore Flowershop");

        jlblHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblHeader.setForeground(new java.awt.Color(153, 0, 0));
        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("Add Customer ");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jlblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblName.setText("Name:");

        jlblGender.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblGender.setText("Gender:");

        jlblContact.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblContact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblContact.setText("Contact No:");

        jcbGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jtfContact.setToolTipText("exp: 0xx-xxxxxxx");

        jbAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbAdd.setText("Add");
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        jbCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbCancel.setText("Cancel");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        jcboxCorporateCustomer.setBackground(new java.awt.Color(255, 204, 204));
        jcboxCorporateCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcboxCorporateCustomer.setText("Corporate Customer");
        jcboxCorporateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxCorporateCustomerActionPerformed(evt);
            }
        });

        jlblCreditLimit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblCreditLimit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblCreditLimit.setText("Credit Limit:");

        jtfCompanyName.setEditable(false);
        jtfCompanyName.setToolTipText("");

        jlblIC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblIC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblIC.setText("IC No:");

        jtfIC.setToolTipText("exp: 001230-08-2341");

        jlblLocation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblLocation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblLocation.setText("Location:");

        jlblCompanyName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblCompanyName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblCompanyName.setText("Company Name:");

        jtfCreditLimit.setEditable(false);
        jtfCreditLimit.setToolTipText("");

        jtaLocation.setEditable(false);
        jtaLocation.setColumns(20);
        jtaLocation.setRows(5);
        jScrollPane1.setViewportView(jtaLocation);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblIC, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcboxCorporateCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfContact, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfIC, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblName)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblIC)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfIC, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblGender)
                    .addComponent(jcbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfContact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcboxCorporateCustomer)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtfIC.getAccessibleContext().setAccessibleDescription("");

        jSeparator1.setForeground(new java.awt.Color(153, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        // TODO add your handling code here:
        String errorMsg;
        String companyName;
        String location;
        String creditLimitStr;
        boolean valid = true;
        String name = jtfName.getText();
        String ic = jtfIC.getText();
        char gender;
        if(jcbGender.getSelectedIndex()==0)
            gender = 'M';
        else
            gender = 'F';
        String contact = jtfContact.getText();
        
        
        if(jcboxCorporateCustomer.isSelected()){
            companyName = jtfCompanyName.getText();
            location = jtaLocation.getText();
            creditLimitStr = jtfCreditLimit.getText();
            errorMsg = control.isValid(name, ic, contact, companyName, location, creditLimitStr);
            if(errorMsg.equals("")){
                Double creditLimit = Double.parseDouble(creditLimitStr);
                CorporateCustomerInterface corporateCustomer = control.createCorporateCustomer(name, ic, gender, contact, companyName, location, creditLimit);
                AddCustomerConfirm addCustomerConfirm = new AddCustomerConfirm(control,corporateCustomer);
                addCustomerConfirm.setVisible(true);
                this.dispose();
            }
            else{
                 JOptionPane.showMessageDialog(null, errorMsg, "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
    
        }
        else{
            errorMsg = control.isValid(name, ic, contact);
            if(errorMsg.equals("")){
                CustomerInterface consumer = control.createConsumer(name, ic, gender, contact);
                AddCustomerConfirm addCustomerConfirm = new AddCustomerConfirm(control,consumer);
                addCustomerConfirm.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, errorMsg, "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
       
    }//GEN-LAST:event_jbAddActionPerformed

    private void jcboxCorporateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxCorporateCustomerActionPerformed
        // TODO add your handling code here:
        if(jcboxCorporateCustomer.isSelected()){
            jlblCreditLimit.setVisible(true);
            jtfCreditLimit.setVisible(true);
            jlblCompanyName.setVisible(true);
            jtfCompanyName.setVisible(true);
            jlblLocation.setVisible(true);
            jtaLocation.setVisible(true);
            jtfCreditLimit.setEditable(true);
            jtfCompanyName.setEditable(true);
            jtaLocation.setEditable(true);
            jScrollPane1.setVisible(true);
        }
        else{
            jlblCreditLimit.setVisible(false);
            jtfCreditLimit.setVisible(false);
            jlblCompanyName.setVisible(false);
            jtfCompanyName.setVisible(false);
            jlblLocation.setVisible(false);
            jtaLocation.setVisible(false);
            jtfCreditLimit.setEditable(false);
            jtfCompanyName.setEditable(false);
            jtaLocation.setEditable(false);
            jScrollPane1.setVisible(false);
        }
    }//GEN-LAST:event_jcboxCorporateCustomerActionPerformed

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbCancelActionPerformed

    
    private void clear(){
        jtfName.setText("");
        jtfIC.setText("");
        jtfContact.setText("");
        jtfCompanyName.setText("");
        jtaLocation.setText("");
        jtfCreditLimit.setText("");
    }
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
            java.util.logging.Logger.getLogger(CustomerAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbCancel;
    private javax.swing.JComboBox<String> jcbGender;
    private javax.swing.JCheckBox jcboxCorporateCustomer;
    private javax.swing.JLabel jlblCompanyName;
    private javax.swing.JLabel jlblContact;
    private javax.swing.JLabel jlblCreditLimit;
    private javax.swing.JLabel jlblGender;
    private javax.swing.JLabel jlblHeader;
    private javax.swing.JLabel jlblIC;
    private javax.swing.JLabel jlblLocation;
    private javax.swing.JLabel jlblName;
    private javax.swing.JLabel jlblTitle;
    private javax.swing.JTextArea jtaLocation;
    private javax.swing.JTextField jtfCompanyName;
    private javax.swing.JTextField jtfContact;
    private javax.swing.JTextField jtfCreditLimit;
    private javax.swing.JTextField jtfIC;
    private javax.swing.JTextField jtfName;
    // End of variables declaration//GEN-END:variables
}
