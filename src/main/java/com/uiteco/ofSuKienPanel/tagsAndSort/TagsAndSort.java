/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.ofSuKienPanel.tagsAndSort;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.DefaultComboBoxModel;
import com.uiteco.components.RoundedPanel;
import com.uiteco.ofSuKienPanel.SuKienDAO;
import java.awt.Color;
import java.sql.SQLException;
import com.uiteco.ofSuKienPanel.SuKienListView;
import com.uiteco.ofSuKienPanel.SuKienModel;
import com.uiteco.ofSuKienPanel.SuKienView;
import java.awt.Component;
import java.beans.PropertyChangeEvent;
import java.util.HashSet;
import java.util.Set;
import javax.swing.Box.Filler;
import java.beans.PropertyChangeListener;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author nddmi
 */
public class TagsAndSort extends RoundedPanel implements PropertyChangeListener {

    /**
     * All sorting options (Eg. Sort by posted time, sort by views, ...)
     */
    public static enum SORT_OPTION {
        NEWEST, HOTTEST
    };
    
    public static SORT_OPTION DEFAULT_SORT_OPTION = SORT_OPTION.NEWEST;
    protected SORT_OPTION sortOption;
    protected DefaultComboBoxModel<String> comboBoxModel;
    protected SuKienListView suKienListView;

    public TagsAndSort() {
        _init();
        initComponents();
        _additionalInit();
    }

    public TagsAndSort(SuKienListView suKienListView) {
        _init();
        initComponents();
        _additionalInit();
        setSuKienListView(suKienListView);
    }

    public SuKienListView getSuKienListView() {
        return this.suKienListView;
    }

    public void setSuKienListView(SuKienListView suKienListView) {
        this.suKienListView = suKienListView;
        this.suKienListView.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals(SuKienListView.LIST_POPULATED_EVENT)) {
            System.out.println("CATCHED A LIST_POPULATED_EVENT");
            try {
                applyFilter();
            } catch (NullSuKienViewException e) {
                e.printStackTrace();
            }
        }
    }

    public void applyFilter() throws NullSuKienViewException {
        System.out.println("Filter will be applied");
        if (suKienListView == null) {
            throw new NullSuKienViewException();
        }

        Set<String> selectedTags = new HashSet<>(comboBoxMulti.getSelectedItems());

        boolean fillerHidden = false;

        // Filter out SuKien based on tags
//        for (Component comp : suKienListView.getComponents()) {
//
//            if (!(comp instanceof SuKienView || comp instanceof Filler)) {
//                continue;
//            }
//
//            if (comp instanceof Filler && fillerHidden) {
//                fillerHidden = false;
//                comp.setVisible(false);
//
//            } else if (comp instanceof SuKienView) {
//                SuKienView suKienView = (SuKienView) comp;
//                SuKienModel suKienModel = suKienView.getSuKienModel();
//
//                // Hide SuKienView object if its tags doesn't match with selected tags
//                boolean tagMatched = false;
//
//                if (selectedTags.size() <= 0) {
//                    tagMatched = true;
//                    System.out.println("Tag matched");
//                } else {
//
//                    for (String tag : selectedTags) {
//                        if (suKienModel.getTags().contains(tag)) {
//                            tagMatched = true;
//                            System.out.println("Tag matched");
//                            break;
//                        }
//                    }
//                }
//
//                suKienView.setVisible(tagMatched);
//                fillerHidden = !tagMatched;
//            }
//        }

//        suKienListView.revalidate();
//        suKienListView.repaint();
//        System.out.println("Filter applied");
    }

    private void _additionalInit() {
        try {
            HashSet<String> tagSet = SuKienDAO.getAllTags();
            int n = tagSet.size();
            String[] tags = new String[n];

            int i = 0;
            for (String tag : tagSet) {
                tags[i] = tag;
                i++;
            }

            comboBoxModel = new DefaultComboBoxModel<String>(tags);
            comboBoxMulti.setModel(comboBoxModel);
        } catch (SQLException e) {
            System.err.println("TagsAndSort error:");
            e.printStackTrace();
        }
    }

    public DefaultComboBoxModel getModel() {
        return this.comboBoxModel;
    }

    private void _init() {
        FlatMacLightLaf.setup(); // This line must be run before initialization of ComboBoxMultiSelection
        sortOption = DEFAULT_SORT_OPTION;
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

        sortLabel = new javax.swing.JLabel();
        comboBoxMulti = new com.uiteco.components.comboBox.ComboBoxMultiSelectionLimitted();
        tagLabel = new javax.swing.JLabel();
        applyBtn = new com.uiteco.components.RoundedGradientPanel();
        applyLabel = new javax.swing.JLabel();
        hotBtn = new com.uiteco.components.RoundedPanel();
        hotLabel = new javax.swing.JLabel();
        newBtn = new com.uiteco.components.RoundedPanel();
        newLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setRoundBottomLeft(50);
        setRoundBottomRight(50);
        setRoundTopLeft(50);
        setRoundTopRight(50);
        setLayout(new java.awt.GridBagLayout());

        sortLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        sortLabel.setForeground(new java.awt.Color(51, 51, 51));
        sortLabel.setText("Sắp xếp:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        add(sortLabel, gridBagConstraints);

        comboBoxMulti.setPreferredSize(new java.awt.Dimension(80, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        add(comboBoxMulti, gridBagConstraints);

        tagLabel.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        tagLabel.setForeground(new java.awt.Color(51, 51, 51));
        tagLabel.setText("Tag:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 10);
        add(tagLabel, gridBagConstraints);

        applyBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 5));
        applyBtn.setColor1(new java.awt.Color(53, 101, 242));
        applyBtn.setColor2(new java.awt.Color(0, 0, 0));
        applyBtn.setPreferredSize(new java.awt.Dimension(100, 35));
        applyBtn.setRoundBottomLeft(25);
        applyBtn.setRoundBottomRight(25);
        applyBtn.setRoundTopLeft(25);
        applyBtn.setRoundTopRight(25);
        applyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                applyBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                applyBtnMouseExited(evt);
            }
        });
        applyBtn.setLayout(new java.awt.GridLayout(1, 0));

        applyLabel.setFont(new java.awt.Font("Circular Std Black", 1, 14)); // NOI18N
        applyLabel.setForeground(new java.awt.Color(255, 255, 255));
        applyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        applyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-filter-22.png"))); // NOI18N
        applyLabel.setText("Apply");
        applyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applyLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                applyLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                applyLabelMouseExited(evt);
            }
        });
        applyBtn.add(applyLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 30);
        add(applyBtn, gridBagConstraints);

        hotBtn.setBackground(new java.awt.Color(240, 242, 245));
        hotBtn.setPreferredSize(new java.awt.Dimension(90, 35));
        hotBtn.setRoundBottomLeft(15);
        hotBtn.setRoundBottomRight(15);
        hotBtn.setRoundTopLeft(15);
        hotBtn.setRoundTopRight(15);
        hotBtn.setLayout(new java.awt.GridLayout());

        hotLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        hotLabel.setForeground(new java.awt.Color(5, 5, 5));
        hotLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hotLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-flame-24.png"))); // NOI18N
        hotLabel.setText("Hot");
        hotLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hotLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hotLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hotLabelMouseExited(evt);
            }
        });
        hotBtn.add(hotLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        add(hotBtn, gridBagConstraints);

        newBtn.setBackground(new java.awt.Color(240, 242, 245));
        newBtn.setPreferredSize(new java.awt.Dimension(100, 35));
        newBtn.setRoundBottomLeft(15);
        newBtn.setRoundBottomRight(15);
        newBtn.setRoundTopLeft(15);
        newBtn.setRoundTopRight(15);
        newBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newBtnMouseExited(evt);
            }
        });
        newBtn.setLayout(new java.awt.GridLayout());

        newLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        newLabel.setForeground(new java.awt.Color(5, 5, 5));
        newLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-bell-24.png"))); // NOI18N
        newLabel.setText("Mới nhất");
        newLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newLabelMouseExited(evt);
            }
        });
        newBtn.add(newLabel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        add(newBtn, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void applyBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_applyBtnMouseEntered

    private void applyBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_applyBtnMouseExited

    private void applyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyLabelMouseClicked
        // TODO add your handling code here:
        try {
            applyFilter();

            Color prevColor = applyBtn.getColor1();
            Icon prevIcon = applyLabel.getIcon();
//            String prevText = applyLabel.getText();

            displayingAnimation = true;
//            applyLabel.setText("Apply");
            applyBtn.setColor1(new Color(14, 231, 15));
            applyLabel.setIcon(new ImageIcon(getClass().getResource("/icons8-tick-24.png")));

            TimerTask undo = new TimerTask() {
                @Override
                public void run() {
//                    applyLabel.setText(prevText);
                    applyBtn.setColor1(prevColor);
                    applyLabel.setIcon(prevIcon);
                    displayingAnimation = false;
                }
            };

            long delay = (long) (1.5 * 1000); // milliseconds
            new Timer().schedule(undo, delay);

        } catch (NullSuKienViewException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_applyLabelMouseClicked


    private void applyLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyLabelMouseEntered
        // TODO add your handling code here:
        applyLabel.setForeground(new Color(204, 203, 204));
        applyBtn.setColor1(new Color(7, 56, 119));

    }//GEN-LAST:event_applyLabelMouseEntered

    private void applyLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyLabelMouseExited
        // TODO add your handling code here:
        if (!displayingAnimation) {
            applyLabel.setForeground(new Color(255, 255, 255));
            applyBtn.setColor1(new Color(53, 101, 242));
        }
    }//GEN-LAST:event_applyLabelMouseExited

    private void hotLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotLabelMouseEntered
        // TODO add your handling code here:
        if (chosenBtn != hotBtn) {
            hotLabel.setForeground(hotLabel.getForeground().darker());
            hotBtn.setBackground(new Color(224, 228, 234));
        }
    }//GEN-LAST:event_hotLabelMouseEntered

    private void hotLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotLabelMouseExited
        // TODO add your handling code here:
        if (chosenBtn != hotBtn) {
            hotLabel.setForeground(hotLabel.getForeground().brighter());
            hotBtn.setBackground(new Color(240, 242, 245));
        }
    }//GEN-LAST:event_hotLabelMouseExited

    private void newBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_newBtnMouseEntered

    private void newBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_newBtnMouseExited

    private void hotLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotLabelMouseClicked
        // TODO add your handling code here:
        if (chosenBtn != hotBtn) {
            chosenBtn = hotBtn;

            hotLabel.setForeground(hotLabel.getForeground().darker());
            hotBtn.setBackground(new Color(204, 204, 204));

            newLabel.setForeground(newLabel.getForeground().brighter());
            newBtn.setBackground(new Color(240, 242, 245));
            
            sortOption = SORT_OPTION.HOTTEST;
        }
    }//GEN-LAST:event_hotLabelMouseClicked

    private void newLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newLabelMouseEntered
        // TODO add your handling code here:
        if (chosenBtn != newBtn) {
            newLabel.setForeground(newLabel.getForeground().darker());
            newBtn.setBackground(new Color(224, 228, 234));
        }
    }//GEN-LAST:event_newLabelMouseEntered

    private void newLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newLabelMouseExited
        // TODO add your handling code here:
        if (chosenBtn != newBtn) {
            newLabel.setForeground(newLabel.getForeground().brighter());
            newBtn.setBackground(new Color(240, 242, 245));
        }
    }//GEN-LAST:event_newLabelMouseExited

    private void newLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newLabelMouseClicked
        // TODO add your handling code here:
        if (chosenBtn != newBtn) {
            chosenBtn = newBtn;
            newLabel.setForeground(newLabel.getForeground().darker());
            newBtn.setBackground(new Color(204, 204, 204));

            hotLabel.setForeground(hotLabel.getForeground().brighter());
            hotBtn.setBackground(new Color(240, 242, 245));
            
            sortOption = SORT_OPTION.NEWEST;
        }
    }//GEN-LAST:event_newLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.uiteco.components.RoundedGradientPanel applyBtn;
    private javax.swing.JLabel applyLabel;
    private com.uiteco.components.comboBox.ComboBoxMultiSelectionLimitted comboBoxMulti;
    private com.uiteco.components.RoundedPanel hotBtn;
    private javax.swing.JLabel hotLabel;
    private com.uiteco.components.RoundedPanel newBtn;
    private javax.swing.JLabel newLabel;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JLabel tagLabel;
    // End of variables declaration//GEN-END:variables
    private boolean displayingAnimation;
    private Component chosenBtn;
}
