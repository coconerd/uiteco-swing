/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.OfCuocThiPanel.firstPage;

/**
 *
 * @author Phan Thi Thuy Hien
 */
public class LabelTag extends javax.swing.JPanel {

    /**
     * @return the roundedPanel1
     */
    public com.uiteco.components.RoundedPanel getRoundedPanel1() {
        return roundedPanel1;
    }

    /**
     * @return the jLabel_TagName
     */
    public javax.swing.JLabel getjLabel_TagName() {
        return jLabel_TagName;
    }

    /**
     * @param roundedPanel1 the roundedPanel1 to set
     */
    public void setRoundedPanel1(com.uiteco.components.RoundedPanel roundedPanel1) {
        this.roundedPanel1 = roundedPanel1;
    }

    /**
     * @param jLabel_TagName the jLabel_TagName to set
     */
    public void setjLabel_TagName(javax.swing.JLabel jLabel_TagName) {
        this.jLabel_TagName = jLabel_TagName;
    }

    /**
     * Creates new form Tags_Label
     */
    public LabelTag() {
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

        roundedPanel1 = new com.uiteco.components.RoundedPanel();
        jLabel_TagName = new javax.swing.JLabel();

        setOpaque(false);

        roundedPanel1.setBackground(new java.awt.Color(223, 235, 248));
        roundedPanel1.setForeground(new java.awt.Color(255, 255, 255));
        roundedPanel1.setRoundBottomLeft(15);
        roundedPanel1.setRoundBottomRight(15);
        roundedPanel1.setRoundTopLeft(15);
        roundedPanel1.setRoundTopRight(15);

        jLabel_TagName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel_TagName.setForeground(new java.awt.Color(35, 120, 209));
        jLabel_TagName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TagName.setText("null");
        jLabel_TagName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 2, 2, 1));

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TagName, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TagName, javax.swing.GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel jLabel_TagName;
    protected com.uiteco.components.RoundedPanel roundedPanel1;
    // End of variables declaration//GEN-END:variables
}