package main.resources.medicalCentre;

import javax.swing.JOptionPane;
import main.resources.medicalCentre.AppointmentMainPage;
import main.resources.medicalCentre.FrontPage;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class EventBlog extends javax.swing.JFrame {

    /**
     * Creates new form EventBlog
     */
    public EventBlog() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Blood = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Medical = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/hospitalIcon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/EventLogo.png"))); // NOI18N
        jLabel3.setText("EVENT BLOG");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1550, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BACK");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 135, 45));

        jButton1.setBackground(new java.awt.Color(2, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOG OUT");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 190, 135, 45));

        Blood.setBackground(new java.awt.Color(0, 102, 51));
        Blood.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Blood.setForeground(java.awt.Color.white);
        Blood.setText("REGISTER");
        Blood.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Blood.setMargin(new java.awt.Insets(2, 2, 2, 2));
        Blood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodActionPerformed(evt);
            }
        });
        jPanel1.add(Blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(1115, 680, 210, 45));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/Blood Donation.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1550, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/Health Check.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1550, -1));

        Medical.setBackground(new java.awt.Color(0, 102, 51));
        Medical.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Medical.setForeground(java.awt.Color.white);
        Medical.setText("REGISTER");
        Medical.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Medical.setMargin(new java.awt.Insets(2, 2, 2, 2));
        Medical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicalActionPerformed(evt);
            }
        });
        jPanel1.add(Medical, new org.netbeans.lib.awtextra.AbsoluteConstraints(1115, 405, 210, 45));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setText("Blood Donation");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 670, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Participate in blood donation and claim your free gifts on every Saturday.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 700, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setText("Medical Check Up");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Free medical check up for those who are needed on every Wednesday.");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 430, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/PasswordBackground.png"))); // NOI18N
        Background.setText("jLabel1");
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, -1));

        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 1550, -1));


        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AppointmentMainPage amp = new AppointmentMainPage();
        dispose();
        amp.setVisible(true);      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrontPage fp = new FrontPage();
        dispose();
        fp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "You have successfully registered for the event!");
//        EventRegistered er = new EventRegistered();
//        dispose();
//        er.setVisible(true);   
    }//GEN-LAST:event_BloodActionPerformed

    private void MedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "You have successfully registered for the event!");
//        EventRegistered er = new EventRegistered();
//        dispose();
//        er.setVisible(true);        
    }//GEN-LAST:event_MedicalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EventBlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventBlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventBlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventBlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventBlog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Blood;
    private javax.swing.JButton Medical;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
