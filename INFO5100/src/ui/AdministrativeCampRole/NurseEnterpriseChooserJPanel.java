/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeCampRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.NurseRole.NurseHomePage;
import ui.NurseRole.VolunteerNurseHomePage;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class NurseEnterpriseChooserJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    EcoSystem ecosystem;
    NurseOrganization organization;
    Network network;

    /**
     * Creates new form NurseEnterpriseChooserJPanel
     */
    public NurseEnterpriseChooserJPanel(JPanel userProcessContainer, UserAccount account, NurseOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.ecosystem = business;
        this.organization = organization;
        populateNetworkComboBox();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmboNetwork = new rojerusan.RSComboMetro();
        cmboEnterpriseType = new rojerusan.RSComboMetro();
        cmboEnterprise = new rojerusan.RSComboMetro();
        bttnBack = new rojerusan.RSMaterialButtonRectangle();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Network");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Enterprise Type");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Enterprise");

        cmboNetwork.setBackground(new java.awt.Color(235, 122, 102));
        cmboNetwork.setForeground(new java.awt.Color(51, 51, 51));
        cmboNetwork.setColorArrow(new java.awt.Color(235, 122, 102));
        cmboNetwork.setColorBorde(new java.awt.Color(51, 51, 51));
        cmboNetwork.setColorFondo(new java.awt.Color(235, 122, 102));
        cmboNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboNetworkActionPerformed(evt);
            }
        });

        cmboEnterpriseType.setBackground(new java.awt.Color(235, 122, 102));
        cmboEnterpriseType.setForeground(new java.awt.Color(51, 51, 51));
        cmboEnterpriseType.setColorArrow(new java.awt.Color(235, 122, 102));
        cmboEnterpriseType.setColorBorde(new java.awt.Color(51, 51, 51));
        cmboEnterpriseType.setColorFondo(new java.awt.Color(235, 122, 102));
        cmboEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboEnterpriseTypeActionPerformed(evt);
            }
        });

        cmboEnterprise.setBackground(new java.awt.Color(235, 122, 102));
        cmboEnterprise.setForeground(new java.awt.Color(51, 51, 51));
        cmboEnterprise.setColorArrow(new java.awt.Color(235, 122, 102));
        cmboEnterprise.setColorBorde(new java.awt.Color(51, 51, 51));
        cmboEnterprise.setColorFondo(new java.awt.Color(235, 122, 102));

        bttnBack.setBackground(new java.awt.Color(235, 122, 102));
        bttnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        bttnBack.setForeground(new java.awt.Color(51, 51, 51));
        bttnBack.setText("Submit");
        bttnBack.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(235, 122, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("NURSE ENTERPRISE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(568, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmboEnterpriseType, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(cmboEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(cmboNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(0, 443, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmboNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmboEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmboEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        //UserAccount userAccount = ecosystem.getUserAccountDirectory().authenticateUser(account.getUsername(), account.getPassword());
        ecosystem.getUserAccountDirectory().authenticateUser(account.getUsername(), account.getPassword());
        // System.out.println(ecosystem.getUserAccountDirectory().getUserAccountList());
        // System.out.println(account.getUsername());
        // System.out.println(account.getPassword());
        Enterprise e = (Enterprise) cmboEnterprise.getSelectedItem();

        Enterprise inEnterprise = null;
        Organization inOrganization = null;

        if (account == null) {
            //Step 2: Go inside each network and check each enterprise
            for (Network network : ecosystem.getNetworkList()) {
                //Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.equals(e)) {
                        account = enterprise.getUserAccountDirectory().authenticateUser(account.getUsername(), account.getPassword());
                        //System.out.println(userAccount);
                        if (account == null) {
                            //Step 3:check against each organization for each enterprise
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                //System.out.println(Organization.OrganizationType.Nurse.equals(organization));
                                //System.out.println(Organization.OrganizationType.Nurse.getValue());
                                //System.out.println(organization.toString());
                                //System.out.println(Organization.OrganizationType.Nurse.getValue().equals(organization.toString()));
                                if (Organization.OrganizationType.Nurse.getValue().equals(organization.toString()) || Organization.OrganizationType.VolunteerCamp.getValue().equals(organization.toString())) {
                                    account = organization.getUserAccountDirectory().authenticateUser(account.getUsername(), account.getPassword());
                                    //System.out.println(organization);
                                    //System.out.println(userAccount);
                                    if (account != null) {
                                        inEnterprise = enterprise;
                                        //System.out.println(inEnterprise);
                                        inOrganization = organization;
                                        //System.out.println(organization);
                                        //System.out.println(inOrganization);
                                        //break;
                                    }
                                }
                            }
                        } else {
                            inEnterprise = enterprise;
                            //System.out.println(inEnterprise);
                            //break;
                        }

                        if (inOrganization != null) {
                            //System.out.println(inOrganization);
                            //break;
                        }
                    }
                    if (inEnterprise != null) {
                        //System.out.println(inEnterprise);
                        //break;
                    }
                }
            }
        }

        if (account == null) {
            JOptionPane.showMessageDialog(null, "User Account does not exist");
            return;
        } else {
            if (cmboEnterpriseType.getSelectedItem().equals(enterprise.getEnterpriseType().Hospital)) {
                NurseHomePage nurseHome = new NurseHomePage(userProcessContainer, account, (NurseOrganization) organization, (Enterprise) cmboEnterprise.getSelectedItem(), network, ecosystem);
                userProcessContainer.add("NurseHomePage", nurseHome);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else if (cmboEnterpriseType.getSelectedItem().equals(enterprise.getEnterpriseType().Camp)) {
                VolunteerNurseHomePage volunteerNurseHome = new VolunteerNurseHomePage(userProcessContainer, account, organization, (Enterprise) cmboEnterprise.getSelectedItem(), ecosystem);
                userProcessContainer.add("VolunteerNurseHomePage", volunteerNurseHome);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }

        /*if(userAccount!=null){
            VolunteerHomePage volunteerHome = new VolunteerHomePage(userProcessContainer, account, (VolunteerCampOrganization) organization, (Enterprise) enterpriseJComboBox.getSelectedItem(), ecosystem);
            userProcessContainer.add("VolunteerHomePage", volunteerHome);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        JOptionPane.showMessageDialog(this, "User Account does not exist");*/
    }//GEN-LAST:event_bttnBackActionPerformed

    private void cmboEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboEnterpriseTypeActionPerformed
        Network network = (Network) cmboNetwork.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) cmboEnterpriseType.getSelectedItem();
        if (type != null) {
            populateEnterpriseComboBox(type, network);
        }
    }//GEN-LAST:event_cmboEnterpriseTypeActionPerformed

    private void cmboNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboNetworkActionPerformed
        Network network = (Network) cmboNetwork.getSelectedItem();
        if (network != null) {
            populateEnterprisetypecomboBox(network);
        }
    }//GEN-LAST:event_cmboNetworkActionPerformed

    private void populateNetworkComboBox() {
        cmboNetwork.removeAllItems();

        for (Network network : ecosystem.getNetworkList()) {
            cmboNetwork.addItem(network);
        }
    }

    private void populateEnterprisetypecomboBox(Network network) {
        cmboEnterpriseType.removeAllItems();
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            if (!type.equals(Enterprise.EnterpriseType.Event)) {
                cmboEnterpriseType.addItem(type);
            }
        }
    }

    private void populateEnterpriseComboBox(Enterprise.EnterpriseType type, Network network) {
        cmboEnterprise.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (type.getValue().equals(enterprise.getEnterpriseType().getValue())) {
                cmboEnterprise.addItem(enterprise);
            }

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttnBack;
    private rojerusan.RSComboMetro cmboEnterprise;
    private rojerusan.RSComboMetro cmboEnterpriseType;
    private rojerusan.RSComboMetro cmboNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
