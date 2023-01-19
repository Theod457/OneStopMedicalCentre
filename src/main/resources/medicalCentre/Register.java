package main.resources.medicalCentre;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author raghavendhra
 */
public class Register extends javax.swing.JFrame {
    public static String usernameInput;
    public static String passwordInput;
    public static String repasswordInput;
    public static int passwordCheck = 0;
    public static int rePasswordCheck = 0;
    public static int usernameCheck = 0;
    public static int contactCheck = 0;
    public static int cityCheck = 0;
    public static int duplicateUserCheck = 0;
    public static String finalPasswordInput = null;
    public static String genderInput;
    public static String bloodInput;
    public static String contactInput;
    public static String cityInput;

    /**
     * Creates new form Signup
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        repassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        bloodg1 = new javax.swing.JComboBox<>();
        city = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        genders = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Contact = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.lightGray);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/hospitalIcon.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("            Amrita Hospital ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(473, 473, 473)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 19)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel4.setText("Sign Up Form");

        jPanel2.setBackground(java.awt.Color.orange);

        jPanel3.setBackground(java.awt.Color.lightGray);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel1.setText("Username                      :   ");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel2.setText("Password                      : ");

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel3.setText("Re-Enter Password     : ");

        repassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repasswordActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel6.setText("Blood Group                 :");

        bloodg1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "A+", "A-","B+", "B-", "AB+", "AB-" }));
        bloodg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodg1ActionPerformed(evt);
            }
        });

        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel5.setText("Gender                          :");

        genders.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gendersMouseClicked(evt);
            }
        });
        genders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendersActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel8.setText("City                              :");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel7.setText(" Contact                       :");

        Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(java.awt.Color.gray);
        jToggleButton1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jToggleButton1.setText("Sign up");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel2))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(password)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel5))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bloodg1, 0, 188, Short.MAX_VALUE)
                                                .addComponent(repassword))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(genders, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(repassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bloodg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(genders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(897, 897, 897)
                        .addComponent(jLabel4)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(616, 616, 616))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 283, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        usernameActionPerformed(evt);
        passwordActionPerformed(evt);
        repasswordActionPerformed(evt);
        bloodg1ActionPerformed(evt);
        cityActionPerformed(evt);
        gendersActionPerformed(evt);
        ContactActionPerformed(evt);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopmedicalcentre", "root",
                    "WinMyDowSQL119");
            Statement stmt = conn.createStatement();
            // stmt.executeQuery("use doctorappointment");
            ResultSet rs = stmt.executeQuery("select * from user");
            System.out.println(passwordCheck);
            System.out.println(rePasswordCheck);
            System.out.println(duplicateUserCheck);
            System.out.println(usernameCheck);
            System.out.println(contactCheck);
            System.out.println(cityCheck);

            if (passwordCheck == 1 && rePasswordCheck == 1 && duplicateUserCheck == 1 && usernameCheck == 1 && contactCheck == 1 && cityCheck == 1) {
                stmt.executeUpdate("insert into user(USER_NAME,USER_PASS,USER_GENDER,USER_BLOOD,USER_CONTACT,USER_ADDRESS)" + "values('"
                        + usernameInput + "','" + finalPasswordInput + "','" + genderInput + "','" + bloodInput + "'," + contactInput + ",'" + cityInput
                        + "')");
                JOptionPane.showMessageDialog(rootPane, "Registration Successful");
                Login login = new Login();
                dispose();
                login.setVisible(true);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }// GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main ma = new Main();
        dispose();
        ma.setVisible(true);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
        System.out.println("Testing ");
        usernameInput = username.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopmedicalcentre", "root",
                    "WinMyDowSQL119");
            Statement stmt = conn.createStatement();
            // stmt.executeQuery("use doctorappointment");
            ResultSet rs = stmt.executeQuery("select * from user");

            duplicateUserCheck = 0;
            while (rs.next())
            {
                if (!usernameInput.equals(rs.getString("USER_NAME"))) {
                    duplicateUserCheck = 1;
                    continue;
                }
                else {
                    duplicateUserCheck = 0;
                    JOptionPane.showMessageDialog(rootPane, "User Already Exists. Please Enter Another Username.");
                    break;
                }
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // set usernameCheck to 0 every time the "Register" button is clicked, so that multiple registration can be done during one program run
        usernameCheck = 0;
        int k = usernameInput.length(), l = 0;
        // check the username to make sure that not all of them are symbols, and not empty
        for (int i = 0; i < k; i++) {
            if (usernameInput.charAt(i) >= 33 && usernameInput.charAt(i) <= 57) {
                l++;
            } 
        }
        if (l == k) {
            usernameCheck = 0;
            JOptionPane.showMessageDialog(rootPane, "Please Enter a Valid Username");
        }
        else {
            usernameCheck = 1;
        }
        // System.out.println(usernameInput);
    }// GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
        passwordCheck = 0;
        passwordInput = password.getText();
        if (passwordInput.length() < 8 || passwordInput.length() > 20) {
            passwordCheck = 0;
            JOptionPane.showMessageDialog(rootPane, "Please Enter a Valid Password. Your Password Must Be Between 8 to 20 Characters Long.");
        }
        else{
            passwordCheck = 1;
        }
        // System.out.print(passwordInput);
    }// GEN-LAST:event_passwordActionPerformed

    private void repasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_repasswordActionPerformed
        // TODO add your handling code here:
        rePasswordCheck = 0;
        repasswordInput = repassword.getText();
        // check whether the passwords match if and only if the password is valid
        if (passwordCheck == 1) {
            if (passwordInput.equals(repasswordInput)) {
                rePasswordCheck = 1;
                finalPasswordInput = passwordInput;
                // System.out.println(finalPasswordInput);
                // stmt.executeUpdate("insert into user(username,password)"+ "values('"+
                // usernameInput + "','amrita')");
            } else {
                rePasswordCheck = 0;
                JOptionPane.showMessageDialog(rootPane, "Passwords Do not Match. Please Retype Your Passwords.");
            }
        }

    }// GEN-LAST:event_repasswordActionPerformed

    private void ContactActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ContactActionPerformed
        // TODO add your handling code here:
        contactCheck = 0;
        contactInput = Contact.getText();
        int k = contactInput.length();
        // input validation: All phone number globally can only have between 8 and 16 digits, including +
        // Lowest: Niue +683-xxxx (8 digits)
        // Highest: Austria +43-xxxxxxxxxxxxx (16 digits)
        if (k >= 8 && k <= 16) {
            contactCheck = 1;
        } else {
            contactCheck = 0;
            JOptionPane.showMessageDialog(rootPane, "Phone Number is Invalid. Please Enter a Valid Phone Number.");
        }
    }// GEN-LAST:event_ContactActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
        cityCheck = 0;
        cityInput = city.getText();
        if (cityInput.length() > 0) {
            cityCheck = 1;
        } else {
            cityCheck = 0;
            JOptionPane.showMessageDialog(rootPane, "Phone Number is Invalid. Please Enter a Valid Phone Number.");
        }
    }// GEN-LAST:event_cityActionPerformed

    private void gendersActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_gendersActionPerformed
        // TODO add your handling code here:
        genderInput = (String) genders.getSelectedItem();
        // System.out.println(genderInput);
    }// GEN-LAST:event_gendersActionPerformed

    private void gendersMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_gendersMouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_gendersMouseClicked

    private void bloodg1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bloodg1ActionPerformed
        // TODO add your handling code here:
        bloodInput = (String) bloodg1.getSelectedItem();

    }// GEN-LAST:event_bloodg1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        // try {
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // Connection conn =
        // DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopmedicalcentre", "root", "WinMyDowSQL119");
        // Statement stmt=conn.createStatement();
        // //stmt.executeQuery("use doctorappointment");
        // //ResultSet rs=stmt.executeQuery("select * from user");
        //// while(rs.next())
        //// {
        //// System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        // if(passwordCheck==1)
        // {
        // stmt.executeUpdate("insert into user(username,password)"+ "values('"+
        // usernameInput + "','"+finalPasswordInput+"')");
        // }
        // conn.close();
        // }
        // catch (Exception e) {
        // e.printStackTrace();
        // }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Contact;
    private javax.swing.JComboBox<String> bloodg1;
    private javax.swing.JTextField city;
    private javax.swing.JComboBox<String> genders;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField repassword;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}