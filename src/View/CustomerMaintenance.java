/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.*;
import DA.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class CustomerMaintenance extends javax.swing.JFrame {

    /**
     * Creates new form CustomerMaintenance
     */
    public CustomerMaintenance() {
        initComponents();
        jlblCreditLimit.setVisible(false);
        jtfCreditLimit.setVisible(false);
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
        jlblAge = new javax.swing.JLabel();
        jlblContact = new javax.swing.JLabel();
        jcbAge = new javax.swing.JComboBox<>();
        jcbGender = new javax.swing.JComboBox<>();
        jtfContact = new javax.swing.JTextField();
        jbAdd = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jcboxCorporateCustomer = new javax.swing.JCheckBox();
        jlblCreditLimit = new javax.swing.JLabel();
        jtfCreditLimit = new javax.swing.JTextField();
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
        jlblHeader.setText("Customer Maintenance");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jlblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblName.setText("Name:");

        jlblGender.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblGender.setText("Gender:");

        jlblAge.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblAge.setText("Age:");

        jlblContact.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblContact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblContact.setText("Contact No:");

        jcbAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));

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

        jtfCreditLimit.setEditable(false);
        jtfCreditLimit.setToolTipText("exp: 0xx-xxxxxxx");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcboxCorporateCustomer)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfContact, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcbAge, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jtfCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblName)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblGender)
                    .addComponent(jcbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAge, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfContact))
                .addGap(18, 18, 18)
                .addComponent(jcboxCorporateCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCreditLimit)
                    .addComponent(jlblCreditLimit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jSeparator1.setForeground(new java.awt.Color(153, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
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
        boolean valid = true;
        String warningMsg = "";
        if(jtfName.getText().equals("")){
            warningMsg += "*Name cannot be empty.\n";
            valid = false;
        }
        if(jtfContact.getText().equals("")){
            warningMsg += "*Contact No cannot be empty.\n";
            valid = false;
        }
        if(!contactValidation(jtfContact.getText()) && !jtfContact.getText().equals("")){
            warningMsg += "*Invalid Contact No format\n";
            valid = false;
        }
        if(jcboxCorporateCustomer.isSelected() && jtfCreditLimit.getText().equals("")){
            warningMsg += "*Credit Limit cannot be empty.\n";
            valid = false;
        }
        
        if(valid){
            CountDA countDA = new CountDA();
            Count count = countDA.getCount();
            String name = jtfName.getText();
            char gender;
            if(jcbGender.getSelectedIndex()==0)
                gender = 'M';
            else
                gender = 'F';
            int age;
            age = jcbAge.getSelectedIndex()+18;
            String contact = jtfContact.getText();
            
            
            if(jcboxCorporateCustomer.isSelected()){
                double creditLimit = 0;
                try{
                    creditLimit = Double.parseDouble(jtfCreditLimit.getText());
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Invalid amount, must be number", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                if(creditLimit!=0){
                    Customer customer = new CorporateCustomer(creditLimit,"C"+String.format("%03d", count.getCustomerCount()),name, gender, age, contact);
                    AddCustomerConfirm addCustomerConfirm = new AddCustomerConfirm(customer);
                    addCustomerConfirm.setVisible(true);
                }
            }
            else{
                Customer customer = new Consumer("C"+String.format("%03d", count.getCustomerCount()),name, gender, age, contact);
                AddCustomerConfirm addCustomerConfirm = new AddCustomerConfirm(customer);
                addCustomerConfirm.setVisible(true);
            }
            
            
            
            
            
            
        }
        else{
            JOptionPane.showMessageDialog(null, warningMsg, "Invalid Input", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jbAddActionPerformed

    private void jcboxCorporateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxCorporateCustomerActionPerformed
        // TODO add your handling code here:
        if(jcboxCorporateCustomer.isSelected()){
            jlblCreditLimit.setVisible(true);
            jtfCreditLimit.setVisible(true);
            jtfCreditLimit.setEditable(true);
        }
        else{
            jlblCreditLimit.setVisible(false);
            jtfCreditLimit.setVisible(false);
            jtfCreditLimit.setEditable(false);
        }
    }//GEN-LAST:event_jcboxCorporateCustomerActionPerformed

    private boolean contactValidation(String contact){
        if(contact.matches("[\\d]{3}-[\\d]{7,8}")){
            if(contact.charAt(0) == '0' && contact.charAt(1) == '1')
                return true;
        }
        return false;
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
            java.util.logging.Logger.getLogger(CustomerMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMaintenance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbCancel;
    private javax.swing.JComboBox<String> jcbAge;
    private javax.swing.JComboBox<String> jcbGender;
    private javax.swing.JCheckBox jcboxCorporateCustomer;
    private javax.swing.JLabel jlblAge;
    private javax.swing.JLabel jlblContact;
    private javax.swing.JLabel jlblCreditLimit;
    private javax.swing.JLabel jlblGender;
    private javax.swing.JLabel jlblHeader;
    private javax.swing.JLabel jlblName;
    private javax.swing.JLabel jlblTitle;
    private javax.swing.JTextField jtfContact;
    private javax.swing.JTextField jtfCreditLimit;
    private javax.swing.JTextField jtfName;
    // End of variables declaration//GEN-END:variables
}
