package main.resources.medicalCentre;

import java.io.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author raghavendhra
 */
public class ViewAppointments extends javax.swing.JFrame {
    public static int appID;

    /**
     * Creates new form ViewAppointments
     */
    public ViewAppointments() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onestopmedicalcentre", "root",
                    "WinMyDowSQL119");
            Statement stmt = conn.createStatement();
            ResultSet rp = stmt.executeQuery(
                    "select a.APPOINTMENT_ID, d.DOCTOR_NAME, a.APPOINTMENT_DATE, a.APPOINTMENT_TIME from appointment as a,doctor as d where a.DOCTOR_ID=d.DOCTOR_ID and (a.APPOINTMENT_DATE >=(select curdate()) and USER_ID="
                            + Login.userIDInput + ")");
            int x = 800;
            int w = 950;
            int y = 250;

            int labelButtonSequence = 1;
            while (rp.next()) {
//                rp.next();
//                rp.previous();
                JLabel name2 = new JLabel();
                name2.setFont(new java.awt.Font("Ubuntu", 1, 17));
                name2.setText("Name : ");
                this.add(name2);
                name2.setOpaque(true);
                name2.setBounds(x, y, 80, 50);
                // y+=50

                JLabel name1 = new JLabel();
                name1.setFont(new java.awt.Font("Ubuntu", 1, 17));
                name1.setText(String.valueOf(rp.getString("d.DOCTOR_NAME")));
                this.add(name1);
                name1.setOpaque(true);
                name1.setBounds(w, y, 200, 50);
                // System.out.println(rp.getString(2));
                y += 40;

                JLabel date2 = new JLabel();
                date2.setFont(new java.awt.Font("Ubuntu", 1, 17));
                date2.setText("Date : ");
                this.add(date2);
                date2.setOpaque(true);
                date2.setBounds(x, y, 80, 50);

                JLabel date = new JLabel();
                date.setFont(new java.awt.Font("Ubuntu", 1, 17));
                date.setText(String.valueOf(rp.getDate("a.APPOINTMENT_DATE")));
                this.add(date);
                date.setOpaque(true);
                date.setBounds(w, y, 100, 50);
                // x+=100;
                y += 40;
                // y-=50;

                JLabel time2 = new JLabel();
                time2.setFont(new java.awt.Font("Ubuntu", 1, 17));
                time2.setText("Time : ");
                this.add(time2);
                time2.setOpaque(true);
                time2.setBounds(x, y, 100, 50);
                // y-=50;

                JLabel time = new JLabel();
                time.setFont(new java.awt.Font("Ubuntu", 1, 17));
                time.setText(String.valueOf(rp.getTime("a.APPOINTMENT_TIME")));
                this.add(time);
                time.setOpaque(true);
                time.setBounds(w, y, 150, 50);
                y += 55;

                appID = rp.getInt("APPOINTMENT_ID");
                // System.out.println(appID);
                ChooseAppointment.ea = 1;
                JButton editButton = new JButton("Edit Appointment");
                editButton.setToolTipText(String.valueOf(rp.getInt("APPOINTMENT_ID")));
                editButton.setFont(new java.awt.Font("Ubuntu", 1, 19));
                this.add(editButton);
                editButton.setOpaque(true);
                editButton.setBounds(700, y, 210, 45);
                editButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        appID = Integer.valueOf(editButton.getToolTipText());
//                        String oo = editButton.getText();
//                        int h = oo.length();
//                        // char ch = getCharFromString(o, h-1);
//                        // System.out.println(h);
//                        if (h == 17) {
//                            r = oo.charAt(h - 1) - '0';
//                        } else {
//                            int b = oo.charAt(h - 2) - '0';
//                            int bb = oo.charAt(h - 1) - '0';
//                            r = (b * 10) + bb;
//                        }
                        EditAppointment o = new EditAppointment();
                        dispose();
                        o.setVisible(true);
                    }
                });
                JButton cancelButton = new JButton("Cancel Appointment");
                cancelButton.setToolTipText(String.valueOf(rp.getInt("APPOINTMENT_ID")));
                cancelButton.setFont(new java.awt.Font("Ubuntu", 1, 19));
                this.add(cancelButton);
                cancelButton.setOpaque(true);
                cancelButton.setBounds(930, y, 230, 45);
                cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        appID = Integer.valueOf(cancelButton.getToolTipText());
//                        String oo = cancelButton.getText();
//                        int h = oo.length();
//                        // char ch = getCharFromString(o, h-1);
//                        // System.out.println(h);
//                        // System.out.println(h);
//                        if (h == 19) {
//                            r = oo.charAt(h - 1) - '0';
//                        } else {
//                            int b = oo.charAt(h - 2) - '0';
//                            int bb = oo.charAt(h - 1) - '0';
//                            r = (b * 10) + bb;
//                        }
                        CancelAppointment o = new CancelAppointment();
                        dispose();
                        o.setVisible(true);
                    }
                });
                x = 800;
                y += 50;
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.lightGray);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/hospitalIcon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Amrita Hospitals");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(524, 524, 524)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 32)); // NOI18N
        jLabel3.setText("Your Next Appointments");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(599, 599, 599)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 581, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(815, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Main m = new Main();
        dispose();
        m.setVisible(true);
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ChooseAppointment ca = new ChooseAppointment();
        dispose();
        ca.setVisible(true);
    }// GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAppointments.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAppointments.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAppointments.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAppointments.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAppointments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}