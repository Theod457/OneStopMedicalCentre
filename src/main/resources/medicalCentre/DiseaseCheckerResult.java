package main.resources.medicalCentre;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class DiseaseCheckerResult extends javax.swing.JFrame {

    /**
     * Creates new form DiseaseChecker
     */
    public DiseaseCheckerResult() {
        initComponents();
        // obtain the top 3 most probably disease by sorting and then selecting the top 3 keys with the highest values in diseaseCheck
        List<String> keys = DiseaseChecker.diseaseCheck.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(3).map(Map.Entry::getKey).collect(Collectors.toList());
        int noOfDiseaseShown = 0;
        for (int value: DiseaseChecker.diseaseCheck.values()){
            if(value>0)
                noOfDiseaseShown++;
            if(noOfDiseaseShown == 3)
                break;
        }
        if (noOfDiseaseShown == 1){
            Disease1.setText(keys.get(0));
            Disease2.setText(null);
            Disease3.setText(null);
        }
        else if (noOfDiseaseShown == 2){
            Disease1.setText(keys.get(0));
            Disease2.setText(keys.get(1));
            Disease3.setText(null);
        }
        else if (noOfDiseaseShown == 3){
            Disease1.setText(keys.get(0));
            Disease2.setText(keys.get(1));
            Disease3.setText(keys.get(2));
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Disease1 = new javax.swing.JLabel();
        Disease2 = new javax.swing.JLabel();
        Disease3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1550, 825));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/PersonShivering.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 380, 520, 441);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("You are most likely suffering from:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(690, 170, 490, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/hospitalIcon.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 170, 170);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel3.setText("RESULT");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(650, 60, 350, 50);

        Back.setBackground(new java.awt.Color(0, 102, 102));
        Back.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel2.add(Back);
        Back.setBounds(1360, 50, 130, 57);

        Disease1.setBackground(new java.awt.Color(153, 255, 153));
        Disease1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Disease1.setText("Disease 1");
        jPanel2.add(Disease1);
        Disease1.setBounds(690, 230, 400, 50);

        Disease2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Disease2.setText("Disease 2");
        jPanel2.add(Disease2);
        Disease2.setBounds(690, 300, 390, 50);

        Disease3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Disease3.setText("Disease 3");
        jPanel2.add(Disease3);
        Disease3.setBounds(690, 370, 410, 50);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Request an appointment now to obtain professional disease diagnosis ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(690, 600, 760, 27);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setText("Do note that Amrita's disease checker is merely a guideline and should");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(690, 520, 760, 27);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setText("NOT be treated as a substitute to professional medical advice.");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(690, 550, 800, 30);

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REQUEST APPOINTMENT");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(800, 700, 380, 50);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel9.setText("from Amrita Hospital's doctors.");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(690, 630, 350, 27);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/DiseaseCheckerResultLogo.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(610, 60, 86, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalCentre/asset/DiseaseCheckerBackground.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 1550, 870);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        DiseaseChecker dc = new DiseaseChecker();
        dispose();
        dc.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SelectSpecialisation ss = new SelectSpecialisation();
        dispose();
        ss.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DiseaseChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiseaseChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiseaseChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiseaseChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiseaseCheckerResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Disease1;
    private javax.swing.JLabel Disease2;
    private javax.swing.JLabel Disease3;
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
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
