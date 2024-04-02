/*
/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uiteco.component;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.JComponent;
import javax.swing.border.SoftBevelBorder;
import com.uiteco.component.RoundedBorder;



/**
 *
 * @author nddmi
 */
public class PageTemplate extends javax.swing.JFrame {

    /**
     * Creates new form PageWithHeaderFooter
     */
    public PageTemplate() {
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

        leftPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        imageAvatar2 = new com.uiteco.component.ImageAvatar();
        imageAvatar13 = new com.uiteco.component.ImageAvatar();
        imageAvatar14 = new com.uiteco.component.ImageAvatar();
        imageAvatar15 = new com.uiteco.component.ImageAvatar();
        imageAvatar16 = new com.uiteco.component.ImageAvatar();
        rightPanel = new javax.swing.JPanel();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        jLabel1 = new javax.swing.JLabel();
        gradientPanel1 = new com.uiteco.component.GradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        searchPane = new javax.swing.JTextPane();
        imageAvatar17 = new com.uiteco.component.ImageAvatar();
        imageAvatar18 = new com.uiteco.component.ImageAvatar();
        imageAvatar19 = new com.uiteco.component.ImageAvatar();
        imageAvatar20 = new com.uiteco.component.ImageAvatar();
        label1 = new java.awt.Label();
        backButton = new com.uiteco.component.ImageAvatar();
        forwardButton = new com.uiteco.component.ImageAvatar();
        jButton1 = new javax.swing.JButton();
        imageAvatar5 = new com.uiteco.component.ImageAvatar();
        imageAvatar6 = new com.uiteco.component.ImageAvatar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 243, 244));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setForeground(new java.awt.Color(102, 102, 102));

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-home-17.png"))); // NOI18N
        jButton2.setText("Sự kiện");
        jButton2.setBorderPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 153, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ranking-17.png"))); // NOI18N
        jButton3.setText("Cuộc thi");
        jButton3.setBorderPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 153, 153));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-group-17.png"))); // NOI18N
        jButton5.setText("Câu lạc bộ");
        jButton5.setBorderPainted(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 153, 153));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-account-17.png"))); // NOI18N
        jButton6.setText("Tài khoản");
        jButton6.setBorderPainted(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(153, 153, 153));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-log-out-17.png"))); // NOI18N
        jButton7.setText("Đăng xuất");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("ECO");

        imageAvatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dhqg.png"))); // NOI18N

        imageAvatar13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uit.jpg"))); // NOI18N

        imageAvatar14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IS.jpg"))); // NOI18N
        imageAvatar13.add(imageAvatar14);
        imageAvatar14.setBounds(0, 0, 0, 0);

        imageAvatar15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IS.jpg"))); // NOI18N

        imageAvatar16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IS.jpg"))); // NOI18N
        imageAvatar15.add(imageAvatar16);
        imageAvatar16.setBounds(0, 0, 0, 0);

        imageAvatar13.add(imageAvatar15);
        imageAvatar15.setBounds(0, 0, 0, 0);

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addComponent(imageAvatar13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageAvatar13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE)
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));

        dateChooser1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        dateChooser1.setForeground(new java.awt.Color(51, 102, 255));

        gradientPanel1.setBackground(new java.awt.Color(255, 234, 234));
        gradientPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 1, true));

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Bộ lọc");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-history-24.png"))); // NOI18N
        jLabel4.setText("Lịch sử");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel1))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)))
                .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        centerPanel.setBackground(new java.awt.Color(242, 243, 244));

        searchPane.setBackground(new java.awt.Color(255, 255, 255));
        searchPane.setBorder(getRoundedBorder(searchPane, 7, 1));
        searchPane.setForeground(new java.awt.Color(102, 102, 102));

        imageAvatar17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-17.png"))); // NOI18N

        imageAvatar18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IS.jpg"))); // NOI18N
        imageAvatar17.add(imageAvatar18);
        imageAvatar18.setBounds(0, 0, 0, 0);

        imageAvatar19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IS.jpg"))); // NOI18N

        imageAvatar20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IS.jpg"))); // NOI18N
        imageAvatar19.add(imageAvatar20);
        imageAvatar20.setBounds(0, 0, 0, 0);

        imageAvatar17.add(imageAvatar19);
        imageAvatar19.setBounds(0, 0, 0, 0);

        backButton.setForeground(new java.awt.Color(242, 243, 244));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-back-36.png"))); // NOI18N

        forwardButton.setForeground(new java.awt.Color(242, 243, 244));
        forwardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-forward-36.png"))); // NOI18N
        forwardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forwardButtonMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-notification-17.png"))); // NOI18N
        jButton1.setToolTipText("Notifications");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        imageAvatar5.setBorderSize(2);
        imageAvatar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png"))); // NOI18N

        imageAvatar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png"))); // NOI18N
        imageAvatar5.add(imageAvatar6);
        imageAvatar6.setBounds(0, 0, 0, 0);

        javax.swing.GroupLayout centerPanelLayout = new javax.swing.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addComponent(forwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                        .addComponent(imageAvatar17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchPane, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imageAvatar5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageAvatar5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(searchPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imageAvatar17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(676, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(centerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(centerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
        unHighlightButton(jButton6);
        jButton6.setBorder(new SoftBevelBorder(10));
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
        highlightButton(jButton6);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        unHighlightButton(jButton5);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        highlightButton(jButton5);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        unHighlightButton(jButton3);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        highlightButton(jButton3);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        unHighlightButton(jButton2);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        highlightButton(jButton2);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void forwardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forwardButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_forwardButtonMouseClicked

    private void highlightButton(javax.swing.JButton button) {
        button.setBackground(new Color(51, 102, 255));
        button.setForeground(new Color(255, 255, 255));

    }

    private void unHighlightButton(javax.swing.JButton button) {
        button.setBackground(new Color(255, 255, 255));
        button.setForeground(new Color(153, 153, 153));
    }

    private RoundedBorder getRoundedBorder(String foregroundColor, int radius, int stroke) {
        Color background = new Color(255, 255, 255);
        Color outline = background;
        Color foreground;
        if (foregroundColor.equalsIgnoreCase("white")) {
            foreground = new Color(255, 255, 255);
        } else if (foregroundColor.equalsIgnoreCase("black")) {
            foreground = new Color(0, 0, 0);
        } else if (foregroundColor.equalsIgnoreCase("grey") || foregroundColor.equalsIgnoreCase("light grey")) {
            foreground = new Color(187, 187, 187);
        } else {
            foreground = new Color(255, 255, 255); // Dark grey
        }
        return new RoundedBorder(background, outline, foreground, radius, stroke);
    }

    private RoundedBorder getRoundedBorder(JComponent c, int radius, int stroke) {
//        Color background = c.getBackground();
//        Color foreground = c.getForeground();
         if (stroke > radius) {
             stroke = radius;
         }
//        final Color background = new Color(204, 204, 255);
        final Color background = c.getBackground();
        final Color border = Color.BLACK;
        final Color foreground = Color.WHITE;
        return new RoundedBorder(background, border, foreground, radius, stroke);
    }

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
//            java.util.logging.Logger.getLogger(PageTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PageTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PageTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PageTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

//        styleButtons();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageTemplate().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.uiteco.component.ImageAvatar backButton;
    private javax.swing.JPanel centerPanel;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.uiteco.component.ImageAvatar forwardButton;
    private com.uiteco.component.GradientPanel gradientPanel1;
    private com.uiteco.component.ImageAvatar imageAvatar13;
    private com.uiteco.component.ImageAvatar imageAvatar14;
    private com.uiteco.component.ImageAvatar imageAvatar15;
    private com.uiteco.component.ImageAvatar imageAvatar16;
    private com.uiteco.component.ImageAvatar imageAvatar17;
    private com.uiteco.component.ImageAvatar imageAvatar18;
    private com.uiteco.component.ImageAvatar imageAvatar19;
    private com.uiteco.component.ImageAvatar imageAvatar2;
    private com.uiteco.component.ImageAvatar imageAvatar20;
    private com.uiteco.component.ImageAvatar imageAvatar5;
    private com.uiteco.component.ImageAvatar imageAvatar6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Label label1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextPane searchPane;
    // End of variables declaration//GEN-END:variables
}
