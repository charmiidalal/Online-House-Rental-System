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
    private Enterprise enterprise;
    private UserAccount useraccount;
    private Property property;
    private PropertyDirectory propertyDirectory;

    public ManageBuyerJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, Property property, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.system = system;
        this.property = property;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
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
        for (UserAccount useraccounts : property.getRegisteredBuyer()) {
            Object[] row = new Object[5];
            row[0] = useraccounts.getEmployee().getId();
            row[1] = useraccounts;
            row[2] = useraccounts.getPhone();
            row[3] = useraccounts.getEmail();
            row[4] = useraccounts.getCity();
            dtm.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblBuyers = new javax.swing.JTable();
        btnAddBuyer = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 241, 242));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblBuyers.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jtblBuyers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Email-Id", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
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
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 660, 180));

        btnAddBuyer.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnAddBuyer.setText("Sell House");
        btnAddBuyer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddBuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBuyerActionPerformed(evt);
            }
        });
        add(btnAddBuyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        btnView.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnView.setText("View Buyers");
        btnView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("INTERESTED BUYERS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 59, -1, 19));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/house1.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 170, 750, 550));

        btnBack1.setBackground(new java.awt.Color(241, 241, 242));
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/back.png"))); // NOI18N
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBuyerActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jtblBuyers.getModel();

        int selectedRow = jtblBuyers.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to sell the house", "Warning", dialogButton);

            if (dialogResult == JOptionPane.YES_OPTION) {
                UserAccount buyerAcc = (UserAccount) jtblBuyers.getValueAt(selectedRow, 1);
                property.setBuyer(buyerAcc);
                property.setStatus("Sold");
                system.getPropertyDirectory().getPropertyList().set(propertyDirectory.getPropertyList().indexOf(property), property);
                system.setPropertyDirectory(propertyDirectory);
                JOptionPane.showMessageDialog(this, "" + property.getPropertyName() + "house is sold to" + buyerAcc.getUsername() + "");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a house to be sold");
        }
    }//GEN-LAST:event_btnAddBuyerActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = jtblBuyers.getSelectedRow();

        int count = jtblBuyers.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount buyerAcc = (UserAccount) jtblBuyers.getValueAt(selectedRow, 1);
                ViewBuyerJPanel buyerPanel = new ViewBuyerJPanel(userProcessContainer, property, buyerAcc, useraccount, system);
                userProcessContainer.add("SellerWorkAreaJPanel", buyerPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBuyer;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblBuyers;
    // End of variables declaration//GEN-END:variables
}
