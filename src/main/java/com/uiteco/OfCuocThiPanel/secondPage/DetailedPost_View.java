package com.uiteco.OfCuocThiPanel.secondPage;

import com.uiteco.OfCuocThiPanel.firstPage.OnePost_Model;

public class DetailedPost_View extends javax.swing.JPanel {

    public DetailedPost_View() {
        initComponents();
        setBounds(0, 0, 1195, 860);
        setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneWin111 = new com.raven.scroll.ScrollPaneWin11();
        jParentPanel = new javax.swing.JPanel();
        topGradientPanel = new com.uiteco.components.GradientPanel();
        RegisterTimePanel = new com.uiteco.components.RoundedPanel();
        jRegisterTime = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jBodyPanel = new javax.swing.JPanel();
        jTitle = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtons = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jRegister = new com.uiteco.OfCuocThiPanel.secondPage.CustomButton();
        jBookmark = new com.uiteco.OfCuocThiPanel.secondPage.CustomButton();
        jLike = new com.uiteco.OfCuocThiPanel.secondPage.CustomButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jOrganizer = new javax.swing.JLabel();
        jPostTime = new javax.swing.JLabel();
        jContent = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(241, 243, 244));
        setOpaque(false);

        scrollPaneWin111.setBackground(new java.awt.Color(255, 255, 51));

        jParentPanel.setBackground(new java.awt.Color(242, 243, 244));
        jParentPanel.setLayout(new java.awt.BorderLayout());

        topGradientPanel.setColor1(new java.awt.Color(255, 134, 134));
        topGradientPanel.setColor2(new java.awt.Color(249, 141, 255));
        topGradientPanel.setPreferredSize(new java.awt.Dimension(1190, 330));

        RegisterTimePanel.setBackground(new java.awt.Color(255, 255, 255));
        RegisterTimePanel.setRoundBottomLeft(45);
        RegisterTimePanel.setRoundBottomRight(45);
        RegisterTimePanel.setRoundTopLeft(45);
        RegisterTimePanel.setRoundTopRight(45);

        jRegisterTime.setText("jLabel3");

        javax.swing.GroupLayout RegisterTimePanelLayout = new javax.swing.GroupLayout(RegisterTimePanel);
        RegisterTimePanel.setLayout(RegisterTimePanelLayout);
        RegisterTimePanelLayout.setHorizontalGroup(
            RegisterTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterTimePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jRegisterTime, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        RegisterTimePanelLayout.setVerticalGroup(
            RegisterTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterTimePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jRegisterTime, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout topGradientPanelLayout = new javax.swing.GroupLayout(topGradientPanel);
        topGradientPanel.setLayout(topGradientPanelLayout);
        topGradientPanelLayout.setHorizontalGroup(
            topGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topGradientPanelLayout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(RegisterTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        topGradientPanelLayout.setVerticalGroup(
            topGradientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topGradientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegisterTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jParentPanel.add(topGradientPanel, java.awt.BorderLayout.NORTH);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1256, Short.MAX_VALUE)
        );

        jParentPanel.add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1256, Short.MAX_VALUE)
        );

        jParentPanel.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jBodyPanel.setBackground(new java.awt.Color(242, 243, 244));

        jTitle.setFont(new java.awt.Font("Circular Std Bold", 0, 48)); // NOI18N
        jTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTitle.setText("jLabel1");
        jTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setOpaque(false);

        jButtons.setOpaque(false);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(10, 10));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setOpaque(true);
        jSeparator2.setPreferredSize(new java.awt.Dimension(10, 10));

        jRegister.setText("THAM GIA");

        jBookmark.setText("BOOKMARK");
        jBookmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBookmarkActionPerformed(evt);
            }
        });

        jLike.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jLike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-heart-24.png"))); // NOI18N
        jLike.setText("3");

        javax.swing.GroupLayout jButtonsLayout = new javax.swing.GroupLayout(jButtons);
        jButtons.setLayout(jButtonsLayout);
        jButtonsLayout.setHorizontalGroup(
            jButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonsLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBookmark, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jButtonsLayout.setVerticalGroup(
            jButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonsLayout.createSequentialGroup()
                .addGroup(jButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBookmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLike, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-contact-card-organizer-24.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jOrganizer.setText("jLabel3");

        jPostTime.setText("jLabel4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jOrganizer, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addComponent(jPostTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jOrganizer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPostTime))
        );

        jContent.setEditable(false);
        jContent.setColumns(20);
        jContent.setLineWrap(true);
        jContent.setWrapStyleWord(true);
        jContent.setOpaque(false);
        jContent.setSelectionColor(new java.awt.Color(242, 243, 244));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jContent, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jContent, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jBodyPanelLayout = new javax.swing.GroupLayout(jBodyPanel);
        jBodyPanel.setLayout(jBodyPanelLayout);
        jBodyPanelLayout.setHorizontalGroup(
            jBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jBodyPanelLayout.setVerticalGroup(
            jBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBodyPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(526, 526, 526))
        );

        jParentPanel.add(jBodyPanel, java.awt.BorderLayout.CENTER);

        scrollPaneWin111.setViewportView(jParentPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void setData(OnePost_Model model){
        jTitle.setText(model.getTitle());
        jRegisterTime.setText(model.getDateRange());
        jOrganizer.setText(model.getOrganizer());
        jPostTime.setText(model.getPostTime_String());
        jContent.setText(model.getContent());
        jLike.setText(model.getCountLike_String());
        
    }
    private void jTymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTymActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTymActionPerformed

    private void jBookmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBookmarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBookmarkActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.uiteco.components.RoundedPanel RegisterTimePanel;
    private javax.swing.JPanel jBodyPanel;
    private com.uiteco.OfCuocThiPanel.secondPage.CustomButton jBookmark;
    private javax.swing.JPanel jButtons;
    private javax.swing.JTextArea jContent;
    private javax.swing.JLabel jLabel2;
    private com.uiteco.OfCuocThiPanel.secondPage.CustomButton jLike;
    private javax.swing.JLabel jOrganizer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jParentPanel;
    private javax.swing.JLabel jPostTime;
    private com.uiteco.OfCuocThiPanel.secondPage.CustomButton jRegister;
    private javax.swing.JLabel jRegisterTime;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jTitle;
    private com.raven.scroll.ScrollPaneWin11 scrollPaneWin111;
    private com.uiteco.components.GradientPanel topGradientPanel;
    // End of variables declaration//GEN-END:variables
}
