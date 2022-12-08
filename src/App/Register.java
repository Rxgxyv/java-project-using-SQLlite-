/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import Backend.AccountBackend;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegister = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblMobile = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        pwdPassword = new javax.swing.JPasswordField();
        txtMobile = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        lblAccountType = new javax.swing.JLabel();
        cmbAccountType = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        lblComfirm = new javax.swing.JLabel();
        pwdConfirm = new javax.swing.JPasswordField();
        cbShowPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book  Management System");

        lblRegister.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblRegister.setText("Register");

        lblUserName.setText("User Name: ");

        lblPassword.setText("Password:");

        lblMobile.setText("Mobile: ");

        lblEmail.setText("E-Mail:");

        txtMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMobileKeyTyped(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblAccountType.setText("Account Type: ");

        cmbAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select>", "Customer", "Librarian" }));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblComfirm.setText("Confirm Password:");

        cbShowPass.setText("Show Password");
        cbShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAccountType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblComfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pwdConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegister)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUserName)
                                .addComponent(pwdPassword)
                                .addComponent(txtMobile)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                            .addComponent(cmbAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addComponent(cbShowPass)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblRegister))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnBack)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComfirm)
                    .addComponent(pwdConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbShowPass))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMobile))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccountType))
                .addGap(51, 51, 51)
                .addComponent(btnRegister)
                .addGap(52, 52, 52))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String uname = txtUserName.getText();
        String pass = pwdPassword.getText();
        String confirmPass = pwdConfirm.getText();
        String email = txtEmail.getText();
        String mobile  = txtMobile.getText();
        
        if(uname.isEmpty()){
            JOptionPane.showMessageDialog(Register.this, "Enter user name");
            txtUserName.grabFocus();
        }
        else if(pass.isEmpty()){
            JOptionPane.showMessageDialog(Register.this, "Enter password");
            pwdPassword.grabFocus();
        }
        else if(confirmPass.isEmpty()){
            JOptionPane.showMessageDialog(Register.this, "Enter password again");
            pwdConfirm.grabFocus();
        }
        else if(email.isEmpty()){
            JOptionPane.showMessageDialog(Register.this, "Enter email address");
            txtEmail.grabFocus();
        }
        else if(mobile.isEmpty()){
            JOptionPane.showMessageDialog(Register.this, "Enter your mobile number");
            txtMobile.grabFocus();
        }
        else if(!pass.equals(confirmPass)){
            JOptionPane.showMessageDialog(Register.this, "Password Mismatch");
            pwdConfirm.grabFocus();
        }
        else{
            String accountType = (String)cmbAccountType.getSelectedItem();
            AccountBackend r = new AccountBackend();
            int status = r.addAccount(uname, pass, accountType, mobile, email);
            if(status == 1){
                JOptionPane.showMessageDialog(Register.this, "Registration successful");
                txtUserName.setText("");
                pwdPassword.setText("");
                pwdConfirm.setText("");
                txtEmail.setText("");
                txtMobile.setText("");
                cmbAccountType.setSelectedIndex(0);
            }else{
                JOptionPane.showMessageDialog(Register.this, "Registration failed");
            }
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
            evt.consume();
    }//GEN-LAST:event_txtMobileKeyTyped

    private void cbShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPassActionPerformed
        if(cbShowPass.isSelected()){
            pwdPassword.setEchoChar('\u0000');
            pwdConfirm.setEchoChar('\u0000');
        }else{
            pwdPassword.setEchoChar('•');
            pwdConfirm.setEchoChar('•');
        }
    }//GEN-LAST:event_cbShowPassActionPerformed

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
                if ("Windows".equals(info.getName())) {
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox cbShowPass;
    private javax.swing.JComboBox<String> cmbAccountType;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblComfirm;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField pwdConfirm;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}