/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.forum;

import com.forum.database.BaiDangForumDAO;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PostDetailAndReplyPanelView extends javax.swing.JPanel {
    private int postID; //khi hiển thị thì biết đây là bài đăng nào và nhờ có mã bài đăng này thì khi lưu những phản hồi bài đăng này vào csdl mới được, do có trường MABDFORUM khi thêm vào table BINHLUAN
    private ArrayList<PostDetailView> listPost;
    private int currentPage;
    private int totalPages; 
    
    public PostDetailAndReplyPanelView(int mabaidang) {
        _initComponents(mabaidang);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tailerPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        statisticButton = new javax.swing.JButton();
        replyButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        hienthisotrangPanel = new javax.swing.JPanel();
        pageLabel = new javax.swing.JLabel();
        jTextFieldOfPageNumberCurrent = new javax.swing.JTextField();
        ofLabel = new javax.swing.JLabel();
        totalPageNumberLabel = new javax.swing.JLabel();
        scrollPaneWin111 = new com.raven.scroll.ScrollPaneWin11();
        listIncludePostDetailAndReply = new javax.swing.JPanel();

        setBackground(new java.awt.Color(245, 238, 238));

        tailerPanel.setBackground(new java.awt.Color(192, 192, 203));

        exitButton.setBackground(new java.awt.Color(172, 172, 172));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exitButton.setForeground(new java.awt.Color(0, 0, 0));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-exit-25.png"))); // NOI18N
        exitButton.setText("Exit");
        exitButton.setFocusable(false);
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        exitButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        exitButton.setIconTextGap(2);
        exitButton.setOpaque(true);

        statisticButton.setBackground(new java.awt.Color(172, 172, 172));
        statisticButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        statisticButton.setForeground(new java.awt.Color(0, 0, 0));
        statisticButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-statistic-25 (1).png"))); // NOI18N
        statisticButton.setText("Statistic");
        statisticButton.setFocusable(false);
        statisticButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statisticButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        statisticButton.setIconTextGap(2);
        statisticButton.setOpaque(true);

        replyButton.setBackground(new java.awt.Color(172, 172, 172));
        replyButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        replyButton.setForeground(new java.awt.Color(0, 0, 0));
        replyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-reply-25.png"))); // NOI18N
        replyButton.setText("Reply");
        replyButton.setFocusable(false);
        replyButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        replyButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        replyButton.setIconTextGap(2);
        replyButton.setOpaque(true);

        backButton.setBackground(new java.awt.Color(172, 172, 172));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left-26.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        backButton.setIconTextGap(2);
        backButton.setMaximumSize(new java.awt.Dimension(86, 33));
        backButton.setMinimumSize(new java.awt.Dimension(86, 33));
        backButton.setOpaque(true);
        backButton.setPreferredSize(new java.awt.Dimension(86, 33));

        nextButton.setBackground(new java.awt.Color(172, 172, 172));
        nextButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nextButton.setForeground(new java.awt.Color(0, 0, 0));
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-right-26.png"))); // NOI18N
        nextButton.setText("Next");
        nextButton.setFocusable(false);
        nextButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nextButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        nextButton.setIconTextGap(2);
        nextButton.setOpaque(true);

        hienthisotrangPanel.setBackground(new java.awt.Color(192, 192, 203));

        pageLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pageLabel.setForeground(new java.awt.Color(0, 0, 0));
        pageLabel.setText("Page");
        pageLabel.setPreferredSize(new java.awt.Dimension(28, 16));

        jTextFieldOfPageNumberCurrent.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldOfPageNumberCurrent.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldOfPageNumberCurrent.setText("1234");
        jTextFieldOfPageNumberCurrent.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(204, 204, 204)));
        jTextFieldOfPageNumberCurrent.setCaretPosition(0);

        ofLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ofLabel.setForeground(new java.awt.Color(0, 0, 0));
        ofLabel.setText("of");
        ofLabel.setPreferredSize(new java.awt.Dimension(15, 16));

        totalPageNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totalPageNumberLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalPageNumberLabel.setText("123");

        javax.swing.GroupLayout hienthisotrangPanelLayout = new javax.swing.GroupLayout(hienthisotrangPanel);
        hienthisotrangPanel.setLayout(hienthisotrangPanelLayout);
        hienthisotrangPanelLayout.setHorizontalGroup(
            hienthisotrangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hienthisotrangPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTextFieldOfPageNumberCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(ofLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(totalPageNumberLabel)
                .addContainerGap())
        );
        hienthisotrangPanelLayout.setVerticalGroup(
            hienthisotrangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hienthisotrangPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
            .addGroup(hienthisotrangPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTextFieldOfPageNumberCurrent)
                .addGap(6, 6, 6))
            .addGroup(hienthisotrangPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(hienthisotrangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPageNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ofLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout tailerPanelLayout = new javax.swing.GroupLayout(tailerPanel);
        tailerPanel.setLayout(tailerPanelLayout);
        tailerPanelLayout.setHorizontalGroup(
            tailerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tailerPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(replyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statisticButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hienthisotrangPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        tailerPanelLayout.setVerticalGroup(
            tailerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tailerPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(tailerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tailerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(tailerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tailerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tailerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(statisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(replyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(hienthisotrangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        scrollPaneWin111.setBackground(new java.awt.Color(255, 255, 255));
        scrollPaneWin111.setBorder(null);
        scrollPaneWin111.setForeground(new java.awt.Color(255, 255, 255));
        scrollPaneWin111.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneWin111.setOpaque(false);
        scrollPaneWin111.setViewportView(listIncludePostDetailAndReply);

        listIncludePostDetailAndReply.setBackground(new java.awt.Color(238, 230, 230));

        javax.swing.GroupLayout listIncludePostDetailAndReplyLayout = new javax.swing.GroupLayout(listIncludePostDetailAndReply);
        listIncludePostDetailAndReply.setLayout(listIncludePostDetailAndReplyLayout);
        listIncludePostDetailAndReplyLayout.setHorizontalGroup(
            listIncludePostDetailAndReplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
        );
        listIncludePostDetailAndReplyLayout.setVerticalGroup(
            listIncludePostDetailAndReplyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        scrollPaneWin111.setViewportView(listIncludePostDetailAndReply);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tailerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(tailerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public int getPostID(){
        return this.postID;
    }
    public void setPostID(int mabaidang){
        this.postID = mabaidang;
    }
    public  void setCurrentPage(int newPage){
        this.currentPage = newPage;
    }
    public  void setTotalPages(int number){
        this.totalPages = number;
    }
    public void setListPost(ArrayList<PostDetailView> postList){
        this.listPost = postList;
    }
    public void updateTotalPages(){
        int totalPages = (int) Math.ceil((double) listPost.size() / 20);
        this.setTotalPages(totalPages);
    }
    public int getCurrentPage(){
        return this.currentPage;
    }
    public int getTotalPages(){
        return this.totalPages;
    }
    public ArrayList<PostDetailView> getListPost(){
        return this.listPost;
    }
    //hàm switchPage để sử dụng cho các nút hiển thị số trang sắp được thiết kế ở tailerPanel của PostDetailAndReplyPanelView.java để người dùng di chuyển đến 1 trang bất kỳ 
    public void switchPage(int page){
    /*ví dụ: khi người dùng muốn di chuyển đến trang 1 thì dùng hàm switchPage này để thay đổi currentPage, do ta lưu currentPage bắt đầu từ 0
    nên tham số page truyền vào phải trừ đi 1 thì mới đúng bằng giá trị currentPage ta lưu cho trang đó*/
        int mapping = page-1;
        if(mapping != this.currentPage && mapping >= 0 && mapping < this.totalPages){
            this.setCurrentPage(mapping);
            this.jTextFieldOfPageNumberCurrent.setText(String.valueOf(this.getCurrentPage()+1));
            setlistIncludePostDetailAndReplyWhenSwitchPage();
        }
    }
    
    public void setCurrentPageToNext(){
        if(this.currentPage < getTotalPages()-1){
            this.setCurrentPage(this.getCurrentPage()+1);
            this.jTextFieldOfPageNumberCurrent.setText(String.valueOf(this.getCurrentPage()+1));
            setlistIncludePostDetailAndReplyWhenSwitchPage();
        }
    }
    public void setCurrentPageToBack(){
        if(this.currentPage > 0){
            this.setCurrentPage(this.getCurrentPage()-1);
            this.jTextFieldOfPageNumberCurrent.setText(String.valueOf(this.getCurrentPage()+1));
            setlistIncludePostDetailAndReplyWhenSwitchPage();
        }
    }
    public void setlistIncludePostDetailAndReplyWhenSwitchPage(){
        int startIndex = currentPage * 20;
        int endIndex = Math.min((currentPage + 1) * 20, listPost.size());
        this.listIncludePostDetailAndReply.removeAll();
        for (int i = startIndex; i < endIndex; i++) {
            this.listIncludePostDetailAndReply.add(listPost.get(i)); 
        }
        revalidate();
        repaint();
    }  
    public javax.swing.JPanel getlistIncludePostDetailAndReply(){
        return this.listIncludePostDetailAndReply;
    }
    public void initListIncludePostDetailAndReply(){
         // Hiển thị chi tiết bài đăng và các bình luận phản hồi của bài đăng
        int startIndex = currentPage * 20;
        int endIndex = Math.min((currentPage + 1) * 20, listPost.size());
        this.removeAll(); 
        for (int i = startIndex; i < endIndex; i++) {
            listIncludePostDetailAndReply.add(listPost.get(i)); 
        }
         // Cập nhật giao diện
        revalidate();
        repaint();
    }    
    public void updateJTextFieldOfPageNumberCurrent(){
        jTextFieldOfPageNumberCurrent.setText(String.valueOf(getCurrentPage()+1));
        jTextFieldOfPageNumberCurrent.setEditable(false);
        jTextFieldOfPageNumberCurrent.setCaret(new javax.swing.text.DefaultCaret(){
            @Override
            protected synchronized void damage(java.awt.Rectangle r) {
                // không làm gì cả
            }
            @Override
            public void paint(java.awt.Graphics g) {
                // không vẽ caret
            }
        });        
    }

    private void _initComponents(int mabaidang) {
        this.postID = mabaidang;        
        this.listPost = new ArrayList<PostDetailView>();
        this.listPost.add(new PostDetailView(mabaidang)); //khi người dùng nhấn vào tiêu đề của bài đăng nào đó của giao diện chính forum thì thao tác này sẽ load chi tiết bài đăng đó và hiển thị
        this.listPost.addAll(BaiDangForumDAO.getCommentsFromDatabaseBaseOnPostID(mabaidang)); 
        updateTotalPages();
        this.currentPage = 0;        
        /*đây là thêm các bình luận phản hồi của bài đăng (nếu có) hiện tại ở csdl, bài đăng gốc cùng với các bình luận của nó đều được hiển thị trong PostDetailAndReplyPanelView này
           bài đăng gốc cùng các phản hồi của nó đều có kiểu dữ liệu là PostDetailView (là panel), các panel này được đặt trong thanh cuộn dọc ScrollPaneWin11 và mỗi trang hiển thị tối đa 20 item (tạm gọi panel bài đăng gốc và các panel phản hồi là các item)      
        */
        tailerPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        statisticButton = new javax.swing.JButton();
        replyButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        hienthisotrangPanel = new javax.swing.JPanel();
        pageLabel = new javax.swing.JLabel();
        jTextFieldOfPageNumberCurrent = new javax.swing.JTextField();
        ofLabel = new javax.swing.JLabel();
        totalPageNumberLabel = new javax.swing.JLabel();
        scrollPaneWin111 = new com.raven.scroll.ScrollPaneWin11();
        listIncludePostDetailAndReply = new javax.swing.JPanel();

        setBackground(new java.awt.Color(245, 238, 238));

        tailerPanel.setBackground(new java.awt.Color(192, 192, 203));
        tailerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e){
                updateJTextFieldOfPageNumberCurrent();
            }
        });

        exitButton.setBackground(new java.awt.Color(172, 172, 172));
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exitButton.setForeground(new java.awt.Color(0, 0, 0));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-exit-25.png"))); // NOI18N
        exitButton.setText("Exit");
        exitButton.setFocusable(false);
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        exitButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        exitButton.setIconTextGap(2);
        exitButton.setOpaque(true);
        exitButton.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            System.out.println("Exit button in PostDetailAndReplyPanelView.java is clicked!");
            com.uiteco.contentPanels.ForumPanel panel1 = (com.uiteco.contentPanels.ForumPanel)getParent(); 
            panel1.removeAll();
            panel1._initComponents();
            panel1.getPostListPanel2().loadPostForumFromDatabaseIntoListPost();
            panel1.updateCurentPageAndTotalPageToShowOnJTextFieldOfTailerPanel();
        }
    });        

        statisticButton.setBackground(new java.awt.Color(172, 172, 172));
        statisticButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        statisticButton.setForeground(new java.awt.Color(0, 0, 0));
        statisticButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-statistic-25 (1).png"))); // NOI18N
        statisticButton.setText("Statistic");
        statisticButton.setFocusable(false);
        statisticButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statisticButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        statisticButton.setIconTextGap(2);
        statisticButton.setOpaque(true);
        statisticButton.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        statisticButton.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            System.out.println("Statistic button in PostDetailAndReplyPanelView.java is clicked!");
            /*hiển thị giao diện thống kê của bài đăng*/
            com.forum.features.StatisticFeatureFrame frame = new com.forum.features.StatisticFeatureFrame(getPostID());
            frame.setVisible(true);
        }
    });        

        replyButton.setBackground(new java.awt.Color(172, 172, 172));
        replyButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        replyButton.setForeground(new java.awt.Color(0, 0, 0));
        replyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-reply-25.png"))); // NOI18N
        replyButton.setText("Reply");
        replyButton.setFocusable(false);
        replyButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        replyButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        replyButton.setIconTextGap(2);
        replyButton.setOpaque(true);
        replyButton.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        replyButton.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            System.out.println("Reply button in PostDetailAndReplyPanelView.java is clicked!");
            com.uiteco.contentPanels.ForumPanel panel1 = (com.uiteco.contentPanels.ForumPanel)getParent(); 
            panel1.showReplyFeaturePanel(getPostID());
        }
    });        

        backButton.setBackground(new java.awt.Color(172, 172, 172));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left-26.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        backButton.setIconTextGap(2);
        backButton.setMaximumSize(new java.awt.Dimension(86, 33));
        backButton.setMinimumSize(new java.awt.Dimension(86, 33));
        backButton.setOpaque(true);
        backButton.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setPreferredSize(new java.awt.Dimension(86, 33));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
           System.out.println("Back button in PostDetailAndReplyPanelView.java is clicked!");
           setCurrentPageToBack();
        }
    });           

        nextButton.setBackground(new java.awt.Color(172, 172, 172));
        nextButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nextButton.setForeground(new java.awt.Color(0, 0, 0));
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-right-26.png"))); // NOI18N
        nextButton.setText("Next");
        nextButton.setFocusable(false);
        nextButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nextButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        nextButton.setIconTextGap(2);
        nextButton.setOpaque(true);
        nextButton.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
           System.out.println("Next button in PostDetailAndReplyPanelView.java is clicked!");
           setCurrentPageToNext();
        }
    });         

        hienthisotrangPanel.setBackground(new java.awt.Color(192, 192, 203));
        hienthisotrangPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e){
                updateJTextFieldOfPageNumberCurrent();
            }
        });

        pageLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pageLabel.setForeground(new java.awt.Color(0, 0, 0));
        pageLabel.setText("Page");
        pageLabel.setPreferredSize(new java.awt.Dimension(28, 16));

        jTextFieldOfPageNumberCurrent.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldOfPageNumberCurrent.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldOfPageNumberCurrent.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldOfPageNumberCurrent.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(204, 204, 204)));
        updateJTextFieldOfPageNumberCurrent();
        jTextFieldOfPageNumberCurrent.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e){
                jTextFieldOfPageNumberCurrent.setEditable(true);
                javax.swing.text.DefaultCaret defaultCaret = new javax.swing.text.DefaultCaret();
                defaultCaret.setBlinkRate(500); // Thiết lập tần số nhấp nháy
                jTextFieldOfPageNumberCurrent.setCaret(defaultCaret);
                jTextFieldOfPageNumberCurrent.setCaretPosition(jTextFieldOfPageNumberCurrent.getText().length()); //đặt con trỏ ở cuối văn bản
                jTextFieldOfPageNumberCurrent.getCaret().setVisible(true); // hiển thị con trỏ
            }
        });
        jTextFieldOfPageNumberCurrent.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e){
                if(e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
                    String text = jTextFieldOfPageNumberCurrent.getText();
                    try{
                        int pageNumber = Integer.parseInt(text);
                        if(pageNumber >= 1 && pageNumber <= getTotalPages()){ //số trang nhập vào hợp lệ
                            if(pageNumber == (getCurrentPage()+1)){ //số trang nhập vào đúng bằng số trang hiện tại đang đứng
                                updateJTextFieldOfPageNumberCurrent();                                   
                            }
                            else{ //thực hiện chuyển trang theo số trang người dùng nhập vào
                                switchPage(pageNumber);
                                jTextFieldOfPageNumberCurrent.setEditable(false);
                                jTextFieldOfPageNumberCurrent.setCaret(new javax.swing.text.DefaultCaret(){
                                    @Override
                                    protected synchronized void damage(java.awt.Rectangle r) {
                                        // không làm gì cả
                                    }
                                    @Override
                                    public void paint(java.awt.Graphics g) {
                                        // không vẽ caret
                                    }
                                });                                        
                            }
                        }
                        else{ //ví dụ nhập số âm, số 0, số vượt quá tổng số trang
                            updateJTextFieldOfPageNumberCurrent();                              
                        }
                    }
                    catch(NumberFormatException ex){ //người dùng nhập vào không phải chuỗi số nguyên, ví dụ nhập "a#123", "12.34", ...
                        updateJTextFieldOfPageNumberCurrent();                        
                    }
                }
            }
        });        

        ofLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ofLabel.setForeground(new java.awt.Color(0, 0, 0));
        ofLabel.setText("of");
        ofLabel.setPreferredSize(new java.awt.Dimension(15, 16));

        totalPageNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totalPageNumberLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalPageNumberLabel.setText(String.valueOf(this.totalPages));

        javax.swing.GroupLayout hienthisotrangPanelLayout = new javax.swing.GroupLayout(hienthisotrangPanel);
        hienthisotrangPanel.setLayout(hienthisotrangPanelLayout);
        hienthisotrangPanelLayout.setHorizontalGroup(
            hienthisotrangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hienthisotrangPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTextFieldOfPageNumberCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(ofLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(totalPageNumberLabel)
                .addContainerGap())
        );
        hienthisotrangPanelLayout.setVerticalGroup(
            hienthisotrangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hienthisotrangPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
            .addGroup(hienthisotrangPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTextFieldOfPageNumberCurrent)
                .addGap(6, 6, 6))
            .addGroup(hienthisotrangPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(hienthisotrangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPageNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ofLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout tailerPanelLayout = new javax.swing.GroupLayout(tailerPanel);
        tailerPanel.setLayout(tailerPanelLayout);
        tailerPanelLayout.setHorizontalGroup(
            tailerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tailerPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(replyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statisticButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(hienthisotrangPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        tailerPanelLayout.setVerticalGroup(
            tailerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tailerPanelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(tailerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tailerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(tailerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tailerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tailerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(statisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(replyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(hienthisotrangPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        scrollPaneWin111.setBackground(new java.awt.Color(255, 255, 255));
        scrollPaneWin111.setBorder(null);
        scrollPaneWin111.setForeground(new java.awt.Color(255, 255, 255));
        scrollPaneWin111.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneWin111.setViewportView(listIncludePostDetailAndReply);
        
        java.awt.Insets insets = new java.awt.Insets(0, 0, 0, 13); // top, left, bottom, right
        listIncludePostDetailAndReply.setBorder(javax.swing.BorderFactory.createEmptyBorder(insets.top, insets.left, insets.bottom, insets.right));
        listIncludePostDetailAndReply.setBackground(new java.awt.Color(242,247,232));
        listIncludePostDetailAndReply.setLayout(new java.awt.GridLayout(0,1,0,13));
        initListIncludePostDetailAndReply();       
        listIncludePostDetailAndReply.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e){
                updateJTextFieldOfPageNumberCurrent();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tailerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(tailerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );     
    }                        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel hienthisotrangPanel;
    private javax.swing.JTextField jTextFieldOfPageNumberCurrent;
    private javax.swing.JPanel listIncludePostDetailAndReply;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel ofLabel;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JButton replyButton;
    private com.raven.scroll.ScrollPaneWin11 scrollPaneWin111;
    private javax.swing.JButton statisticButton;
    private javax.swing.JPanel tailerPanel;
    private javax.swing.JLabel totalPageNumberLabel;
    // End of variables declaration//GEN-END:variables
}