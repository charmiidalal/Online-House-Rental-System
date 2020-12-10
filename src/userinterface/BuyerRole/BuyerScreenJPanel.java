/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuyerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SellerRole.BuyerRegistrationFormJPanel;

/**
 *
 * @author dinesh
 */
public class BuyerScreenJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private PropertyDirectory propertyDirectory;
    private Enterprise enterprise;
    private Network network;
    private Organization organization;

    /**
     * Creates new form BuyerWorkAreaJpanel
     */
    public BuyerScreenJPanel(JPanel userProcessContainer, UserAccount userAccount,  Enterprise enterprise,  EcoSystem system, Network network,Organization organization ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        this.system = system;
        this.userAccount = userAccount;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
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
            row[10] = property.getSeller().getUsername();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBuyHouse = new javax.swing.JButton();
        btnRegistration = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnViewHouseDetails = new javax.swing.JButton();
        btnViewSellerDetails = new javax.swing.JButton();
        hireSPBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 241, 242));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 790, 271));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 50, 80));
        jLabel2.setText("VIEW PROPERTIES");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 30));

        btnBuyHouse.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBuyHouse.setForeground(new java.awt.Color(41, 50, 80));
        btnBuyHouse.setText("Buy House");
        btnBuyHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyHouseActionPerformed(evt);
            }
        });
        add(btnBuyHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 203, -1));

        btnRegistration.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistration.setForeground(new java.awt.Color(41, 50, 80));
        btnRegistration.setText("Registeration Form");
        btnRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrationActionPerformed(evt);
            }
        });
        add(btnRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 201, -1));

        jLabel3.setBackground(new java.awt.Color(241, 241, 242));
        jLabel3.setForeground(new java.awt.Color(41, 50, 80));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/household.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 690, 600));

        btnViewHouseDetails.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewHouseDetails.setForeground(new java.awt.Color(41, 50, 80));
        btnViewHouseDetails.setText("View House Details");
        btnViewHouseDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHouseDetailsActionPerformed(evt);
            }
        });
        add(btnViewHouseDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 203, 32));

        btnViewSellerDetails.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewSellerDetails.setForeground(new java.awt.Color(41, 50, 80));
        btnViewSellerDetails.setText("View Seller Details");
        btnViewSellerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSellerDetailsActionPerformed(evt);
            }
        });
        add(btnViewSellerDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 203, 31));

        hireSPBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        hireSPBtn.setForeground(new java.awt.Color(41, 50, 80));
        hireSPBtn.setText("Hire Services");
        hireSPBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireSPBtnActionPerformed(evt);
            }
        });
        add(hireSPBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 203, -1));

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewHouseDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHouseDetailsActionPerformed
        int selectedRow = houseTable.getSelectedRow();

        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
               CardLayout layout = (CardLayout) userProcessContainer.getLayout();
               String Id = (String) houseTable.getValueAt(selectedRow, 0);
                Property property = propertyDirectory.fetchProperty(Id);
               ViewHouseDetailJPanel viewJPanel = new ViewHouseDetailJPanel(userProcessContainer, property, propertyDirectory, system, userAccount);
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
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to buy the house? Please fill the Property Registration Form first! If you have completed and got it approved please click yes!", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Property property = propertyDirectory.fetchProperty(propertyID);
                property.setStatus("Sold");
                property.setBuyer(userAccount);
                populateRequestTable();
            } else {
                JOptionPane.showMessageDialog(null, "Please click on Registration Form to buy the house!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnBuyHouseActionPerformed

    private void btnViewSellerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSellerDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            UserAccount seller = (UserAccount) houseTable.getValueAt(selectedRow, 10);
            ViewSellerDetailsJPanel viewSellerDetailsJPanel = new ViewSellerDetailsJPanel(userProcessContainer, seller, userAccount, system);
            userProcessContainer.add("viewSellerDetailsJPanel", viewSellerDetailsJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnViewSellerDetailsActionPerformed

    private void btnRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrationActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            String status = (String) houseTable.getValueAt(selectedRow, 9);
            if (!"sold".equalsIgnoreCase(status)) {
                String propertyID = (String) houseTable.getValueAt(selectedRow, 0);
                Property property = propertyDirectory.fetchProperty(propertyID);
                BuyerRegistrationFormJPanel regBuyerPanel = new BuyerRegistrationFormJPanel(userProcessContainer, property, system, userAccount);
                userProcessContainer.add("BuyerRegistrationFormJPanel", regBuyerPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "Sorry the selected house is sold! Choose other vacant houses!.");
            }
        } // TODO add your handling code here:
        else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }

    }//GEN-LAST:event_btnRegistrationActionPerformed

    private void hireSPBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireSPBtnActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();
        if (count == 1) {
            String propertyID = (String) houseTable.getValueAt(selectedRow, 0);
            Property property = propertyDirectory.fetchProperty(propertyID);
            //Buyer buyer = buyerDirectory.searchBuyer(userAccount.getEmployee().getName());
      
            HireServiceJPanel hireServiceJPanel = new HireServiceJPanel(userProcessContainer,organization,network,enterprise, property,system, userAccount);
            userProcessContainer.add("hireServiceJPanel", hireServiceJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        
        }else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_hireSPBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuyHouse;
    private javax.swing.JButton btnRegistration;
    private javax.swing.JButton btnViewHouseDetails;
    private javax.swing.JButton btnViewSellerDetails;
    private javax.swing.JButton hireSPBtn;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
