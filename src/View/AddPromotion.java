/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.*;
import DA.*;
import Control.MaintainCatalogControl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author lamzn
 */
public class AddPromotion extends javax.swing.JFrame {

    private MaintainCatalogControl control;

    private static List<CatalogInterface> catalogList;

    /**
     * Creates new form AddPromotion
     */
    public AddPromotion() {
        initComponents();
    }

    public AddPromotion(MaintainCatalogControl control) {
        initComponents();
        this.control = control;
        catalogList = control.getAllCatalog();

        Iterator<CatalogInterface> catalogIterator = catalogList.getIterator();

        DefaultTableModel catalogModel = (DefaultTableModel) jtcatalog.getModel();

        while (catalogIterator.hasNext()) {

            CatalogInterface catalog = catalogIterator.next();
            Vector row = new Vector();
            row.add(catalog.getProdID());
            row.add(catalog.getPrice());
            catalogModel.addRow(row);
        }

        jtcatalog.setModel(catalogModel);

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
        jlblPromotion = new javax.swing.JLabel();
        jlblPromotion2 = new javax.swing.JLabel();
        jConfirm = new javax.swing.JButton();
        jCancel = new javax.swing.JButton();
        jStartyear = new javax.swing.JComboBox<>();
        jEndmonth = new javax.swing.JComboBox<>();
        jStartday = new javax.swing.JComboBox<>();
        jEndyear = new javax.swing.JComboBox<>();
        jStartmonth = new javax.swing.JComboBox<>();
        jEndday = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtcatalog = new javax.swing.JTable();
        jAdd = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtcatalog1 = new javax.swing.JTable();
        jRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jlblTitle.setForeground(new java.awt.Color(102, 0, 0));
        jlblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTitle.setText("Fiore Flowershop");

        jlblHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblHeader.setForeground(new java.awt.Color(153, 0, 0));
        jlblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHeader.setText("Add Promotion ");

        jlblPromotion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblPromotion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblPromotion.setText("Start Date :");

        jlblPromotion2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblPromotion2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblPromotion2.setText("End Date :");

        jConfirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jConfirm.setText("Confirm");
        jConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmActionPerformed(evt);
            }
        });

        jCancel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCancel.setText("Cancel");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });

        jStartyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2018", "2019", "2020" }));

        jEndmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jEndmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEndmonthActionPerformed(evt);
            }
        });

        jEndyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2018", "2019", "2020" }));

        jStartmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jStartmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStartmonthActionPerformed(evt);
            }
        });

        jtcatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Catalog ID", "Price"
            }
        ));
        jScrollPane3.setViewportView(jtcatalog);

        jAdd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jAdd.setText("Add");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });

        jtcatalog1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Catalog ID", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jtcatalog1);

        jRemove.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRemove.setText("Remove");
        jRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jlblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblPromotion2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jStartyear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jStartmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jEndyear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jEndmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jStartday, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEndday, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblPromotion2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jStartyear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jStartmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jStartday, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblPromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEndyear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEndmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jEndday, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmActionPerformed
        // TODO add your handling code here:
        if (jStartyear.getSelectedIndex() != 0 && jStartmonth.getSelectedIndex() != 0 && jStartday.getSelectedIndex() != 0) {

            String syear = "";
            String smonth = "";
            String sday = "";
            Date sdate = null;
            String year = "";
            String month = "";
            String day = "";
            Date date = null;
            switch (jStartyear.getSelectedIndex()) {
                case 1:
                    syear = "2018";
                    break;
                case 2:
                    syear = "2019";
                    break;
                case 3:
                    syear = "2020";

            }

            switch (jStartmonth.getSelectedIndex()) {
                case 1:
                    smonth = "01";
                    break;
                case 2:
                    smonth = "02";
                    break;
                case 3:
                    smonth = "03";
                    break;
                case 4:
                    smonth = "04";
                    break;
                case 5:
                    smonth = "05";
                    break;
                case 6:
                    smonth = "06";
                    break;
                case 7:
                    smonth = "07";
                    break;
                case 8:
                    smonth = "08";
                    break;
                case 9:
                    smonth = "09";
                    break;
                case 10:
                    smonth = "10";
                    break;
                case 11:
                    smonth = "11";
                    break;
                case 12:
                    smonth = "12";
                    break;
            }

            switch (jStartday.getSelectedIndex()) {
                case 1:
                    sday = "01";
                    break;
                case 2:
                    sday = "02";
                    break;
                case 3:
                    sday = "03";
                    break;
                case 4:
                    sday = "04";
                    break;
                case 5:
                    sday = "05";
                    break;
                case 6:
                    sday = "06";
                    break;
                case 7:
                    sday = "07";
                    break;
                case 8:
                    sday = "08";
                    break;
                case 9:
                    sday = "09";
                    break;
                case 10:
                    sday = "10";
                    break;
                case 11:
                    sday = "11";
                    break;
                case 12:
                    sday = "12";
                    break;
                case 13:
                    sday = "13";
                    break;
                case 14:
                    sday = "14";
                    break;
                case 15:
                    sday = "15";
                    break;
                case 16:
                    sday = "16";
                    break;
                case 17:
                    sday = "17";
                    break;
                case 18:
                    sday = "18";
                    break;
                case 19:
                    sday = "19";
                    break;
                case 20:
                    sday = "20";
                    break;
                case 21:
                    sday = "21";
                    break;
                case 22:
                    sday = "22";
                    break;
                case 23:
                    sday = "23";
                    break;
                case 24:
                    sday = "24";
                    break;
                case 25:
                    sday = "25";
                    break;
                case 26:
                    sday = "26";
                    break;
                case 27:
                    sday = "27";
                    break;
                case 28:
                    sday = "28";
                    break;
                case 29:
                    sday = "29";
                    break;
                case 30:
                    sday = "30";
                    break;
                case 31:
                    sday = "31";
                    break;
            }
            try {
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                String dateStr = syear + "-" + smonth + "-" + sday;
                sdate = format.parse(dateStr);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            if (jStartyear.getSelectedIndex() != 0 && jStartmonth.getSelectedIndex() != 0 && jStartday.getSelectedIndex() != 0) {

                switch (jEndyear.getSelectedIndex()) {
                    case 1:
                        year = "2018";
                        break;
                    case 2:
                        year = "2019";
                        break;
                    case 3:
                        year = "2020";

                }

                switch (jEndmonth.getSelectedIndex()) {
                    case 1:
                        month = "01";
                        break;
                    case 2:
                        month = "02";
                        break;
                    case 3:
                        month = "03";
                        break;
                    case 4:
                        month = "04";
                        break;
                    case 5:
                        month = "05";
                        break;
                    case 6:
                        month = "06";
                        break;
                    case 7:
                        month = "07";
                        break;
                    case 8:
                        month = "08";
                        break;
                    case 9:
                        month = "09";
                        break;
                    case 10:
                        month = "10";
                        break;
                    case 11:
                        month = "11";
                        break;
                    case 12:
                        month = "12";
                        break;
                }

                switch (jEndday.getSelectedIndex()) {
                    case 1:
                        day = "01";
                        break;
                    case 2:
                        day = "02";
                        break;
                    case 3:
                        day = "03";
                        break;
                    case 4:
                        day = "04";
                        break;
                    case 5:
                        day = "05";
                        break;
                    case 6:
                        day = "06";
                        break;
                    case 7:
                        day = "07";
                        break;
                    case 8:
                        day = "08";
                        break;
                    case 9:
                        day = "09";
                        break;
                    case 10:
                        day = "10";
                        break;
                    case 11:
                        day = "11";
                        break;
                    case 12:
                        day = "12";
                        break;
                    case 13:
                        day = "13";
                        break;
                    case 14:
                        day = "14";
                        break;
                    case 15:
                        day = "15";
                        break;
                    case 16:
                        day = "16";
                        break;
                    case 17:
                        day = "17";
                        break;
                    case 18:
                        day = "18";
                        break;
                    case 19:
                        day = "19";
                        break;
                    case 20:
                        day = "20";
                        break;
                    case 21:
                        day = "21";
                        break;
                    case 22:
                        day = "22";
                        break;
                    case 23:
                        day = "23";
                        break;
                    case 24:
                        day = "24";
                        break;
                    case 25:
                        day = "25";
                        break;
                    case 26:
                        day = "26";
                        break;
                    case 27:
                        day = "27";
                        break;
                    case 28:
                        day = "28";
                        break;
                    case 29:
                        day = "29";
                        break;
                    case 30:
                        day = "30";
                        break;
                    case 31:
                        day = "31";
                        break;
                }
                try {
                    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    String dateStr = year + "-" + month + "-" + day;
                    date = format.parse(dateStr);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
    
            if (syear == "" || smonth == "" || sday == "") {
                JOptionPane.showMessageDialog(null, "Date Field cannot be empty!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            if (year == "" || month == "" || day == "") {
                JOptionPane.showMessageDialog(null, "Date Field cannot be empty!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            if(sdate.compareTo(date) ==  1 || sdate.compareTo(date) == 0)
            {
                 JOptionPane.showMessageDialog(null, "End Date Cannot Smaller than Start Date", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
             if(jtcatalog1.getColumnCount() != 0 ){
                       JOptionPane.showMessageDialog(null, "Table cannot Empty", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
            else{
                PromotionInterface promotion = control.createPromotion(sdate, date);
                List<PromotionCatalog> promotionCatalogList = new LinkedList(); 
                TableModel model = jtcatalog1.getModel();
                for(int i=0; i < model.getRowCount(); i++){
                    
                    
                    CatalogInterface catalog = control.getCatalogById((String)model.getValueAt(i, 0));
                    Double price = 0.0;
                    try{
                        price = (Double) model.getValueAt(i, 1);
                    }
                    catch(ClassCastException ex){
                        JOptionPane.showMessageDialog(null, ex.getStackTrace(), "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    PromotionCatalog promotionCatalog = new PromotionCatalog(promotion,catalog, price);
                    promotionCatalogList.add(promotionCatalog);
                    
                    
                }
                
                control.addPromotion(promotion);
                control.addPromotionCatalog(promotion, promotionCatalogList);
               
                JOptionPane.showMessageDialog(null, promotion.getPromoID() + " added success.");
            }
            

        } else {
            JOptionPane.showMessageDialog(null, "Error!!!!Empty Date.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

            this.dispose();
    }//GEN-LAST:event_jConfirmActionPerformed

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_jCancelActionPerformed

    private void jStartmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStartmonthActionPerformed
        // TODO add your handling code here:
        String[] day1 = {"", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13",
            "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] day2 = {"", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13",
            "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        String[] day3 = {"", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13",
            "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"};

        int month = jStartmonth.getSelectedIndex();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            DefaultComboBoxModel model = new DefaultComboBoxModel<>(day1);
            jStartday.setModel(model);
        } else if (month == 2) {
            DefaultComboBoxModel model = new DefaultComboBoxModel<>(day3);
            jStartday.setModel(model);
        } else {
            DefaultComboBoxModel model = new DefaultComboBoxModel<>(day2);
            jStartday.setModel(model);
        }


    }//GEN-LAST:event_jStartmonthActionPerformed

    private void jEndmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEndmonthActionPerformed
        // TODO add your handling code here:
        String[] day1 = {"", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13",
            "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] day2 = {"", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13",
            "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        String[] day3 = {"", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13",
            "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"};

        int month = jEndmonth.getSelectedIndex();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            DefaultComboBoxModel model = new DefaultComboBoxModel<>(day1);
            jEndday.setModel(model);
        } else if (month == 2) {
            DefaultComboBoxModel model = new DefaultComboBoxModel<>(day3);
            jEndday.setModel(model);
        } else {
            DefaultComboBoxModel model = new DefaultComboBoxModel<>(day2);
            jEndday.setModel(model);
        }
    }//GEN-LAST:event_jEndmonthActionPerformed

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        // TODO add your handling code here:

    
            TableModel model = jtcatalog.getModel();
            int[] indexs = jtcatalog.getSelectedRows();
            Object[] row = new Object[2];
            DefaultTableModel model1 = (DefaultTableModel) jtcatalog1.getModel();
            for (int i = 0; i < indexs.length; i++) {
                row[0] = model.getValueAt(indexs[i], 0);
                row[1] = model.getValueAt(indexs[i], 1);
                ((DefaultTableModel)jtcatalog.getModel()).removeRow(indexs[i]);
                model1.addRow(row);

            }

    }//GEN-LAST:event_jAddActionPerformed

    private void jRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoveActionPerformed
        // TODO add your handling code here:
            TableModel model = jtcatalog1.getModel();
            int[] indexs = jtcatalog1.getSelectedRows();
            Object[] row = new Object[2];
            DefaultTableModel model1 = (DefaultTableModel) jtcatalog.getModel();
            for (int i = 0; i < indexs.length; i++) {
                row[0] = model.getValueAt(indexs[i], 0);
                row[1] = model.getValueAt(indexs[i], 1);
                ((DefaultTableModel)jtcatalog1.getModel()).removeRow(indexs[i]);
                model1.addRow(row);

            }
        
        
        
        
        
        
    }//GEN-LAST:event_jRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(AddPromotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPromotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPromotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPromotion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPromotion(new MaintainCatalogControl()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdd;
    private javax.swing.JButton jCancel;
    private javax.swing.JButton jConfirm;
    private javax.swing.JComboBox<String> jEndday;
    private javax.swing.JComboBox<String> jEndmonth;
    private javax.swing.JComboBox<String> jEndyear;
    private javax.swing.JButton jRemove;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> jStartday;
    private javax.swing.JComboBox<String> jStartmonth;
    private javax.swing.JComboBox<String> jStartyear;
    private javax.swing.JLabel jlblHeader;
    private javax.swing.JLabel jlblPromotion;
    private javax.swing.JLabel jlblPromotion2;
    private javax.swing.JLabel jlblTitle;
    private javax.swing.JTable jtcatalog;
    private javax.swing.JTable jtcatalog1;
    // End of variables declaration//GEN-END:variables
}