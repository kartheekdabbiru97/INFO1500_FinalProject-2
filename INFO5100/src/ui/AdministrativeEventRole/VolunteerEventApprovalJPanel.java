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

        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        buttonBack = new javax.swing.JButton();
        buttonApprove = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 243, 255));

        jLabel1.setBackground(new java.awt.Color(15, 19, 52));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VOLUNTEER REGISTRATION DETAILS");
        jLabel1.setOpaque(true);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE NAME: ");

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        valueLabel.setText("<value>");

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

        buttonBack.setText("BACK");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        buttonApprove.setText("APPROVE");
        buttonApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApproveActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(buttonRefresh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(buttonBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonApprove)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonRefresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBack)
                    .addComponent(buttonApprove))
                .addGap(0, 168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        populateRequestTable();
    }//GEN-LAST:event_buttonRefreshActionPerformed

    private void buttonApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApproveActionPerformed
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
    }//GEN-LAST:event_buttonApproveActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_buttonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonApprove;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
