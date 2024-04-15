/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.contentPanels.suKienPanel.components;

import javax.swing.SwingConstants;

/**
 *
 * @author nddmi
 */
public class SuKienView extends javax.swing.JPanel {
    private SuKienModel suKienModel;
    
    public SuKienView() {
        this.suKienModel = new SuKienModel();
        initComponents();
    }
    
    public SuKienView(SuKienModel suKienModel) {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        postedBy = new javax.swing.JLabel();
        postedAt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextPane();

        setForeground(new java.awt.Color(242, 243, 244));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 0));
        jPanel1.setForeground(new java.awt.Color(242, 243, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 102));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(89, 165, 235));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 102));
        jPanel2.setLayout(new java.awt.GridLayout(3, 0));

        postedBy.setText(suKienModel.getPostedBy());
        postedBy.setHorizontalAlignment(SwingConstants.CENTER);
        jPanel2.add(postedBy);

        postedAt.setText(suKienModel.getPostedAt().toString());
        postedAt.setHorizontalAlignment(SwingConstants.CENTER);
        jPanel2.add(postedAt);

        add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        title.setText(suKienModel.getTitle());

        String content = suKienModel.getContent();
        int maxLength = 40;
        String trimmedContent = content.substring(0, Math.min(content.length(), maxLength));
        description.setText(trimmedContent);
        jScrollPane1.setViewportView(description);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(0, 218, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
        );

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane description;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel postedAt;
    private javax.swing.JLabel postedBy;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
