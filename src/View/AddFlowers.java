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
 * @author lamzn
 */
public class AddFlowers extends javax.swing.JFrame {

    /**
     * Creates new form AddFlowers
     */
    public AddFlowers() {
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

        jlblTitle = new javax.swing.JLabel();
        jlblHeader = new javax.swing.JLabel();
        jlblProdID = new javax.swing.JLabel();
        jlblProdName = new javax.swing.JLabel();
        jlblType = new javax.swing.JLabel();
        jlblPrice = new javax.swing.JLabel();
        jlblStock = new javax.swing.JLabel();
        jConfirm = new javax.swing.JButton();
        jCancel = new javax.swing.JButton();
        jtfProdID = new javax.swing.JTextField();
        jtfProdName = new javax.swing.JTextField();
        jType = new javax.swing.JComboBox<>();
        jtfPrice = new javax.swing.JTextField();
        jtfStock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlblTitle.setForeground(new java.awt.Color(102, 0, 0));
        jlblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitle.setText("Fiore Flowershop");

        jlblHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblHeader.setForeground(new java.awt.Color(153, 0, 0));
        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("Catalog Maintenance");

        jlblProdID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblProdID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblProdID.setText("Product ID:");

        jlblProdName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblProdName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblProdName.setText("Product Name:");

        jlblType.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblType.setText("Type:");

        jlblPrice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblPrice.setText("Price:");

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

        jType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bounquet", "Pot" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblType, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfPrice)
                            .addComponent(jtfProdID)
                            .addComponent(jtfProdName)
                            .addComponent(jType, 0, 247, Short.MAX_VALUE)
                            .addComponent(jtfStock))
                        .addGap(0, 123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jlblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jlblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblProdID, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jtfProdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblProdName, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jtfProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblType, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jtfPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblStock, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jtfStock))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmActionPerformed
        // TODO add your handling code here:
        boolean valid = true;
        String warningMsg = "";
        if(jtfProdName.getText().equals("")){
            warningMsg += "*Name cannot be empty.\n";
            valid = false;
        }
        if(jtfPrice.getText().equals("")){
            warningMsg += "*Price No cannot be empty.\n";
            valid = false;
        }
        if(jtfStock.getText().equals("")){
            warningMsg += "*Stock No cannot be empty.\n";
            valid = false;
       
      
        }
        if(!stockValidation(jtfStock.getText()) && !jtfStock.getText().equals("")){
            warningMsg += "*Invalid Stock No Follow the format\n";
            valid = false;
        }
        if(valid){
            CountDA countDA = new CountDA();
            Count count = countDA.getCount();
            String name = jtfProdName.getText();
            double price = Double.parseDouble(jtfPrice.getText());
            int stock = Integer.parseInt(jtfStock.getText());
            String type;
            if(jType.getSelectedIndex()==0)
            type = "Bonquet";
            else
            type = "Pot";

            Catalog catalog;
            catalog = new Catalog("P"+String.format("%03d", count.getProductCount()),name, type, price, stock);

        }
        else{
            JOptionPane.showMessageDialog(null, warningMsg, "Invalid Input", JOptionPane.ERROR_MESSAGE);

        }
        

        

    }//GEN-LAST:event_jConfirmActionPerformed


        private boolean stockValidation(String stock){
             if(Character.isDigit(stock.charAt(0)))
                    {
                        return true;
                    }
            return false;
            
        }
    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        // TODO add your handling code here:

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
            java.util.logging.Logger.getLogger(AddFlowers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFlowers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFlowers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFlowers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFlowers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancel;
    private javax.swing.JButton jConfirm;
    private javax.swing.JComboBox<String> jType;
    private javax.swing.JLabel jlblHeader;
    private javax.swing.JLabel jlblPrice;
    private javax.swing.JLabel jlblProdID;
    private javax.swing.JLabel jlblProdName;
    private javax.swing.JLabel jlblStock;
    private javax.swing.JLabel jlblTitle;
    private javax.swing.JLabel jlblType;
    private javax.swing.JTextField jtfPrice;
    private javax.swing.JTextField jtfProdID;
    private javax.swing.JTextField jtfProdName;
    private javax.swing.JTextField jtfStock;
    // End of variables declaration//GEN-END:variables


}
