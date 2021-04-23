/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SponsorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SponsorApprovalStatus;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ashishroy
 */
public class SponsorRegistrationPanel extends javax.swing.JPanel {

    /**
     * Creates new form SponsorRegistrationPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private static final Pattern mailPattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
    private static final Pattern ssnPattern = Pattern.compile("^\\d{3}-?\\d{2}-?\\d{4}$|^XXX-XX-XXXX$");
    private static final Pattern passportPattern = Pattern.compile("^\\d{3}-?\\d{2}-?\\d{4}$|^XXX-XX-XXXX$");
    private static final Pattern phonePattern = Pattern.compile("^\\D?(\\d{3})\\D?\\D?(\\d{3})\\D?(\\d{4})$");

    /**
     * Creates new form VolunteerRegistration
     */
    public SponsorRegistrationPanel(JPanel userProcessContainerÏ, EcoSystem system) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
    }

    private int validateMail(String validate) {
        Matcher match = mailPattern.matcher(validate);
        if (match.matches()) {
            return 1;
        }
        return 0;
    }

    private int validatePassport(String validate) {
        Matcher match = passportPattern.matcher(validate);
        System.out.println(match.matches());
        if (match.matches()) {
            return 1;
        }
        return 0;
    }

    private int validateSsn(String validate) {
        Matcher match = ssnPattern.matcher(validate);
        System.out.println(match.matches());
        if (match.matches()) {
            return 1;
        }
        return 0;
    }

    private int validatePhone(String validate) {
        Matcher match = phonePattern.matcher(validate);
        System.out.println(match.matches());
        if (match.matches()) {
            return 1;
        }
        return 0;
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
            message.setSubject("Sponsor Registration");
            message.setText("Thank you for registering with us. Your account will be approved as soon as possible and will be notified to you in the next email.");
        // Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Message sent!");
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
            message.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(contact));

            // Set Subject: header field
            message.setSubject("Sponsor Registration");
            message.setText("Thank you for registering with us. Your account will be approved as soon as possible and will be notified to you in the next email.");
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txtName = new rojerusan.RSMetroTextPlaceHolder();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtUsername = new rojerusan.RSMetroTextPlaceHolder();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new rojerusan.RSMetroTextPlaceHolder();
        jLabel4 = new javax.swing.JLabel();
        bttnBack = new rojerusan.RSMaterialButtonRectangle();
        txtNumber = new rojerusan.RSMetroTextPlaceHolder();
        jLabel10 = new javax.swing.JLabel();
        roleCombo = new rojerusan.RSComboMetro();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtpassport = new rojerusan.RSMetroTextPlaceHolder();
        comboProvider = new rojerusan.RSComboMetro();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtSSN = new rojerusan.RSMetroTextPlaceHolder();
        jLabel12 = new javax.swing.JLabel();
        txtDob = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new rojerusan.RSMetroTextPlaceHolder();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Username");

        txtName.setForeground(new java.awt.Color(15, 19, 52));
        txtName.setToolTipText("");
        txtName.setBorderColor(new java.awt.Color(51, 51, 51));
        txtName.setBotonColor(new java.awt.Color(235, 122, 102));
        txtName.setPhColor(new java.awt.Color(235, 122, 102));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        jScrollPane1.setViewportView(txtAddress);

        txtUsername.setForeground(new java.awt.Color(15, 19, 52));
        txtUsername.setToolTipText("");
        txtUsername.setBorderColor(new java.awt.Color(51, 51, 51));
        txtUsername.setBotonColor(new java.awt.Color(235, 122, 102));
        txtUsername.setPhColor(new java.awt.Color(235, 122, 102));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Address");

        txtEmail.setForeground(new java.awt.Color(15, 19, 52));
        txtEmail.setToolTipText("");
        txtEmail.setBorderColor(new java.awt.Color(51, 51, 51));
        txtEmail.setBotonColor(new java.awt.Color(235, 122, 102));
        txtEmail.setPhColor(new java.awt.Color(235, 122, 102));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Phone Number");

        bttnBack.setBackground(new java.awt.Color(235, 122, 102));
        bttnBack.setForeground(new java.awt.Color(51, 51, 51));
        bttnBack.setText("Submit");
        bttnBack.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        bttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBackActionPerformed(evt);
            }
        });

        txtNumber.setForeground(new java.awt.Color(15, 19, 52));
        txtNumber.setToolTipText("");
        txtNumber.setBorderColor(new java.awt.Color(51, 51, 51));
        txtNumber.setBotonColor(new java.awt.Color(235, 122, 102));
        txtNumber.setPhColor(new java.awt.Color(235, 122, 102));
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Role");

        roleCombo.setBackground(new java.awt.Color(235, 122, 102));
        roleCombo.setForeground(new java.awt.Color(51, 51, 51));
        roleCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GeneralRole", "CorporateRole", "StudentRole" }));
        roleCombo.setColorArrow(new java.awt.Color(235, 122, 102));
        roleCombo.setColorBorde(new java.awt.Color(51, 51, 51));
        roleCombo.setColorFondo(new java.awt.Color(235, 122, 102));
        roleCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleComboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Passport No");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Carrier");

        txtpassport.setForeground(new java.awt.Color(15, 19, 52));
        txtpassport.setToolTipText("");
        txtpassport.setBorderColor(new java.awt.Color(51, 51, 51));
        txtpassport.setBotonColor(new java.awt.Color(235, 122, 102));
        txtpassport.setPhColor(new java.awt.Color(235, 122, 102));
        txtpassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassportActionPerformed(evt);
            }
        });

        comboProvider.setBackground(new java.awt.Color(235, 122, 102));
        comboProvider.setForeground(new java.awt.Color(51, 51, 51));
        comboProvider.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "ATT", "TMobile", "Sprint", "Verizon" }));
        comboProvider.setToolTipText("");
        comboProvider.setColorArrow(new java.awt.Color(235, 122, 102));
        comboProvider.setColorBorde(new java.awt.Color(51, 51, 51));
        comboProvider.setColorFondo(new java.awt.Color(235, 122, 102));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Email ID");

        jPanel2.setBackground(new java.awt.Color(235, 122, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("WELCOME TO SPONSOR REGISTRATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        txtSSN.setForeground(new java.awt.Color(15, 19, 52));
        txtSSN.setToolTipText("");
        txtSSN.setBorderColor(new java.awt.Color(51, 51, 51));
        txtSSN.setBotonColor(new java.awt.Color(235, 122, 102));
        txtSSN.setPhColor(new java.awt.Color(235, 122, 102));
        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("SSN");

        txtDob.setBackground(new java.awt.Color(255, 255, 255));
        txtDob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("DOB");

        txtPassword.setForeground(new java.awt.Color(15, 19, 52));
        txtPassword.setToolTipText("");
        txtPassword.setBorderColor(new java.awt.Color(51, 51, 51));
        txtPassword.setBotonColor(new java.awt.Color(235, 122, 102));
        txtPassword.setPhColor(new java.awt.Color(235, 122, 102));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(11, 11, 11)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(bttnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        int check = 0;
        int co = 1;
        int checkMail = 0;
        int userCheck = 0;
        int checkSsn = 0;
        int checkPass = 0;
        int checkPhone = 0;
        int checkdate = 0;

        String name = null;
        String userName = null;
        String pass = null;
        String mail = null;
        String role = "null";
        String passport1 = null;
        String address1 = null;
        long ssn1 = 0;
        long pass1 = 0;
        long number1 = 0;
        //  Date dob1 = null;
        Date sysDate = null;
        if (txtName.getText().isEmpty() || txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty() || txtEmail.getText().isEmpty() || txtpassport.getText().isEmpty() || txtSSN.getText().isEmpty() || txtDob.getDate() == null || txtNumber.getText().isEmpty() || txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Registration cannot be completed as one or more fields are empty");
            return;
        } else {
            check = 1;
            SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
            format.setLenient(false);
            //     dob1 = null;
            sysDate = new Date();

            name = txtName.getText();
            userName = txtUsername.getText();
            pass = txtPassword.getText();
            mail = txtEmail.getText();
            role = "null";
            passport1 = txtpassport.getText();
            checkMail = validateMail(txtEmail.getText());
            if (checkMail == 0) {
                JOptionPane.showMessageDialog(null, "Please Enter a valid Email-ID format");
                return;
            }
            try {
                //       dob1 = format.parse(dob.getText());
                ssn1 = Long.parseLong(txtSSN.getText());
                pass1 = Long.parseLong(txtpassport.getText());
                number1 = Long.parseLong(txtNumber.getText());
                checkSsn = validateSsn(Long.toString(ssn1));
                checkPass = validatePassport(Long.toString(pass1));
                checkPhone = validatePhone(Long.toString(number1));

                long diff = sysDate.getTime() - txtDob.getDate().getTime();
                long diffDays = diff / (24 * 60 * 60 * 1000);
                long years = diffDays / 365;

                System.out.println(diff);
                System.out.println(diffDays);
                System.out.println(years);
                if ((years < 16 && diff > 0) && (years >= 0 && diff > 0)) {
                    JOptionPane.showMessageDialog(null, "Cannot enroll as age is less than 16 years");
                    checkdate = 1;
                    return;
                }

                if (diff < 0) {
                    JOptionPane.showMessageDialog(null, "Date of Birth cannot be a future date");
                    checkdate = 1;
                    return;
                }

                co = 0;

                if (checkSsn == 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid SSN format (9 digits only allowed) ");
                    return;
                }

                if (checkPass == 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid Passport ID format (9 digits only allowed) ");
                    return;
                }

                if (checkPhone == 0) {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid Phone format(10 digits)");
                    return;
                }
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Please enter number for SSN and Phone Number");
                return;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter number for SSN and Phone Number");
                return;
            }
            address1 = txtAddress.getText();
        }
        //
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, pass);
        if (userAccount == null) {
            for (Network network : system.getNetworkList()) {
                //Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    System.out.println(enterprise.getOrganizationDirectory().getOrganizationList());
                    System.out.println("***************************reg****************************");
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        System.out.println(organization);
                        userAccount = organization.getUserAccountDirectory().authenticateUser(userName, pass);
                        System.out.println(userAccount);
                        if (userAccount != null) {
                            userCheck++;
                            System.out.println(userAccount);
                            // break;
                        }
                    }
                }
            }
        }
        System.out.println(userCheck);
        if (userCheck > 0) {
            JOptionPane.showMessageDialog(this, "User name already exists!");
        } else if (userCheck == 0) {
            if (co == 0 && check == 1 && checkMail != 0 && checkSsn != 0 && checkPhone != 0 && checkdate == 0) {
                SponsorApprovalStatus request = new SponsorApprovalStatus();
                request.setTypeOfRequest("Sponsor");
                request.setName(name);
                request.setUsername(userName);
                request.setPassword(pass);
                request.setMailid(mail);
                request.setDob(txtDob.getDate());
                request.setPassport(passport1);
                request.setNumber(number1);
                request.setSsn(ssn1);
                request.setAddress(address1);
                request.setStatus("Pending");
                if (roleCombo.getSelectedItem() == "GeneralRole") {
                    role = (String) roleCombo.getSelectedItem();
                    request.setRole(role);
                    //                    System.out.println(request.getRole());
                }
                if (roleCombo.getSelectedItem() == "CorporateRole") {
                    role = (String) roleCombo.getSelectedItem();
                    request.setRole(role);
                    //                     System.out.println(role);
                }
                if (roleCombo.getSelectedItem() == "StudentRole") {
                    role = (String) roleCombo.getSelectedItem();
                    request.setRole(role);

                    //                    System.out.println(role);
                }
                for (Network network : system.getNetworkList()) {
                    //Step 2.a: check against each enterprise
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        System.out.println(enterprise.getOrganizationDirectory().getOrganizationList());
                        System.out.println("***************************reg into****************************");
                        for (UserAccount user : enterprise.getUserAccountDirectory().getUserAccountList()) {
                            if ((enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Event) && (roleCombo.getSelectedItem() == "GeneralRole") && (user.getUsername().equals("mafund"))) {
                                //System.out.println(user);
                                user.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(this, "Registration submitted Successfully. Sent to Fund Admin for Approval!");
                                txtName.setText("");
                                txtUsername.setText("");
                                txtPassword.setText("");
                                txtEmail.setText("");
                                txtpassport.setText("");
                                txtSSN.setText("");
                                txtNumber.setText("");
                                txtDob.setDate(null);
                                txtAddress.setText("");
                            } else if ((enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Event) && (roleCombo.getSelectedItem() == "CorporateRole") && (user.getUsername().equals("mafund"))) {
                                // System.out.println(user);
                                user.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(this, "Registration submitted Successfully. Sent to Fund Admin for Approval!");
                                txtName.setText("");
                                txtUsername.setText("");
                                txtPassword.setText("");
                                txtEmail.setText("");
                                txtpassport.setText("");
                                txtSSN.setText("");
                                txtNumber.setText("");
                                txtDob.setDate(null);
                                txtAddress.setText("");
                            } else if ((enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Event) && (roleCombo.getSelectedItem() == "StudentRole") && (user.getUsername().equals("mafund"))) {
                                // System.out.println(user);
                                user.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(this, "Registration submitted Successfully. Sent to Fund Admin for Approval!");
                                txtName.setText("");
                                txtUsername.setText("");
                                txtPassword.setText("");
                                txtEmail.setText("");
                                txtpassport.setText("");
                                txtSSN.setText("");
                                txtNumber.setText("");
                                txtDob.setDate(null);
                                txtAddress.setText("");
                            }
                        }
                    }
                }
            }
        }
        String contact = "";
        if (comboProvider.getSelectedItem().equals("ATT")) {
            contact = txtNumber.getText() + "@txt.att.net";
        } else if (comboProvider.getSelectedItem().equals("Verizon")) {
            contact = txtNumber.getText() + "@vmobl.com";
        } else if (comboProvider.getSelectedItem().equals("Sprint")) {
            contact = txtNumber.getText() + "@messaging.sprintpcs.com";
        } else if (comboProvider.getSelectedItem().equals("TMobile")) {
            contact = txtNumber.getText() + "@tmomail.net";
        }
        sendEmailMessage(mail);
        //        sendTextMessage(contact);
    }//GEN-LAST:event_bttnBackActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void txtpassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassportActionPerformed

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void roleComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bttnBack;
    private rojerusan.RSComboMetro comboProvider;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSComboMetro roleCombo;
    private javax.swing.JTextArea txtAddress;
    private com.toedter.calendar.JDateChooser txtDob;
    private rojerusan.RSMetroTextPlaceHolder txtEmail;
    private rojerusan.RSMetroTextPlaceHolder txtName;
    private rojerusan.RSMetroTextPlaceHolder txtNumber;
    private rojerusan.RSMetroTextPlaceHolder txtPassword;
    private rojerusan.RSMetroTextPlaceHolder txtSSN;
    private rojerusan.RSMetroTextPlaceHolder txtUsername;
    private rojerusan.RSMetroTextPlaceHolder txtpassport;
    // End of variables declaration//GEN-END:variables
}
