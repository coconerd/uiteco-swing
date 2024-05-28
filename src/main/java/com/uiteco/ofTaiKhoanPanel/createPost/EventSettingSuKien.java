/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.ofTaiKhoanPanel.createPost;

import com.raven.datechooser.DateChooser;
import com.raven.datechooser.SelectedDate;
import java.awt.Color;
import java.time.LocalDate;
import com.raven.datechooser.SelectedDate;

/**
 *
 * @author nddmi
 */
public class EventSettingSuKien extends javax.swing.JPanel {

    public static final String INSTANCE_NAME = "eventSettingSuKien";

    public void setEnrollable(boolean enrollable) {
        enrollableCheck.setSelected(enrollable);
        if (!enrollable) {
            startChooser.setForeground(dateDisableColor);
            startChooser.setEnabled(false);
            endChooser.setForeground(dateDisableColor);
            endChooser.setEnabled(false);
            jSpinner1.setFocusable(false);
            jSpinner1.setEnabled(false);
            jSpinner1.setForeground(textDisableColor);
            limitCheck.setFocusable(false);
            limitCheck.setEnabled(false);
            limitCheck.setForeground(textDisableColor);
        } else {
            startChooser.setForeground(dateEnableColor);
            startChooser.setEnabled(true);
            endChooser.setForeground(dateEnableColor);
            endChooser.setEnabled(true);
        }
    }

    public void setEnrollLimit(Integer enrollLimit) {
        if (enrollLimit != null) {
            limitCheck.setEnabled(true);
            limitCheck.setSelected(true);
            limitCheck.setFocusable(true);
            limitCheck.setForeground(textEnableColor);
            jSpinner1.setValue(enrollLimit);
            jSpinner1.setEnabled(true);
            jSpinner1.setFocusable(true);
        } else {
            jSpinner1.setEnabled(false);
            jSpinner1.setValue(1);
            jSpinner1.setFocusable(false);

            limitCheck.setEnabled(false);
            limitCheck.setForeground(textDisableColor);
            limitCheck.setSelected(false);
            limitCheck.setFocusable(false);
        }
    }

    public void setEnrollStart(LocalDate enrollStart) {
        LocalDate toBeSet = enrollStart != null ? enrollStart : LocalDate.now();
        startChooser.setSelectedDate(new SelectedDate(toBeSet.getDayOfMonth(), toBeSet.getMonthValue(), toBeSet.getYear()));
    }

    public void setEnrollEnd(LocalDate enrollEnd) {
        LocalDate toBeSet = enrollEnd != null ? enrollEnd : LocalDate.now();
        endChooser.setSelectedDate(new SelectedDate(toBeSet.getDayOfMonth(), toBeSet.getMonthValue(), toBeSet.getYear()));
    }

    public boolean isEnrollable() {
        return enrollableCheck.isSelected();
    }

    public Integer getEnrollLimit() {
        if (!enrollableCheck.isSelected()) {
            return null;
        }

        return limitCheck.isSelected() ? (int) jSpinner1.getValue() : null;
    }

    public LocalDate getEnrollStart() {
        return enrollableCheck.isSelected() ? _getLocalDateOf(startChooser) : null;
    }

    public LocalDate getEnrollEnd() {
        return enrollableCheck.isSelected() ? _getLocalDateOf(endChooser) : null;
    }

    private LocalDate _getLocalDateOf(DateChooser dc) {
        SelectedDate selDate = dc.getSelectedDate();
        int d = selDate.getDay();
        int m = selDate.getMonth();
        int y = selDate.getYear();
        return LocalDate.of(y, m, d);
    }

    /**
     * Creates new form EventSettingSuKien
     */
    public EventSettingSuKien() {
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

        startChooser = new com.raven.datechooser.DateChooser();
        enrollableCheck = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        endChooser = new com.raven.datechooser.DateChooser();
        limitCheck = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        startChooser.setForeground(new java.awt.Color(153, 204, 255));

        enrollableCheck.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enrollableCheck.setForeground(new java.awt.Color(51, 51, 51));
        enrollableCheck.setSelected(true);
        enrollableCheck.setText("Cho phép đăng ký tham gia");
        enrollableCheck.setToolTipText("");
        enrollableCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollableCheckActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(this.textDisableColor);
        jLabel1.setText("Số lượng tham gia tối đa");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Ngày hết hạn đăng ký");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Ngày bắt đầu đăng ký");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jSpinner1.setEnabled(false);
        jSpinner1.setFocusable(false);
        jSpinner1.setValue(1
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        endChooser.setForeground(new java.awt.Color(153, 204, 255));

        limitCheck.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limitCheck.setForeground(java.awt.Color.darkGray);
        limitCheck.setText("Giới hạn số lượng sinh viên tham gia");
        limitCheck.setToolTipText("");
        limitCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limitCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enrollableCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(limitCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(startChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(endChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(endChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enrollableCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(limitCheck)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enrollableCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollableCheckActionPerformed
        // TODO add your handling code here:
        if (!enrollableCheck.isSelected()) {
            jLabel1.setForeground(textDisableColor);
            jLabel2.setForeground(textDisableColor);
            jLabel3.setForeground(textDisableColor);
            limitCheck.setForeground(textDisableColor);
            limitCheck.setFocusable(false);
            limitCheck.setEnabled(false);
            jSpinner1.setValue(1);
            jSpinner1.setFocusable(false);
            jSpinner1.setEnabled(false);
            startChooser.setForeground(dateDisableColor);
            endChooser.setForeground(dateDisableColor);
            startChooser.setEnabled(false);
            endChooser.setEnabled(false);
        } else {
            jLabel1.setForeground(textEnableColor);
            jLabel2.setForeground(textEnableColor);
            jLabel3.setForeground(textEnableColor);
            limitCheck.setEnabled(true);
            if (!limitCheck.isSelected()) {
                limitCheck.setForeground(textDisableColor);
                limitCheck.setFocusable(false);
                jSpinner1.setValue(1);
                jSpinner1.setFocusable(false);
                jSpinner1.setEnabled(false);
            } else {
                limitCheck.setForeground(textEnableColor);
                limitCheck.setFocusable(true);
                jSpinner1.setValue(1);
                jSpinner1.setFocusable(true);
                jSpinner1.setEnabled(true);
            }
            startChooser.setForeground(dateEnableColor);
            endChooser.setForeground(dateEnableColor);
            startChooser.setEnabled(true);
            endChooser.setEnabled(true);
        }
    }//GEN-LAST:event_enrollableCheckActionPerformed

    private void limitCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limitCheckActionPerformed
        // TODO add your handling code here:
        if (!limitCheck.isSelected()) {
            jSpinner1.setEnabled(false);
            jSpinner1.setFocusable(false);
            jLabel1.setForeground(textDisableColor);
        } else {
            jSpinner1.setEnabled(true);
            jSpinner1.setFocusable(true);
            jLabel1.setForeground(textEnableColor);
        }
    }//GEN-LAST:event_limitCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.DateChooser endChooser;
    private javax.swing.JCheckBox enrollableCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JCheckBox limitCheck;
    private com.raven.datechooser.DateChooser startChooser;
    // End of variables declaration//GEN-END:variables
    private Color textDisableColor = new Color(153, 153, 153);
    private Color textEnableColor = new Color(102, 102, 102);
    private Color dateDisableColor = new Color(204, 204, 204);
    private Color dateEnableColor = new Color(153, 204, 255);
}
