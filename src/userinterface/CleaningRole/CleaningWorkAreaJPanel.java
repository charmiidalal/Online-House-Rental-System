

package userinterface.CleaningRole;

import Business.Buyer.BuyerDirectory;
import Business.CleaningRequest.CleaningRequestDirectory;
import Business.EcoSystem;
import Business.ElectricianRequest.ElectricianRequestDirectory;
import Business.Enterprise.Enterprise;
import Business.Property.PropertyDirectory;
import Business.Seller.SellerDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class CleaningWorkAreaJPanel extends javax.swing.JPanel {
    
   private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private CleaningRequestDirectory cleaningRequestDirectory;
    private SellerDirectory sellerDirectory;
    private PropertyDirectory propertyDirectory;
    private BuyerDirectory buyerDirectory;
    

    /** Creates new form AdminWorkAreaJPanel */
   public CleaningWorkAreaJPanel(JPanel userProcessContainer,EcoSystem system,UserAccount userAccount ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount=userAccount;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        this.buyerDirectory = (system.getBuyerDirectory() == null) ? new BuyerDirectory() : system.getBuyerDirectory();
        this.cleaningRequestDirectory = (system.getCleaningRequestDirectory()== null) ? new CleaningRequestDirectory(): system.getCleaningRequestDirectory();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewJob = new javax.swing.JButton();
        btnManageProfile = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewJob.setText("View Jobs");
        btnViewJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewJobActionPerformed(evt);
            }
        });
        add(btnViewJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 120, -1));

        btnManageProfile.setText("Manage Profile");
        btnManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfileActionPerformed(evt);
            }
        });
        add(btnManageProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewJobActionPerformed
        // TODO add your handling code here:
        ViewDetailsJPanel viewJobsJPanel = new ViewDetailsJPanel(userProcessContainer, system, userAccount);
        userProcessContainer.add("viewDetailsJPanel", viewJobsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewJobActionPerformed

    private void btnManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfileActionPerformed
        // TODO add your handling code here:
        ManageCleaningJPanel manageCleanerProfileJPanel = new ManageCleaningJPanel(userProcessContainer, system, userAccount);
        userProcessContainer.add("ManageCleanerJPanel", manageCleanerProfileJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageProfileActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageProfile;
    private javax.swing.JButton btnViewJob;
    // End of variables declaration//GEN-END:variables
    
}
