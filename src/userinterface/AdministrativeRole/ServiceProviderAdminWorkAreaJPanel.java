

package userinterface.AdministrativeRole;

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
 * @author  charmi
 */
public class ServiceProviderAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;
    /** Creates new form AdminWorkAreaJPanel */
    public ServiceProviderAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        manageOrganization();
        
    }
    
    private void manageOrganization(){
        
        ServiceProviderEntManageOrganizationsJPanel pemoj = new ServiceProviderEntManageOrganizationsJPanel(rightSystemAdminPanel, enterprise.getOrganizationDirectory(),enterprise, network, system);
        rightSystemAdminPanel.add("ServiceProvider", pemoj);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    private void manageEmployee(){
       
        ServiceProviderEntManageEmployeesJPanel pemej = new ServiceProviderEntManageEmployeesJPanel(rightSystemAdminPanel, enterprise.getOrganizationDirectory());
        rightSystemAdminPanel.add("ServiceProviderEntManageEmployeesJPanel", pemej);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    private void manageUsers(){
        
        ServiceProviderEntUserAccounts peua = new ServiceProviderEntUserAccounts(rightSystemAdminPanel, enterprise, system, organization);
        rightSystemAdminPanel.add("ServiceProviderEntUserAccounts", peua);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    private void manageRequests(){
       
        ServiceProviderEntWorkRequestJPanel pewrj = new ServiceProviderEntWorkRequestJPanel(rightSystemAdminPanel, account, enterprise, network, system);
        rightSystemAdminPanel.add("ServiceProviderEntWorkRequestJPanel", pewrj);
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
        manageOrganization = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        manageEmployee = new javax.swing.JPanel();
        manageEmployeeLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        manageUserAccount = new javax.swing.JPanel();
        manageUserAccountLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        manageRequestPanel = new javax.swing.JPanel();
        manageRequestLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1338, 840));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(215, 81, 81));
        systemAdminPanel.setMinimumSize(new java.awt.Dimension(1338, 840));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(255, 213, 90));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrganizationPanel.setBackground(new java.awt.Color(255, 213, 90));
        manageOrganizationPanel.setToolTipText("");
        manageOrganizationPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationPanelMousePressed(evt);
            }
        });

        manageOrganization.setBackground(new java.awt.Color(215, 81, 81));
        manageOrganization.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageOrganization.setText("Manage Organization");
        manageOrganization.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageOrganization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(215, 81, 81));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/user_small.png"))); // NOI18N
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout manageOrganizationPanelLayout = new javax.swing.GroupLayout(manageOrganizationPanel);
        manageOrganizationPanel.setLayout(manageOrganizationPanelLayout);
        manageOrganizationPanelLayout.setHorizontalGroup(
            manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageOrganizationPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        manageOrganizationPanelLayout.setVerticalGroup(
            manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageOrganizationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageOrganizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(manageOrganizationPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(manageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
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

        manageEmployeeLabel.setBackground(new java.awt.Color(215, 81, 81));
        manageEmployeeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageEmployeeLabel.setText("Manage Employee");
        manageEmployeeLabel.setAutoscrolls(true);
        manageEmployeeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeeLabelMousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(215, 81, 81));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/employee_small.png"))); // NOI18N

        javax.swing.GroupLayout manageEmployeeLayout = new javax.swing.GroupLayout(manageEmployee);
        manageEmployee.setLayout(manageEmployeeLayout);
        manageEmployeeLayout.setHorizontalGroup(
            manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEmployeeLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageEmployeeLayout.setVerticalGroup(
            manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageEmployeeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(manageEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(manageEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(manageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 280, 40));

        manageUserAccount.setBackground(new java.awt.Color(255, 213, 90));
        manageUserAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageUserAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageUserAccountMousePressed(evt);
            }
        });

        manageUserAccountLabel.setBackground(new java.awt.Color(215, 81, 81));
        manageUserAccountLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageUserAccountLabel.setText("Manage User Account");
        manageUserAccountLabel.setPreferredSize(new java.awt.Dimension(115, 16));

        jLabel6.setBackground(new java.awt.Color(215, 81, 81));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/login_small.png"))); // NOI18N

        javax.swing.GroupLayout manageUserAccountLayout = new javax.swing.GroupLayout(manageUserAccount);
        manageUserAccount.setLayout(manageUserAccountLayout);
        manageUserAccountLayout.setHorizontalGroup(
            manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageUserAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageUserAccountLayout.setVerticalGroup(
            manageUserAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageUserAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageUserAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(manageUserAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("SERVICE PROVIDER ENTERPRISE");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 280, 20));

        manageRequestPanel.setBackground(new java.awt.Color(255, 213, 90));
        manageRequestPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageRequestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageRequestPanelMousePressed(evt);
            }
        });

        manageRequestLabel.setBackground(new java.awt.Color(215, 81, 81));
        manageRequestLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageRequestLabel.setText("Manage Requests");
        manageRequestLabel.setPreferredSize(new java.awt.Dimension(115, 16));

        jLabel7.setBackground(new java.awt.Color(215, 81, 81));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/request_small.png"))); // NOI18N

        javax.swing.GroupLayout manageRequestPanelLayout = new javax.swing.GroupLayout(manageRequestPanel);
        manageRequestPanel.setLayout(manageRequestPanelLayout);
        manageRequestPanelLayout.setHorizontalGroup(
            manageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageRequestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(13, 13, 13)
                .addComponent(manageRequestLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        manageRequestPanelLayout.setVerticalGroup(
            manageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageRequestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageRequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(manageRequestPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addComponent(manageRequestLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageRequestPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 280, 40));

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

    private void manageOrganizationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMousePressed
        manageOrganization();
    }//GEN-LAST:event_manageOrganizationMousePressed

    private void manageOrganizationPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationPanelMousePressed
        // TODO add your handling code here:
        manageOrganization();
    }//GEN-LAST:event_manageOrganizationPanelMousePressed

    private void manageEmployeeLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeLabelMousePressed
        manageEmployee();
    }//GEN-LAST:event_manageEmployeeLabelMousePressed

    private void manageEmployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeMousePressed
        // TODO add your handling code here:
        manageEmployee();
    }//GEN-LAST:event_manageEmployeeMousePressed

    private void manageUserAccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserAccountMousePressed
        manageUsers();
    }//GEN-LAST:event_manageUserAccountMousePressed

    private void manageRequestPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageRequestPanelMousePressed
        // TODO add your handling code here:
        manageRequests();
    }//GEN-LAST:event_manageRequestPanelMousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel manageEmployee;
    private javax.swing.JLabel manageEmployeeLabel;
    private javax.swing.JLabel manageOrganization;
    private javax.swing.JPanel manageOrganizationPanel;
    private javax.swing.JLabel manageRequestLabel;
    private javax.swing.JPanel manageRequestPanel;
    private javax.swing.JPanel manageUserAccount;
    private javax.swing.JLabel manageUserAccountLabel;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables
    
}
