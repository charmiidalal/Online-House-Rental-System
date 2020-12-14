

package userinterface.ElectricianRole;

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
 * @author  Dinesh
 */
public class ElectricianWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public ElectricianWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        manageAdvertise();

    }

    private void manageAdvertise() {
        
        ViewElectricianJobsJPanel viewJobsJPanel = new ViewElectricianJobsJPanel(rightSystemAdminPanel, enterprise, account, system);
        rightSystemAdminPanel.add("viewJobsJPanel",viewJobsJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void manageBuyers() {
       
        ManageElectricianJPanel manageProfileJPanel = new ManageElectricianJPanel(rightSystemAdminPanel, enterprise, account, system);
        rightSystemAdminPanel.add("manageElectricianProfileJPanel", manageProfileJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        manageOrganizationPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageEmployeeLabel = new javax.swing.JLabel();
        manageEmployee = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        manageOrganization = new javax.swing.JLabel();
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
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrganizationPanel.setBackground(new java.awt.Color(255, 213, 90));
        manageOrganizationPanel.setToolTipText("");
        manageOrganizationPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageOrganizationPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationPanelMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(215, 81, 81));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/management.png"))); // NOI18N
        jLabel2.setToolTipText("");

        manageEmployeeLabel.setBackground(new java.awt.Color(215, 81, 81));
        manageEmployeeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageEmployeeLabel.setText("Manage Profile");
        manageEmployeeLabel.setAutoscrolls(true);
        manageEmployeeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageEmployeeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeeLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageOrganizationPanelLayout = new javax.swing.GroupLayout(manageOrganizationPanel);
        manageOrganizationPanel.setLayout(manageOrganizationPanelLayout);
        manageOrganizationPanelLayout.setHorizontalGroup(
            manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrganizationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageOrganizationPanelLayout.setVerticalGroup(
            manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageOrganizationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(manageOrganizationPanelLayout.createSequentialGroup()
                        .addComponent(manageEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.add(manageOrganizationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, -1));

        manageEmployee.setBackground(new java.awt.Color(255, 213, 90));
        manageEmployee.setToolTipText("");
        manageEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageEmployee.setPreferredSize(new java.awt.Dimension(264, 48));
        manageEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeeMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(215, 81, 81));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/request.png"))); // NOI18N

        manageOrganization.setBackground(new java.awt.Color(215, 81, 81));
        manageOrganization.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageOrganization.setText("Manage Jobs");
        manageOrganization.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageOrganization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageEmployeeLayout = new javax.swing.GroupLayout(manageEmployee);
        manageEmployee.setLayout(manageEmployeeLayout);
        manageEmployeeLayout.setHorizontalGroup(
            manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(manageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageEmployeeLayout.setVerticalGroup(
            manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(manageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, 280, 70));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("ELECTRICIAN MANAGEMENT");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 190, 20));

        rightSystemAdminPanel.setBackground(new java.awt.Color(241, 241, 242));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void manageOrganizationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMousePressed
        manageAdvertise();
    }//GEN-LAST:event_manageOrganizationMousePressed

    private void manageOrganizationPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationPanelMousePressed
        // TODO add your handling code here:
       manageBuyers();
    }//GEN-LAST:event_manageOrganizationPanelMousePressed

    private void manageEmployeeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeLabelMousePressed
        manageBuyers();
    }//GEN-LAST:event_manageEmployeeLabelMousePressed

    private void manageEmployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeMousePressed
        // TODO add your handling code here:
        manageAdvertise();
    }//GEN-LAST:event_manageEmployeeMousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel manageEmployee;
    private javax.swing.JLabel manageEmployeeLabel;
    private javax.swing.JLabel manageOrganization;
    private javax.swing.JPanel manageOrganizationPanel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
    
}
