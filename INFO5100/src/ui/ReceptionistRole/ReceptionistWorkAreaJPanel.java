/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ReceptionistRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class ReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ReceptionistOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem eco;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public ReceptionistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ReceptionistOrganization organization, Enterprise enterprise, Network network, EcoSystem eco) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.eco = eco;
        this.valueLabel.setText(this.enterprise.getName());
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
        jLabel5 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        bttnManageOrganization = new rojerusan.RSMaterialButtonRectangle();
        bttnManageOrganization1 = new rojerusan.RSMaterialButtonRectangle();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(235, 122, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("PATIENT BILL GENERATION");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(51, 51, 51));
        enterpriseLabel.setText("ENTERPRISE:");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(51, 51, 51));
        valueLabel.setText("<value>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(enterpriseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        bttnManageOrganization.setBackground(new java.awt.Color(235, 122, 102));
        bttnManageOrganization.setForeground(new java.awt.Color(51, 51, 51));
        bttnManageOrganization.setText("Patient Request");
        bttnManageOrganization.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnManageOrganizationActionPerformed(evt);
            }
        });

        bttnManageOrganization1.setBackground(new java.awt.Color(235, 122, 102));
        bttnManageOrganization1.setForeground(new java.awt.Color(51, 51, 51));
        bttnManageOrganization1.setText("Patient Fees");
        bttnManageOrganization1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnManageOrganization1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnManageOrganization1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnManageOrganization1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnManageOrganization1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnManageOrganizationActionPerformed
        NGOPatientRequest requestPanel = new NGOPatientRequest(userProcessContainer, userAccount, organization, enterprise, eco);
        userProcessContainer.add("NGOPatientRequest", requestPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_bttnManageOrganizationActionPerformed

    private void bttnManageOrganization1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnManageOrganization1ActionPerformed
        // TODO add your handling code here:
        PatientSubmission payPanel = new PatientSubmission(userProcessContainer, userAccount, organization, enterprise, eco);
        userProcessContainer.add("PatientSubmission", payPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_bttnManageOrganization1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttnManageOrganization;
    private rojerusan.RSMaterialButtonRectangle bttnManageOrganization1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
