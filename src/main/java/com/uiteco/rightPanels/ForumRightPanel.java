/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.rightPanels;

/**
 *
 * @author nddmi
 */
public class ForumRightPanel extends javax.swing.JPanel {

    /**
     * Creates new form ForumRightPanel
     */
    public ForumRightPanel() {
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

        dateChooser1 = new com.raven.datechooser.DateChooser();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(235, 235, 235));
        setLayout(new java.awt.GridBagLayout());

        dateChooser1.setForeground(new java.awt.Color(0, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(30, 15, 620, 15);
        add(dateChooser1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.DateChooser dateChooser1;
    // End of variables declaration//GEN-END:variables
}
