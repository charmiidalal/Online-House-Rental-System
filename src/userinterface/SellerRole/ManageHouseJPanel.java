/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SellerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
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
    /**
     * Creates new form ManageHouseJPanel
     */
    private Enterprise enterprise;
    private UserAccount useraccount;
    private PropertyDirectory propertyDirectory;
    private EcoSystem system;

    public ManageHouseJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
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
//                try {
//                    if (property.getBuyer().getBuyerName() != null) {
//                        row[10] = property.getBuyer().getBuyerName();
//                    } else {
//                        row[10] = "";
//                    }
//                } catch (NullPointerException ex) {
//                    System.out.println("userinterface.SellerRole.ManageHouseJPanel.populateTable()");
//                }
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
        btnBuyers = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanelHouse = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stateTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bhkTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bathroomTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pinTxt = new javax.swing.JTextField();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtSoldTo = new javax.swing.JTextField();
        jbtnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblHouse.setAutoCreateRowSorter(true);
        jtblHouse.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
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
        jtblHouse.setSelectionBackground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setViewportView(jtblHouse);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 1030, 127));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("LIST OF HOUSES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        btnDeleteHouse.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDeleteHouse.setForeground(new java.awt.Color(0, 0, 51));
        btnDeleteHouse.setText("Delete House");
        btnDeleteHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHouseActionPerformed(evt);
            }
        });
        add(btnDeleteHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        btnEdit.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 0, 51));
        btnEdit.setText("Edit House");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        btnBuyers.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBuyers.setForeground(new java.awt.Color(0, 0, 51));
        btnBuyers.setText("View Interested Buyers");
        btnBuyers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyersActionPerformed(evt);
            }
        });
        add(btnBuyers, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/house seller.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 410, 280));

        jPanelHouse.setBackground(new java.awt.Color(255, 255, 255));
        jPanelHouse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Name:");
        jPanelHouse.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 19, -1, -1));

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        jPanelHouse.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 20, 188, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("House Address:");
        jPanelHouse.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 65, -1, -1));
        jPanelHouse.add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 66, 188, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("City:");
        jPanelHouse.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 112, -1, -1));
        jPanelHouse.add(cityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 113, 188, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("State:");
        jPanelHouse.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 159, -1, -1));
        jPanelHouse.add(stateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 160, 188, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("BHK:");
        jPanelHouse.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 19, 37, -1));

        bhkTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhkTxtActionPerformed(evt);
            }
        });
        jPanelHouse.add(bhkTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 20, 160, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Bathroom:");
        jPanelHouse.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 65, -1, -1));

        bathroomTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bathroomTxtActionPerformed(evt);
            }
        });
        jPanelHouse.add(bathroomTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 66, 160, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Price:");
        jPanelHouse.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 112, -1, -1));
        jPanelHouse.add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 113, 166, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Status:");
        jPanelHouse.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 159, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Pincode:");
        jPanelHouse.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 207, -1, -1));
        jPanelHouse.add(pinTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 208, 188, -1));

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacant", "Sold" }));
        jPanelHouse.add(jComboBoxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 160, 166, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("SoldTo:");
        jPanelHouse.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 207, -1, -1));

        txtSoldTo.setEnabled(false);
        jPanelHouse.add(txtSoldTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 208, 175, -1));

        jbtnUpdate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });
        jPanelHouse.add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 88, -1));

        add(jPanelHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));
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

    private void btnBuyersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyersActionPerformed
        // TODO add your handling code here:
        int selectedRow = jtblHouse.getSelectedRow();

        int count = jtblHouse.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {

                String name = (String) jtblHouse.getValueAt(selectedRow, 1);
                Property property = propertyDirectory.searchPropertyName(name);

                ArrayList<UserAccount> buyers = property.getRegisteredBuyer();
                try {
                    if (!buyers.isEmpty() || buyers != null) {

                        ManageBuyerJPanel mngBuyerPanel = new ManageBuyerJPanel(userProcessContainer, enterprise, useraccount, property, system);
                        userProcessContainer.add("ManageBuyerJPanel", mngBuyerPanel);
                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        layout.next(userProcessContainer);

                    } else {
                        JOptionPane.showMessageDialog(null, "Sorry,No interested buyer for this property!!");
                    }
                } catch (NullPointerException e) {
                    System.out.println("NullPointerException thrown!");
                    JOptionPane.showMessageDialog(null, "Sorry,No interested buyer for this property!!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }

    }//GEN-LAST:event_btnBuyersActionPerformed

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
//        try {
//            if (txtSoldTo.getText() != null) {
//                property.getBuyer().setBuyerName(txtSoldTo.getText());
//            }
//
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException thrown!");
//        }

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

        property.setSeller(useraccount);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField bathroomTxt;
    private javax.swing.JTextField bhkTxt;
    private javax.swing.JButton btnBuyers;
    private javax.swing.JButton btnDeleteHouse;
    private javax.swing.JButton btnEdit;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
