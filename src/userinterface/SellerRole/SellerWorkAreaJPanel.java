/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SellerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;


import Business.Seller.SellerDirectory;
import Business.UserAccount.UserAccount;
import java.awt.Color;

import javax.swing.JPanel;

/**
 *
 * @author anusha
 */
public class SellerWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
   private Network network;
    private Organization organization;
    private SellerDirectory sellerDirectory;
    /**
     * Creates new form SellerWorkAreaJPanel
     */
    private Enterprise enterprise;
    private UserAccount useraccount;
    private EcoSystem system;
    
    public SellerWorkAreaJPanel(JPanel userProcessContainer, UserAccount useraccount, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
        this.sellerDirectory = (system.getSellerDirectory() == null) ? new SellerDirectory() : system.getSellerDirectory();
        
       
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AdvrtJPanel = new javax.swing.JPanel();
        btnAdvrt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        mngBuyerJPanel = new javax.swing.JPanel();
        btnBuyers = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        MngProfileJPanel = new javax.swing.JPanel();
        btnManageProfile = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        MngHousesJPanel = new javax.swing.JPanel();
        btnManageHouse = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));

        AdvrtJPanel.setBackground(new java.awt.Color(255, 102, 102));

        btnAdvrt.setBackground(new java.awt.Color(255, 102, 102));
        btnAdvrt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdvrt.setText("Create Advertise");
        btnAdvrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvrtActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(215, 81, 81));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/best.png"))); // NOI18N

        javax.swing.GroupLayout AdvrtJPanelLayout = new javax.swing.GroupLayout(AdvrtJPanel);
        AdvrtJPanel.setLayout(AdvrtJPanelLayout);
        AdvrtJPanelLayout.setHorizontalGroup(
            AdvrtJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdvrtJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnAdvrt, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AdvrtJPanelLayout.setVerticalGroup(
            AdvrtJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdvrtJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AdvrtJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdvrtJPanelLayout.createSequentialGroup()
                        .addComponent(btnAdvrt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdvrtJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
        );

        mngBuyerJPanel.setBackground(new java.awt.Color(255, 102, 102));

        btnBuyers.setBackground(new java.awt.Color(255, 102, 102));
        btnBuyers.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuyers.setText("Manage Buyers");
        btnBuyers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyersActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/department.png"))); // NOI18N
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout mngBuyerJPanelLayout = new javax.swing.GroupLayout(mngBuyerJPanel);
        mngBuyerJPanel.setLayout(mngBuyerJPanelLayout);
        mngBuyerJPanelLayout.setHorizontalGroup(
            mngBuyerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mngBuyerJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuyers, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mngBuyerJPanelLayout.setVerticalGroup(
            mngBuyerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngBuyerJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(mngBuyerJPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnBuyers, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MngProfileJPanel.setBackground(new java.awt.Color(255, 102, 102));

        btnManageProfile.setBackground(new java.awt.Color(255, 102, 102));
        btnManageProfile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnManageProfile.setText("Manage Profile");
        btnManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfileActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(215, 81, 81));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/manager24x.png"))); // NOI18N

        javax.swing.GroupLayout MngProfileJPanelLayout = new javax.swing.GroupLayout(MngProfileJPanel);
        MngProfileJPanel.setLayout(MngProfileJPanelLayout);
        MngProfileJPanelLayout.setHorizontalGroup(
            MngProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MngProfileJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MngProfileJPanelLayout.setVerticalGroup(
            MngProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MngProfileJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MngProfileJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addGroup(MngProfileJPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnManageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        MngHousesJPanel.setBackground(new java.awt.Color(255, 102, 102));

        btnManageHouse.setBackground(new java.awt.Color(255, 102, 102));
        btnManageHouse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnManageHouse.setText("Manage Houses");
        btnManageHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHouseActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-houses-48.png"))); // NOI18N

        javax.swing.GroupLayout MngHousesJPanelLayout = new javax.swing.GroupLayout(MngHousesJPanel);
        MngHousesJPanel.setLayout(MngHousesJPanelLayout);
        MngHousesJPanelLayout.setHorizontalGroup(
            MngHousesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MngHousesJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnManageHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MngHousesJPanelLayout.setVerticalGroup(
            MngHousesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MngHousesJPanelLayout.createSequentialGroup()
                .addGroup(MngHousesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MngHousesJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnManageHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MngHousesJPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("                      SELLER ENTERPRISE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MngHousesJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(MngProfileJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mngBuyerJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdvrtJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdvrtJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mngBuyerJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MngProfileJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(MngHousesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdvrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvrtActionPerformed
        // TODO add your handling code here:
        AdvrtJPanel.setBackground(new Color(236,113,107));
        MngHousesJPanel.setBackground(new Color(215,81,81));
        mngBuyerJPanel.setBackground(new Color(215,81,81));
        MngProfileJPanel.setBackground(new Color(215,81,81));
        CreateAdvertiseJPanel advrtPanel = new CreateAdvertiseJPanel(userProcessContainer,enterprise,useraccount,sellerDirectory,system);
        userProcessContainer.add("CreateAdvertiseJPanel", advrtPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAdvrtActionPerformed

    private void btnBuyersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyersActionPerformed
        // TODO add your handling code here:
          AdvrtJPanel.setBackground(new Color(236,113,107));
        MngHousesJPanel.setBackground(new Color(215,81,81));
        mngBuyerJPanel.setBackground(new Color(215,81,81));
        MngProfileJPanel.setBackground(new Color(215,81,81));
       // ManageBuyerJPanel mngBuyerPanel = new ManageBuyerJPanel(userProcessContainer,enterprise,useraccount,property,system);
      // userProcessContainer.add("ManageBuyerJPanel", mngBuyerPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBuyersActionPerformed

    private void btnManageHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHouseActionPerformed
        // TODO add your handling code here:
          AdvrtJPanel.setBackground(new Color(236,113,107));
        MngHousesJPanel.setBackground(new Color(215,81,81));
        mngBuyerJPanel.setBackground(new Color(215,81,81));
        MngProfileJPanel.setBackground(new Color(215,81,81));
         ManageHouseJPanel mngHousesPanel = new ManageHouseJPanel(userProcessContainer,enterprise,useraccount,sellerDirectory,system);
        userProcessContainer.add("ManageHouseJPanel", mngHousesPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageHouseActionPerformed

    private void btnManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfileActionPerformed
        // TODO add your handling code here:
          AdvrtJPanel.setBackground(new Color(236,113,107));
        MngHousesJPanel.setBackground(new Color(215,81,81));
        mngBuyerJPanel.setBackground(new Color(215,81,81));
        MngProfileJPanel.setBackground(new Color(215,81,81));
        ManageSellerProfileJPanel manageSellerProfileJPanel = new ManageSellerProfileJPanel(userProcessContainer,system,useraccount);
        userProcessContainer.add("ManageInspectorJPanel", manageSellerProfileJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdvrtJPanel;
    private javax.swing.JPanel MngHousesJPanel;
    private javax.swing.JPanel MngProfileJPanel;
    private javax.swing.JButton btnAdvrt;
    private javax.swing.JButton btnBuyers;
    private javax.swing.JButton btnManageHouse;
    private javax.swing.JButton btnManageProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mngBuyerJPanel;
    // End of variables declaration//GEN-END:variables
}
