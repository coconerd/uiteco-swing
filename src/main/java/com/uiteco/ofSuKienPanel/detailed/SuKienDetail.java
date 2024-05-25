/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.ofSuKienPanel.detailed;

import com.uiteco.components.ImageAvatar;
import com.uiteco.components.ImagePanel;
import com.uiteco.components.RoundedImagePanel;
import com.uiteco.main.App;
import com.uiteco.ofSuKienPanel.SuKienDAO;
import com.uiteco.ofSuKienPanel.SuKienModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.time.format.DateTimeFormatter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author nddmi
 */
public class SuKienDetail extends javax.swing.JPanel {

    private SuKienModel suKienModel;

    public SuKienDetail() {
    }

    public SuKienDetail(SuKienModel suKienModel) {
        removeAll();
        this.suKienModel = suKienModel;
        initComponents();
    }

    public SuKienModel getSuKienModel() {
        return this.suKienModel;
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

        upperPanel = new javax.swing.JPanel();
        roundedImagePanel1 = new com.uiteco.components.RoundedImagePanel();
        roundedGradientPanel1 = new com.uiteco.components.RoundedGradientPanel();
        postedBy = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        heartButton = new com.uiteco.components.RoundedPanel();
        heartImage = new com.uiteco.components.RoundedImagePanel();
        heartLabel = new javax.swing.JLabel();
        postedAt = new javax.swing.JLabel();
        postedAtTime = new javax.swing.JLabel();
        tagsPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        roundedPanel2 = new com.uiteco.components.RoundedPanel();
        tag = new javax.swing.JLabel();
        roundedPanel3 = new com.uiteco.components.RoundedPanel();
        tag1 = new javax.swing.JLabel();
        roundedPanel4 = new com.uiteco.components.RoundedPanel();
        tag2 = new javax.swing.JLabel();
        viewsButton = new com.uiteco.components.RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        postedBy1 = new javax.swing.JLabel();
        gallery1 = new com.uiteco.ofSuKienPanel.detailed.Gallery(getSuKienModel());
        roundedPanel1 = new com.uiteco.components.RoundedPanel();
        title = new javax.swing.JTextArea();
        content = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        searcnBar = new com.uiteco.ofSuKienPanel.search.SearchBar();

        setLayout(new java.awt.GridBagLayout());

        upperPanel.setPreferredSize(new java.awt.Dimension(810, 365));
        upperPanel.setLayout(new java.awt.GridBagLayout());

        roundedImagePanel1.setImage(getSuKienModel().getThumbnail());
        roundedImagePanel1.setPreferredSize(new java.awt.Dimension(610, 365));
        roundedImagePanel1.setRoundTopRight(16);
        roundedImagePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundedImagePanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundedImagePanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundedImagePanel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout roundedImagePanel1Layout = new javax.swing.GroupLayout(roundedImagePanel1);
        roundedImagePanel1.setLayout(roundedImagePanel1Layout);
        roundedImagePanel1Layout.setHorizontalGroup(
            roundedImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        roundedImagePanel1Layout.setVerticalGroup(
            roundedImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 1.0;
        upperPanel.add(roundedImagePanel1, gridBagConstraints);

        roundedGradientPanel1.setColor1(new java.awt.Color(152, 255, 152));
        roundedGradientPanel1.setColor2(new java.awt.Color(0, 255, 0));
        roundedGradientPanel1.setFade(false);
        roundedGradientPanel1.setPreferredSize(new java.awt.Dimension(310, 329));

        postedBy.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        postedBy.setForeground(new java.awt.Color(101, 103, 107));
        postedBy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-person-24.png"))); // NOI18N
        postedBy.setText(getSuKienModel().getPostedBy());
        postedBy.setIconTextGap(10);
        postedBy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator1.setBackground(new java.awt.Color(0, 102, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        heartButton.setBackground(new java.awt.Color(228, 230, 235));
        heartButton.setPreferredSize(new java.awt.Dimension(300, 365));
        heartButton.setRoundBottomLeft(11);
        heartButton.setRoundBottomRight(11);
        heartButton.setRoundTopLeft(11);
        heartButton.setRoundTopRight(11);
        heartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                heartButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                heartButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                heartButtonMouseExited(evt);
            }
        });
        heartButton.setLayout(new java.awt.GridBagLayout());

        heartImage.setBackground(new java.awt.Color(255, 255, 255));
        heartImage.setImage(new javax.swing.ImageIcon(getClass().getResource(getSuKienModel().isLiked() ? "/icons8-heart-48.png" : "/icons8-heart-40.png")));
        heartImage.setMinimumSize(new java.awt.Dimension(10, 10));
        heartImage.setPreferredSize(new java.awt.Dimension(26, 26));
        heartImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                heartImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                heartImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                heartImageMouseExited(evt);
            }
        });

        javax.swing.GroupLayout heartImageLayout = new javax.swing.GroupLayout(heartImage);
        heartImage.setLayout(heartImageLayout);
        heartImageLayout.setHorizontalGroup(
            heartImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        heartImageLayout.setVerticalGroup(
            heartImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        heartButton.add(heartImage, gridBagConstraints);

        heartLabel.setFont(new java.awt.Font("Circular Std Bold", 1, 13)); // NOI18N
        heartLabel.setForeground(new java.awt.Color(102, 102, 102));
        heartLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heartLabel.setText(String.valueOf(getSuKienModel().getLikes()));
        heartLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        heartLabel.setPreferredSize(new java.awt.Dimension(20, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        heartButton.add(heartLabel, gridBagConstraints);

        postedAt.setFont(new java.awt.Font("Circular Std Medium", 0, 15)); // NOI18N
        postedAt.setForeground(new java.awt.Color(101, 103, 107));
        postedAt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        postedAt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-clock-24.png"))); // NOI18N
        DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern("dd.MM.yy");
        String dateStr = getSuKienModel().getPostedAt().format(dateFmt);
        postedAt.setText(dateStr);
        postedAt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        postedAt.setIconTextGap(10);

        postedAtTime.setFont(new java.awt.Font("Circular Std Medium", 0, 15)); // NOI18N
        postedAtTime.setForeground(new java.awt.Color(255, 255, 255));
        postedAtTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DateTimeFormatter timeFmt = DateTimeFormatter.ofPattern("HH:mm");
        String timeStr = getSuKienModel().getPostedAt().format(timeFmt);
        postedAtTime.setText(timeStr);

        tagsPanel.setOpaque(false);
        tagsPanel.setLayout(new java.awt.GridBagLayout());
        boolean hasTags = !(getSuKienModel().getTags().isEmpty());
        tagsPanel.setVisible(hasTags);

        jLabel2.setFont(new java.awt.Font("Circular Std Medium", 0, 15)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-tag-24.png"))); // NOI18N
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        tagsPanel.add(jLabel2, gridBagConstraints);

        roundedPanel2.setBackground(new java.awt.Color(249, 235, 227));
        roundedPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        roundedPanel2.setForeground(new java.awt.Color(249, 235, 234));
        roundedPanel2.setRoundBottomLeft(22);
        roundedPanel2.setRoundBottomRight(22);
        roundedPanel2.setRoundTopLeft(22);
        roundedPanel2.setRoundTopRight(22);
        roundedPanel2.setLayout(new java.awt.GridLayout(1, 0));

        tag.setFont(new java.awt.Font("Segoe UI Variable", 1, 15)); // NOI18N
        tag.setForeground(new java.awt.Color(247, 160, 114));
        if (getSuKienModel().getTags().size() >= 1) {
            tag.setText(getSuKienModel().getTag(0));
        } else {
            roundedPanel2.setVisible(false);
        }
        tag.setFocusable(false);
        tag.setIconTextGap(10);
        tag.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tagMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tagMouseExited(evt);
            }
        });
        roundedPanel2.add(tag);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        tagsPanel.add(roundedPanel2, gridBagConstraints);

        roundedPanel3.setBackground(new java.awt.Color(249, 235, 227));
        roundedPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        roundedPanel3.setForeground(new java.awt.Color(247, 154, 103));
        roundedPanel3.setRoundBottomLeft(22);
        roundedPanel3.setRoundBottomRight(22);
        roundedPanel3.setRoundTopLeft(22);
        roundedPanel3.setRoundTopRight(22);
        roundedPanel3.setLayout(new java.awt.GridLayout(1, 0));

        tag1.setFont(new java.awt.Font("Segoe UI Variable", 1, 15)); // NOI18N
        tag1.setForeground(new java.awt.Color(247, 160, 114));
        tag1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        if (getSuKienModel().getTags().size() >= 2) {
            tag1.setText(getSuKienModel().getTag(1));
        } else {
            roundedPanel3.setVisible(false);
        }
        tag1.setFocusTraversalPolicyProvider(true);
        tag1.setFocusable(false);
        tag1.setIconTextGap(40);
        tag1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tag1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tag1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tag1MouseExited(evt);
            }
        });
        roundedPanel3.add(tag1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        tagsPanel.add(roundedPanel3, gridBagConstraints);

        roundedPanel4.setBackground(new java.awt.Color(249, 235, 227));
        roundedPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        roundedPanel4.setRoundBottomLeft(22);
        roundedPanel4.setRoundBottomRight(22);
        roundedPanel4.setRoundTopLeft(22);
        roundedPanel4.setRoundTopRight(22);
        roundedPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundedPanel4MouseEntered(evt);
            }
        });
        roundedPanel4.setLayout(new java.awt.GridLayout(1, 0));

        tag2.setFont(new java.awt.Font("Segoe UI Variable", 1, 15)); // NOI18N
        tag2.setForeground(new java.awt.Color(247, 160, 114));
        if (getSuKienModel().getTags().size() >= 3) {
            tag2.setText(getSuKienModel().getTag(2));
        } else {
            roundedPanel4.setVisible(false);
        }
        tag2.setFocusable(false);
        tag2.setIconTextGap(10);
        tag2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tag2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tag2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tag2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tag2MouseExited(evt);
            }
        });
        roundedPanel4.add(tag2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        tagsPanel.add(roundedPanel4, gridBagConstraints);

        viewsButton.setBackground(new java.awt.Color(255, 99, 71));
        viewsButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8));
        viewsButton.setRoundBottomLeft(14);
        viewsButton.setRoundBottomRight(14);
        viewsButton.setRoundTopLeft(14);
        viewsButton.setRoundTopRight(14);
        viewsButton.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Circular Std Black", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eye-24.png"))); // NOI18N
        jLabel3.setText(String.valueOf(getSuKienModel().getViews()));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        viewsButton.add(jLabel3);

        postedBy1.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        postedBy1.setForeground(new java.awt.Color(101, 103, 107));
        postedBy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-university-24.png"))); // NOI18N
        postedBy1.setIconTextGap(10);
        String clubName = getSuKienModel().getClubName();
        postedBy1.setText(clubName != null ? clubName : "Trường ĐH Công nghệ Thông tin");
        postedBy1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout roundedGradientPanel1Layout = new javax.swing.GroupLayout(roundedGradientPanel1);
        roundedGradientPanel1.setLayout(roundedGradientPanel1Layout);
        roundedGradientPanel1Layout.setHorizontalGroup(
            roundedGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tagsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(roundedGradientPanel1Layout.createSequentialGroup()
                        .addComponent(heartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addComponent(viewsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundedGradientPanel1Layout.createSequentialGroup()
                        .addGroup(roundedGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(postedBy1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(postedBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(roundedGradientPanel1Layout.createSequentialGroup()
                                .addComponent(postedAt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(postedAtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        roundedGradientPanel1Layout.setVerticalGroup(
            roundedGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedGradientPanel1Layout.createSequentialGroup()
                .addGroup(roundedGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(heartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(postedBy)
                .addGroup(roundedGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedGradientPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(roundedGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postedAtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postedAt)))
                    .addGroup(roundedGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(postedBy1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tagsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        for (java.awt.Component comp : tagsPanel.getComponents()) {
            comp.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    comp.setForeground(new Color(101, 103, 107));
                }

                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    comp.setForeground(new Color(228, 230, 235));
                }
            });
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 1.0;
        upperPanel.add(roundedGradientPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        add(upperPanel, gridBagConstraints);

        gallery1.setBorder(null);
        gallery1.setPreferredSize(new java.awt.Dimension(410, 300));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        add(gallery1, gridBagConstraints);

        roundedPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundedPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 0, 0, 0));
        roundedPanel1.setRoundBottomLeft(16);
        roundedPanel1.setRoundBottomRight(16);
        roundedPanel1.setRoundTopLeft(16);
        roundedPanel1.setRoundTopRight(16);
        roundedPanel1.setLayout(new java.awt.BorderLayout());

        title.setEditable(false);
        title.setColumns(20);
        title.setFont(new java.awt.Font("Segoe UI Black", 1, 22)); // NOI18N
        title.setForeground(new java.awt.Color(78, 230, 235));
        title.setLineWrap(true);
        title.setRows(2);
        title.setText(" - " + getSuKienModel().getTitle() + " - ");
        title.setWrapStyleWord(true);
        title.setOpaque(false);
        roundedPanel1.add(title, java.awt.BorderLayout.PAGE_START);

        content.setEditable(false);
        content.setColumns(20);
        content.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        content.setLineWrap(true);
        content.setRows(5);
        content.setText(getSuKienModel().getContent());
        content.setWrapStyleWord(true);
        content.setMargin(new java.awt.Insets(6, 18, 6, 12));
        content.setOpaque(false);
        roundedPanel1.add(content, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        add(roundedPanel1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 5, 5));
        jLabel1.setText("Ảnh sự kiện");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 25, 10, 0);
        add(jLabel1, gridBagConstraints);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 25);
        add(jSeparator2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 15);
        add(searcnBar, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void heartButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heartButtonMouseEntered
        // TODO add your handling code here:
        _heartHovered();
    }//GEN-LAST:event_heartButtonMouseEntered

    private void heartButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heartButtonMouseExited
        // TODO add your handling code here:
        _heartUnhovered();
    }//GEN-LAST:event_heartButtonMouseExited

    private void heartImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heartImageMouseEntered
        // TODO add your handling code here:
//        heartButton.setBorder(new LineBorder(new Color(5, 5, 5)));
        _heartHovered();
    }//GEN-LAST:event_heartImageMouseEntered

    private void heartImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heartImageMouseExited
        // TODO add your handling code here:
//        heartButton.setBorder(null);
        _heartUnhovered();
    }//GEN-LAST:event_heartImageMouseExited

    private void _heartHovered() {
        heartButton.setBackground(new Color(200, 200, 200));
    }

    private void _heartUnhovered() {
        heartButton.setBackground(new Color(221, 221, 221));

    }

    private void _heartClicked() {
        boolean isLiked = getSuKienModel().isLiked();

        if (!isLiked) {
            heartImage.setImage(new ImageIcon(getClass().getResource("/icons8-heart-48.png")));
        } else {
            heartImage.setImage(new ImageIcon(getClass().getResource("/icons8-heart-40.png")));
        }
        try {
            SuKienDAO.likePost(suKienModel);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không thể like bài viết", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        heartLabel.setText(String.valueOf(getSuKienModel().getLikes()));
        getSuKienModel().setLiked(!isLiked);

    }

    private void heartImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heartImageMouseClicked
        // TODO add your handling code here:
        _heartClicked();

    }//GEN-LAST:event_heartImageMouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        viewsButton.setBackground(heartButton.getBackground().darker());
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        viewsButton.setBackground(new Color(255, 99, 71));
    }//GEN-LAST:event_jLabel3MouseExited

    private void heartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heartButtonMouseClicked
        // TODO add your handling code here:
        _heartClicked();
    }//GEN-LAST:event_heartButtonMouseClicked

    private void roundedImagePanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedImagePanel1MouseEntered
        // TODO add your handling code here:
        roundedImagePanel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_roundedImagePanel1MouseEntered

    private void roundedImagePanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedImagePanel1MouseExited
        // TODO add your handling code here:
        roundedImagePanel1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_roundedImagePanel1MouseExited

    private void roundedImagePanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedImagePanel1MouseClicked
        // TODO add your handling code here:
        showImageDialog(roundedImagePanel1);
    }//GEN-LAST:event_roundedImagePanel1MouseClicked

    private void tagMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tagMouseEntered
        // TODO add your handling code here:
        _hili(tag, roundedPanel2);
    }//GEN-LAST:event_tagMouseEntered

    private void tagMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tagMouseExited
        // TODO add your handling code here:
        _unhili(tag, roundedPanel2);
    }//GEN-LAST:event_tagMouseExited

    private void tag1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tag1MouseEntered
        // TODO add your handling code here:
        _hili(tag1, roundedPanel3);
    }//GEN-LAST:event_tag1MouseEntered

    private void tag1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tag1MouseExited
        // TODO add your handling code here:
        _unhili(tag1, roundedPanel3);
    }//GEN-LAST:event_tag1MouseExited

    private void tag2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tag2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tag2MouseClicked

    private void roundedPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedPanel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_roundedPanel4MouseEntered

    private void tag2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tag2MouseEntered
        // TODO add your handling code here:
        _hili(tag2, roundedPanel4);
    }//GEN-LAST:event_tag2MouseEntered

    private void tag2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tag2MouseExited
        // TODO add your handling code here:
        _unhili(tag2, roundedPanel4);
    }//GEN-LAST:event_tag2MouseExited

    private void _hili(Component comp, Component parent) {
        comp.setForeground(new Color(5, 5, 5));
        parent.setBackground(parent.getBackground().brighter());
    }
    
    private void _unhili(Component comp, Component parent) {
        comp.setForeground(new Color(247, 160, 114));
        parent.setBackground(new Color(249, 235, 227));
    }
    
    public static void showImageDialog(RoundedImagePanel panel) {
        _showImageDialog(panel.getImage());
    }

    public static void showImageDialog(ImagePanel panel) {
        _showImageDialog(panel.getImage());
    }

    public static void showImageDialog(ImageAvatar avt) {
        _showImageDialog(avt.getIcon());
    }

    private static void _showImageDialog(Icon img) {
        ImagePanel imgPanel = new ImagePanel(img);
        imgPanel.setPreferredSize(new Dimension(1280, 720));
        _createDialog("Xem hình ảnh", imgPanel);
    }

    private static void _createDialog(String dialogName, Component child) {
        JDialog dialog = new JDialog(App.getMainFrame(), dialogName, false);
        dialog.setLayout(new GridLayout(1, 1, 0, 0));
        dialog.setSize(child.getPreferredSize());
        dialog.add(child);
        dialog.setVisible(true);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dialogSize = dialog.getSize();
        dialog.setLocation((screenSize.width - dialogSize.width) / 2, (screenSize.height - dialogSize.height) / 2);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea content;
    private com.uiteco.ofSuKienPanel.detailed.Gallery gallery1;
    private com.uiteco.components.RoundedPanel heartButton;
    private com.uiteco.components.RoundedImagePanel heartImage;
    private javax.swing.JLabel heartLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel postedAt;
    private javax.swing.JLabel postedAtTime;
    private javax.swing.JLabel postedBy;
    private javax.swing.JLabel postedBy1;
    private com.uiteco.components.RoundedGradientPanel roundedGradientPanel1;
    private com.uiteco.components.RoundedImagePanel roundedImagePanel1;
    private com.uiteco.components.RoundedPanel roundedPanel1;
    private com.uiteco.components.RoundedPanel roundedPanel2;
    private com.uiteco.components.RoundedPanel roundedPanel3;
    private com.uiteco.components.RoundedPanel roundedPanel4;
    private com.uiteco.ofSuKienPanel.search.SearchBar searcnBar;
    private javax.swing.JLabel tag;
    private javax.swing.JLabel tag1;
    private javax.swing.JLabel tag2;
    private javax.swing.JPanel tagsPanel;
    private javax.swing.JTextArea title;
    private javax.swing.JPanel upperPanel;
    private com.uiteco.components.RoundedPanel viewsButton;
    // End of variables declaration//GEN-END:variables
}
