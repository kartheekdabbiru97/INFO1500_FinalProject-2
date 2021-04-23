/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeEventRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.mail.*;
import java.util.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Shreya Vivek Bhosale
 */
public class VolunteerEventApprovalJPanel extends javax.swing.JPanel {

    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private static String emailMsgTxt = "";
    private static String emailSubjectTxt = "";
    private static String emailFromAddress = "";
// Add List of Email address to who email needs to be sent to
    private static String[] emailList = new String[1];

    /**
     * Creates new form VolunteerAprovalJPanel
     */
    public VolunteerEventApprovalJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.toString().equals("Volunteer")) {
                Object[] row = new Object[8];
                row[0] = request;
                row[1] = request.getVolunteerName();
                row[2] = request.getUsername();
                row[3] = request.getDob();
                row[4] = request.getSsn();
                row[5] = request.getMailid();
                row[6] = request.getRole();
                row[7] = request.getStatus();

                //String result = ((VolunteerApprovalStatus) request).getTestResult();
                // row[3] = result == null ? "Waiting" : result;
                model.addRow(row);
            }
        }
    }

    public static void sendEmailMessage(String emailId) {
// Recipient's email ID needs to be mentioned.
        String to = emailId;
        String from = "aedxaxis@gmail.com";
        String pass = "info5000";
// Assuming you are sending email from localhost
// String host = "192.168.0.16";

// Get system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";

        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
// properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

// Setup mail server
// properties.setProperty("mail.smtp.host", host);
// properties.put("mail.smtp.starttls.enable", "true");
// Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try {
// Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

// Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

// Set To: header field of the header.
            message.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(to));

// Set Subject: header field
            message.setSubject("Volunteer Registration Update");
            message.setText("Thank you for registering with us. Your account has been approved");
// Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }

    public static void sendTextMessage(String contact) {
        // Recipient's email ID needs to be mentioned.
        String to = contact;
        System.out.println(contact);
        String from = "aedxaxis@gmail.com";
        String pass = "info5000";
        // Assuming you are sending email from localhost
        // String host = "192.168.0.16";
        // Get system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
        // properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        // Setup mail server
        // properties.setProperty("mail.smtp.host", host);
        //  properties.put("mail.smtp.starttls.enable", "true");
        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);
        //       final PasswordAuthentication auth = new PasswordAuthentication(from, pass);
//Session session = Session.getDefaultInstance(properties, new Authenticator() {
//    @Override
//    protected PasswordAuthentication getPasswordAuthentication() { return auth; }
//});
//Session session = Session.getInstance(properties);
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress("6177510819@tmomail.net"));

            // Set Subject: header field
            message.setSubject("Volunteer Registration Update");
            message.setText("Thank you for registering with us. Your account has been approved");
            // Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message!");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        bttnRefresh = new rojerusan.RSMaterialButtonRectangle();
        bttnBack = new rojerusan.RSMaterialButtonRectangle();
        bttnBack1 = new rojerusan.RSMaterialButtonRectangle();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Name", "Username", "Date of Birth", "SSN", "Email ID", "Role", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jPanel2.setBackground(new java.awt.Color(235, 122, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("VOLUNTEER REGISTRATION DETAILS");

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        enterpriseLabel1.setText("ENTERPRISE NAME :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        valueLabel.setText("<value>");

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(enterpriseLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(bttnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bttnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        bttnBack1.setText("Approve");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRefreshActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_bttnRefreshActionPerformed

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bttnBackActionPerformed

    private void bttnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBack1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please make a selection");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        Employee employee = null;
        Role role = null;
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            //System.out.println(request.getRole().equals(org.getOrganType().VolunteerCamp.toString()));
            //System.out.println(request.getRole());
            //System.out.println(request.getRole().equals("VolunteerCampRole"));
            if (request.getRole().equals("VolunteerCampRole")) {
                org.getEmployeeDirectory().createEmployee(request.getVolunteerName());
                for (Employee e : org.getEmployeeDirectory().getEmployeeList()) {
                    if (request.getVolunteerName() == e.getName()) {
                        employee = e;
                    }
                    for (Role r : org.getSupportedRole()) {
                        //System.out.println(r);
                        if (request.getRole().equals("VolunteerCampRole")) {
                            role = r;
                        }
                    }
                }
                org.getUserAccountDirectory().createUserAccount(request.getUsername(), request.getPassword(), employee, role);
                break;
            } else if (request.getRole().equals("VolunteerEventRole")) {
                if (org.toString().equals("Event Organization")) {
                    org.getEmployeeDirectory().createEmployee(request.getVolunteerName());
                    for (Employee e : org.getEmployeeDirectory().getEmployeeList()) {
                        if (request.getVolunteerName() == e.getName()) {
                            employee = e;
                        }

                        for (Role r : org.getSupportedRole()) {
                            //System.out.println(r);
                            //System.out.println(r.toString());
                            if (r.toString().equals("VolunteerEventRole")) {
                                role = r;
                                //System.out.print(role);
                                //org.getUserAccountDirectory().createUserAccount(request.getUsername(), request.getPassword(), employee, role);
                                // break;
                            }
                        }
                    }
                    org.getUserAccountDirectory().createUserAccount(request.getUsername(), request.getPassword(), employee, role);
                }
            }
        }
        request.setStatus("Completed");
        populateRequestTable();
        if (request.getStatus().equals("Completed")) {
//            // System.out.println("Mail Begins");
//            String ab = request.getVolunteerName();
//            emailMsgTxt = "Hi " + ab.toUpperCase() + ", " + "\n" + "\n" + "Your User Account got Created, You can login into the system now" + "\n" + "\n" + "Regards," + "\n" + "NGO Admin";
//            emailSubjectTxt = "Volunteer Request Approved";
//            emailFromAddress = SendMailUsingAuthentication.SMTP_AUTH_USER;
//
//            // Add List of Email address to who email needs to be sent to
//            StringBuffer sb = new StringBuffer(request.getMailid());
//            StringTokenizer st = new StringTokenizer(request.getMailid());
//            int i = 0;
//            while (st.hasMoreTokens()) {
//                emailList[i] = st.nextToken(",");
//                // System.err.println(emailList[i]);
//                i++;
//            }
//            String emailReceipeint[] = new String[i];
//            for (int j = 0; j < i; j++) {
//                emailReceipeint[j] = emailList[j];
//                //System.out.println("Actually emails are " + j);
//            }
//
//            SendMailUsingAuthentication smtpMailSender = new SendMailUsingAuthentication();
//            try {
//                smtpMailSender.postMail(emailReceipeint, emailSubjectTxt, emailMsgTxt, emailFromAddress);
//                JOptionPane.showMessageDialog(null, "Request Approved and mail has been sent to Volunteer");
//            } catch (MessagingException ex) {
//                //Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            //    System.out.println("Sucessfully Sent mail to All Users");
            sendEmailMessage(request.getMailid());
            long num = request.getNumber();
            String numStr = Long.toString(num);
            sendTextMessage(numStr);

        }
    }//GEN-LAST:event_bttnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttnBack;
    private rojerusan.RSMaterialButtonRectangle bttnBack1;
    private rojerusan.RSMaterialButtonRectangle bttnRefresh;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
