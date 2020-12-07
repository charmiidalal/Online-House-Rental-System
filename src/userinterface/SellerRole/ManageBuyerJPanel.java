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
public class ManageBuyerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageBuyerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private SellerDirectory sellerDirectory;
    private Enterprise enterprise;
    private UserAccount useraccount;
    private BuyerDirectory buyerDirectory;
    private Buyer buyer;
    private Property property;
    private PropertyDirectory propertyDirectory;

     public ManageBuyerJPanel(JPanel userProcessContainer, Enterprise enterprise,UserAccount useraccount,Property property, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.useraccount=useraccount;
        this.sellerDirectory=sellerDirectory;
        this.system = system;
        this.buyer=buyer;
        this.property=property;
        this.buyerDirectory = (system.getBuyerDirectory() == null) ? new BuyerDirectory(): system.getBuyerDirectory();
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory(): system.getPropertyDirectory();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     
      private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) jtblBuyers.getModel();
        dtm.setRowCount(0);
        for (Buyer buyers : property.getRegisteredBuyer()) {
         
             
                Object[] row = new Object[6];
                row[0] = buyers;
                row[1] = buyers.getBuyerName();
                row[2] = buyers.getBuyerPhone();
                row[3] = buyers.getBuyerEmail();
                row[4]=buyers.getBuyerStreet();
                row[5]=buyers.getBuyerZipcode();
                
               
               
                dtm.addRow(row);
            
          }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblBuyers = new javax.swing.JTable();
        btnAddBuyer = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        jtblBuyers.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtblBuyers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", " Name", "Phone", "Email-Id", "Address", "Zipcode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblBuyers);
        if (jtblBuyers.getColumnModel().getColumnCount() > 0) {
            jtblBuyers.getColumnModel().getColumn(1).setResizable(false);
            jtblBuyers.getColumnModel().getColumn(2).setResizable(false);
            jtblBuyers.getColumnModel().getColumn(3).setResizable(false);
            jtblBuyers.getColumnModel().getColumn(4).setResizable(false);
            jtblBuyers.getColumnModel().getColumn(5).setResizable(false);
        }

        btnAddBuyer.setText("Sell House");
        btnAddBuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBuyerActionPerformed(evt);
            }
        });

        btnBack.setText("<<back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnView.setText("View Buyers");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddBuyer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(73, 73, 73)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnAddBuyer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBuyerActionPerformed
       DefaultTableModel dtm = (DefaultTableModel) jtblBuyers.getModel();

        int selectedRow = jtblBuyers.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to sell the house", "Warning", dialogButton);

            if (dialogResult == JOptionPane.YES_OPTION) {
                 buyer = (Buyer) jtblBuyers.getValueAt(selectedRow, 0);
                 property.setBuyer(buyer);
                 property.setStatus("Sold");
                 system.getPropertyDirectory().getPropertyList().set(propertyDirectory.getPropertyList().indexOf(property), property);
                system.setPropertyDirectory(propertyDirectory);
                JOptionPane.showMessageDialog(this,"" +property.getPropertyName()+ "house is sold to"  +buyer.getBuyerName()+ "");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a house to be sold");
        }
    }//GEN-LAST:event_btnAddBuyerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        SellerWorkAreaJPanel sellerJPanel = new SellerWorkAreaJPanel(userProcessContainer, useraccount,system);
        userProcessContainer.add("SellerWorkAreaJPanel", sellerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = jtblBuyers.getSelectedRow();

        int count = jtblBuyers.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {

                String name = (String) jtblBuyers.getValueAt(selectedRow,1);
                Buyer viewBuyer=buyerDirectory.getBuyer(name);
                
        ViewBuyerJPanel buyerPanel = new ViewBuyerJPanel(userProcessContainer,property,viewBuyer,useraccount,system);
        userProcessContainer.add("SellerWorkAreaJPanel", buyerPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }
        }
            else
            {
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }
        
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBuyer;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblBuyers;
    // End of variables declaration//GEN-END:variables
}
