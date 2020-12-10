/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AgentRole;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Property.Property;
import Business.Property.PropertyDirectory;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.AgentRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


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

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblHouse = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnSendHouseSug = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/houseop.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 660, 440));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 730, 219));

        btnBack.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 320, -1, -1));

        btnSendHouseSug.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnSendHouseSug.setText("Send House Suggestions");
        btnSendHouseSug.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSendHouseSug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendHouseSugActionPerformed(evt);
            }
        });
        add(btnSendHouseSug, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/house.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 145, 164));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 56, 82));
        jLabel3.setText("LIST OF ALL THE HOUSES");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblHouse;
    // End of variables declaration//GEN-END:variables
}
