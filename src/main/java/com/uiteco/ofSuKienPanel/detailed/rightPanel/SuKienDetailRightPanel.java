/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.ofSuKienPanel.detailed.rightPanel;

import com.uiteco.components.GradientPanel;
import com.uiteco.ofSuKienPanel.SuKienDAO;
import com.uiteco.ofSuKienPanel.SuKienModel;
import com.uiteco.ofTaiKhoanPanel.TaiKhoanModel;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import net.miginfocom.swing.MigLayout;
import static com.uiteco.ofTaiKhoanPanel.createPost.CreatePostUI.createDialog;
import static com.uiteco.main.App.getSession;

/**
 *
 * @author nddmi
 */
public class SuKienDetailRightPanel extends GradientPanel {

    public static final String INSTANCE_NAME = "suKienDetailRightPanel";
    private SuKienModel suKienModel;

    /**
     * Creates new form DetailedRightPanel
     */
    public SuKienDetailRightPanel() {
        initComponents();
//        setColor1((new Color(168, 202, 240)).brighter());
//        setColor2((new Color(236, 243, 251)).brighter());
        setDirection(GradientPanel.DIAGONAL);
        likesPanel.setLayout(new MigLayout("fillx, debug", "[grow]", "[]10[]"));
    }

    public void load(SuKienModel suKienModel) {
        this.suKienModel = suKienModel;

        // Only show enroll button  for student accounts
        if (getSession().getUser().getAccountType() == TaiKhoanModel.ACCOUNT_TYPE.sinhvien
                || getSession().getUser().getAccountType() == TaiKhoanModel.ACCOUNT_TYPE.cuusinhvien) {
            enrollBtn.setVisible(suKienModel.isEnrollable());
        } else {
            enrollBtn.setVisible(false);
        }

        try {
            likesPanel.removeAll();
            ArrayList<TaiKhoanModel> list = SuKienDAO.getLikers(suKienModel);
            if (list.size() < 1) {
                likesPanel.revalidate();
                likesPanel.repaint();
                return;
            }
            for (TaiKhoanModel m : list) {
                LikerLine v = new LikerLine(m);
//                likesPanel.add(v, "growx, wrap, width ::" + likesPanel.getPreferredSize().width);
                likesPanel.add(v, "growx, wrap");
            }
            likesPanel.revalidate();
            likesPanel.repaint();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void _showParticipantPanel() {
        createDialog("Danh sách sinh viên tham gia", new ParticipantsPanel(suKienModel));
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

        likeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        likeScrollPane = new com.raven.scroll.ScrollPaneWin11();
        likesPanel = new javax.swing.JPanel();
        enrollBtn = new com.uiteco.components.RoundedGradientPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setColor1(new java.awt.Color(255, 255, 255));
        setDirection(com.uiteco.components.GradientPanel.Direction.HORIZONTAL);
        setFade(false);
        setLayout(new java.awt.GridBagLayout());

        likeLabel.setBackground(new java.awt.Color(153, 255, 153));
        likeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        likeLabel.setForeground(new java.awt.Color(0, 204, 0));
        likeLabel.setText("Lượt thích");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(15, 5, 5, 0);
        add(likeLabel, gridBagConstraints);

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        add(jSeparator1, gridBagConstraints);

        dateChooser2.setForeground(new java.awt.Color(90, 207, 241));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        add(dateChooser2, gridBagConstraints);

        jLayeredPane2.setOpaque(true);

        likeScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        likesPanel.setBackground(new java.awt.Color(255, 255, 255));
        likesPanel.setPreferredSize(new java.awt.Dimension(400, 603));

        javax.swing.GroupLayout likesPanelLayout = new javax.swing.GroupLayout(likesPanel);
        likesPanel.setLayout(likesPanelLayout);
        likesPanelLayout.setHorizontalGroup(
            likesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        likesPanelLayout.setVerticalGroup(
            likesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        likeScrollPane.setViewportView(likesPanel);

        enrollBtn.setBorder(null);
        enrollBtn.setColor1(new java.awt.Color(204, 255, 170));
        enrollBtn.setColor2(new java.awt.Color(255, 255, 255));
        enrollBtn.setDirection(com.uiteco.components.RoundedGradientPanel.Direction.DIAGONAL);
        enrollBtn.setPreferredSize(new java.awt.Dimension(70, 70));
        enrollBtn.setRoundBottomLeft(99);
        enrollBtn.setRoundBottomRight(99);
        enrollBtn.setRoundTopLeft(99);
        enrollBtn.setRoundTopRight(99);
        enrollBtn.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-join-48.png"))); // NOI18N
        jLabel1.setToolTipText("THAM GIA SỰ KIỆN");
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
        enrollBtn.add(jLabel1);

        jLayeredPane2.setLayer(likeScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(enrollBtn, javax.swing.JLayeredPane.POPUP_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(320, Short.MAX_VALUE)
                .addComponent(enrollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(likeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(418, Short.MAX_VALUE)
                .addComponent(enrollBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(likeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.8;
        add(jLayeredPane2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        enrollBtn.setColor1(enrollBtn.getColor1().brighter());
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        _showParticipantPanel();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        enrollBtn.setColor1(new Color(204, 255, 170));
    }//GEN-LAST:event_jLabel1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.DateChooser dateChooser2;
    private com.uiteco.components.RoundedGradientPanel enrollBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel likeLabel;
    private com.raven.scroll.ScrollPaneWin11 likeScrollPane;
    private javax.swing.JPanel likesPanel;
    // End of variables declaration//GEN-END:variables
}