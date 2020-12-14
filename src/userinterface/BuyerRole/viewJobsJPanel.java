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
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Dinesh
 */
public class viewJobsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewJobsJPanel
     */
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
    public viewJobsJPanel(JPanel userProcess, UserAccount userAccount, Enterprise enterprise, EcoSystem system, Network network, Organization organization) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        this.network = network;
        this.organization = organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHireInspector1 = new javax.swing.JButton();
        btnViewElectrician = new javax.swing.JButton();
        btnViewPlumber = new javax.swing.JButton();
        btnViewPacker = new javax.swing.JButton();
        btnViewPhoto = new javax.swing.JButton();
        btnViewCleaner = new javax.swing.JButton();
        btnViewManager = new javax.swing.JButton();
        btnViewBuilder = new javax.swing.JButton();
        agentJob = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnViewLoanRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 241, 242));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHireInspector1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnHireInspector1.setForeground(new java.awt.Color(41, 50, 80));
        btnHireInspector1.setText("View Inspector Jobs");
        btnHireInspector1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHireInspector1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHireInspector1ActionPerformed(evt);
            }
        });
        add(btnHireInspector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 174, -1));

        btnViewElectrician.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewElectrician.setForeground(new java.awt.Color(41, 50, 80));
        btnViewElectrician.setText("View Electrician Jobs");
        btnViewElectrician.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewElectrician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewElectricianActionPerformed(evt);
            }
        });
        add(btnViewElectrician, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 174, -1));

        btnViewPlumber.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewPlumber.setForeground(new java.awt.Color(41, 50, 80));
        btnViewPlumber.setText("View Plumber Jobs");
        btnViewPlumber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewPlumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPlumberActionPerformed(evt);
            }
        });
        add(btnViewPlumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 174, -1));

        btnViewPacker.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewPacker.setForeground(new java.awt.Color(41, 50, 80));
        btnViewPacker.setText("View Packer Jobs");
        btnViewPacker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewPacker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPackerActionPerformed(evt);
            }
        });
        add(btnViewPacker, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 174, -1));

        btnViewPhoto.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewPhoto.setForeground(new java.awt.Color(41, 50, 80));
        btnViewPhoto.setText("View Photographer Jobs");
        btnViewPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPhotoActionPerformed(evt);
            }
        });
        add(btnViewPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 190, -1));

        btnViewCleaner.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewCleaner.setForeground(new java.awt.Color(41, 50, 80));
        btnViewCleaner.setText("View Cleaner Jobs");
        btnViewCleaner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewCleaner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCleanerActionPerformed(evt);
            }
        });
        add(btnViewCleaner, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 190, -1));

        btnViewManager.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewManager.setForeground(new java.awt.Color(41, 50, 80));
        btnViewManager.setText("View Property Manager Jobs");
        btnViewManager.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewManagerActionPerformed(evt);
            }
        });
        add(btnViewManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 240, -1));

        btnViewBuilder.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewBuilder.setForeground(new java.awt.Color(41, 50, 80));
        btnViewBuilder.setText("View Builder Jobs");
        btnViewBuilder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewBuilder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBuilderActionPerformed(evt);
            }
        });
        add(btnViewBuilder, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 190, -1));

        agentJob.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        agentJob.setForeground(new java.awt.Color(41, 50, 80));
        agentJob.setText("View Agent Jobs");
        agentJob.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agentJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentJobActionPerformed(evt);
            }
        });
        add(agentJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/jobs.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        btnViewLoanRequest.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnViewLoanRequest.setForeground(new java.awt.Color(41, 50, 80));
        btnViewLoanRequest.setText("View Loan Requests");
        btnViewLoanRequest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewLoanRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewLoanRequestActionPerformed(evt);
            }
        });
        add(btnViewLoanRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnHireInspector1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHireInspector1ActionPerformed
        // TODO add your handling code here:
        ManageInspectorActivity manageInspectorActivity = new ManageInspectorActivity(userProcessContainer, userAccount, system, enterprise, network, organization);
        userProcessContainer.add("manageInspectorActivity", manageInspectorActivity);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnHireInspector1ActionPerformed

    private void btnViewElectricianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewElectricianActionPerformed
        ManageElectricianActivity manageElectricianActivity = new ManageElectricianActivity(userProcessContainer, userAccount, system, enterprise, network, organization);
        userProcessContainer.add("manageElectricianActivity", manageElectricianActivity);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewElectricianActionPerformed

    private void btnViewPlumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPlumberActionPerformed
        ManagePlumberActivity managePlumberActivity = new ManagePlumberActivity(userProcessContainer, userAccount, system, enterprise, network, organization);
        userProcessContainer.add("ManagePlumberActivity", managePlumberActivity);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewPlumberActionPerformed

    private void btnViewPackerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPackerActionPerformed
        ManagePackerActivity managePackerActivity = new ManagePackerActivity(userProcessContainer, userAccount, system, enterprise, network, organization);
        userProcessContainer.add("ManagePackerActivity", managePackerActivity);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewPackerActionPerformed

    private void btnViewPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPhotoActionPerformed
        ManagePhotoActivity ManagePhotoActivity = new ManagePhotoActivity(userProcessContainer, userAccount, system, enterprise, network, organization);
        userProcessContainer.add("ManagePhotoActivity", ManagePhotoActivity);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewPhotoActionPerformed

    private void btnViewCleanerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCleanerActionPerformed
        ManageCleanerActivity ManageCleanerActivity = new ManageCleanerActivity(userProcessContainer, userAccount, system, enterprise, network, organization);
        userProcessContainer.add("ManageCleanerActivity", ManageCleanerActivity);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewCleanerActionPerformed

    private void btnViewManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewManagerActionPerformed
        ManageManagerActivity manageManagerActivity = new ManageManagerActivity(userProcessContainer, userAccount, system, enterprise, network, organization);
        userProcessContainer.add("ManageManagerActivity", manageManagerActivity);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewManagerActionPerformed

    private void btnViewBuilderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBuilderActionPerformed
        ManageBuilderActivity manageManagerActivity = new ManageBuilderActivity(userProcessContainer, userAccount, system, enterprise, network, organization);
        userProcessContainer.add("ManageManagerActivity", manageManagerActivity);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewBuilderActionPerformed

    private void agentJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentJobActionPerformed
        // TODO add your handling code here:
        ManageAgentActivity manageAgentActivity = new ManageAgentActivity(userProcessContainer, userAccount, system, enterprise, network, organization);
        userProcessContainer.add("ManageAgentActivity", manageAgentActivity);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_agentJobActionPerformed

    private void btnViewLoanRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewLoanRequestActionPerformed
        // TODO add your handling code here:
        ManageLoanActivity manageLoanActivity = new ManageLoanActivity(userProcessContainer, userAccount, system, enterprise, network, organization);
        userProcessContainer.add("manageLoanActivity", manageLoanActivity);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewLoanRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agentJob;
    private javax.swing.JButton btnHireInspector1;
    private javax.swing.JButton btnViewBuilder;
    private javax.swing.JButton btnViewCleaner;
    private javax.swing.JButton btnViewElectrician;
    private javax.swing.JButton btnViewLoanRequest;
    private javax.swing.JButton btnViewManager;
    private javax.swing.JButton btnViewPacker;
    private javax.swing.JButton btnViewPhoto;
    private javax.swing.JButton btnViewPlumber;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
