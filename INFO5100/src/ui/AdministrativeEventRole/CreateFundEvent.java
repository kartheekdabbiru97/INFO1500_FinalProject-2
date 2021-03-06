/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeEventRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jo-ji
 */
public class CreateFundEvent extends javax.swing.JPanel {

    /**
     * Creates new form CreateFundEvent
     */
    /**
     * Creates new form CreateFundEvent
     */
    private JPanel userProcessContainer;
    private WorkRequest request;
    private UserAccount user;
    private Enterprise enter;
    private Network network;
    //   private static final Pattern ZIP_PATTERN = Pattern.compile("/^(\\d{5}(-\\d{4})?|([a-z][a-z]?\\d\\d?|[a-z{2}\\d[a-z]) ?\\d[a-z][a-z])$/i;");

    public CreateFundEvent(JPanel userProcessContainer, WorkRequest request, UserAccount user, Enterprise enter, Network network) {
        this.userProcessContainer = userProcessContainer;
        this.enter = enter;
        this.request = request;
        this.user = user;
        this.network = network;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        eventName = new rojerusan.RSMetroTextPlaceHolder();
        street = new rojerusan.RSMetroTextPlaceHolder();
        city = new rojerusan.RSMetroTextPlaceHolder();
        state = new rojerusan.RSMetroTextPlaceHolder();
        zipCode = new rojerusan.RSMetroTextPlaceHolder();
        eventDate = new com.toedter.calendar.JDateChooser();
        eventApproxFund = new rojerusan.RSMetroTextPlaceHolder();
        bttnBack = new rojerusan.RSMaterialButtonRectangle();
        bttnApprove = new rojerusan.RSMaterialButtonRectangle();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Event Name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Street Address");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("City");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("State");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("ZipCode");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Date");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fund To Be Collected");

        jPanel1.setBackground(new java.awt.Color(235, 122, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("CREATE FUNDRAISER EVENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(643, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        eventName.setForeground(new java.awt.Color(15, 19, 52));
        eventName.setToolTipText("");
        eventName.setBorderColor(new java.awt.Color(51, 51, 51));
        eventName.setBotonColor(new java.awt.Color(235, 122, 102));
        eventName.setPhColor(new java.awt.Color(235, 122, 102));
        eventName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventNameActionPerformed(evt);
            }
        });

        street.setForeground(new java.awt.Color(15, 19, 52));
        street.setToolTipText("");
        street.setBorderColor(new java.awt.Color(51, 51, 51));
        street.setBotonColor(new java.awt.Color(235, 122, 102));
        street.setPhColor(new java.awt.Color(235, 122, 102));
        street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetActionPerformed(evt);
            }
        });

        city.setForeground(new java.awt.Color(15, 19, 52));
        city.setToolTipText("");
        city.setBorderColor(new java.awt.Color(51, 51, 51));
        city.setBotonColor(new java.awt.Color(235, 122, 102));
        city.setPhColor(new java.awt.Color(235, 122, 102));
        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });

        state.setForeground(new java.awt.Color(15, 19, 52));
        state.setToolTipText("");
        state.setBorderColor(new java.awt.Color(51, 51, 51));
        state.setBotonColor(new java.awt.Color(235, 122, 102));
        state.setPhColor(new java.awt.Color(235, 122, 102));
        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });

        zipCode.setForeground(new java.awt.Color(15, 19, 52));
        zipCode.setToolTipText("");
        zipCode.setBorderColor(new java.awt.Color(51, 51, 51));
        zipCode.setBotonColor(new java.awt.Color(235, 122, 102));
        zipCode.setPhColor(new java.awt.Color(235, 122, 102));
        zipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodeActionPerformed(evt);
            }
        });

        eventDate.setBackground(new java.awt.Color(255, 255, 255));
        eventDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        eventApproxFund.setForeground(new java.awt.Color(15, 19, 52));
        eventApproxFund.setToolTipText("");
        eventApproxFund.setBorderColor(new java.awt.Color(51, 51, 51));
        eventApproxFund.setBotonColor(new java.awt.Color(235, 122, 102));
        eventApproxFund.setPhColor(new java.awt.Color(235, 122, 102));
        eventApproxFund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventApproxFundActionPerformed(evt);
            }
        });

        bttnBack.setBackground(new java.awt.Color(235, 122, 102));
        bttnBack.setForeground(new java.awt.Color(51, 51, 51));
        bttnBack.setText("Back");
        bttnBack.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBackActionPerformed(evt);
            }
        });

        bttnApprove.setBackground(new java.awt.Color(235, 122, 102));
        bttnApprove.setForeground(new java.awt.Color(51, 51, 51));
        bttnApprove.setText("APPROVE");
        bttnApprove.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnApproveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eventApproxFund, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(eventDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(eventName, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5))
                    .addComponent(eventDate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventApproxFund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eventNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventNameActionPerformed

    private void streetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed

    private void zipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeActionPerformed

    private void eventApproxFundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventApproxFundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventApproxFundActionPerformed

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FundRequests fund = (FundRequests) component;
        fund.populateTable();;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bttnBackActionPerformed

    private void bttnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnApproveActionPerformed
        int check = 0;
        int checkdate = 0;
        if (eventDate.getDate() == null || zipCode.getText().isEmpty() || state.getText().isEmpty() || city.getText().isEmpty() || street.getText().isEmpty() || eventName.getText().isEmpty() || eventApproxFund.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all the fields");
        } else {
            check = 1;
            Enterprise enterprise = null;
            //System.out.println(business.getNetworkList());
            // enterprise = new CampEnterprise(Integer.toString(request.getCampId()));
            Date eventDay = null;
            Date sysDate = null;
            SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
            format.setLenient(false);
            try {

                eventDay = eventDate.getDate();
                sysDate = new Date();
                long diff = sysDate.getTime() - eventDay.getTime();
                long diff1 = eventDay.getTime() - sysDate.getTime();
                long diff1Days = diff1 / (24 * 60 * 60 * 1000);
                long years = diff1Days / 365;

                if (diff > 0) {
                    JOptionPane.showMessageDialog(null, "Cannot enter a previous date");
                    checkdate = 1;
                }

                if (diff1Days >= 4 && check == 1 && checkdate == 0) {
                    request.setStatus("Funding Process is going on");
                    int zipcodeVal = validateZipCode(zipCode.getText());
                    if (zipcodeVal == 0) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid 5 digit zip code");
                        return;
                    }
                    enterprise = network.getEnterpriseDirectory().createAndAddEventEnterprise(eventName.getText(), street.getText(), city.getText(), state.getText(), zipCode.getText(), eventDay, Enterprise.EnterpriseType.Event, Integer.parseInt(eventApproxFund.getText()));
                    Employee empl = enterprise.getEmployeeDirectory().createEmployee("admin");
                    String username = "admin_" + eventName.getText();
                    enterprise.getUserAccountDirectory().createUserAccount(username, "admin", empl, new AdminRole());
                    enterprise.getOrganizationDirectory().createOrganization(Organization.OrganizationType.VolunteerEvent);
                    enterprise.getOrganizationDirectory().createOrganization(Organization.OrganizationType.Fund);
                    JOptionPane.showMessageDialog(null, "FundRaiser Event Approved. Sponsors can donate for this event!");
                    eventApproxFund.setText("");
                    eventDate.setDate(null);
                    eventName.setText("");
                    street.setText("");
                    city.setText("");
                    state.setText("");
                    zipCode.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a Date after 4 days");
                }
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Please Enter Appropriate Date MM-dd-yyyy");
            }

        }
    }//GEN-LAST:event_bttnApproveActionPerformed
    private int validateZipCode(String validate) {
        //    Matcher match = ZIP_PATTERN.matcher(validate);
        try {
            int zipcodeVal = Integer.parseInt(validate);
            if (validate.length() >= 6) {
                return 0;
            }
            return 1;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttnApprove;
    private rojerusan.RSMaterialButtonRectangle bttnBack;
    private rojerusan.RSMetroTextPlaceHolder city;
    private rojerusan.RSMetroTextPlaceHolder eventApproxFund;
    private com.toedter.calendar.JDateChooser eventDate;
    private rojerusan.RSMetroTextPlaceHolder eventName;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private rojerusan.RSMetroTextPlaceHolder state;
    private rojerusan.RSMetroTextPlaceHolder street;
    private rojerusan.RSMetroTextPlaceHolder txtCampID;
    private rojerusan.RSMetroTextPlaceHolder txtCampID1;
    private rojerusan.RSMetroTextPlaceHolder zipCode;
    // End of variables declaration//GEN-END:variables
}
