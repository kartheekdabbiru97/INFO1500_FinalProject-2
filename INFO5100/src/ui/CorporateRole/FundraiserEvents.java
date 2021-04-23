/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CorporateRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FundCharityEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.logging.*;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class FundraiserEvents extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem business;
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public FundraiserEvents(JPanel userProcessContainer, UserAccount user, Network network, EcoSystem eco) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = user;
        this.network = network;
        this.business = eco;
        initComponents();
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        int count = 0;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enter.getEnterpriseType().equals(Enterprise.EnterpriseType.Event)) {
                if (count != 0) {
                    FundCharityEnterprise camp = (FundCharityEnterprise) enter;
                    Object[] row = new Object[5];
                    row[0] = camp;
                    row[1] = camp.getStreet();
                    row[2] = camp.getCity();
                    row[3] = camp.getState();
                    row[4] = camp.getZipcode();
                    model.addRow(row);
                } else {
                    count++;
                }
            }
        }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        buttonBack = new javax.swing.JButton();
        buttonJoinEvent = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 243, 255));

        jLabel1.setBackground(new java.awt.Color(15, 19, 52));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JOIN FUNDRAISING EVENT");
        jLabel1.setOpaque(true);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Street", "City", "State", "Zipcode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        buttonBack.setText("BACK");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        buttonJoinEvent.setText("JOIN EVENT");
        buttonJoinEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJoinEventActionPerformed(evt);
            }
        });

        buttonRefresh.setText("REFRESH");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(buttonBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonJoinEvent)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonRefresh)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(buttonRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBack)
                    .addComponent(buttonJoinEvent))
                .addGap(0, 43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_buttonRefreshActionPerformed

    private void buttonJoinEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJoinEventActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }
        Enterprise e = (Enterprise) workRequestJTable.getValueAt(selectedRow, 0);
        Employee employee = null;

        UserAccount user = business.getUserAccountDirectory().authenticateUser(userAccount.getUsername(), userAccount.getPassword());

        Enterprise inEnterprise = null;
        Organization inOrganization = null;

        if (user == null) {
            //Step 2: Go inside each network and check each enterprise
            for (Network network : business.getNetworkList()) {
                //Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.equals(e)) {
                        user = enterprise.getUserAccountDirectory().authenticateUser(userAccount.getUsername(), userAccount.getPassword());
                        if (user == null) {
                            //Step 3:check against each organization for each enterprise
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                user = organization.getUserAccountDirectory().authenticateUser(userAccount.getUsername(), userAccount.getPassword());
                                if (user != null) {
                                    inEnterprise = enterprise;
                                    //System.out.println(inEnterprise);
                                    inOrganization = organization;
                                    //System.out.println(inOrganization);
                                    //break;
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

        if (user == null) {
            //JOptionPane.showMessageDialog(null, "User Account does not exist");
            for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                org.getEmployeeDirectory().createEmployee(userAccount.getEmployee().getName());
                for (Employee emp : org.getEmployeeDirectory().getEmployeeList()) {
                    if (userAccount.getEmployee().getName() == emp.getName()) {
                        employee = emp;
                        org.getUserAccountDirectory().createUserAccount(userAccount.getUsername(), userAccount.getPassword(), employee, userAccount.getRole());
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Enrolled for the event. Donation pools are now open!");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Enrollment Already Done. Donation pools are now open!");
        }

        logr.info("Volunteer joined fund Raiser event");
    }//GEN-LAST:event_buttonJoinEventActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_buttonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonJoinEvent;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
