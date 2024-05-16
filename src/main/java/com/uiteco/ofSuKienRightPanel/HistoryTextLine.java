/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.ofSuKienRightPanel;

import com.uiteco.components.RoundedBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;
import com.uiteco.components.RoundedImagePanel;
import com.uiteco.ofSuKienPanel.SuKienModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import com.uiteco.main.App;
import com.uiteco.ofSuKienPanel.detailed.NullSuKienModelException;
import com.uiteco.ofSuKienPanel.detailed.SuKienDetail;
import com.uiteco.ofSuKienPanel.detailed.SuKienDetailScrollPane;
import com.uiteco.swing.ContentPanel;
import java.awt.Component;

/**
 *
 * @author nddmi
 */
public class HistoryTextLine extends javax.swing.JPanel {

    SuKienModel suKienModel;

    /**
     * Creates new form HistoryTextLine
     */
    public HistoryTextLine(SuKienModel suKienModel) {
        this.suKienModel = suKienModel;
        initComponents();
    }

    public SuKienModel getSuKienModel() {
        return suKienModel;
    }

    public void setSuKienModel(SuKienModel suKienModel) {
        this.suKienModel = suKienModel;
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

        thumbnailImg = RoundedImagePanel.getRoundedImagePanel(3);
        title = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        thumbnailImg.setImage(suKienModel.getThumbnail());
        thumbnailImg.setMinimumSize(new java.awt.Dimension(20, 10));
        thumbnailImg.setPreferredSize(new java.awt.Dimension(45, 20));
        thumbnailImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thumbnailImgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout thumbnailImgLayout = new javax.swing.GroupLayout(thumbnailImg);
        thumbnailImg.setLayout(thumbnailImgLayout);
        thumbnailImgLayout.setHorizontalGroup(
            thumbnailImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );
        thumbnailImgLayout.setVerticalGroup(
            thumbnailImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        add(thumbnailImg, gridBagConstraints);

        title.setBackground(java.awt.Color.darkGray);
        title.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        title.setForeground(java.awt.Color.darkGray);
        title.setText(suKienModel.getTitle());
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                titleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titleMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 1.0;
        add(title, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void _showSuKienDetail() {
        if (suKienModel != null) {
            ContentPanel appContentPanel = App.getMainFrame().getContentPanel();
            SuKienDetailScrollPane sds = (SuKienDetailScrollPane) appContentPanel.getComponent(SuKienDetailScrollPane.INSTANCE_NAME);
            try {
                sds.loadAndDisplay(suKienModel);
            } catch (NullSuKienModelException e) {
                e.printStackTrace();
            }
        }
    }

    private void titleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseEntered
        // TODO add your handling code here:
        title.setForeground(new Color(51, 51, 51));
        title.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
    }//GEN-LAST:event_titleMouseEntered

    private void titleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseExited
        // TODO add your handling code here:
        title.setForeground(new Color(64, 64, 64));
        title.setFont(new Font("Segoe UI", Font.BOLD, 13));
    }//GEN-LAST:event_titleMouseExited

    private void titleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseClicked
        // TODO add your handling code here:
        _showSuKienDetail();
    }//GEN-LAST:event_titleMouseClicked

    private void thumbnailImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thumbnailImgMouseClicked
        // TODO add your handling code here:
        _showSuKienDetail();
    }//GEN-LAST:event_thumbnailImgMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.uiteco.components.RoundedImagePanel thumbnailImg;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
