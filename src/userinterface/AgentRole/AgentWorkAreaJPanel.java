

package userinterface.AgentRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class AgentWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    private EcoSystem system;
    private UserAccount userAccount;
    /** Creates new form AdminWorkAreaJPanel */
    public AgentWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = userAccount;
        //valueLabel.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageProfile = new javax.swing.JButton();
        btnViewJobs = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageProfile.setText("Manage Profile");
        btnManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfileActionPerformed(evt);
            }
        });
        add(btnManageProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 130, 30));

        btnViewJobs.setText("View Jobs");
        btnViewJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewJobsActionPerformed(evt);
            }
        });
        add(btnViewJobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfileActionPerformed
        ManageAgentJPanel manageAgentJPanel = new ManageAgentJPanel(userProcessContainer, system, userAccount);
        userProcessContainer.add("manageAgentJPanel", manageAgentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageProfileActionPerformed

    private void btnViewJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewJobsActionPerformed
        ViewAgentJobJPanel viewAgentJobJPanel = new ViewAgentJobJPanel(userProcessContainer, system, userAccount);
        userProcessContainer.add("ViewAgentJobJPanel", viewAgentJobJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewJobsActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageProfile;
    private javax.swing.JButton btnViewJobs;
    // End of variables declaration//GEN-END:variables
    
}
