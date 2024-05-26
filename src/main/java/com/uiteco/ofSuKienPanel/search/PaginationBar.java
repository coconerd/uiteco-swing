/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.ofSuKienPanel.search;

import com.uiteco.components.RoundedPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;

/**
 *
 * @author nddmi
 */
public class PaginationBar extends RoundedPanel {

    boolean hasNextPage;
    boolean hasPreviousPage;
    Color btnColor = new Color(83, 132, 255);

    /**
     * Creates new form PaginationBar
     */
    public PaginationBar(boolean hasNextPage, boolean hasPreviousPage) {
        setHasNextPage(hasNextPage);
        setHasPreviousPage(hasPreviousPage);
        
        if (!hasNextPage && !hasPreviousPage) {
            return;
        }
        initComponents();
    }

    public boolean hasNextPage() {
        return hasNextPage;
    }

    public boolean hasPreviousPage() {
        return hasPreviousPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public void setHasPreviousPage(boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
    }

    public void changePage(boolean isNext) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prevBtn = new com.uiteco.components.RoundedPanel();
        jLabel1 = new javax.swing.JLabel();
        nextBtn = new com.uiteco.components.RoundedPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        setRoundBottomLeft(16);
        setRoundBottomRight(16);
        setRoundTopLeft(16);
        setRoundTopRight(16);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5);
        flowLayout1.setAlignOnBaseline(true);
        setLayout(flowLayout1);

        prevBtn.setBackground(hasPreviousPage ? btnColor : new Color(204, 204, 204));
        prevBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        prevBtn.setPreferredSize(hasPreviousPage ? new Dimension(130, 35) : new Dimension(45, 45));
        prevBtn.setRoundBottomLeft(60);
        prevBtn.setRoundBottomRight(60);
        prevBtn.setRoundTopLeft(60);
        prevBtn.setRoundTopRight(60);
        prevBtn.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.background"));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-less-than-30.png"))); // NOI18N
        jLabel1.setIconTextGap(7);
        jLabel1.setMaximumSize(new java.awt.Dimension(116, 40));
        jLabel1.setMinimumSize(new java.awt.Dimension(116, 40));
        jLabel1.setPreferredSize(new java.awt.Dimension(116, 40));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        prevBtn.add(jLabel1);

        add(prevBtn);

        nextBtn.setBackground(hasPreviousPage ? btnColor : new Color(204, 204, 204));
        nextBtn.setPreferredSize(hasNextPage ? new Dimension(130, 35) : new Dimension(45, 45));
        nextBtn.setRoundBottomLeft(60);
        nextBtn.setRoundBottomRight(60);
        nextBtn.setRoundTopLeft(60);
        nextBtn.setRoundTopRight(60);
        nextBtn.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-more-than-30.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel2.setIconTextGap(7);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        nextBtn.add(jLabel2);

        add(nextBtn);
    }// </editor-fold>//GEN-END:initComponents

    private void highlight(Component comp) {
//        comp.setBackground(new Color(25, 140, 255));
        comp.setBackground(btnColor.darker());
    }

    private void unHighlight(Component comp) {
//        comp.setBackground(new Color(10, 132, 255));
        comp.setBackground(btnColor);
    }

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        if (hasPreviousPage) {
            highlight(prevBtn);
            jLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        if (hasPreviousPage) {
            unHighlight(prevBtn);
            jLabel1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        if (hasNextPage) {
            highlight(nextBtn);
            jLabel2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        if (hasNextPage) {
            unHighlight(nextBtn);
            jLabel2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        changePage(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        changePage(true);
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.uiteco.components.RoundedPanel nextBtn;
    private com.uiteco.components.RoundedPanel prevBtn;
    // End of variables declaration//GEN-END:variables
}