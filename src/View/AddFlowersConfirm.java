/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DA.CatalogDA;
import DA.CountDA;
import Model.Catalog;
import javax.swing.JOptionPane;

/**
 *
 * @author lamzn
 */
public class AddFlowersConfirm extends javax.swing.JFrame {

    /**
     * Creates new form AddFlowersConfirm
     */
    
     private Catalog catalog;
    private CountDA countDA;
    private CatalogDA catalogDA;
    /**
     * Creates new form AddCustomerConfirm
     */
    public AddFlowersConfirm(Catalog catalog) {
        initComponents();
        countDA = new CountDA();
        catalogDA = new CatalogDA();
        this.catalog = catalog;
        jtfProdID.setText(catalog.getProdid());
        jtfProdName.setText(catalog.getName());
        jtfType.setText(String.valueOf(catalog.getType()));
        jtfPrice.setText(String.valueOf(catalog.getPrice()));
        jtfDescription.setText(catalog.getDescription());
         jtfStock.setText(String.valueOf(catalog.getStock()));
        
    }
    public AddFlowersConfirm() {
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

        jlblProdID = new javax.swing.JLabel();
        jlblProdName = new javax.swing.JLabel();
        jlblTitle = new javax.swing.JLabel();
        jlblHeader = new javax.swing.JLabel();
        jlblType = new javax.swing.JLabel();
        jlblPrice = new javax.swing.JLabel();
        jlblDescription = new javax.swing.JLabel();
        jlblStock = new javax.swing.JLabel();
        jConfirm = new javax.swing.JButton();
        jCancel = new javax.swing.JButton();
        jtfProdID = new javax.swing.JTextField();
        jtfProdName = new javax.swing.JTextField();
        jtfType = new javax.swing.JTextField();
        jtfDescription = new javax.swing.JTextField();
        jtfStock = new javax.swing.JTextField();
        jtfPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblProdID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblProdID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblProdID.setText("Product ID:");

        jlblProdName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblProdName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblProdName.setText("Product Name:");

        jlblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlblTitle.setForeground(new java.awt.Color(102, 0, 0));
        jlblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitle.setText("Fiore Flowershop");

        jlblHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblHeader.setForeground(new java.awt.Color(153, 0, 0));
        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("Catalog Maintenance");

        jlblType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblType.setText("Type:");

        jlblPrice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblPrice.setText("Price:");

        jlblDescription.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblDescription.setText("Description:");

        jlblStock.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblStock.setText("Stock:");

        jConfirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jConfirm.setText("Confirm");
        jConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmActionPerformed(evt);
            }
        });

        jCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCancel.setText("Cancel");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });

        jtfProdID.setEditable(false);

        jtfProdName.setEditable(false);

        jtfType.setEditable(false);

        jtfDescription.setEditable(false);

        jtfStock.setEditable(false);

        jtfPrice.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblType, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfProdID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfProdName)
                            .addComponent(jtfType)
                            .addComponent(jtfDescription, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfStock)
                            .addComponent(jtfPrice, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(107, 107, 107))
                    .addComponent(jlblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblProdID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfProdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblProdName, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jtfProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblType, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jtfType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jtfPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jtfDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblStock, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jtfStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmActionPerformed
        // TODO add your handling code here
        catalogDA.addCatalog(catalog);
        countDA.increaseProductCount();
        JOptionPane.showMessageDialog(null, "Catalog Added.", "Success", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jConfirmActionPerformed

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jCancelActionPerformed

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
            java.util.logging.Logger.getLogger(AddFlowersConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFlowersConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFlowersConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFlowersConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFlowersConfirm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancel;
    private javax.swing.JButton jConfirm;
    private javax.swing.JLabel jlblDescription;
    private javax.swing.JLabel jlblHeader;
    private javax.swing.JLabel jlblPrice;
    private javax.swing.JLabel jlblProdID;
    private javax.swing.JLabel jlblProdName;
    private javax.swing.JLabel jlblStock;
    private javax.swing.JLabel jlblTitle;
    private javax.swing.JLabel jlblType;
    private javax.swing.JTextField jtfDescription;
    private javax.swing.JTextField jtfPrice;
    private javax.swing.JTextField jtfProdID;
    private javax.swing.JTextField jtfProdName;
    private javax.swing.JTextField jtfStock;
    private javax.swing.JTextField jtfType;
    // End of variables declaration//GEN-END:variables
}
