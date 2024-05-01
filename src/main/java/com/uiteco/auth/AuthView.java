/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uiteco.auth;

/**
 *
 * @author nddmi
 */
public class AuthView extends javax.swing.JFrame {

    private AuthModel authModel;

    /**
     * Creates new form Test
     */
    public AuthView() {
        setAuthModel(new AuthModel());
        initComponents();
    }

    public AuthModel getAuthModel() {
        return authModel;
    }

    public void setAuthModel(AuthModel authModel) {
        this.authModel = authModel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel1 = new com.uiteco.components.ImagePanel();
        gradientPanel1 = new com.uiteco.components.GradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imageAvatar1 = new com.uiteco.components.ImageAvatar();
        roundedPanel1 = new com.uiteco.components.RoundedPanel();
        imageAvatar2 = new com.uiteco.components.ImageAvatar();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailForm = new javax.swing.JTextField();
        accountButton = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordForm = new javax.swing.JPasswordField();
        showButton = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        onPremiseNoti = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagePanel1.setImage(new javax.swing.ImageIcon(getClass().getResource("/uit-background.jpg"))); // NOI18N

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(imagePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 890, 720));

        gradientPanel1.setBackground(new java.awt.Color(221, 221, 221));
        gradientPanel1.setColor1(new java.awt.Color(245, 244, 246));
        gradientPanel1.setColor2(new java.awt.Color(245, 244, 246));
        gradientPanel1.setMaximumSize(new java.awt.Dimension(400, 720));
        gradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ĐẠI HỌC QUỐC GIA TP.HCM");
        gradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("TRƯỜNG ĐẠI HỌC CÔNG NGHỆ THÔNG TIN");
        gradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 30));

        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university.png"))); // NOI18N
        imageAvatar1.setShape(com.uiteco.components.ImageAvatar.SHAPE.RECT);
        gradientPanel1.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 40));

        roundedPanel1.setBackground(new java.awt.Color(51, 204, 255));
        roundedPanel1.setRoundBottomLeft(100);
        roundedPanel1.setRoundBottomRight(100);
        roundedPanel1.setRoundTopLeft(100);
        roundedPanel1.setRoundTopRight(100);

        imageAvatar2.setBackground(new java.awt.Color(255, 153, 153));
        imageAvatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-graduate-96.png"))); // NOI18N

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gradientPanel1.add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 110, 100));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Education");
        gradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Connection");
        gradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 90, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Opportunities");
        gradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 120, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("UIT ECO");
        gradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 80, 20));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(53, 150, 255));
        emailLabel.setText("Tài khoản");
        gradientPanel1.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 372, -1));

        emailForm.setBackground(new java.awt.Color(255, 255, 255));
        emailForm.setForeground(new java.awt.Color(221, 221, 221));
        emailForm.setText("Email");
        emailForm.setToolTipText("Nhập email");
        emailForm.setMinimumSize(new java.awt.Dimension(0, 0));
        emailForm.setPreferredSize(new java.awt.Dimension(64, 20));
        emailForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFormFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFormFocusLost(evt);
            }
        });
        emailForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailFormMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emailFormMouseExited(evt);
            }
        });
        emailForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFormActionPerformed(evt);
            }
        });
        emailForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailFormKeyTyped(evt);
            }
        });
        gradientPanel1.add(emailForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 340, 35));

        accountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/account-gradient.png"))); // NOI18N
        accountButton.setToolTipText("Chuyển qua nhập username");
        accountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountButtonMouseClicked(evt);
            }
        });
        gradientPanel1.add(accountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, 40));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(53, 150, 255));
        passwordLabel.setText("Mật khẩu");
        gradientPanel1.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 372, -1));

        passwordForm.setBackground(new java.awt.Color(255, 255, 255));
        passwordForm.setForeground(new java.awt.Color(221, 221, 221));
        passwordForm.setText("***");
        passwordForm.setToolTipText("Nhập mật khẩu");
        passwordForm.setEchoChar('*');
        passwordForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFormFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFormFocusLost(evt);
            }
        });
        passwordForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFormMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordFormMouseExited(evt);
            }
        });
        passwordForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFormKeyTyped(evt);
            }
        });
        gradientPanel1.add(passwordForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 340, 35));

        showButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye.png"))); // NOI18N
        showButton.setToolTipText("Hiển thị mật khẩu");
        showButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showButtonMouseClicked(evt);
            }
        });
        gradientPanel1.add(showButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, 40));

        loginButton.setBackground(new java.awt.Color(0, 153, 255));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Đăng nhập");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        gradientPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 368, 40));

        onPremiseNoti.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        onPremiseNoti.setForeground(new java.awt.Color(255, 51, 51));
        onPremiseNoti.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gradientPanel1.add(onPremiseNoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 360, 90));

        getContentPane().add(gradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void highlight(javax.swing.JComponent comp) {
        comp.setForeground(new java.awt.Color(153, 153, 153));
    }

    private void unHighlight(javax.swing.JComponent comp) {
        comp.setForeground(new java.awt.Color(221, 221, 221));
    }


    private void emailFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailFormMouseClicked
        if (!inEmailForm && emailForm.getText().equals(receiveEmail ? "Email" : "Username")) {
            highlight(emailForm);
            emailForm.setText("");
        }
        if ("".equals(new String(passwordForm.getPassword()))) {
            unHighlight(passwordForm);
            passwordForm.setText("***");
//            passwordForm.setEchoChar((char) 0);
        }
        inEmailForm = true;
        inPasswordForm = false;
    }//GEN-LAST:event_emailFormMouseClicked

    private void emailFormMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailFormMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFormMouseExited

    private void emailFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFormActionPerformed

    private void emailFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFormKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFormKeyTyped

    private void passwordFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFormMouseClicked
        // TODO add your handling code here:
        if (!inPasswordForm && "***".equals(new String(passwordForm.getPassword()))) {
            highlight(passwordForm);
            passwordForm.setText("");
//            passwordForm.setEchoChar('*');
        }
        if (emailForm.getText().equals("")) {
            unHighlight(emailForm);
            emailForm.setText(receiveEmail ? "Email" : "Username");
        }
        inPasswordForm = true;
        inEmailForm = false;
    }//GEN-LAST:event_passwordFormMouseClicked

    private void passwordFormMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFormMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFormMouseExited

    private void passwordFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFormKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFormKeyTyped

    private void showButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showButtonMouseClicked
        // TODO add your handling code here:
        passwordHidden = !passwordHidden;
        if (!passwordHidden) {
            passwordForm.setEchoChar((char) 0);
            showButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye-hide.png")));
            showButton.setToolTipText("Ẩn mật khẩu");
        } else {
            passwordForm.setEchoChar('*');
            showButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye.png")));
            showButton.setToolTipText("Hiển thị mật khẩu");
        }
    }//GEN-LAST:event_showButtonMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        // TODO add your handling code here:
        String password = new String(passwordForm.getPassword());
        if (password.equals("***")) {
            password = null;
        }

        try {

            if (receiveEmail) {
                String email = emailForm.getText();
                authModel.loginWithEmail(email, password);
            } else {
                String username = emailForm.getText();
                authModel.loginWithUsername(username, password);
            }

            System.out.println("Login successful");
            onPremiseNoti.setForeground(java.awt.Color.green);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof MissingCredentialsException || e instanceof InvalidCredentialsException) {
                onPremiseNoti.setText(e.getMessage());
            } else if (e instanceof BadCredentialsFormatException) {
                onPremiseNoti.setText(e.getMessage());
            }
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void emailFormFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFormFocusGained
        // TODO add your handling code here:
        if (!inEmailForm && emailForm.getText().equals(receiveEmail ? "Email" : "Username")) {
            highlight(emailForm);
            emailForm.setText("");
        }
        if ("".equals(new String(passwordForm.getPassword()))) {
            unHighlight(passwordForm);
            passwordForm.setText("***");
//            passwordForm.setEchoChar((char) 0);
        }
        inEmailForm = true;
        inPasswordForm = false;
    }//GEN-LAST:event_emailFormFocusGained

    private void emailFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFormFocusLost
        // TODO add your handling code here:
        if (emailForm.getText().equals("")) {
            unHighlight(emailForm);
            emailForm.setText(receiveEmail ? "Email" : "Username");
        }
        inEmailForm = false;
    }//GEN-LAST:event_emailFormFocusLost

    private void passwordFormFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFormFocusGained
        // TODO add your handling code here:
        if (!inPasswordForm && "***".equals(new String(passwordForm.getPassword()))) {
            highlight(passwordForm);
            passwordForm.setText("");
//            passwordForm.setEchoChar('*');
        }
        if (emailForm.getText().equals("")) {
            unHighlight(emailForm);
            emailForm.setText(receiveEmail ? "Email" : "Username");
        }
        inPasswordForm = true;
        inEmailForm = false;
    }//GEN-LAST:event_passwordFormFocusGained

    private void passwordFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFormFocusLost
        // TODO add your handling code here:
        if ("".equals(new String(passwordForm.getPassword()))) {
            unHighlight(passwordForm);
            passwordForm.setText("***");
//            passwordForm.setEchoChar((char) 0);
        }
        inPasswordForm = false;

    }//GEN-LAST:event_passwordFormFocusLost

    private void accountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountButtonMouseClicked
        // TODO add your handling code here:
        receiveEmail = !receiveEmail;
        if (receiveEmail) {
            accountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/account-gradient.png")));
            accountButton.setToolTipText("Chuyển qua nhập username");
            emailForm.setToolTipText("Nhập email");
        } else {
            accountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/email-gradient.png")));
            accountButton.setToolTipText("Chuyển qua nhập email");
            emailForm.setToolTipText("Nhập username");
        }
    }//GEN-LAST:event_accountButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AuthView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AuthView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AuthView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AuthView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountButton;
    private javax.swing.JTextField emailForm;
    private javax.swing.JLabel emailLabel;
    private com.uiteco.components.GradientPanel gradientPanel1;
    private com.uiteco.components.ImageAvatar imageAvatar1;
    private com.uiteco.components.ImageAvatar imageAvatar2;
    private com.uiteco.components.ImagePanel imagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel onPremiseNoti;
    private javax.swing.JPasswordField passwordForm;
    private javax.swing.JLabel passwordLabel;
    private com.uiteco.components.RoundedPanel roundedPanel1;
    private javax.swing.JLabel showButton;
    // End of variables declaration//GEN-END:variables

    private boolean inEmailForm = false;
    private boolean inPasswordForm = false;
    private boolean passwordHidden = true;
    private boolean receiveEmail = true;
}
