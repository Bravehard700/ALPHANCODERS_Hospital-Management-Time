/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author HP
 */
public class PerawatLogin extends javax.swing.JFrame {

    /**
     * Creates new form PerawatLogin
     */
    public PerawatLogin() {
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
        LoginTitle = new javax.swing.JLabel();
        IDtitle = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        PINtitle = new javax.swing.JLabel();
        tfPIN = new javax.swing.JTextField();
        btSignIn = new javax.swing.JButton();
        btSignUp = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        LoginTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        LoginTitle.setText("LOGIN");
        jPanel1.add(LoginTitle);
        LoginTitle.setBounds(360, 120, 160, 90);

        IDtitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        IDtitle.setText("ID");
        jPanel1.add(IDtitle);
        IDtitle.setBounds(270, 210, 60, 40);
        jPanel1.add(tfID);
        tfID.setBounds(270, 250, 340, 40);

        PINtitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PINtitle.setText("PIN");
        jPanel1.add(PINtitle);
        PINtitle.setBounds(270, 320, 60, 30);

        tfPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPINActionPerformed(evt);
            }
        });
        jPanel1.add(tfPIN);
        tfPIN.setBounds(270, 350, 340, 40);

        btSignIn.setBackground(new java.awt.Color(204, 204, 204));
        btSignIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSignIn.setText("SIGN IN");
        jPanel1.add(btSignIn);
        btSignIn.setBounds(510, 430, 100, 30);

        btSignUp.setBackground(new java.awt.Color(204, 204, 204));
        btSignUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSignUp.setText("SIGN UP");
        btSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btSignUp);
        btSignUp.setBounds(270, 430, 100, 30);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Blank.png"))); // NOI18N
        jPanel1.add(BG);
        BG.setBounds(0, 0, 920, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSignUpActionPerformed

    private void tfPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPINActionPerformed

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
            java.util.logging.Logger.getLogger(PerawatLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerawatLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerawatLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerawatLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerawatLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel IDtitle;
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JLabel PINtitle;
    private javax.swing.JButton btSignIn;
    private javax.swing.JButton btSignUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfPIN;
    // End of variables declaration//GEN-END:variables
}
