/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.contentPanels;
import com.uiteco.ofSuKienPanel.SlideShowView;
import com.uiteco.ofSuKienPanel.SuKienListModel;
import com.uiteco.ofSuKienPanel.SuKienListView;
import com.uiteco.ofSuKienPanel.SuKienModel;
import com.uiteco.ofSuKienPanel.SuKienView;
import com.uiteco.ofSuKienPanel.search.SearchBar;
import com.uiteco.ofSuKienPanel.tagsAndSort.TagsAndSort;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JTextPane;
import com.uiteco.ofSuKienPanel.tagsAndSort.NullSuKienViewException;

/**
 *
 * @author nddmi
 */
public class SuKienPanel extends javax.swing.JPanel {
    public static final String INSTANCE_NAME = "suKienPanel";
    

    /**
     * Creates new form Feed
     */
    public SuKienPanel() {
        initComponents();
    }

    public JPanel getContainerPanel() {
        return containerPanel;
    }

    public SearchBar getSearchBar() {
        return searchBar;
    }

    public SlideShowView getSlideShowView() {
        return slideShowView2;
    }

    public SuKienListView getSuKienListView() {
        return suKienListView1;
    }

    public TagsAndSort getTagsAndSort() {
        return tagsAndSort1;
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

        scrollPaneWin11 = new com.raven.scroll.ScrollPaneWin11();
        containerPanel = new javax.swing.JPanel();
        slideShowView2 = new com.uiteco.ofSuKienPanel.SlideShowView();
        searchBar = new com.uiteco.ofSuKienPanel.search.SearchBar();
        suKienListView1 = new com.uiteco.ofSuKienPanel.SuKienListView();
        tagsAndSort1 = new com.uiteco.ofSuKienPanel.tagsAndSort.TagsAndSort(getSuKienListView());

        setBackground(new java.awt.Color(242, 243, 244));
        setForeground(new java.awt.Color(242, 243, 244));
        setPreferredSize(null);
        setLayout(new java.awt.GridLayout(1, 1));

        scrollPaneWin11.setBorder(null);
        scrollPaneWin11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        containerPanel.setBackground(new java.awt.Color(242, 243, 244));
        containerPanel.setLayout(new java.awt.GridBagLayout());

        slideShowView2.setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25));
        slideShowView2.setMinimumSize(new java.awt.Dimension(518, 1100));
        slideShowView2.setPreferredSize(new java.awt.Dimension(728, 900));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        containerPanel.add(slideShowView2, gridBagConstraints);

        searchBar.setPlaceHolder("sự kiện");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 60);
        containerPanel.add(searchBar, gridBagConstraints);

        suKienListView1.setBackground(new java.awt.Color(242, 243, 244));
        suKienListView1.setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 60, 25, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 60, 15, 60);
        containerPanel.add(suKienListView1, gridBagConstraints);

        tagsAndSort1.setPreferredSize(new java.awt.Dimension(252, 70));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.insets = new java.awt.Insets(20, 60, 10, 60);
        containerPanel.add(tagsAndSort1, gridBagConstraints);

        scrollPaneWin11.setViewportView(containerPanel);

        add(scrollPaneWin11);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containerPanel;
    private com.raven.scroll.ScrollPaneWin11 scrollPaneWin11;
    private com.uiteco.ofSuKienPanel.search.SearchBar searchBar;
    private com.uiteco.ofSuKienPanel.SlideShowView slideShowView2;
    private com.uiteco.ofSuKienPanel.SuKienListView suKienListView1;
    private com.uiteco.ofSuKienPanel.tagsAndSort.TagsAndSort tagsAndSort1;
    // End of variables declaration//GEN-END:variables
}
