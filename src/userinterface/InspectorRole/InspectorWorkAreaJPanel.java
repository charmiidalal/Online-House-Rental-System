package userinterface.InspectorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author DInesh
 */
public class InspectorWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public InspectorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        manageJobs();
    }

    private void manageJobs() {
        ViewJobsJPanel viewJobsJPanel = new ViewJobsJPanel(rightSystemAdminPanel, enterprise, account, system);
        rightSystemAdminPanel.add("viewJobsJPanel", viewJobsJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void manageProfile() {
        ManageInspectorProfileJPanel manageInspectorProfileJPanel = new ManageInspectorProfileJPanel(rightSystemAdminPanel, enterprise, account, system);
        rightSystemAdminPanel.add("manageInspectorProfileJPanel", manageInspectorProfileJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        manageInspectorProfile = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageProfileLabel = new javax.swing.JLabel();
        manageJobs = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        manageJobsLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1338, 840));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(241, 241, 242));
        systemAdminPanel.setMinimumSize(new java.awt.Dimension(1338, 840));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(255, 213, 90));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageInspectorProfile.setBackground(new java.awt.Color(255, 213, 90));
        manageInspectorProfile.setToolTipText("");
        manageInspectorProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageInspectorProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageInspectorProfileMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 213, 90));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/management.png"))); // NOI18N
        jLabel2.setToolTipText("");

        manageProfileLabel.setBackground(new java.awt.Color(255, 213, 90));
        manageProfileLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageProfileLabel.setText("Manage Profile");
        manageProfileLabel.setAutoscrolls(true);
        manageProfileLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageProfileLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageInspectorProfileLayout = new javax.swing.GroupLayout(manageInspectorProfile);
        manageInspectorProfile.setLayout(manageInspectorProfileLayout);
        manageInspectorProfileLayout.setHorizontalGroup(
            manageInspectorProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageInspectorProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageProfileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        manageInspectorProfileLayout.setVerticalGroup(
            manageInspectorProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageInspectorProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageInspectorProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageProfileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageInspectorProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, -1));

        manageJobs.setBackground(new java.awt.Color(255, 213, 90));
        manageJobs.setToolTipText("");
        manageJobs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageJobs.setPreferredSize(new java.awt.Dimension(264, 48));
        manageJobs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageJobsMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 213, 90));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/request.png"))); // NOI18N

        manageJobsLbl.setBackground(new java.awt.Color(255, 213, 90));
        manageJobsLbl.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageJobsLbl.setText("Manage Jobs");
        manageJobsLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageJobsLblMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageJobsLayout = new javax.swing.GroupLayout(manageJobs);
        manageJobs.setLayout(manageJobsLayout);
        manageJobsLayout.setHorizontalGroup(
            manageJobsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageJobsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageJobsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageJobsLayout.setVerticalGroup(
            manageJobsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(manageJobsLayout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(manageJobsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(manageJobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 280, 60));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("INSPECTOR MANAGEMENT");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 20));

        rightSystemAdminPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageJobsLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageJobsLblMousePressed
        manageJobs();
    }//GEN-LAST:event_manageJobsLblMousePressed

    private void manageInspectorProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageInspectorProfileMousePressed
        // TODO add your handling code here:
        manageProfile();
    }//GEN-LAST:event_manageInspectorProfileMousePressed

    private void manageProfileLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProfileLabelMousePressed
        manageProfile();
    }//GEN-LAST:event_manageProfileLabelMousePressed

    private void manageJobsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageJobsMousePressed
        // TODO add your handling code here:
        manageJobs();
    }//GEN-LAST:event_manageJobsMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel manageInspectorProfile;
    private javax.swing.JPanel manageJobs;
    private javax.swing.JLabel manageJobsLbl;
    private javax.swing.JLabel manageProfileLabel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables

}
