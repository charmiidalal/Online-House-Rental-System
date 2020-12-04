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
        this.sellerDirectory = (system.getSellerDirectory() == null) ? new SellerDirectory() : system.getSellerDirectory();
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
            row[11] = property.getSeller().getName();
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
        btnViewSellerDetails = new javax.swing.JButton();
        btnRequestNegotiation = new javax.swing.JButton();
        btnHireInspector = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnHireInspector1 = new javax.swing.JButton();
        hireSPBtn = new javax.swing.JButton();

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

        btnHireInspector.setText("Hire Inspector");
        btnHireInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHireInspectorActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnHireInspector1.setText("View Inspector Jobs");
        btnHireInspector1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHireInspector1ActionPerformed(evt);
            }
        });

        hireSPBtn.setText("Hire Service Providers");
        hireSPBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireSPBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(btnBuyHouse)
                .addGap(84, 84, 84)
                .addComponent(btnRequestNegotiation, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(204, 204, 204))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnHireInspector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hireSPBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewSellerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewHouseDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHireInspector1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHireInspector1)
                        .addGap(41, 41, 41)
                        .addComponent(btnHireInspector)
                        .addGap(18, 18, 18)
                        .addComponent(hireSPBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewHouseDetails)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewSellerDetails)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRequestNegotiation)
                    .addComponent(btnBack)
                    .addComponent(btnBuyHouse))
                .addContainerGap(271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewHouseDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHouseDetailsActionPerformed
        int selectedRow = houseTable.getSelectedRow();

        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                String Id = (String) houseTable.getValueAt(selectedRow, 0);
                Property property = propertyDirectory.fetchProperty(Id);
                ViewHouseDetailsJPanel viewJPanel = new ViewHouseDetailsJPanel(userProcessContainer, property, propertyDirectory, system, userAccount);
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

    private void btnViewSellerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSellerDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            String sellerID = (String) houseTable.getValueAt(selectedRow, 10);
            Seller seller = sellerDirectory.fetchSeller(sellerID);
            ViewSellerDetailsJPanel viewSellerDetailsJPanel = new ViewSellerDetailsJPanel(userProcessContainer, seller, userAccount, system);
            userProcessContainer.add("viewSellerDetailsJPanel", viewSellerDetailsJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnViewSellerDetailsActionPerformed

    private void btnRequestNegotiationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestNegotiationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequestNegotiationActionPerformed

    private void btnHireInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHireInspectorActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            String propertyID = (String) houseTable.getValueAt(selectedRow, 0);
            Property property = propertyDirectory.fetchProperty(propertyID);
            Buyer buyer = buyerDirectory.searchBuyer(userAccount.getEmployee().getName());
            HireInspectorJPanel hireInspectorJPanel = new HireInspectorJPanel(userProcessContainer, property, buyer, system);
            userProcessContainer.add("hireInspectorJPanel", hireInspectorJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnHireInspectorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHireInspector1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHireInspector1ActionPerformed
        // TODO add your handling code here:
        ManageInspectorActivity manageInspectorActivity = new ManageInspectorActivity(userProcessContainer, system, userAccount);
        userProcessContainer.add("manageInspectorActivity", manageInspectorActivity);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnHireInspector1ActionPerformed

    private void hireSPBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireSPBtnActionPerformed
         int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            String propertyID = (String) houseTable.getValueAt(selectedRow, 0);
            Property property = propertyDirectory.fetchProperty(propertyID);
            Buyer buyer = buyerDirectory.searchBuyer(userAccount.getEmployee().getName());
        HireServiceJPanel hireServiceJPanel = new HireServiceJPanel(userProcessContainer,property, buyer, system, userAccount);
        userProcessContainer.add("manageInspectorActivity", hireServiceJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hireSPBtnActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuyHouse;
    private javax.swing.JButton btnHireInspector;
    private javax.swing.JButton btnHireInspector1;
    private javax.swing.JButton btnRequestNegotiation;
    private javax.swing.JButton btnViewHouseDetails;
    private javax.swing.JButton btnViewSellerDetails;
    private javax.swing.JButton hireSPBtn;
    private javax.swing.JTable houseTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
