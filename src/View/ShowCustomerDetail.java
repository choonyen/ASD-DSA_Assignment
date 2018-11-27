/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DA.CustomerDA;
import Model.CorporateCustomer;
import Model.Customer;

/**
 *
 * @author LENOVO
 */
public class ShowCustomerDetail extends javax.swing.JFrame {
    CustomerDA customerDA;
    Customer customer;
    /**
     * Creates new form ShowCustomerDetail
     */
    public ShowCustomerDetail() {
        initComponents();
    }
    public ShowCustomerDetail(Customer customer) {
        initComponents();
        customerDA = new CustomerDA();
        this.customer = customer;
        jtfCustID.setText(customer.getCustID());
        jtfName.setText(customer.getName());
        jtfIC.setText(customer.getIc());
        if(customer.getGender() == 'M')
            jtfGender.setText("Male");
        else
            jtfGender.setText("Female");
        
        jtfContactNo.setText(customer.getContact());
        if(customer instanceof CorporateCustomer){
            jtfCreditLimit.setText(String.valueOf(customer.getCreditLimit()));
            jtfCompanyName.setText(customer.getCompanyName());
            jtaLocation.setText(customer.getLocation());
        }
        else{
            jlblCreditLimit.setVisible(false);
            jtfCreditLimit.setVisible(false);
            jlblCompanyName.setVisible(false);
            jtfCompanyName.setVisible(false);
            jlblLocation.setVisible(false);
            jtaLocation.setVisible(false);
            jScrollPane1.setVisible(false);
        }
        if(customer.getLastOrderDate()!=null){
            jtfLastOrderDate.setText(String.valueOf(customer.getLastOrderDate().getTime()));
        }
        else{
            jtfLastOrderDate.setText("-");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlblHeader = new javax.swing.JLabel();
        jlblCustID = new javax.swing.JLabel();
        jlblGender = new javax.swing.JLabel();
        jlblContact = new javax.swing.JLabel();
        jlblName = new javax.swing.JLabel();
        jtfCustID = new javax.swing.JTextField();
        jtfName = new javax.swing.JTextField();
        jtfGender = new javax.swing.JTextField();
        jtfContactNo = new javax.swing.JTextField();
        jbEdit = new javax.swing.JButton();
        jbCancel = new javax.swing.JButton();
        jlblCreditLimit = new javax.swing.JLabel();
        jtfCreditLimit = new javax.swing.JTextField();
        jlblIC = new javax.swing.JLabel();
        jtfIC = new javax.swing.JTextField();
        jlblCompanyName = new javax.swing.JLabel();
        jtfCompanyName = new javax.swing.JTextField();
        jlblLocation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaLocation = new javax.swing.JTextArea();
        jlblLastOrderDate = new javax.swing.JLabel();
        jtfLastOrderDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlblTitle.setForeground(new java.awt.Color(102, 0, 0));
        jlblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitle.setText("Fiore Flowershop");

        jSeparator1.setForeground(new java.awt.Color(153, 0, 51));

        jlblHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblHeader.setForeground(new java.awt.Color(153, 0, 0));
        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("Customer Detail");

        jlblCustID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblCustID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblCustID.setText("Customer ID:");

        jlblGender.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblGender.setText("Gender:");

        jlblContact.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblContact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblContact.setText("Contact No:");

        jlblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblName.setText("Name:");

        jtfCustID.setEditable(false);

        jtfName.setEditable(false);

        jtfGender.setEditable(false);

        jtfContactNo.setEditable(false);

        jbEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbEdit.setText("Edit");
        jbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditActionPerformed(evt);
            }
        });

        jbCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbCancel.setText("Cancel");
        jbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelActionPerformed(evt);
            }
        });

        jlblCreditLimit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblCreditLimit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblCreditLimit.setText("Credit Limit:");

        jtfCreditLimit.setEditable(false);

        jlblIC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblIC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblIC.setText("IC No:");

        jtfIC.setEditable(false);

        jlblCompanyName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblCompanyName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblCompanyName.setText("Company Name:");

        jtfCompanyName.setEditable(false);

        jlblLocation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblLocation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblLocation.setText("Location:");

        jtaLocation.setEditable(false);
        jtaLocation.setColumns(20);
        jtaLocation.setRows(5);
        jScrollPane1.setViewportView(jtaLocation);

        jlblLastOrderDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblLastOrderDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblLastOrderDate.setText("Last Order Date:");

        jtfLastOrderDate.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblIC, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfGender, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(jtfCustID))
                                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfIC, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlblCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jlblCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlblLastOrderDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                        .addComponent(jtfCompanyName, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jtfCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtfLastOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblCustID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfCustID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblName)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblIC)
                    .addComponent(jtfIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblGender)
                    .addComponent(jtfGender, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jlblCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCreditLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblLastOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfLastOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbCancelActionPerformed

    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditActionPerformed
        // TODO add your handling code here:
        CustomerEdit customerEdit = new CustomerEdit(customer);
        customerEdit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbEditActionPerformed

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
            java.util.logging.Logger.getLogger(ShowCustomerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowCustomerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowCustomerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowCustomerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowCustomerDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCancel;
    private javax.swing.JButton jbEdit;
    private javax.swing.JLabel jlblCompanyName;
    private javax.swing.JLabel jlblContact;
    private javax.swing.JLabel jlblCreditLimit;
    private javax.swing.JLabel jlblCustID;
    private javax.swing.JLabel jlblGender;
    private javax.swing.JLabel jlblHeader;
    private javax.swing.JLabel jlblIC;
    private javax.swing.JLabel jlblLastOrderDate;
    private javax.swing.JLabel jlblLocation;
    private javax.swing.JLabel jlblName;
    private javax.swing.JLabel jlblTitle;
    private javax.swing.JTextArea jtaLocation;
    private javax.swing.JTextField jtfCompanyName;
    private javax.swing.JTextField jtfContactNo;
    private javax.swing.JTextField jtfCreditLimit;
    private javax.swing.JTextField jtfCustID;
    private javax.swing.JTextField jtfGender;
    private javax.swing.JTextField jtfIC;
    private javax.swing.JTextField jtfLastOrderDate;
    private javax.swing.JTextField jtfName;
    // End of variables declaration//GEN-END:variables
}
