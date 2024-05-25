/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.ofTaiKhoanPanel.ofHoatDongPanel;

import com.uiteco.components.RoundedPanel;
import com.uiteco.ofTaiKhoanPanel.TaiKhoanModel;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author nddmi
 */
public class LoginActivity extends RoundedPanel {

    public LoginActivity() {
        initComponents();
    }
    
    /**
     * Creates new form LoginActivity
     */
    public LoginActivity(TaiKhoanModel user) {
        initComponents();
        jLabel4.setText(formatDateWithDistance(user.getAccountCreationDate()));
        jLabel5.setText(formatDateTimeWithDistance(user.getLastAccess()));
    }

    public static String formatDateTimeWithDistance(LocalDateTime dateTime) {
        // Calculate the distance from the input date to now
        LocalDateTime now = LocalDateTime.now();
        Period period = Period.between(dateTime.toLocalDate(), now.toLocalDate());
        Duration duration = Duration.between(dateTime, now);

        long totalMinutes = duration.toMinutes();
        long totalHours = duration.toHours();
        long totalDays = duration.toDays();
        long months = period.toTotalMonths();
        long years = period.getYears();

        String timeDifference;
        if (totalMinutes < 60) {
            timeDifference = totalMinutes + " phút";
        } else if (totalHours < 24) {
            long minutes = totalMinutes % 60;
            timeDifference = totalHours + " giờ " + minutes + " phút";
        } else if (totalDays < 30) {
            long hours = totalHours % 24;
            timeDifference = totalDays + " ngày " + hours + " giờ";
        } else if (months < 12) {
            long days = totalDays % 30;
            timeDifference = months + " tháng " + days + " ngày";
        } else {
            long monthsRemainder = months % 12;
            timeDifference = years + " năm " + monthsRemainder + " tháng";
        }

        // Format the input date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d 'tháng' M yyyy, h:mm a", new Locale("vi", "VN"));
        String formattedDate = dateTime.format(formatter);

        // Build the final string
        return String.format("%s (%s)", formattedDate, timeDifference);
    }

    public static String formatDateWithDistance(LocalDate date) {
        // Calculate the distance from the input date to today
        LocalDate today = LocalDate.now();
        Period period = Period.between(date, today);
        int years = period.getYears();
        int days = period.getDays() + period.getMonths() * 30; // Simplified calculation for days in months

        // Format the input date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d 'tháng' M yyyy", new Locale("vi", "VN"));
        String formattedDate = date.format(formatter);

        // Build the final string
        return String.format("%s (%d năm %d ngày)", formattedDate, years, days);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setRoundBottomLeft(10);
        setRoundBottomRight(10);
        setRoundTopLeft(10);
        setRoundTopRight(10);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 5, 5));
        jLabel1.setText("Hoạt động đăng nhập");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 5, 5));
        jLabel2.setText("Ngày tạo tài khoản");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(5, 5, 5));
        jLabel3.setText("Lần truy cập gần nhất");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 608, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
