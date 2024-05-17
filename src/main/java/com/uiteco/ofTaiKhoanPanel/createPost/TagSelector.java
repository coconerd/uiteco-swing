/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.ofTaiKhoanPanel.createPost;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.uiteco.components.RoundedPanel;
import javax.swing.DefaultComboBoxModel;
import static com.uiteco.ofSuKienPanel.SuKienDAO.getAllTags;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.HashSet;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Set;

/**
 *
 * @author nddmi
 */
public class TagSelector extends RoundedPanel implements PropertyChangeListener {

    /**
     * Creates new form TagSelector
     */
    public TagSelector() throws SQLException {
        FlatMacLightLaf.setup(); // This line must be run before initialization of ComboBoxMultiSelection

        initComponents();

        HashSet<String> tagSet = getAllTags();
        int n = tagSet.size();
        String[] tags = new String[n];

        int i = 0;
        for (String tag : tagSet) {
            tags[i] = tag;
            i++;

        }
        combo.setModel(new DefaultComboBoxModel<String>(tags));
//        combo.addChangeListener(this);
    }

    public Set<String> getSelectedTags() {
        return new HashSet<String>(combo.getSelectedItems());
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
//        if (evt.getPropertyName().equals("selectedItems")) {
//            List<String> items = combo.getSelectedItems();
//            if (evt.getNewValue() == evt.getOldValue()) {
//                JOptionPane.showMessageDialog(this, "Bạn không thể chọn quá 3 tag", "", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//            roundedPanel1.removeAll();
//            for (String tag : items) {
//                RoundedPanel wrapper = RoundedPanel.getRoundedPanel(50, new GridLayout(1, 1, 0, 0));
//                wrapper.setForeground(Color.WHITE);
//                JLabel t = new JLabel(tag);
//                t.setIcon(new ImageIcon(getClass().getResource("/icons8-tag-24.png")));
//                t.setFont(new Font("Circular Std Black", Font.PLAIN, 13));
//                t.setForeground(new Color(101, 103, 107));
//                wrapper.add(t);
//                roundedPanel1.add(wrapper);
//            }
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        combo = new com.uiteco.components.comboBox.ComboBoxMultiSelectionLimitted();
        roundedPanel1 = new com.uiteco.components.RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 300));
        setRoundBottomLeft(10);
        setRoundBottomRight(10);
        setRoundTopLeft(10);
        setRoundTopRight(10);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Gắn thẻ cho bài viết");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Việc gắn thể cho bài viết giúp người dùng dễ dàng tìm kiếm bài viết hơn và đồng thời nắm bắt nội dung của bài viết tốt hơn");

        roundedPanel1.setBackground(new java.awt.Color(255, 51, 51));
        roundedPanel1.setRoundBottomLeft(7);
        roundedPanel1.setRoundBottomRight(7);
        roundedPanel1.setRoundTopLeft(7);
        roundedPanel1.setRoundTopRight(7);
        roundedPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HỦY TẤT CẢ TAG");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        roundedPanel1.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Chọn tối đa 3 tag");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        combo.clearSelectedItems();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        roundedPanel1.setBackground(roundedPanel1.getBackground().darker());
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        roundedPanel1.setBackground(roundedPanel1.getBackground().brighter());
    }//GEN-LAST:event_jLabel3MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.uiteco.components.comboBox.ComboBoxMultiSelectionLimitted combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private com.uiteco.components.RoundedPanel roundedPanel1;
    // End of variables declaration//GEN-END:variables
}
