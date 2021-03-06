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
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Dinesh
 */
public class HireServiceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HireServiceJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Property property;
    private Enterprise enterprise;
    private Network network;
    private Organization organization;

    public HireServiceJPanel(JPanel userProcessContainer, Organization organization, Network network, Enterprise enterprise, Property property, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        this.property = property;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        rightSystemAdminPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        hirePropertyManager = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        hirePlum = new javax.swing.JButton();
        hireCleaner = new javax.swing.JButton();
        hireEletrician = new javax.swing.JButton();
        agentHire = new javax.swing.JButton();
        hirepackerMover = new javax.swing.JButton();
        hireInspector = new javax.swing.JButton();
        hirePhotograph = new javax.swing.JButton();
        hireBuilder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(241, 241, 242));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 241, 242));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 448, -1, -1));

        hirePropertyManager.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        hirePropertyManager.setForeground(new java.awt.Color(0, 0, 51));
        hirePropertyManager.setText("Hire Property Manager");
        hirePropertyManager.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hirePropertyManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hirePropertyManagerActionPerformed(evt);
            }
        });
        add(hirePropertyManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("SERVICE MANAGEMENT");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        hirePlum.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        hirePlum.setForeground(new java.awt.Color(0, 0, 51));
        hirePlum.setText("Hire Plumber");
        hirePlum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hirePlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hirePlumActionPerformed(evt);
            }
        });
        add(hirePlum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, -1));

        hireCleaner.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        hireCleaner.setForeground(new java.awt.Color(0, 0, 51));
        hireCleaner.setText("Hire Cleaner");
        hireCleaner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hireCleaner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireCleanerActionPerformed(evt);
            }
        });
        add(hireCleaner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, -1));

        hireEletrician.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        hireEletrician.setForeground(new java.awt.Color(0, 0, 51));
        hireEletrician.setText("Hire Electrician");
        hireEletrician.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hireEletrician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireEletricianActionPerformed(evt);
            }
        });
        add(hireEletrician, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 190, -1));

        agentHire.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        agentHire.setForeground(new java.awt.Color(41, 50, 80));
        agentHire.setText("Hire Agent");
        agentHire.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agentHire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentHireActionPerformed(evt);
            }
        });
        add(agentHire, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 180, -1));

        hirepackerMover.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        hirepackerMover.setForeground(new java.awt.Color(0, 0, 51));
        hirepackerMover.setText("Hire Packers Movers");
        hirepackerMover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hirepackerMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hirepackerMoverActionPerformed(evt);
            }
        });
        add(hirepackerMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 200, -1));

        hireInspector.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        hireInspector.setForeground(new java.awt.Color(0, 0, 51));
        hireInspector.setText("Hire Inspector");
        hireInspector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hireInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireInspectorActionPerformed(evt);
            }
        });
        add(hireInspector, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 200, -1));

        hirePhotograph.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        hirePhotograph.setForeground(new java.awt.Color(0, 0, 51));
        hirePhotograph.setText("Hire Photographer");
        hirePhotograph.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hirePhotograph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hirePhotographActionPerformed(evt);
            }
        });
        add(hirePhotograph, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 200, -1));

        hireBuilder.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        hireBuilder.setForeground(new java.awt.Color(0, 0, 51));
        hireBuilder.setText("Hire Builder");
        hireBuilder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hireBuilder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireBuilderActionPerformed(evt);
            }
        });
        add(hireBuilder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 190, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/property_manager.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 500, 510));
    }// </editor-fold>//GEN-END:initComponents


    private void hirePropertyManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirePropertyManagerActionPerformed
        HiremanagerJPanel hireServiceJPanel = new HiremanagerJPanel(userProcessContainer, organization, network, enterprise, property, userAccount, system);
        userProcessContainer.add("managerActivity", hireServiceJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hirePropertyManagerActionPerformed

    private void hirePlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirePlumActionPerformed
        // TODO add your handling code here:
        HirePlumberJPanel hireService = new HirePlumberJPanel(userProcessContainer, organization, network, enterprise, property, userAccount, system);
        userProcessContainer.add("plumberWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hirePlumActionPerformed

    private void hireCleanerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireCleanerActionPerformed
        // TODO add your handling code here:
        HireCleanerJPanel hireService = new HireCleanerJPanel(userProcessContainer, organization, network, enterprise, property, userAccount, system);
        userProcessContainer.add("CleaningWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hireCleanerActionPerformed

    private void hireEletricianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireEletricianActionPerformed
        // TODO add your handling code here:
        HireElectricianJPanel hireService = new HireElectricianJPanel(userProcessContainer, organization, network, enterprise, property, userAccount, system);
        userProcessContainer.add("ElectricianWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hireEletricianActionPerformed

    private void hirepackerMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirepackerMoverActionPerformed
        // TODO add your handling code here:
         HirePackersJPanel hireService = new HirePackersJPanel(userProcessContainer, organization, network, enterprise, property, userAccount, system);
        userProcessContainer.add("HirePackersJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hirepackerMoverActionPerformed

    private void hireInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireInspectorActionPerformed
        // TODO add your handling code here:
        HireInspectorJPanel hireServiceJPanel = new HireInspectorJPanel(userProcessContainer,organization, network, enterprise, property,userAccount, system);
        userProcessContainer.add("managerActivity", hireServiceJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hireInspectorActionPerformed

    private void hirePhotographActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirePhotographActionPerformed
        // TODO add your handling code here:
        HirePhotoJPanel hireService = new HirePhotoJPanel(userProcessContainer, organization, network, enterprise, property, userAccount, system);
        userProcessContainer.add("PhotoWorkAreaJPanel", hireService);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hirePhotographActionPerformed

    private void hireBuilderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireBuilderActionPerformed
        // TODO add your handling code here:
        
        HireBuilder hireBuilder = new HireBuilder(userProcessContainer, organization, network, enterprise,property, userAccount, system);
        userProcessContainer.add("hireBuilder", hireBuilder);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hireBuilderActionPerformed
    
    private void hireAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agentHireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentHireActionPerformed
        // TODO add your handling code here:
        HireAgentJPanel hireAgent = new HireAgentJPanel(userProcessContainer, organization, network, enterprise,property, userAccount, system);
        userProcessContainer.add("HireAgentJPanel", hireAgent);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_agentHireActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agentHire;
    private javax.swing.JButton hireBuilder;
    private javax.swing.JButton hireCleaner;
    private javax.swing.JButton hireEletrician;
    private javax.swing.JButton hireInspector;
    private javax.swing.JButton hirePhotograph;
    private javax.swing.JButton hirePlum;
    private javax.swing.JButton hirePropertyManager;
    private javax.swing.JButton hirepackerMover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel rightSystemAdminPanel;
    // End of variables declaration//GEN-END:variables

}
