/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CorporateRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FundraiserOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.util.logging.*;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class CorporateWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private FundraiserOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem eco;
    private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CorporateWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, FundraiserOrganization organization, Network network, Enterprise enterprise, EcoSystem eco) {
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
        buttonDonate = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 243, 255));

        jLabel1.setBackground(new java.awt.Color(15, 19, 52));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CORPORATE WORK AREA - FUND ROLE");
        jLabel1.setOpaque(true);

        buttonEnroll.setText("ENROLL FOR FUNDRAISER");
        buttonEnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnrollActionPerformed(evt);
            }
        });

        buttonDonate.setText("DONATE FOR THE EVENT");
        buttonDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDonateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonEnroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDonate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(buttonEnroll)
                .addGap(32, 32, 32)
                .addComponent(buttonDonate)
                .addGap(0, 184, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDonateActionPerformed
        DonateFunds payPanel = new DonateFunds(userProcessContainer, userAccount, network, eco);
        userProcessContainer.add("DonateFunds", payPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_buttonDonateActionPerformed

    private void buttonEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnrollActionPerformed
        log.info("Enroll for fund raiser action performed");
        System.out.println(network.getEnterpriseDirectory().getEnterpriseList());
        FundraiserEvents fundPanel = new FundraiserEvents(userProcessContainer, userAccount, network, eco);
        userProcessContainer.add("FundraiserEvents", fundPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        log.info("FundraiserEvents");
    }//GEN-LAST:event_buttonEnrollActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDonate;
    private javax.swing.JButton buttonEnroll;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
