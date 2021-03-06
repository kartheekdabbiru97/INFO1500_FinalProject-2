/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CorporateRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FundCharityEnterprise;
import Business.Network.Network;
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
public class DonateFunds extends javax.swing.JPanel {

    private JPanel userProcessConatiner;
    private UserAccount user;
    private EcoSystem eco;
    private Network network;
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public DonateFunds(JPanel userProcessContainer, UserAccount user, Network network, EcoSystem eco) {
        this.userProcessConatiner = userProcessContainer;
        this.user = user;
        this.eco = eco;
        this.network = network;
        initComponents();
        populateTable();

    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable1.getModel();
        model.setRowCount(0);
        int count = 0;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enter.getEnterpriseType().equals(Enterprise.EnterpriseType.Event)) {
                if (count != 0) {
                    FundCharityEnterprise camp = (FundCharityEnterprise) enter;
                    Object[] row = new Object[5];
                    row[0] = camp;
                    row[1] = camp.getStreet();;
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

        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bttnRefresh = new rojerusan.RSMaterialButtonRectangle();
        bttnBack = new rojerusan.RSMaterialButtonRectangle();
        bttnBack1 = new rojerusan.RSMaterialButtonRectangle();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Applicant Name", "Street Address", "City", "State", "Zipcode"
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
        workRequestJTable1.setSelectionBackground(new java.awt.Color(235, 122, 102));
        workRequestJTable1.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(workRequestJTable1);

        jPanel2.setBackground(new java.awt.Color(235, 122, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("FUND DONATION");

        bttnRefresh.setBackground(new java.awt.Color(255, 255, 255));
        bttnRefresh.setForeground(new java.awt.Color(51, 51, 51));
        bttnRefresh.setText("Refresh");
        bttnRefresh.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(bttnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bttnBack.setBackground(new java.awt.Color(235, 122, 102));
        bttnBack.setForeground(new java.awt.Color(51, 51, 51));
        bttnBack.setText("Back");
        bttnBack.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBackActionPerformed(evt);
            }
        });

        bttnBack1.setBackground(new java.awt.Color(235, 122, 102));
        bttnBack1.setForeground(new java.awt.Color(51, 51, 51));
        bttnBack1.setText("Pay Funds");
        bttnBack1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBack1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_bttnRefreshActionPerformed

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        userProcessConatiner.remove(this);
        CardLayout layout = (CardLayout) userProcessConatiner.getLayout();
        layout.previous(userProcessConatiner);
    }//GEN-LAST:event_bttnBackActionPerformed

    private void bttnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBack1ActionPerformed
        // TODO add your handling code here:
        logr.info("Pay funds action performed");
        int selectedRow = workRequestJTable1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select An Event To Donate");
            System.out.println(selectedRow);
            return;
        } else {
            String money = JOptionPane.showInputDialog(null, "Enter The Amount You Want To Donate?", "Donation Window", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(money);
            try {
                if (money.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter the Amount you want to donate in digits");
                    return;
                }
            } catch (NullPointerException et) {
//            JOptionPane.showMessageDialog(null, "Please Enter The Amount you want to donate");
                System.out.println("Cancel option");
                return;
            }
//        if(money.equals("")){
//            money = "0";
//        }

            FundCharityEnterprise e = (FundCharityEnterprise) workRequestJTable1.getValueAt(selectedRow, 0);
            try {
                e.setFundsCollected(Integer.parseInt(money));
                System.out.println(e.getFundsCollected());
                JOptionPane.showMessageDialog(null, "You have donated " + money + "$. Thank you for your valuable contribution! " + "\n" + " Funds Sent to System Admin for Assigning Hospital!");
            } catch (NumberFormatException ex) {
                //   System.out.println(e.getFundsCollected());
                JOptionPane.showMessageDialog(null, "Please Enter The Amount you want to donate in digits");
            }
        }
        logr.info("Funds paid for fundraiser event");
    }//GEN-LAST:event_bttnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttnBack;
    private rojerusan.RSMaterialButtonRectangle bttnBack1;
    private rojerusan.RSMaterialButtonRectangle bttnRefresh;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables
}
