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
        bttnManageOrganization = new rojerusan.RSMaterialButtonRectangle();
        bttnManageUser = new rojerusan.RSMaterialButtonRectangle();
        bttnManageEmployee1 = new rojerusan.RSMaterialButtonRectangle();
        bttnVolunteerApproval = new rojerusan.RSMaterialButtonRectangle();
        bttnHealthCampRequest = new rojerusan.RSMaterialButtonRectangle();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        bttnManageOrganization.setBackground(new java.awt.Color(15, 19, 52));
        bttnManageOrganization.setText("Manage Organization");
        bttnManageOrganization.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnManageOrganizationActionPerformed(evt);
            }
        });

        bttnManageUser.setBackground(new java.awt.Color(15, 19, 52));
        bttnManageUser.setText("Manage User");
        bttnManageUser.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnManageUserActionPerformed(evt);
            }
        });

        bttnManageEmployee1.setBackground(new java.awt.Color(15, 19, 52));
        bttnManageEmployee1.setText("Manage Employee");
        bttnManageEmployee1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnManageEmployee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnManageEmployee1ActionPerformed(evt);
            }
        });

        bttnVolunteerApproval.setBackground(new java.awt.Color(15, 19, 52));
        bttnVolunteerApproval.setText("Volunteer Approval");
        bttnVolunteerApproval.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnVolunteerApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnVolunteerApprovalActionPerformed(evt);
            }
        });

        bttnHealthCampRequest.setBackground(new java.awt.Color(15, 19, 52));
        bttnHealthCampRequest.setText("Health Camp Request");
        bttnHealthCampRequest.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnHealthCampRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnHealthCampRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnHealthCampRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnVolunteerApproval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnManageEmployee1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnManageEmployee1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnVolunteerApproval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnHealthCampRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnManageOrganizationActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bttnManageOrganizationActionPerformed

    private void bttnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnManageUserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bttnManageUserActionPerformed

    private void bttnManageEmployee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnManageEmployee1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_bttnManageEmployee1ActionPerformed

    private void bttnVolunteerApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnVolunteerApprovalActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_bttnVolunteerApprovalActionPerformed

    private void bttnHealthCampRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnHealthCampRequestActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_bttnHealthCampRequestActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttnHealthCampRequest;
    private rojerusan.RSMaterialButtonRectangle bttnManageEmployee1;
    private rojerusan.RSMaterialButtonRectangle bttnManageOrganization;
    private rojerusan.RSMaterialButtonRectangle bttnManageUser;
    private rojerusan.RSMaterialButtonRectangle bttnVolunteerApproval;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel valueLabel1;
    // End of variables declaration//GEN-END:variables
}
