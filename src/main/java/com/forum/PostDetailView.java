/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.forum;
import com.forum.database.BaiDangForumDAO;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
/**
 *
 * @author 21H1 HNQA
 */
public class PostDetailView extends javax.swing.JPanel {
    private String title;
    private LocalDateTime postingTimeStamp;
    private String content;
    private String postingPerson;
    private int postID;
    private int replyForMABLPHANHOI; //bình luận này đang bình luận cho mã bình luận nào MABLPHANHOI
    private int replyID; //mã bình luận MABL

    public int getReplyForPostID() {
        return replyForMABLPHANHOI;
    }

    public int getReplyID() {
        return replyID;
    }

    public void setReplyID(int replyID) {
        this.replyID = replyID;
    }

    public void setReplyForPostID(int replyForMABLPHANHOI) {
        this.replyForMABLPHANHOI = replyForMABLPHANHOI;
    }
    
    
    public int getpostID() {
        return postID;
    }

    public void setpostID(int postID) {
        this.postID = postID;
    }

    public String getPostingPerson() {
        return postingPerson;
    }

    public void setPostingPerson(String postingPerson) {
        this.postingPerson = postingPerson;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getPostingTimeStamp() {
        return postingTimeStamp;
    }

    public void setPostingTimeStamp(LocalDateTime postingTimeStamp) {
        this.postingTimeStamp = postingTimeStamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public PostDetailView(int mabaidang) {
        _initComponents(mabaidang); // constructor này để khởi tạo PostDetailView để hiển thị chi tiết bài đăng khi người dùng click chuột vào title của bài đăng nào đó được hiển thị ở giao diện chính của forum
    }
    public PostDetailView(int postID, int replyID, int replyForMABLPHANHOI, String replyPerson, LocalDateTime replyTime, String content){
        /*hàm này dùng để khởi tạo các bình luận của mã bài đăng được truyền vào và được load dữ liệu từ csdl, sau đó khởi tạo thành các PostDetailView*/
        initComponent(postID, replyID, replyForMABLPHANHOI, replyPerson, replyTime, content);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        userimageLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jScrollPaneOfContent = new javax.swing.JScrollPane();
        showContentArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        leftPanel.setBackground(new java.awt.Color(235, 235, 235));

        userimageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userimageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-user-80.png"))); // NOI18N

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("Công Phan");
        usernameLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userimageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(userimageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(402, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(204, 255, 204));

        titlePanel.setBackground(new java.awt.Color(242, 247, 232));
        titlePanel.setPreferredSize(null);

        titleLabel.setBackground(new java.awt.Color(242, 247, 232));
        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLabel.setText("title và thời điểm đăng");
        titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        titleLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jScrollPaneOfContent.setBackground(new java.awt.Color(242, 247, 232));
        jScrollPaneOfContent.setBorder(null);
        jScrollPaneOfContent.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        showContentArea.setEditable(false);
        showContentArea.setBackground(new java.awt.Color(242, 247, 232));
        showContentArea.setColumns(20);
        showContentArea.setLineWrap(true);
        showContentArea.setRows(5);
        showContentArea.setWrapStyleWord(true);
        showContentArea.setBorder(null);
        jScrollPaneOfContent.setViewportView(showContentArea);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
            .addComponent(jScrollPaneOfContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPaneOfContent))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initComponent(int postID, int replyID, int replyForMABLPHANHOI, String replyPerson, LocalDateTime replyTimeStamp, String content){
            this.postID = postID;
            this.replyID = replyID;
            this.replyForMABLPHANHOI = replyForMABLPHANHOI;
            this.postingPerson = replyPerson;
            this.postingTimeStamp = replyTimeStamp;
            this.content = content;

            leftPanel = new javax.swing.JPanel();
            userimageLabel = new javax.swing.JLabel();
            usernameLabel = new javax.swing.JLabel();
            mainPanel = new javax.swing.JPanel();
            titlePanel = new javax.swing.JPanel();
            titleLabel = new javax.swing.JLabel();
            jScrollPaneOfContent = new javax.swing.JScrollPane();
            showContentArea = new javax.swing.JTextArea();

            setBackground(new java.awt.Color(255, 255, 255));
            setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

            leftPanel.setBackground(new java.awt.Color(235, 235, 235));
            leftPanel.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e){                   
//                    System.out.println("leftPanel: "+leftPanel.getParent().getClass()); //com.forum.PostDetailView
//                    System.out.println("leftPanel: "+leftPanel.getParent().getParent().getClass()); //javax.swing.JPanel
//                    System.out.println("leftPanel: "+leftPanel.getParent().getParent().getParent().getClass()); //javax.swing.JViewport
//                    System.out.println("leftPanel: "+leftPanel.getParent().getParent().getParent().getParent().getClass()); //com.raven.scroll.ScrollPaneWin11
//                    System.out.println("leftPanel: "+leftPanel.getParent().getParent().getParent().getParent().getParent().getClass()); //com.forum.PostDetailAndReplyPanelView
//                    System.out.println("leftPanel: "+leftPanel.getParent().getParent().getParent().getParent().getParent().getParent().getClass()); //com.uiteco.contentPanels.ForumPanel
                    com.forum.PostDetailView postDetailView = (com.forum.PostDetailView)leftPanel.getParent();
                    javax.swing.JPanel panel1 = (javax.swing.JPanel)postDetailView.getParent();
                    javax.swing.JViewport viewPort = (javax.swing.JViewport) panel1.getParent();
                    com.raven.scroll.ScrollPaneWin11 scrollPaneWin11 = (com.raven.scroll.ScrollPaneWin11) viewPort.getParent();
                    com.forum.PostDetailAndReplyPanelView postDetailAndReplyPanelView = (com.forum.PostDetailAndReplyPanelView)scrollPaneWin11.getParent();
                    postDetailAndReplyPanelView.updateJTextFieldOfPageNumberCurrent();
                }
            });

            userimageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            usernameLabel.setForeground(new java.awt.Color(0, 0, 0));
            usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            usernameLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            int loaitaikhoan = BaiDangForumDAO.getLoaiTaiKhoan(this.postingPerson);
            if(loaitaikhoan == 2){ //là tài khoản sinh viên
                userimageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-student-70.png"))); // NOI18N
                usernameLabel.setText("<html>"+this.postingPerson+"<br>[Student]"+"<br>Reply ID: "+this.replyID+"</html>");
            }
            else if(loaitaikhoan == 1){ //là tài khoản admin
                userimageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-admin-70.png"))); // NOI18N
                usernameLabel.setText("<html>"+this.postingPerson+"<br>[Admin]"+"<br>Reply ID: "+this.replyID+"</html>");                
            }
            else if(loaitaikhoan == 3){ //là tài khoản cựu sinh viên
                userimageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-alumni-70.png"))); // NOI18N
                usernameLabel.setText("<html>"+this.postingPerson+"<br>[Alumni]"+"<br>Reply ID: "+this.replyID+"</html>");
            }
            else if(loaitaikhoan == 4){ //là tài khoản giảng viên
                userimageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-teacher-70.png"))); // NOI18N
                usernameLabel.setText("<html>"+this.postingPerson+"<br>[Lecturer]"+"<br>Reply ID: "+this.replyID+"</html>");
            }        

            javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
            leftPanel.setLayout(leftPanelLayout);
            leftPanelLayout.setHorizontalGroup(
                leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userimageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            );
            leftPanelLayout.setVerticalGroup(
                leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(leftPanelLayout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(userimageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(402, Short.MAX_VALUE))
            );

            mainPanel.setBackground(new java.awt.Color(204, 255, 204));

            titlePanel.setBackground(new java.awt.Color(242, 247, 232));
            titlePanel.setPreferredSize(null);
            titlePanel.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e){                  
//                    System.out.println("titlePanel: "+titlePanel.getParent().getClass()); //javax.swing.JPanel
//                    System.out.println("titlePanel: "+titlePanel.getParent().getParent().getClass());//com.forum.PostDetailView
//                    System.out.println("titlePanel: "+titlePanel.getParent().getParent().getParent().getClass());//javax.swing.JPanel
//                    System.out.println("titlePanel: "+titlePanel.getParent().getParent().getParent().getParent().getClass());//javax.swing.JViewport
//                    System.out.println("titlePanel: "+titlePanel.getParent().getParent().getParent().getParent().getParent().getClass());//com.raven.scroll.ScrollPaneWin11
//                    System.out.println("titlePanel: "+titlePanel.getParent().getParent().getParent().getParent().getParent().getParent().getClass());//com.forum.PostDetailAndReplyPanelView
//                    System.out.println("titlePanel: "+titlePanel.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getClass());//com.uiteco.contentPanels.ForumPanel
//                    System.out.println("titlePanel: "+titlePanel.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getClass());//javax.swing.JPanel
                    javax.swing.JPanel panel1 = (javax.swing.JPanel)titlePanel.getParent();
                    com.forum.PostDetailView postDetailView = (com.forum.PostDetailView)panel1.getParent();
                    javax.swing.JPanel panel2 = (javax.swing.JPanel)postDetailView.getParent();
                    javax.swing.JViewport viewPort = (javax.swing.JViewport)panel2.getParent();
                    com.raven.scroll.ScrollPaneWin11 scrollPaneWin11 = (com.raven.scroll.ScrollPaneWin11)viewPort.getParent();
                    com.forum.PostDetailAndReplyPanelView postDetailAndReplyPanelView = (com.forum.PostDetailAndReplyPanelView)scrollPaneWin11.getParent();
                    postDetailAndReplyPanelView.updateJTextFieldOfPageNumberCurrent();
                }
            });

            titleLabel.setBackground(new java.awt.Color(242, 247, 232));
            titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            titleLabel.setForeground(new java.awt.Color(0, 0, 0));
            titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            if(this.replyForMABLPHANHOI == 0){
                titleLabel.setText("<html>"+this.postingTimeStamp.format(formatter)+"<br><i>&lt;Phản hồi cho mã bình luận: None&gt;</i></html>"); //&lt &gt lần lượt đại diện cho kí tự < và >
            }
            else{
                titleLabel.setText("<html>"+this.postingTimeStamp.format(formatter)+"<br><i>&lt;Phản hồi cho mã bình luận: "+this.replyForMABLPHANHOI+"&gt;</i></html>"); //&lt &gt lần lượt đại diện cho kí tự < và >
            }   
            titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
            titleLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

            javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
            titlePanel.setLayout(titlePanelLayout);
            titlePanelLayout.setHorizontalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            titlePanelLayout.setVerticalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
            );

            jScrollPaneOfContent.setBackground(new java.awt.Color(242, 247, 232));
            jScrollPaneOfContent.setBorder(null);
            jScrollPaneOfContent.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            showContentArea.setEditable(false);
            showContentArea.setBackground(new java.awt.Color(242, 247, 232));
            showContentArea.setColumns(20);
            showContentArea.setLineWrap(true);
            showContentArea.setRows(5);
            showContentArea.setWrapStyleWord(true);
            showContentArea.setBorder(null);
            showContentArea.setText(this.content);
            jScrollPaneOfContent.setViewportView(showContentArea);
            showContentArea.setCaret(new javax.swing.text.DefaultCaret(){
                @Override
                protected synchronized void damage(java.awt.Rectangle r) {
                    // không làm gì cả
                }
                @Override
                public void paint(java.awt.Graphics g) {
                    // không vẽ caret
                }
            });
            showContentArea.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e){              
//                System.out.println("showContentArea: "+showContentArea.getParent().getClass());//javax.swing.JViewport
//                System.out.println("showContentArea: "+showContentArea.getParent().getParent().getClass());//javax.swing.JScrollPane
//                System.out.println("showContentArea: "+showContentArea.getParent().getParent().getParent().getClass());//javax.swing.JPanel
//                System.out.println("showContentArea: "+showContentArea.getParent().getParent().getParent().getParent().getClass());//com.forum.PostDetailView
//                System.out.println("showContentArea: "+showContentArea.getParent().getParent().getParent().getParent().getParent().getClass());//javax.swing.JPanel
//                System.out.println("showContentArea: "+showContentArea.getParent().getParent().getParent().getParent().getParent().getParent().getClass());//javax.swing.JViewport
//                System.out.println("showContentArea: "+showContentArea.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getClass());//com.raven.scroll.ScrollPaneWin11
//                System.out.println("showContentArea: "+showContentArea.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getClass());//com.forum.PostDetailAndReplyPanelView
//                System.out.println("showContentArea: "+showContentArea.getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getParent().getClass());//com.uiteco.contentPanels.ForumPanel
                    javax.swing.JViewport viewport = (javax.swing.JViewport)showContentArea.getParent();
                    javax.swing.JScrollPane scrollpane = (javax.swing.JScrollPane)viewport.getParent();
                    javax.swing.JPanel panel1 = (javax.swing.JPanel)scrollpane.getParent();
                    com.forum.PostDetailView postDetailView = (com.forum.PostDetailView)panel1.getParent();
                    javax.swing.JPanel panel2 = (javax.swing.JPanel)postDetailView.getParent();
                    javax.swing.JViewport viewPort = (javax.swing.JViewport)panel2.getParent();
                    com.raven.scroll.ScrollPaneWin11 scrollPaneWin11 = (com.raven.scroll.ScrollPaneWin11)viewPort.getParent();
                    com.forum.PostDetailAndReplyPanelView postDetailAndReplyPanelView = (com.forum.PostDetailAndReplyPanelView)scrollPaneWin11.getParent();
                    postDetailAndReplyPanelView.updateJTextFieldOfPageNumberCurrent();
                }
            });

            javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
            mainPanel.setLayout(mainPanelLayout);
            mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(titlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addComponent(jScrollPaneOfContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
            );
            mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jScrollPaneOfContent))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );                          
        }
    private void _initComponents(int mabaidang) {
            this.postID = mabaidang;
            ArrayList <Object> list = BaiDangForumDAO.getDataIntoPostDetailView(mabaidang);
            this.postingPerson = (String)list.get(0);
            this.postingTimeStamp = (LocalDateTime)list.get(1);
            this.title = (String)list.get(2);
            this.content = (String)list.get(3);

            leftPanel = new javax.swing.JPanel();
            userimageLabel = new javax.swing.JLabel();
            usernameLabel = new javax.swing.JLabel();
            mainPanel = new javax.swing.JPanel();
            titlePanel = new javax.swing.JPanel();
            titleLabel = new javax.swing.JLabel();
            jScrollPaneOfContent = new javax.swing.JScrollPane();
            showContentArea = new javax.swing.JTextArea();

            setBackground(new java.awt.Color(255, 255, 255));
            setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

            leftPanel.setBackground(new java.awt.Color(235, 235, 235));
            leftPanel.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e){
                    com.forum.PostDetailView postDetailView = (com.forum.PostDetailView)leftPanel.getParent();
                    javax.swing.JPanel panel1 = (javax.swing.JPanel)postDetailView.getParent();
                    javax.swing.JViewport viewPort = (javax.swing.JViewport) panel1.getParent();
                    com.raven.scroll.ScrollPaneWin11 scrollPaneWin11 = (com.raven.scroll.ScrollPaneWin11) viewPort.getParent();
                    com.forum.PostDetailAndReplyPanelView postDetailAndReplyPanelView = (com.forum.PostDetailAndReplyPanelView)scrollPaneWin11.getParent();
                    postDetailAndReplyPanelView.updateJTextFieldOfPageNumberCurrent();
                }
            });            

            userimageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            usernameLabel.setForeground(new java.awt.Color(0, 0, 0));
            usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            usernameLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            int loaitaikhoan = BaiDangForumDAO.getLoaiTaiKhoan(this.postingPerson);
            if(loaitaikhoan == 2){ //là tài khoản sinh viên
                userimageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-student-70.png"))); // NOI18N
                usernameLabel.setText("<html>"+this.postingPerson+"<br>[Student]"+"<br>Reply ID: None</html>");
            }
            else if(loaitaikhoan == 1){ //là tài khoản admin
                userimageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-admin-70.png"))); // NOI18N
                usernameLabel.setText("<html>"+this.postingPerson+"<br>[Admin]"+"<br>Reply ID: None</html>");                
            }
            else if(loaitaikhoan == 3){ //là tài khoản cựu sinh viên
                userimageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-alumni-70.png"))); // NOI18N
                usernameLabel.setText("<html>"+this.postingPerson+"<br>[Alumni]"+"<br>Reply ID: None</html>");
            }
            else if(loaitaikhoan == 4){ //là tài khoản giảng viên
                userimageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-teacher-70.png"))); // NOI18N
                usernameLabel.setText("<html>"+this.postingPerson+"<br>[Lecturer]"+"<br>Reply ID: None</html>");
            }         

            javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
            leftPanel.setLayout(leftPanelLayout);
            leftPanelLayout.setHorizontalGroup(
                leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userimageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            );
            leftPanelLayout.setVerticalGroup(
                leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(leftPanelLayout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(userimageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(402, Short.MAX_VALUE))
            );

            mainPanel.setBackground(new java.awt.Color(204, 255, 204));        

            titlePanel.setBackground(new java.awt.Color(242, 247, 232));
            titlePanel.setPreferredSize(null);
            titlePanel.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e){
                    javax.swing.JPanel panel1 = (javax.swing.JPanel)titlePanel.getParent();
                    com.forum.PostDetailView postDetailView = (com.forum.PostDetailView)panel1.getParent();
                    javax.swing.JPanel panel2 = (javax.swing.JPanel)postDetailView.getParent();
                    javax.swing.JViewport viewPort = (javax.swing.JViewport)panel2.getParent();
                    com.raven.scroll.ScrollPaneWin11 scrollPaneWin11 = (com.raven.scroll.ScrollPaneWin11)viewPort.getParent();
                    com.forum.PostDetailAndReplyPanelView postDetailAndReplyPanelView = (com.forum.PostDetailAndReplyPanelView)scrollPaneWin11.getParent();
                    postDetailAndReplyPanelView.updateJTextFieldOfPageNumberCurrent();
                }
            });            

            titleLabel.setBackground(new java.awt.Color(242, 247, 232));
            titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            titleLabel.setForeground(new java.awt.Color(0, 0, 0));
            titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            titleLabel.setText("<html><b>"+this.title+"</b><br><i>"+this.postingTimeStamp.format(formatter)+"</i></html>");  
            titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
            titleLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

            javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
            titlePanel.setLayout(titlePanelLayout);
            titlePanelLayout.setHorizontalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            titlePanelLayout.setVerticalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
            );

            jScrollPaneOfContent.setBackground(new java.awt.Color(242, 247, 232));
            jScrollPaneOfContent.setBorder(null);
            jScrollPaneOfContent.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            showContentArea.setEditable(false);
            showContentArea.setBackground(new java.awt.Color(242, 247, 232));
            showContentArea.setColumns(20);
            showContentArea.setLineWrap(true);
            showContentArea.setRows(5);
            showContentArea.setWrapStyleWord(true);
            showContentArea.setBorder(null);
            showContentArea.setText(this.content);
            jScrollPaneOfContent.setViewportView(showContentArea);
            showContentArea.setCaret(new javax.swing.text.DefaultCaret(){
                @Override
                protected synchronized void damage(java.awt.Rectangle r) {
                    // không làm gì cả
                }
                @Override
                public void paint(java.awt.Graphics g) {
                    // không vẽ caret
                }
            });  
            showContentArea.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e){
                    javax.swing.JViewport viewport = (javax.swing.JViewport)showContentArea.getParent();
                    javax.swing.JScrollPane scrollpane = (javax.swing.JScrollPane)viewport.getParent();
                    javax.swing.JPanel panel1 = (javax.swing.JPanel)scrollpane.getParent();
                    com.forum.PostDetailView postDetailView = (com.forum.PostDetailView)panel1.getParent();
                    javax.swing.JPanel panel2 = (javax.swing.JPanel)postDetailView.getParent();
                    javax.swing.JViewport viewPort = (javax.swing.JViewport)panel2.getParent();
                    com.raven.scroll.ScrollPaneWin11 scrollPaneWin11 = (com.raven.scroll.ScrollPaneWin11)viewPort.getParent();
                    com.forum.PostDetailAndReplyPanelView postDetailAndReplyPanelView = (com.forum.PostDetailAndReplyPanelView)scrollPaneWin11.getParent();
                    postDetailAndReplyPanelView.updateJTextFieldOfPageNumberCurrent();
                }
            });            

            javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
            mainPanel.setLayout(mainPanelLayout);
            mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(titlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addComponent(jScrollPaneOfContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
            );
            mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jScrollPaneOfContent))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );               
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPaneOfContent;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextArea showContentArea;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel userimageLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}