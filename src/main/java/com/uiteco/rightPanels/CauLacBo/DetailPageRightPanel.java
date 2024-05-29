/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.rightPanels.CauLacBo;

import com.uiteco.contentPanels.CauLacBo.Calendar.InfoDateEvent;
import com.uiteco.contentPanels.CauLacBo.Calendar.List_DateEvent;
import com.uiteco.contentPanels.CauLacBo.IntroductionClub;
import com.uiteco.database.ConnectionManager;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class DetailPageRightPanel extends javax.swing.JPanel {

    private int MaCLB = -1;
    private List_DateEvent ListDE = new List_DateEvent();
    
    public DetailPageRightPanel() {
        initComponents();
        
        calendarCustom2.setparentPanel(jPanel1);
    }

    public DetailPageRightPanel(int MaCLB, String NameCLB, String CreateBy, String HostBy, LocalDate DateCreate) {
        this.MaCLB = MaCLB;
        
        try {
            LocalDate startDateDK = null, endDateDK = null;
            LocalDateTime startDateDR = null, endDateDR = null;
            String title = null;
            
            Connection conn = ConnectionManager.getConnection();
            String sql = "select * from BAIDANG Where MACLBDANGBAI = " + MaCLB;
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                startDateDK = rs.getDate("NGAYBD_DANGKY").toLocalDate();
                endDateDK = rs.getDate("NGAYHH_DANGKY").toLocalDate();
                
                title = rs.getNString("TIEUDE");
                
                startDateDR = rs.getTimestamp("THOIDIEMDIENRA").toLocalDateTime();
                endDateDR = rs.getTimestamp("THOIDIEMKETTHUC").toLocalDateTime();
                
                ListDE.add(new InfoDateEvent(startDateDK, title, "startDK"));
                ListDE.add(new InfoDateEvent(endDateDK, title, "endDK"));
                ListDE.add(new InfoDateEvent(startDateDR.toLocalDate(), title, "startDR"));
                ListDE.add(new InfoDateEvent(endDateDR.toLocalDate(), title, "endDR"));
            }

//            System.out.println("Size: " + ListDE.size());
            
            ListDE.SortDate();
            
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        initComponents();

        calendarCustom2.setparentPanel(jPanel1);
        
        this.NameCLB.setText(NameCLB);
        
        if(DateCreate != null)
            this.DateCreate.setText("Ngày Thành Lập: " + DateCreate.getDayOfMonth() + "/" + DateCreate.getMonthValue() + "/" + DateCreate.getYear());
        else
            this.DateCreate.setText("Ngày Thành Lập: --/--/----");
            
        this.CreateBy.setText("Thành Lập Bởi: " + CreateBy);
        
        
        String NameHost = "";
        
        try {
            Connection conn = ConnectionManager.getConnection();
            String sql = "select * from TAIKHOAN Where MATK = " + HostBy;
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
           
            while(rs.next())
            {
                NameHost = rs.getNString("HOTEN");  
                break;
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        this.HostBy.setText("Chủ nhiệm: " + NameHost);
        
        // Connect Data calendar
        
        
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
        calendarCustom2 = new com.uiteco.contentPanels.CauLacBo.Calendar.CalendarCustom(ListDE);
        NameCLB = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        DateCreate = new javax.swing.JLabel();
        CreateBy = new javax.swing.JLabel();
        HostBy = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(calendarCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        NameCLB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NameCLB.setForeground(new java.awt.Color(0, 149, 255));
        NameCLB.setText("NameCLB");

        jPanel2.setBackground(new java.awt.Color(168, 168, 168));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        DateCreate.setForeground(new java.awt.Color(112, 112, 112));
        DateCreate.setText("Ngày Thành Lập: 27/11/2004");

        CreateBy.setForeground(new java.awt.Color(112, 112, 112));
        CreateBy.setText("Thành Lập Bởi: Sinh Viên Khoa CNPM");

        HostBy.setForeground(new java.awt.Color(112, 112, 112));
        HostBy.setText("Người Chủ trì: VStorm");

        jLabel2.setBackground(new java.awt.Color(23, 23, 23));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 100, 100));
        jLabel2.setText("Copyright © 2024 : CocoNerd ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(100, 100, 100));
        jLabel3.setText("Designed by ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(98, 98, 98));
        jLabel4.setText("VStorm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(NameCLB))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(DateCreate))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(CreateBy))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(HostBy)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(NameCLB)
                .addGap(15, 15, 15)
                .addComponent(DateCreate)
                .addGap(15, 15, 15)
                .addComponent(CreateBy)
                .addGap(15, 15, 15)
                .addComponent(HostBy)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setMaCLB(int MaCLB)
    {
        MaCLB = this.MaCLB;
        
        
        
    }
    
    public int getMaCLB()
    {
       return MaCLB;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CreateBy;
    private javax.swing.JLabel DateCreate;
    private javax.swing.JLabel HostBy;
    private javax.swing.JLabel NameCLB;
    private com.uiteco.contentPanels.CauLacBo.Calendar.CalendarCustom calendarCustom2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
