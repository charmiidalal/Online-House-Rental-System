/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AgentRole;

import Business.AgentRequest.AgentRequest;
import Business.Buyer.BuyerDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.Seller.Seller;
import Business.Seller.SellerDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.ManageSystemUsersJPanel;

/**
 *
 * @author anush
 */
public class AssignPropetyJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private AgentRequest agentRequest;
    /**
     * Creates new form ManageHouseJPanel
     */
    private Enterprise enterprise;
    private UserAccount useraccount;
    private PropertyDirectory propertyDirectory;
    private EcoSystem system;

    public AssignPropetyJPanel(JPanel userProcessContainer, UserAccount useraccount, EcoSystem system,AgentRequest agentRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.agentRequest = agentRequest;
        this.system = system;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) jtblHouse.getModel();
        dtm.setRowCount(0);
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
                row[10] = property.getBuyer();
                row[11] = property.getSeller().getName();
                dtm.addRow(row);
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
        btnBack = new javax.swing.JButton();
        btnSendHouseSug = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jtblHouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HouseID", " Name", " Address", "City", "State", "Zipcode", "BHK", "Bathroom", "Rate", "Status", "SoldTo", "SellerName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, true
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
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("List of All Houses");

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSendHouseSug.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSendHouseSug.setText("Send House Suggestions");
        btnSendHouseSug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendHouseSugActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnSendHouseSug)
                        .addGap(145, 145, 145)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendHouseSug, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSendHouseSugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendHouseSugActionPerformed
        // TODO add your handling code here
        ArrayList<String> propertyList = new ArrayList<String>();
        if (jtblHouse.getSelectedRow() >= 0) {
            for(int i = 0; i < jtblHouse.getSelectedRows().length; i++){
                String propertyID =  (String) jtblHouse.getValueAt(jtblHouse.getSelectedRows()[i], 0);
                propertyList.add(propertyID);
            }
            agentRequest.setPropertyList(propertyList);
            JOptionPane.showMessageDialog(this, "Property Suggested Successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a house to suggest");
        }
    }//GEN-LAST:event_btnSendHouseSugActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSendHouseSug;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblHouse;
    // End of variables declaration//GEN-END:variables
}