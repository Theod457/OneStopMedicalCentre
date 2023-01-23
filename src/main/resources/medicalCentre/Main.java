/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.resources.medicalCentre;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author raghavendhra
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    // jLabel1 = new java.swing.JLabel();
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
        jLabel3 = new javax.swing.JLabel();
        jLogOutButton = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jClickHereButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jBookMenu = new javax.swing.JMenuItem();
        jUpcomingMenu = new javax.swing.JMenuItem();
        jHistoryMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jEventMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jDiseaseCheckerMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(1550, 850));
        setPreferredSize(new java.awt.Dimension(1550, 825));
        setSize(new java.awt.Dimension(1550, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(14, 93, 109));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AMRITA HOSPITAL");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/hospitalIcon.png"))); // NOI18N

        jLogOutButton.setBackground(new java.awt.Color(16, 153, 153));
        jLogOutButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLogOutButton.setForeground(new java.awt.Color(255, 255, 255));
        jLogOutButton.setText("LOG OUT");
        jLogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(jLabel11)
                        .addContainerGap(935, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(317, 317, 317)
                        .addComponent(jLogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(55, 55, 55))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 170));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 825, 1447, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setText("WELCOME TO AMRITA HOSPITAL");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 778, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/HOME BANNER.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 820, 450));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("ABOUT US");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 590, 48));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Amrita Hospital is located at Penang, Malaysia and has been providing the best quality medical ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 680, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("services, as well as being equipped with the best doctors from all across Malaysia since its ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 350, 640, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("establishment in 2018. Our medical centre have specializations in several fields including ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("cardiologist, otolaryngologist, neurologist, gastroenterologist, pulmonologist, and ophthalmologist.  ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, 720, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/Hotline.png"))); // NOI18N
        jLabel12.setText("EMERGENCY HOTLINE ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 490, 250, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel15.setText("+6019-911 9111");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 530, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/Mail.png"))); // NOI18N
        jLabel14.setText(" EMAIL");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 580, 160, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel16.setText("amrita_hospital@gmail.com");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 620, 270, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/Location (2).png"))); // NOI18N
        jLabel13.setText("VENUE");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 670, 200, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel17.setText("23, Jalan Sungai Dua, Kampung Dua Bukit, 11700 Gelugor, Penang");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 710, 590, -1));

        jPanel2.setLayout(null);

        jClickHereButton.setBackground(new java.awt.Color(16, 153, 153));
        jClickHereButton.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jClickHereButton.setForeground(new java.awt.Color(255, 255, 255));
        jClickHereButton.setText("CLICK HERE");
        jClickHereButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClickHereButtonActionPerformed(evt);
            }
        });
        jPanel2.add(jClickHereButton);
        jClickHereButton.setBounds(230, 730, 410, 50);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/FrontpageBackground.png"))); // NOI18N
        jPanel2.add(jLabel18);
        jLabel18.setBounds(-7, 160, 1560, 660);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1550, 820));

        jMenu1.setText("APPOINTMENT");
        jMenu1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        jBookMenu.setText("Book Appoinment");
        jBookMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBookMenuActionPerformed(evt);
            }
        });
        jMenu1.add(jBookMenu);

        jUpcomingMenu.setText("Upcoming Appointment");
        jUpcomingMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpcomingMenuActionPerformed(evt);
            }
        });
        jMenu1.add(jUpcomingMenu);

        jHistoryMenu.setText("Appointment History");
        jHistoryMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHistoryMenuActionPerformed(evt);
            }
        });
        jMenu1.add(jHistoryMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("EVENT");
        jMenu2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        jEventMenu.setText("Event blog");
        jEventMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEventMenuActionPerformed(evt);
            }
        });
        jMenu2.add(jEventMenu);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("DISEASE CHECKER");
        jMenu3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        jDiseaseCheckerMenu.setText("Check for possible disease");
        jDiseaseCheckerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDiseaseCheckerMenuActionPerformed(evt);
            }
        });
        jMenu3.add(jDiseaseCheckerMenu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jClickHereButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClickHereButtonActionPerformed
        AppointmentMainPage amp = new AppointmentMainPage();
        dispose();
        amp.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jClickHereButtonActionPerformed

    private void jBookMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBookMenuActionPerformed
        SelectSpecialisation s = new SelectSpecialisation();
        dispose();
        s.setVisible(true); 
    }//GEN-LAST:event_jBookMenuActionPerformed

    private void jUpcomingMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpcomingMenuActionPerformed
        ViewAppointments va = new ViewAppointments();
        dispose();
        va.setVisible(true);
    }//GEN-LAST:event_jUpcomingMenuActionPerformed

    private void jHistoryMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHistoryMenuActionPerformed
        AppointmentHistory ap = new AppointmentHistory();
        dispose();
        ap.setVisible(true);
    }//GEN-LAST:event_jHistoryMenuActionPerformed

    private void jEventMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEventMenuActionPerformed
        EventBlog eb = new EventBlog();
        dispose();
        eb.setVisible(true);
    }//GEN-LAST:event_jEventMenuActionPerformed

    private void jDiseaseCheckerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDiseaseCheckerMenuActionPerformed
        DiseaseChecker dc = new DiseaseChecker();
        dispose();
        dc.setVisible(true);
    }//GEN-LAST:event_jDiseaseCheckerMenuActionPerformed

    private void jLogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton1ActionPerformed
        int ans = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?",
                        "Warning", JOptionPane.YES_NO_OPTION);
        if (ans == JOptionPane.YES_OPTION) {    
            FrontPage fp = new FrontPage();
            dispose();
            fp.setVisible(true);
        } 
    }// GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jBookMenu;
    private javax.swing.JButton jClickHereButton;
    private javax.swing.JMenuItem jDiseaseCheckerMenu;
    private javax.swing.JMenuItem jEventMenu;
    private javax.swing.JMenuItem jHistoryMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jLogOutButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem jUpcomingMenu;
    // End of variables declaration//GEN-END:variables
}
