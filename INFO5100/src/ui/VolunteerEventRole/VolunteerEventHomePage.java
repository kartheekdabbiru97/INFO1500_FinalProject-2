/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.VolunteerEventRole;

import ui.CorporateRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.VolunteerEventOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class VolunteerEventHomePage extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private VolunteerEventOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem eco;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public VolunteerEventHomePage(JPanel userProcessContainer, UserAccount account, VolunteerEventOrganization organization, Network network, Enterprise enterprise, EcoSystem eco) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.eco = eco;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonEnroll = new javax.swing.JButton();
        buttonCheckStatus = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 243, 255));

        jLabel1.setBackground(new java.awt.Color(15, 19, 52));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VOLUNTEER EVENT ROLE HOME PAGE");
        jLabel1.setOpaque(true);

        buttonEnroll.setText("ENROLL FOR FUNDRAISERS");
        buttonEnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnrollActionPerformed(evt);
            }
        });

        buttonCheckStatus.setText("CHECK ENROLLMENT STATUS");
        buttonCheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCheckStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonEnroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCheckStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(buttonEnroll, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(buttonCheckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnrollActionPerformed
        System.out.println(network.getEnterpriseDirectory().getEnterpriseList());
        FundraiserEventVolunteer fundPanelVolunteer = new FundraiserEventVolunteer(userProcessContainer, userAccount, network, eco);
        userProcessContainer.add("FundraiserEventVolunteer", fundPanelVolunteer);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_buttonEnrollActionPerformed

    private void buttonCheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCheckStatusActionPerformed
        EnrollmentStatus empStatusPanel = new EnrollmentStatus(userProcessContainer, userAccount, network, eco);
        userProcessContainer.add("EnrollmentStatus", empStatusPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_buttonCheckStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCheckStatus;
    private javax.swing.JButton buttonEnroll;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
