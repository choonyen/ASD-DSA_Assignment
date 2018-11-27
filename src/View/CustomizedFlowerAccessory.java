/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import DA.*;
import Model.*;
import Control.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Choonyen
 */
public class CustomizedFlowerAccessory extends javax.swing.JFrame {
    
    private CustomizedFloral customizedFloral;
    private FlowerDA flowerDA;
    private AccessoryDA accessoryDA;
    private List<Flower> flowerList = new ArrayList<>();
    private List<Accessory> accessoryList = new ArrayList<>();
    private String flowerNo;
    private String accessoryNo;
    private double flowerPrice;
    private double accessoryPrice;
    private double total;
    
    /**
     * Creates new form CustomizedFlowerAccessory
     */
    public CustomizedFlowerAccessory() {
        initComponents();
    }
    
    public CustomizedFlowerAccessory(CustomizedFloral customizedFloral)
    {
       this.customizedFloral = customizedFloral;
       initComponents();
       flowerDA = new FlowerDA();
       accessoryDA = new AccessoryDA(); 
       
       flowerList = flowerDA.getFlowerList();
       for(int i=0;i<flowerList.size();i++)
       {
           jComboBoxFlower.addItem(flowerList.get(i).getFlowerName());
       }
       
       accessoryList = accessoryDA.getAccessoryList();
       for(int i=0;i<accessoryList.size();i++)
       {
           jComboBoxAccessory.addItem(accessoryList.get(i).getAccessoryName());
       }
       
       for(int i=0;i<flowerList.size();i++)
        {
            if(jComboBoxFlower.getSelectedItem() == flowerList.get(i).getFlowerName())
            {
                flowerNo = flowerList.get(i).getFlowerNo();
            }
        }
        for(int i=0; i<accessoryList.size();i++)
        {
            if(jComboBoxAccessory.getSelectedItem().equals(accessoryList.get(i).getAccessoryName()))
            {
                 accessoryNo = accessoryList.get(i).getAccessoryNo();
            }
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
        jLabelTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelFlower = new javax.swing.JLabel();
        jComboBoxFlower = new javax.swing.JComboBox<>();
        jLabelAccessory = new javax.swing.JLabel();
        jComboBoxAccessory = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textFlower = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAccessory = new javax.swing.JTextArea();
        jLabelTotal = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbtTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 0, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Customized Floral Arrangement");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please select your desire items *");

        jLabelFlower.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFlower.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFlower.setText("Flower");

        jComboBoxFlower.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBoxFlower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFlowerActionPerformed(evt);
            }
        });

        jLabelAccessory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAccessory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAccessory.setText("Accessory");

        jComboBoxAccessory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBoxAccessory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAccessoryActionPerformed(evt);
            }
        });

        textFlower.setEditable(false);
        textFlower.setColumns(20);
        textFlower.setRows(5);
        jScrollPane1.setViewportView(textFlower);

        textAccessory.setEditable(false);
        textAccessory.setColumns(20);
        textAccessory.setRows(5);
        jScrollPane2.setViewportView(textAccessory);

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTotal.setText("Total Amount");

        jTextFieldTotal.setEditable(false);

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back To Home Page");

        jbtTotal.setText("Calculate");
        jbtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(221, 221, 221)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelFlower, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelAccessory, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxAccessory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtTotal)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFlower)
                    .addComponent(jComboBoxFlower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAccessory)
                    .addComponent(jComboBoxAccessory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTotal)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxFlowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFlowerActionPerformed
        // TODO add your handling code here:
        for(int i =0;i<flowerList.size();i++)
        {
            if(jComboBoxFlower.getSelectedItem() == flowerList.get(i).getFlowerName())
            {  
                flowerPrice = flowerList.get(i).getPrice();
                String Flower ="Price: RM " + flowerPrice;
                textFlower.setText(Flower);
            }             
        }
    }//GEN-LAST:event_jComboBoxFlowerActionPerformed

    private void jComboBoxAccessoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAccessoryActionPerformed
        // TODO add your handling code here:
        for(int i=0;i<accessoryList.size();i++)
        {
            if(jComboBoxAccessory.getSelectedItem() == accessoryList.get(i).getAccessoryName())
            {
                accessoryPrice = accessoryList.get(i).getPrice();
                String Accessory = "Price: RM " + accessoryPrice;
                textAccessory.setText(Accessory);
            }       
        }
        
        
    }//GEN-LAST:event_jComboBoxAccessoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTotalActionPerformed
        // TODO add your handling code here:
        total = customizedFloral.getPrice();
        total = total + flowerPrice + accessoryPrice;
        jTextFieldTotal.setText(String.format("RM %.2f",total));
    }//GEN-LAST:event_jbtTotalActionPerformed

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
            java.util.logging.Logger.getLogger(CustomizedFlowerAccessory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomizedFlowerAccessory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomizedFlowerAccessory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomizedFlowerAccessory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomizedFlowerAccessory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxAccessory;
    private javax.swing.JComboBox<String> jComboBoxFlower;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAccessory;
    private javax.swing.JLabel jLabelFlower;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JButton jbtTotal;
    private javax.swing.JTextArea textAccessory;
    private javax.swing.JTextArea textFlower;
    // End of variables declaration//GEN-END:variables
}