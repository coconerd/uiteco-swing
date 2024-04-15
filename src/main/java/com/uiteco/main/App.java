/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uiteco.main;

import com.uiteco.components.RoundedBorder;
import java.awt.Color;
import javax.swing.JComponent;
import com.uiteco.contentPanels.SuKienPanel;
import com.uiteco.contentPanels.CuocThiPanel;
import com.uiteco.contentPanels.CauLacBoPanel;
import com.uiteco.contentPanels.ForumPanel;
import com.uiteco.contentPanels.TinNhanPanel;
import com.uiteco.contentPanels.TaiKhoanPanel;
import com.uiteco.rightPanels.SuKienRightPanel;
import com.uiteco.rightPanels.CuocThiRightPanel;
import com.uiteco.rightPanels.CauLacBoRightPanel;
import com.uiteco.rightPanels.ForumRightPanel;
import com.uiteco.rightPanels.TinNhanRightPanel;
import com.uiteco.rightPanels.TaiKhoanRightPanel;

/**
 *
 * @author nddmi
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form TestMain
     */
    public App() {
        initComponents();
        initContentPanel();
        initRightPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        leftPanel = new javax.swing.JPanel();
        suKienButton = new javax.swing.JButton();
        cuocThiButton = new javax.swing.JButton();
        cauLacBoButton = new javax.swing.JButton();
        forumButton = new javax.swing.JButton();
        dangXuatButton = new javax.swing.JButton();
        ecoLabel = new javax.swing.JLabel();
        imageAvatar2 = new com.uiteco.components.ImageAvatar();
        imageAvatar13 = new com.uiteco.components.ImageAvatar();
        imageAvatar14 = new com.uiteco.components.ImageAvatar();
        imageAvatar15 = new com.uiteco.components.ImageAvatar();
        imageAvatar16 = new com.uiteco.components.ImageAvatar();
        tinNhanButton = new javax.swing.JButton();
        headerPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nextButton = new com.uiteco.components.ImageAvatar();
        prevButton = new com.uiteco.components.ImageAvatar();
        jPanel2 = new javax.swing.JPanel();
        avatar = new com.uiteco.components.ImageAvatar();
        imageAvatar6 = new com.uiteco.components.ImageAvatar();
        notificationButton = new javax.swing.JButton();
        searchPaneWrapper = new javax.swing.JScrollPane();
        searchPane = new javax.swing.JTextPane();
        imageAvatar17 = new com.uiteco.components.ImageAvatar();
        imageAvatar18 = new com.uiteco.components.ImageAvatar();
        imageAvatar19 = new com.uiteco.components.ImageAvatar();
        imageAvatar20 = new com.uiteco.components.ImageAvatar();
        rightPanel = new com.uiteco.swing.ContentPanel();
        contentPanel = new com.uiteco.swing.ScrollableContentPanel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1280, 720));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setForeground(new java.awt.Color(102, 102, 102));

        suKienButton.setBackground(new java.awt.Color(51, 102, 255));
        suKienButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        suKienButton.setForeground(new java.awt.Color(255, 255, 255));
        suKienButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-home-17.png"))); // NOI18N
        suKienButton.setText("Sự kiện");
        suKienButton.setBorderPainted(false);
        suKienButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suKienButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suKienButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suKienButtonMouseExited(evt);
            }
        });
        suKienButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suKienButtonActionPerformed(evt);
            }
        });

        cuocThiButton.setBackground(new java.awt.Color(255, 255, 255));
        cuocThiButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cuocThiButton.setForeground(new java.awt.Color(153, 153, 153));
        cuocThiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ranking-17.png"))); // NOI18N
        cuocThiButton.setText("Cuộc thi");
        cuocThiButton.setBorderPainted(false);
        cuocThiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuocThiButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cuocThiButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cuocThiButtonMouseExited(evt);
            }
        });
        cuocThiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuocThiButtonActionPerformed(evt);
            }
        });

        cauLacBoButton.setBackground(new java.awt.Color(255, 255, 255));
        cauLacBoButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cauLacBoButton.setForeground(new java.awt.Color(153, 153, 153));
        cauLacBoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-group-17.png"))); // NOI18N
        cauLacBoButton.setText("Câu lạc bộ");
        cauLacBoButton.setBorderPainted(false);
        cauLacBoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cauLacBoButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cauLacBoButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cauLacBoButtonMouseExited(evt);
            }
        });
        cauLacBoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cauLacBoButtonActionPerformed(evt);
            }
        });

        forumButton.setBackground(new java.awt.Color(255, 255, 255));
        forumButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        forumButton.setForeground(new java.awt.Color(153, 153, 153));
        forumButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-forum-17.png"))); // NOI18N
        forumButton.setText("Forum");
        forumButton.setBorderPainted(false);
        forumButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forumButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forumButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forumButtonMouseExited(evt);
            }
        });
        forumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forumButtonActionPerformed(evt);
            }
        });

        dangXuatButton.setBackground(new java.awt.Color(255, 255, 255));
        dangXuatButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dangXuatButton.setForeground(new java.awt.Color(153, 153, 153));
        dangXuatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-log-out-17.png"))); // NOI18N
        dangXuatButton.setText("Đăng xuất");
        dangXuatButton.setBorderPainted(false);
        dangXuatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dangXuatButtonMouseClicked(evt);
            }
        });
        dangXuatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangXuatButtonActionPerformed(evt);
            }
        });

        ecoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ecoLabel.setForeground(new java.awt.Color(102, 102, 255));
        ecoLabel.setText("ECO");

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

        tinNhanButton.setBackground(new java.awt.Color(255, 255, 255));
        tinNhanButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tinNhanButton.setForeground(new java.awt.Color(153, 153, 153));
        tinNhanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-chat-17.png"))); // NOI18N
        tinNhanButton.setText("Tin nhắn");
        tinNhanButton.setBorderPainted(false);
        tinNhanButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tinNhanButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tinNhanButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tinNhanButtonMouseExited(evt);
            }
        });
        tinNhanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinNhanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dangXuatButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(suKienButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cuocThiButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addComponent(imageAvatar13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ecoLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tinNhanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cauLacBoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))))
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                        .addComponent(ecoLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(suKienButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cuocThiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cauLacBoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tinNhanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dangXuatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        headerPanel.setBackground(new java.awt.Color(242, 243, 244));
        headerPanel.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(headerPanel.getBackground());
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 50));

        nextButton.setForeground(new java.awt.Color(242, 243, 244));
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-forward-36.png"))); // NOI18N
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextButtonMouseClicked(evt);
            }
        });

        prevButton.setForeground(new java.awt.Color(242, 243, 244));
        prevButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-back-36.png"))); // NOI18N
        prevButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        headerPanel.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(headerPanel.getBackground());
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 55));

        avatar.setBorderSize(2);
        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png"))); // NOI18N

        imageAvatar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cat.png"))); // NOI18N
        avatar.add(imageAvatar6);
        imageAvatar6.setBounds(0, 0, 0, 0);

        notificationButton.setBackground(new java.awt.Color(204, 204, 204));
        notificationButton.setForeground(new java.awt.Color(102, 102, 102));
        notificationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-notification-17.png"))); // NOI18N
        notificationButton.setToolTipText("Notifications");
        notificationButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        notificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationButtonActionPerformed(evt);
            }
        });

        searchPaneWrapper.setBorder(getRoundedBorder(searchPaneWrapper, 7, 2));
        searchPaneWrapper.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        searchPaneWrapper.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        searchPaneWrapper.setAutoscrolls(true);
        searchPaneWrapper.setHorizontalScrollBar(null);
        searchPaneWrapper.setWheelScrollingEnabled(false);

        searchPane.setBackground(new java.awt.Color(255, 255, 255));
        searchPane.setBorder(null);
        searchPane.setForeground(new java.awt.Color(102, 102, 102));
        searchPane.setToolTipText("Tìm kiếm");
        searchPane.setMaximumSize(new java.awt.Dimension(210, 40));
        searchPane.setPreferredSize(new java.awt.Dimension(210, 35));
        searchPaneWrapper.setViewportView(searchPane);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(imageAvatar17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPaneWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(notificationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(notificationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imageAvatar17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchPaneWrapper, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        headerPanel.add(jPanel2, java.awt.BorderLayout.LINE_END);

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void suKienButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suKienButtonMouseEntered
        highlightButton(suKienButton);
    }//GEN-LAST:event_suKienButtonMouseEntered

    private void suKienButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suKienButtonMouseExited
        unHighlightButton(suKienButton);
    }//GEN-LAST:event_suKienButtonMouseExited

    private void suKienButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suKienButtonActionPerformed

    }//GEN-LAST:event_suKienButtonActionPerformed

    private void cuocThiButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuocThiButtonMouseEntered
        // TODO add your handling code here:
        highlightButton(cuocThiButton);
    }//GEN-LAST:event_cuocThiButtonMouseEntered

    private void cuocThiButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuocThiButtonMouseExited
        // TODO add your handling code here:
        unHighlightButton(cuocThiButton);
    }//GEN-LAST:event_cuocThiButtonMouseExited

    private void cuocThiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuocThiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuocThiButtonActionPerformed

    private void cauLacBoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cauLacBoButtonMouseEntered
        highlightButton(cauLacBoButton);
    }//GEN-LAST:event_cauLacBoButtonMouseEntered

    private void cauLacBoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cauLacBoButtonMouseExited
        // TODO add your handling code here:
        unHighlightButton(cauLacBoButton);
    }//GEN-LAST:event_cauLacBoButtonMouseExited

    private void cauLacBoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cauLacBoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cauLacBoButtonActionPerformed

    private void forumButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forumButtonMouseEntered
        // TODO add your handling code here:
        highlightButton(forumButton);
    }//GEN-LAST:event_forumButtonMouseEntered

    private void forumButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forumButtonMouseExited
        // TODO add your handling code here:
        unHighlightButton(forumButton);
    }//GEN-LAST:event_forumButtonMouseExited

    private void forumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forumButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forumButtonActionPerformed

    private void dangXuatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangXuatButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dangXuatButtonActionPerformed

    private void notificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notificationButtonActionPerformed

    private void prevButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prevButtonMouseClicked
        // TODO add your handling code here:
        this.contentPanel.previousComponent();
        this.rightPanel.previousComponent();
    }//GEN-LAST:event_prevButtonMouseClicked

    private void nextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseClicked
        // TODO add your handling code here:
        this.contentPanel.nextComponent();
        this.rightPanel.nextComponent();
    }//GEN-LAST:event_nextButtonMouseClicked

    private void suKienButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suKienButtonMouseClicked
        // TODO add your handling code here:
        this.contentPanel.showComponent("suKienPanel");
        this.rightPanel.showComponent("suKienRightPanel");
    }//GEN-LAST:event_suKienButtonMouseClicked

    private void cuocThiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuocThiButtonMouseClicked
        // TODO add your handling code here:
        this.contentPanel.showComponent("cuocThiPanel");
        this.rightPanel.showComponent("cuocThiRightPanel");
    }//GEN-LAST:event_cuocThiButtonMouseClicked

    private void cauLacBoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cauLacBoButtonMouseClicked
        // TODO add your handling code here:
        this.contentPanel.showComponent("cauLacBoPanel");
        this.rightPanel.showComponent("cauLacBoRightPanel");

    }//GEN-LAST:event_cauLacBoButtonMouseClicked

    private void forumButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forumButtonMouseClicked
        // TODO add your handling code here:
        this.contentPanel.showComponent("taiKhoanPanel");
        this.rightPanel.showComponent("forumRightPanel");

    }//GEN-LAST:event_forumButtonMouseClicked

    private void dangXuatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangXuatButtonMouseClicked
        // TODO add your handling code here:
        this.logOut();
    }//GEN-LAST:event_dangXuatButtonMouseClicked

    private void tinNhanButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tinNhanButtonMouseClicked
        // TODO add your handling code here:
        this.contentPanel.showComponent("tinNhanPanel");
        this.rightPanel.showComponent("tinNhanRightPanel");
    }//GEN-LAST:event_tinNhanButtonMouseClicked

    private void tinNhanButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tinNhanButtonMouseEntered
        // TODO add your handling code here:
        highlightButton(tinNhanButton);
    }//GEN-LAST:event_tinNhanButtonMouseEntered

    private void tinNhanButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tinNhanButtonMouseExited
        // TODO add your handling code here:
        unHighlightButton(tinNhanButton);
    }//GEN-LAST:event_tinNhanButtonMouseExited

    private void tinNhanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinNhanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinNhanButtonActionPerformed

    /**
     *
     * This section is for user-defined methods
     */
    private void initContentPanel() {
        SuKienPanel sk = new SuKienPanel();
        contentPanel.registerComponent(sk, "suKienPanel");

        CuocThiPanel ct = new CuocThiPanel();
        contentPanel.registerComponent(ct, "cuocThiPanel");

        CauLacBoPanel clb = new CauLacBoPanel();
        contentPanel.registerComponent(clb, "cauLacBoPanel");

        ForumPanel fr = new ForumPanel();
        contentPanel.registerComponent(fr, "forumPanel");

        TinNhanPanel tn = new TinNhanPanel();
        contentPanel.registerComponent(tn, "tinNhanPanel");

        TaiKhoanPanel tk = new TaiKhoanPanel();
        contentPanel.registerComponent(tk, "taiKhoanPanel");

//        contentPanel.registerComponent(rootPane, name);
//        contentPanel.registerComponent(rootPane, name);
//        contentPanel.registerComponent(rootPane, name);
//        Random random = new Random();
//        for (String labelText : contentPanelNames) {
//            JLabel label = new JLabel(labelText, SwingConstants.CENTER);
//            label.setPreferredSize(contentPanelSize);
//            label.setOpaque(true);
//            label.setBackground(new Color(random.nextInt(170) + 85, random
//                    .nextInt(170) + 85, random.nextInt(170) + 85));
//            contentPanel.registerComponent(label, labelText);
//        }
    }

    private void initRightPanel() {
        SuKienRightPanel skr = new SuKienRightPanel();
        rightPanel.registerComponent(skr, "suKienRightPanel");

        CuocThiRightPanel ctr = new CuocThiRightPanel();
        rightPanel.registerComponent(ctr, "cuocThiRightPanel");

        CauLacBoRightPanel clbr = new CauLacBoRightPanel();
        rightPanel.registerComponent(clbr, "cauLacBoRightPanel");

        ForumRightPanel frr = new ForumRightPanel();
        rightPanel.registerComponent(frr, "forumRightPanel");

        TinNhanRightPanel tnr = new TinNhanRightPanel();
        rightPanel.registerComponent(tnr, "tinNhanRightPanel");

        TaiKhoanRightPanel tkr = new TaiKhoanRightPanel();
        rightPanel.registerComponent(tkr, "taiKhoanRightPanel");
    }

    private void logOut() {
        System.out.println("Logged out!");
    }

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
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    /**
     * End of section user-defined methods
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.uiteco.components.ImageAvatar avatar;
    private javax.swing.JButton cauLacBoButton;
    private com.uiteco.swing.ScrollableContentPanel contentPanel;
    private javax.swing.JButton cuocThiButton;
    private javax.swing.JButton dangXuatButton;
    private javax.swing.JLabel ecoLabel;
    private javax.swing.JButton forumButton;
    private javax.swing.JPanel headerPanel;
    private com.uiteco.components.ImageAvatar imageAvatar13;
    private com.uiteco.components.ImageAvatar imageAvatar14;
    private com.uiteco.components.ImageAvatar imageAvatar15;
    private com.uiteco.components.ImageAvatar imageAvatar16;
    private com.uiteco.components.ImageAvatar imageAvatar17;
    private com.uiteco.components.ImageAvatar imageAvatar18;
    private com.uiteco.components.ImageAvatar imageAvatar19;
    private com.uiteco.components.ImageAvatar imageAvatar2;
    private com.uiteco.components.ImageAvatar imageAvatar20;
    private com.uiteco.components.ImageAvatar imageAvatar6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel leftPanel;
    private com.uiteco.components.ImageAvatar nextButton;
    private javax.swing.JButton notificationButton;
    private com.uiteco.components.ImageAvatar prevButton;
    private com.uiteco.swing.ContentPanel rightPanel;
    private javax.swing.JTextPane searchPane;
    private javax.swing.JScrollPane searchPaneWrapper;
    private javax.swing.JButton suKienButton;
    private javax.swing.JButton tinNhanButton;
    // End of variables declaration//GEN-END:variables

}
