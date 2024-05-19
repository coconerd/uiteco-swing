/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.rightPanels;

import com.uiteco.main.App;

/**
 *
 * @author nddmi
 */
public class TaiKhoanRightPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form TaiKhoanRightPanel
     */
    public TaiKhoanRightPanel() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        gradientPanel1 = new com.uiteco.components.GradientPanel();
        imageAvatar1 = new com.uiteco.components.ImageAvatar();
        menu1 = new com.uiteco.ofTaiKhoanRightPanel.Menu();
        roundedPanel1 = new com.uiteco.components.RoundedPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        gradientPanel1.setColor1(new java.awt.Color(255, 0, 153));
        gradientPanel1.setColor2(new java.awt.Color(102, 0, 255));
        gradientPanel1.setDirection(com.uiteco.components.GradientPanel.Direction.DIAGONAL);
        gradientPanel1.setFade(false);
        gradientPanel1.setLayout(new java.awt.GridLayout());

        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/account-gradient.png"))); // NOI18N
        gradientPanel1.add(imageAvatar1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.4;
        add(gradientPanel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        add(menu1, gridBagConstraints);

        roundedPanel1.setBackground(new java.awt.Color(222, 222, 222));
        roundedPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 14, 1, 1));
        roundedPanel1.setRoundBottomLeft(30);
        roundedPanel1.setRoundBottomRight(30);
        roundedPanel1.setRoundTopLeft(30);
        roundedPanel1.setRoundTopRight(30);
        roundedPanel1.setLayout(new java.awt.GridLayout(3, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Tài khoản");
        roundedPanel1.add(jLabel5);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-email-24.png"))); // NOI18N
        jLabel1.setText(App.getSession().getEmail());
        jLabel1.setIconTextGap(15);
        roundedPanel1.add(jLabel1);

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-username-24.png"))); // NOI18N
        jLabel6.setText(App.getSession().getUsername());
        jLabel6.setIconTextGap(15);
        roundedPanel1.add(jLabel6);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(18, 8, 11, 8);
        add(roundedPanel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Menu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(18, 8, 0, 0);
        add(jLabel2, gridBagConstraints);

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.insets = new java.awt.Insets(21, 0, 0, 0);
        add(jSeparator1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.uiteco.components.GradientPanel gradientPanel1;
    private com.uiteco.components.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private com.uiteco.ofTaiKhoanRightPanel.Menu menu1;
    private com.uiteco.components.RoundedPanel roundedPanel1;
    // End of variables declaration//GEN-END:variables
}
