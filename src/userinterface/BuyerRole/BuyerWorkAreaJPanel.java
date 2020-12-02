/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuyerRole;

import Business.Buyer.Buyer;
import Business.Buyer.BuyerDirectory;
import Business.EcoSystem;
import Business.InspectRequest.InspectRequest;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.Seller.Seller;
import Business.Seller.SellerDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dinesh
 */
public class BuyerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private SellerDirectory sellerDirectory;
    private PropertyDirectory propertyDirectory;
    private BuyerDirectory buyerDirectory;

    /**
     * Creates new form BuyerWorkAreaJpanel
     */
    public BuyerWorkAreaJPanel(JPanel userProcess, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.userAccount = userAccount;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        this.buyerDirectory = (system.getBuyerDirectory() == null) ? new BuyerDirectory() : system.getBuyerDirectory();
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);
        for (Property property : propertyDirectory.getPropertyList()) {
            Object[] row = new Object[12];
            row[0] = property.getPropertyID();
            row[1] = property.getPropertyName();
            row[2] = property.getStreet();
            row[3] = property.getCity();
            row[4] = property.getState();
            row[5] = property.getPincode();
            row[6] = property.getBhk();
            row[7] = property.getBathroom();
            row[8] = property.getPrice();
            row[9] = property.getStatus();
            row[10] = property.getSeller().getSellerNo();
            row[11] = property.getSeller().getSellerName();
            model.addRow(row);
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

        btnViewHouseDetails = new javax.swing.JButton();
        btnBuyHouse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        btnHireInspector = new javax.swing.JButton();
        btnViewSellerDetails = new javax.swing.JButton();
        btnRequestNegotiation = new javax.swing.JButton();
        btnBuyHouse1 = new javax.swing.JButton();

        btnViewHouseDetails.setText("View House Details");
        btnViewHouseDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHouseDetailsActionPerformed(evt);
            }
        });

        btnBuyHouse.setText("Buy House");
        btnBuyHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyHouseActionPerformed(evt);
            }
        });

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PropertyID", " Name", " Address", "City", "State", "Zipcode", "BHK", "Bathroom", "Rate", "Status", "SoldByID", "SoldBy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(houseTable);

        btnHireInspector.setText("Hire Inspector");
        btnHireInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHireInspectorActionPerformed(evt);
            }
        });

        btnViewSellerDetails.setText("View Seller Details");
        btnViewSellerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSellerDetailsActionPerformed(evt);
            }
        });

        btnRequestNegotiation.setText("Request Negotiation");
        btnRequestNegotiation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestNegotiationActionPerformed(evt);
            }
        });

        btnBuyHouse1.setText("<< Back");
        btnBuyHouse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyHouse1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRequestNegotiation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addComponent(btnHireInspector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnViewHouseDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewSellerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuyHouse1)
                        .addGap(98, 98, 98)
                        .addComponent(btnBuyHouse))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnHireInspector)
                        .addGap(42, 42, 42)
                        .addComponent(btnRequestNegotiation)
                        .addGap(51, 51, 51)
                        .addComponent(btnViewSellerDetails)
                        .addGap(39, 39, 39)
                        .addComponent(btnViewHouseDetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuyHouse)
                    .addComponent(btnBuyHouse1))
                .addContainerGap(232, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewHouseDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHouseDetailsActionPerformed
        int selectedRow = houseTable.getSelectedRow();

        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                String Id = (String) houseTable.getValueAt(selectedRow, 0);
                Property seller = propertyDirectory.fetchProperty(Id);
                ViewDetailsJPanel viewJPanel = new ViewDetailsJPanel(userProcessContainer, seller, propertyDirectory);
                userProcessContainer.add(viewJPanel);
                layout.next(userProcessContainer);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }

    }//GEN-LAST:event_btnViewHouseDetailsActionPerformed

    private void btnBuyHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyHouseActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        String propertyID = (String) houseTable.getValueAt(selectedRow, 0);
        if (count == 1) {
            Property property = propertyDirectory.fetchProperty(propertyID);
            property.setStatus("Sold");
            Buyer buyer = buyerDirectory.searchBuyer(userAccount.getEmployee().getName());
            property.setBuyer(buyer);
            populateRequestTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnBuyHouseActionPerformed

    private void btnHireInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHireInspectorActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        String propertyID = (String) houseTable.getValueAt(selectedRow, 0);
        if (count == 1) {
            Property property = propertyDirectory.fetchProperty(propertyID);
            Buyer buyer = buyerDirectory.searchBuyer(userAccount.getEmployee().getName());
            HireInspectorJPanel hireInspectorJPanel = new HireInspectorJPanel(userProcessContainer, property,buyer, system);
            userProcessContainer.add("hireInspectorJPanel", hireInspectorJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnHireInspectorActionPerformed

    private void btnViewSellerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSellerDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewSellerDetailsActionPerformed

    private void btnRequestNegotiationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestNegotiationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequestNegotiationActionPerformed

    private void btnBuyHouse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyHouse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuyHouse1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyHouse;
    private javax.swing.JButton btnBuyHouse1;
    private javax.swing.JButton btnHireInspector;
    private javax.swing.JButton btnRequestNegotiation;
    private javax.swing.JButton btnViewHouseDetails;
    private javax.swing.JButton btnViewSellerDetails;
    private javax.swing.JTable houseTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
