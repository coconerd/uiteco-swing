/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.ofSuKienPanel.detailed;

import com.uiteco.ofSuKienPanel.SuKienModel;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.border.LineBorder;


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
        postedAt = new javax.swing.JLabel();
        roundedBorderButton2 = new com.uiteco.components.RoundedBorderButton();
        postedAtTime = new javax.swing.JLabel();
        tagsPanel = new javax.swing.JPanel();
        tag = new javax.swing.JLabel();
        tag1 = new javax.swing.JLabel();
        tag2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        javax.swing.GroupLayout roundedImagePanel1Layout = new javax.swing.GroupLayout(roundedImagePanel1);
        roundedImagePanel1.setLayout(roundedImagePanel1Layout);
        roundedImagePanel1Layout.setHorizontalGroup(
            roundedImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
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

        roundedGradientPanel1.setColor1(new java.awt.Color(0, 255, 102));
        roundedGradientPanel1.setColor2(new java.awt.Color(0, 102, 0));
        roundedGradientPanel1.setFade(false);
        roundedGradientPanel1.setPreferredSize(new java.awt.Dimension(310, 329));

        postedBy.setFont(new java.awt.Font("Circular Std Medium", 0, 15)); // NOI18N
        postedBy.setForeground(new java.awt.Color(101, 103, 107));
        postedBy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-person-24.png"))); // NOI18N
        postedBy.setText(getSuKienModel().getPostedBy());
        postedBy.setIconTextGap(10);
        postedBy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator1.setBackground(new java.awt.Color(0, 102, 51));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        heartButton.setBackground(new java.awt.Color(228, 230, 235));
        heartButton.setPreferredSize(new java.awt.Dimension(300, 365));
        heartButton.setRoundBottomLeft(11);
        heartButton.setRoundBottomRight(11);
        heartButton.setRoundTopLeft(11);
        heartButton.setRoundTopRight(11);
        heartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                heartButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                heartButtonMouseExited(evt);
            }
        });
        heartButton.setLayout(new java.awt.GridLayout(1, 0));

        heartImage.setBackground(new java.awt.Color(255, 255, 255));
        heartImage.setImage(new javax.swing.ImageIcon(getClass().getResource("/icons8-heart-plus-40.png"))); // NOI18N

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

        heartButton.add(heartImage);

        postedAt.setFont(new java.awt.Font("Circular Std Medium", 0, 15)); // NOI18N
        postedAt.setForeground(new java.awt.Color(101, 103, 107));
        postedAt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        postedAt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-clock-24.png"))); // NOI18N
        DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern("dd.MM.yy");
        String dateStr = getSuKienModel().getPostedAt().format(dateFmt);
        postedAt.setText(dateStr);
        postedAt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        postedAt.setIconTextGap(10);

        roundedBorderButton2.setBackground(new java.awt.Color(58, 59, 60));
        roundedBorderButton2.setBorder(null);
        roundedBorderButton2.setForeground(new java.awt.Color(242, 243, 244));
        roundedBorderButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eye-28.png"))); // NOI18N
        roundedBorderButton2.setText(String.valueOf(getSuKienModel().getViews()));
        roundedBorderButton2.setToolTipText("Lượt xem");
        roundedBorderButton2.setFont(new java.awt.Font("Circular Std Medium", 0, 14)); // NOI18N
        roundedBorderButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundedBorderButton2MouseEntered(evt);
            }
        });

        postedAtTime.setFont(new java.awt.Font("Circular Std Medium", 0, 14)); // NOI18N
        postedAtTime.setForeground(new java.awt.Color(255, 255, 255));
        postedAtTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DateTimeFormatter timeFmt = DateTimeFormatter.ofPattern("HH:mm");
        String timeStr = getSuKienModel().getPostedAt().format(timeFmt);
        postedAtTime.setText(timeStr);

        tagsPanel.setOpaque(false);
        tagsPanel.setLayout(new java.awt.GridBagLayout());
        boolean hasTags = !(getSuKienModel().getTags().isEmpty());
        tagsPanel.setVisible(hasTags);

        tag.setFont(new java.awt.Font("Circular Std Medium", 0, 15)); // NOI18N
        tag.setForeground(new java.awt.Color(228, 230, 235));
        if (getSuKienModel().getTags().size() >= 1) {
            tag.setText(getSuKienModel().getTag(0));
        }
        tag.setFocusable(false);
        tag.setIconTextGap(10);
        tag.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        tagsPanel.add(tag, gridBagConstraints);

        tag1.setFont(new java.awt.Font("Circular Std Medium", 0, 15)); // NOI18N
        tag1.setForeground(new java.awt.Color(228, 230, 235));
        tag1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        if (getSuKienModel().getTags().size() >= 2) {
            tag1.setText(getSuKienModel().getTag(1));
        }
        tag1.setFocusTraversalPolicyProvider(true);
        tag1.setFocusable(false);
        tag1.setIconTextGap(40);
        tag1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        tagsPanel.add(tag1, gridBagConstraints);

        tag2.setFont(new java.awt.Font("Circular Std Medium", 0, 15)); // NOI18N
        tag2.setForeground(new java.awt.Color(228, 230, 235));
        if (getSuKienModel().getTags().size() >= 3) {
            tag2.setText(getSuKienModel().getTag(2));
        }
        tag2.setFocusable(false);
        tag2.setIconTextGap(10);
        tag2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        tagsPanel.add(tag2, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Circular Std Medium", 0, 15)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-tag-24.png"))); // NOI18N
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        tagsPanel.add(jLabel2, gridBagConstraints);

        javax.swing.GroupLayout roundedGradientPanel1Layout = new javax.swing.GroupLayout(roundedGradientPanel1);
        roundedGradientPanel1.setLayout(roundedGradientPanel1Layout);
        roundedGradientPanel1Layout.setHorizontalGroup(
            roundedGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(roundedGradientPanel1Layout.createSequentialGroup()
                        .addComponent(heartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundedBorderButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(postedBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(roundedGradientPanel1Layout.createSequentialGroup()
                        .addComponent(postedAt, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(postedAtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tagsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        roundedGradientPanel1Layout.setVerticalGroup(
            roundedGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedGradientPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(roundedGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(heartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundedBorderButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(postedBy)
                .addGap(18, 18, 18)
                .addGroup(roundedGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postedAt)
                    .addComponent(postedAtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tagsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        title.setFont(new java.awt.Font("OCR A Std", 1, 22)); // NOI18N
        title.setForeground(new java.awt.Color(78, 230, 235));
        title.setLineWrap(true);
        title.setRows(2);
        title.setText(" . " + getSuKienModel().getTitle());
        title.setWrapStyleWord(true);
        title.setOpaque(false);
        roundedPanel1.add(title, java.awt.BorderLayout.PAGE_START);

        content.setEditable(false);
        content.setColumns(20);
        content.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        content.setLineWrap(true);
        content.setRows(5);
        content.setText(getSuKienModel().getContent());
        content.setWrapStyleWord(true);
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

    private void roundedBorderButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundedBorderButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_roundedBorderButton2MouseEntered

    private void heartButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heartButtonMouseEntered
        // TODO add your handling code here:
        heartButton.setBorder(new LineBorder(new Color(5, 5, 5)));
    }//GEN-LAST:event_heartButtonMouseEntered

    private void heartButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_heartButtonMouseExited
        // TODO add your handling code here:
        heartButton.setBorder(null);
    }//GEN-LAST:event_heartButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea content;
    private com.uiteco.ofSuKienPanel.detailed.Gallery gallery1;
    private com.uiteco.components.RoundedPanel heartButton;
    private com.uiteco.components.RoundedImagePanel heartImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel postedAt;
    private javax.swing.JLabel postedAtTime;
    private javax.swing.JLabel postedBy;
    private com.uiteco.components.RoundedBorderButton roundedBorderButton2;
    private com.uiteco.components.RoundedGradientPanel roundedGradientPanel1;
    private com.uiteco.components.RoundedImagePanel roundedImagePanel1;
    private com.uiteco.components.RoundedPanel roundedPanel1;
    private com.uiteco.ofSuKienPanel.search.SearchBar searcnBar;
    private javax.swing.JLabel tag;
    private javax.swing.JLabel tag1;
    private javax.swing.JLabel tag2;
    private javax.swing.JPanel tagsPanel;
    private javax.swing.JTextArea title;
    private javax.swing.JPanel upperPanel;
    // End of variables declaration//GEN-END:variables
}