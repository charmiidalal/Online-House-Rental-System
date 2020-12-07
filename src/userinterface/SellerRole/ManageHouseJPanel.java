/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SellerRole;

import Business.Buyer.Buyer;
import Business.Buyer.BuyerDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.Seller.Seller;
import Business.Seller.SellerDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anush
 */
public class ManageHouseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private SellerDirectory sellerDirectory;
    /**
     * Creates new form ManageHouseJPanel
     */
    private Enterprise enterprise;
    private UserAccount useraccount;
    private PropertyDirectory propertyDirectory;
    private EcoSystem system;

    public ManageHouseJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, SellerDirectory sellerDirectory, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.sellerDirectory = sellerDirectory;
        this.system = system;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        populateTable();
        jPanelHouse.setVisible(false);
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) jtblHouse.getModel();
        dtm.setRowCount(0);
        for (Property property : propertyDirectory.getPropertyList()) {
            if (property.getSeller().getUsername().equals(useraccount.getUsername())) {
                // String buyername=(property.getBuyer().getBuyerName())==null ? "null": property.getBuyer().getBuyerName();
                /*  try {
            if ((property.getBuyer().getBuyerName())!=null ) {
                  System.out.println("no exception");
                }
            }

        catch (NullPointerException e) {
          
            System.out.println("NullPointerException thrown!");
        }*/
                Object[] row = new Object[11];
                row[0] = property;
                row[1] = property.getPropertyName();
                row[2] = property.getStreet();
                row[3] = property.getCity();
                row[4] = property.getState();
                row[5] = property.getPincode();
                row[6] = property.getBhk();
                row[7] = property.getBathroom();
                row[8] = property.getPrice();
                row[9] = property.getStatus();
                try {
                    if (property.getBuyer().getBuyerName() != null) {
                        row[10] = property.getBuyer().getBuyerName();
                    } else {
                        row[10] = "";
                    }
                } catch (NullPointerException ex) {
                    System.out.println("userinterface.SellerRole.ManageHouseJPanel.populateTable()");
                }
                dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblHouse = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnDeleteHouse = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnBuyers = new javax.swing.JButton();
        jPanelHouse = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        stateTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bhkTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bathroomTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pinTxt = new javax.swing.JTextField();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtSoldTo = new javax.swing.JTextField();
        jbtnUpdate = new javax.swing.JButton();

        jtblHouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", " Name", " Address", "City", "State", "Zipcode", "BHK", "Bathroom", "Rate", "Status", "SoldTo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblHouse);
        if (jtblHouse.getColumnModel().getColumnCount() > 0) {
            jtblHouse.getColumnModel().getColumn(0).setResizable(false);
            jtblHouse.getColumnModel().getColumn(1).setResizable(false);
            jtblHouse.getColumnModel().getColumn(2).setResizable(false);
            jtblHouse.getColumnModel().getColumn(3).setResizable(false);
            jtblHouse.getColumnModel().getColumn(4).setResizable(false);
            jtblHouse.getColumnModel().getColumn(5).setResizable(false);
            jtblHouse.getColumnModel().getColumn(6).setResizable(false);
            jtblHouse.getColumnModel().getColumn(7).setResizable(false);
            jtblHouse.getColumnModel().getColumn(8).setResizable(false);
            jtblHouse.getColumnModel().getColumn(9).setResizable(false);
            jtblHouse.getColumnModel().getColumn(10).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("List of All Houses");

        btnDeleteHouse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDeleteHouse.setText("Delete House");
        btnDeleteHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHouseActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEdit.setText("Edit House");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnBuyers.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuyers.setText("View Interested Buyers");
        btnBuyers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyersActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name:");

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("House Address:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("City:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("State:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("BHK:");

        bhkTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhkTxtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Bathroom:");

        bathroomTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bathroomTxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Price:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Status:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Pincode:");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacant", "Sold" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("SoldTo:");

        txtSoldTo.setEnabled(false);

        jbtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHouseLayout = new javax.swing.GroupLayout(jPanelHouse);
        jPanelHouse.setLayout(jPanelHouseLayout);
        jPanelHouseLayout.setHorizontalGroup(
            jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHouseLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelHouseLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(58, 58, 58)
                        .addComponent(pinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelHouseLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelHouseLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelHouseLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelHouseLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(86, 86, 86)
                .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelHouseLayout.createSequentialGroup()
                        .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bhkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bathroomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelHouseLayout.createSequentialGroup()
                        .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(42, 42, 42)
                        .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoldTo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(priceTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, 166, Short.MAX_VALUE)))))
                .addGap(10, 75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHouseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanelHouseLayout.setVerticalGroup(
            jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHouseLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(bhkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(bathroomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(stateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtSoldTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit)
                    .addComponent(btnDeleteHouse)
                    .addComponent(btnBuyers))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(jPanelHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(351, 351, 351))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnDeleteHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnBuyers, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(jPanelHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHouseActionPerformed
        // TODO add your handling code here:

        int selectedRow = jtblHouse.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete the house", "Warning", dialogButton);

            if (dialogResult == JOptionPane.YES_OPTION) {
                Property property = (Property) jtblHouse.getValueAt(selectedRow, 0);
                propertyDirectory.removeProperty(property);
                JOptionPane.showMessageDialog(this, "Selected house is removed from the list!");
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a house to be deleted");
        }
    }//GEN-LAST:event_btnDeleteHouseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        SellerWorkAreaJPanel sellerJPanel = new SellerWorkAreaJPanel(userProcessContainer, useraccount, system);
        userProcessContainer.add("SellerWorkAreaJPanel", sellerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        jPanelHouse.setVisible(true);
        DefaultTableModel dtm = (DefaultTableModel) jtblHouse.getModel();

        int selectedRow = jtblHouse.getSelectedRow();
        if (selectedRow >= 0) {

            String name = (String) jtblHouse.getValueAt(selectedRow, 1);
            String address = (String) jtblHouse.getValueAt(selectedRow, 2);
            String city = (String) jtblHouse.getValueAt(selectedRow, 3);
            String state = (String) jtblHouse.getValueAt(selectedRow, 4);
            String zipcode = (String) jtblHouse.getValueAt(selectedRow, 5);
            int bhk = (Integer) jtblHouse.getValueAt(selectedRow, 6);
            double bathroom = (Double) jtblHouse.getValueAt(selectedRow, 7);
            double price = (Double) jtblHouse.getValueAt(selectedRow, 8);
            String status = (String) jtblHouse.getValueAt(selectedRow, 9);
            String soldto = (String) jtblHouse.getValueAt(selectedRow, 10);

            nameTxt.setText(name);
            addressTxt.setText(address);
            pinTxt.setText(zipcode);
            stateTxt.setText(state);
            String bhkset = Integer.toString(bhk);
            bhkTxt.setText(bhkset);
            String bathroomset = Double.toString(bathroom);
            bathroomTxt.setText(bathroomset);
            String priceset = Double.toString(price);
            priceTxt.setText(priceset);
            jComboBoxStatus.getModel().setSelectedItem(status);
            txtSoldTo.setText(soldto);
            cityTxt.setText(city);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void bhkTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhkTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bhkTxtActionPerformed

    private void bathroomTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bathroomTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bathroomTxtActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        // TODO add your handling code here:
        jPanelHouse.setVisible(true);
        String sellerID = this.useraccount.getEmployee().getName();
        DefaultTableModel dtm1 = (DefaultTableModel) jtblHouse.getModel();

        int selectedRow = jtblHouse.getSelectedRow();
        Property property = (Property) jtblHouse.getValueAt(selectedRow, 0);

        property.setPropertyName(nameTxt.getText());
        property.setStreet(addressTxt.getText());
        property.setCity(cityTxt.getText());
        property.setPincode(pinTxt.getText());
        property.setState(stateTxt.getText());
        int bhkget = Integer.parseInt(bhkTxt.getText());

        System.out.println(bhkget);
        property.setBhk(bhkget);
        property.setBathroom(Double.parseDouble(bathroomTxt.getText()));
        property.setPrice(Double.parseDouble(priceTxt.getText()));
        String statusget = String.valueOf(jComboBoxStatus.getSelectedItem());
        property.setStatus(statusget);
        //property.setBuyer(buyer);
        try {
            if (txtSoldTo.getText() != null) {
                property.getBuyer().setBuyerName(txtSoldTo.getText());
            }

        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown!");
        }

        DefaultTableModel dtm = (DefaultTableModel) jtblHouse.getModel();
        dtm.setRowCount(0);

        Object[] row = new Object[11];
        row[0] = property;
        row[1] = property.getPropertyName();
        row[2] = property.getStreet();
        row[3] = property.getCity();
        row[4] = property.getState();
        row[5] = property.getPincode();
        row[6] = property.getBhk();
        row[7] = property.getBathroom();
        row[8] = property.getPrice();
        row[9] = property.getStatus();
        row[10] = property.getBuyer();
        dtm.addRow(row);

        property.setSeller(sellerDirectory.fetchSeller(sellerID));

        system.setPropertyDirectory(propertyDirectory);
        JOptionPane.showMessageDialog(null, "House details Updated!");
        nameTxt.setText("");
        addressTxt.setText("");
        pinTxt.setText("");
        stateTxt.setText("");

        bhkTxt.setText("");

        bathroomTxt.setText("");

        priceTxt.setText("");

        txtSoldTo.setText("");
        cityTxt.setText("");
        populateTable();
        jPanelHouse.setVisible(false);
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void btnBuyersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyersActionPerformed
        // TODO add your handling code here:
        int selectedRow = jtblHouse.getSelectedRow();

        int count = jtblHouse.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {

                String name = (String) jtblHouse.getValueAt(selectedRow,1);
                Property property = propertyDirectory.searchPropertyName(name);
               
                    ArrayList<Buyer> buyers = property.getRegisteredBuyer();
                    try{
                    if (!buyers.isEmpty() || buyers != null) {

                    
                            ManageBuyerJPanel mngBuyerPanel = new ManageBuyerJPanel(userProcessContainer, enterprise, useraccount, property, system);
                            userProcessContainer.add("ManageBuyerJPanel", mngBuyerPanel);
                            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                            layout.next(userProcessContainer);

                        } else {
                            JOptionPane.showMessageDialog(null, "Sorry,No interested buyer for this property!!");
                        }
                    }
                 catch (NullPointerException e) {
                    System.out.println("NullPointerException thrown!");
                    JOptionPane.showMessageDialog(null, "Sorry,No interested buyer for this property!!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }}
else {
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }

    }//GEN-LAST:event_btnBuyersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField bathroomTxt;
    private javax.swing.JTextField bhkTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuyers;
    private javax.swing.JButton btnDeleteHouse;
    private javax.swing.JButton btnEdit;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelHouse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTable jtblHouse;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField pinTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField stateTxt;
    private javax.swing.JTextField txtSoldTo;
    // End of variables declaration//GEN-END:variables
}
