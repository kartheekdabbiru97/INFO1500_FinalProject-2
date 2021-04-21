/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeCampRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ashishroy
 */
public class AdminWorkCampAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    EcoSystem ecosystem;
    Network network;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
        public AdminWorkCampAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account,Network network,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.ecosystem = ecosystem;
        this.network = network;
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
        jLabel2 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        valueLabel1 = new javax.swing.JLabel();
        bttnManageOrganizationCopy = new rojerusan.RSMaterialButtonRectangle();
        bttnManageEmployeeCopy = new rojerusan.RSMaterialButtonRectangle();
        bttnManageUserCopy = new rojerusan.RSMaterialButtonRectangle();
        bttnVolunteerApprovalCopy = new rojerusan.RSMaterialButtonRectangle();
        bttnHealthCampRequestCopy = new rojerusan.RSMaterialButtonRectangle();


        setBackground(new java.awt.Color(232, 243, 255));

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HEALTHCAMP ADMINISTRATOR HOME");

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel1.setText("ENTERPRISE:");

        valueLabel1.setBackground(new java.awt.Color(255, 255, 255));
        valueLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        valueLabel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bttnManageOrganizationCopy.setBackground(new java.awt.Color(15, 19, 52));
        bttnManageOrganizationCopy.setText("manage organization");
        bttnManageOrganizationCopy.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnManageOrganizationCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnManageOrganizationCopyActionPerformed(evt);
            }
        });

        bttnManageEmployeeCopy.setBackground(new java.awt.Color(15, 19, 52));
        bttnManageEmployeeCopy.setText("Manage Employee");
        bttnManageEmployeeCopy.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnManageEmployeeCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnManageEmployeeCopyActionPerformed(evt);
            }
        });

        bttnManageUserCopy.setBackground(new java.awt.Color(15, 19, 52));
        bttnManageUserCopy.setText("Manage User");
        bttnManageUserCopy.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnManageUserCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnManageUserCopyActionPerformed(evt);
            }
        });

        bttnVolunteerApprovalCopy.setBackground(new java.awt.Color(15, 19, 52));
        bttnVolunteerApprovalCopy.setText("Volunteer Approval");
        bttnVolunteerApprovalCopy.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnVolunteerApprovalCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnVolunteerApprovalCopyActionPerformed(evt);
            }
        });

        bttnHealthCampRequestCopy.setBackground(new java.awt.Color(15, 19, 52));
        bttnHealthCampRequestCopy.setText("Health Camp Request");
        bttnHealthCampRequestCopy.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnHealthCampRequestCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnHealthCampRequestCopyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnVolunteerApprovalCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnManageUserCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnManageEmployeeCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnManageOrganizationCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnHealthCampRequestCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnManageOrganizationCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnManageEmployeeCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnManageUserCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnVolunteerApprovalCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnHealthCampRequestCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))

        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttnManageOrganizationCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnManageOrganizationCopyActionPerformed
        // TODO add your handling code here:
        //Donot Write here, can't delete this
    }//GEN-LAST:event_bttnManageOrganizationCopyActionPerformed

    private void bttnManageUserCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnManageUserCopyActionPerformed
        // TODO add your handling code here:
        //Donot Write here, can't delete this
    }//GEN-LAST:event_bttnManageUserCopyActionPerformed

    private void bttnManageEmployee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnManageEmployee1ActionPerformed
        // TODO add your handling code here:
        //Donot Write here, can't delete this

    }//GEN-LAST:event_bttnManageEmployee1ActionPerformed

    private void bttnVolunteerApprovalCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnVolunteerApprovalCopyActionPerformed
        // TODO add your handling code here:
        //Donot Write here, can't delete this
    }//GEN-LAST:event_bttnVolunteerApprovalCopyActionPerformed

    private void bttnHealthCampRequestCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnHealthCampRequestCopyActionPerformed
        // TODO add your handling code here:
        //Donot Write here, can't delete this
    }//GEN-LAST:event_bttnHealthCampRequestCopyActionPerformed

    private void bttnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnManageNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnManageNetworkActionPerformed

    private void bttnManageEmployeeCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnManageEmployeeCopyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnManageEmployeeCopyActionPerformed

    private void bttnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnManageEnterpriseAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnManageEnterpriseAdminActionPerformed

    private void bttnVolunteerApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnPatientFundRequestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnPatientFundRequestActionPerformed


    private void bttnHealthCampRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnPayPatientBillsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnPayPatientBillsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttnHealthCampRequestCopy;
    private rojerusan.RSMaterialButtonRectangle bttnManageEmployeeCopy;
    private rojerusan.RSMaterialButtonRectangle bttnManageOrganizationCopy;
    private rojerusan.RSMaterialButtonRectangle bttnManageUserCopy;
    private rojerusan.RSMaterialButtonRectangle bttnVolunteerApprovalCopy;

    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel valueLabel1;
    // End of variables declaration//GEN-END:variables
}
