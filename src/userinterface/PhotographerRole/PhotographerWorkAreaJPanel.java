

package userinterface.PhotographerRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class PhotographerWorkAreaJPanel extends javax.swing.JPanel {
    
    private final JPanel userProcessContainer;
    private final EcoSystem business;
    private UserAccount userAccount;

    public PhotographerWorkAreaJPanel(JPanel userProcessContainer, EcoSystem business, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnViewProfile = new javax.swing.JButton();
        btnViewJob = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Photographer Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        btnViewProfile.setText("View Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });
        add(btnViewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        btnViewJob.setText("View Jobs");
        btnViewJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewJobActionPerformed(evt);
            }
        });
        add(btnViewJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        // TODO add your handling code here:
        ManagePhotographerProfileJPanel managePhotographerProfileJPanel = new ManagePhotographerProfileJPanel(userProcessContainer, business, userAccount);
        userProcessContainer.add("managePhotographerProfileJPanel", managePhotographerProfileJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnViewJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewJobActionPerformed
        // TODO add your handling code here:
        ViewJobJPanel viewJobsJPanel = new ViewJobJPanel(userProcessContainer, business, userAccount);
        userProcessContainer.add("ViewJobJPanel", viewJobsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewJobActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewJob;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
