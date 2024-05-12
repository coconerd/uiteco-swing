/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.ofSuKienPanel.detailed;

import com.uiteco.components.GradientPanel;
import com.uiteco.components.ImageAvatar;
import com.uiteco.ofSuKienPanel.SuKienModel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author nddmi
 */
public class SuKienDetailPanel extends GradientPanel implements PropertyChangeListener {
    public static final String INSTANCE_NAME = "suKienDetailPanel";
    private SuKienModel suKienModel;
 
    /**
     * Constructor 1
     */
    public SuKienDetailPanel() {
        // Do not run initComponents() here because it won't work properly unless suKienModel is not null
    }

    public SuKienModel getSuKienModel() {
        return suKienModel;
    }

//    public GalleryView getGalleryView() {
//        return galleryView;
//    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        
    }

    /**
     * 
     * @param suKienModel
     * @throws NullSuKienModelException 
     */
    public void setSuKienModel(SuKienModel suKienModel) throws NullSuKienModelException {
        if (suKienModel == null) {
            throw new NullSuKienModelException();
        }
        
        this.suKienModel = suKienModel;
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

        scrollPaneWin111 = new com.raven.scroll.ScrollPaneWin11();
        viewport = new com.uiteco.components.GradientPanel();
        coverPhotoPanel = new com.uiteco.components.RoundedImagePanel();
        contentPanel = new com.uiteco.components.RoundedGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        textArea = new com.uiteco.components.RoundedGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        galleryView1 = new com.uiteco.ofSuKienPanel.detailed.GalleryView();
        metricsPanel = new com.uiteco.components.RoundedGradientPanel();
        jButton1 = new javax.swing.JButton();

        setBorder(null);
        setColor1(new java.awt.Color(204, 204, 204));
        setFade(false);
        setLayout(new java.awt.BorderLayout());

        scrollPaneWin111.setBorder(null);
        scrollPaneWin111.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneWin111.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        viewport.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 20));
        viewport.setLayout(new java.awt.GridBagLayout());

        coverPhotoPanel.setImage(getSuKienModel().getThumbnail());
        coverPhotoPanel.setMinimumSize(new java.awt.Dimension(670, 665));
        coverPhotoPanel.setPreferredSize(new java.awt.Dimension(510, 365));
        coverPhotoPanel.setRoundBottomRight(20);

        javax.swing.GroupLayout coverPhotoPanelLayout = new javax.swing.GroupLayout(coverPhotoPanel);
        coverPhotoPanel.setLayout(coverPhotoPanelLayout);
        coverPhotoPanelLayout.setHorizontalGroup(
            coverPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        coverPhotoPanelLayout.setVerticalGroup(
            coverPhotoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.6;
        viewport.add(coverPhotoPanel, gridBagConstraints);

        contentPanel.setPreferredSize(new java.awt.Dimension(810, 300));
        contentPanel.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("OCR A Std", 0, 16)); // NOI18N
        jLabel2.setText(getSuKienModel().getTitle());
        contentPanel.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText(getSuKienModel().getContent());

        javax.swing.GroupLayout textAreaLayout = new javax.swing.GroupLayout(textArea);
        textArea.setLayout(textAreaLayout);
        textAreaLayout.setHorizontalGroup(
            textAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(415, 415, 415))
        );
        textAreaLayout.setVerticalGroup(
            textAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textAreaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        contentPanel.add(textArea, java.awt.BorderLayout.CENTER);

        galleryView1.setBorder(null);
        contentPanel.add(galleryView1, java.awt.BorderLayout.LINE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.4;
        viewport.add(contentPanel, gridBagConstraints);

        metricsPanel.setPreferredSize(new java.awt.Dimension(300, 365));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye.png"))); // NOI18N
        jButton1.setText(String.valueOf(getSuKienModel().getViews()));

        javax.swing.GroupLayout metricsPanelLayout = new javax.swing.GroupLayout(metricsPanel);
        metricsPanel.setLayout(metricsPanelLayout);
        metricsPanelLayout.setHorizontalGroup(
            metricsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, metricsPanelLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        metricsPanelLayout.setVerticalGroup(
            metricsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, metricsPanelLayout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.6;
        viewport.add(metricsPanel, gridBagConstraints);

        scrollPaneWin111.setViewportView(viewport);

        add(scrollPaneWin111, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.uiteco.components.RoundedGradientPanel contentPanel;
    private com.uiteco.components.RoundedImagePanel coverPhotoPanel;
    private com.uiteco.ofSuKienPanel.detailed.GalleryView galleryView1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.uiteco.components.RoundedGradientPanel metricsPanel;
    private com.raven.scroll.ScrollPaneWin11 scrollPaneWin111;
    private com.uiteco.components.RoundedGradientPanel textArea;
    private com.uiteco.components.GradientPanel viewport;
    // End of variables declaration//GEN-END:variables
}