/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.uiteco.ofTaiKhoanRightPanel;

import com.uiteco.components.RoundedPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import com.uiteco.main.App;
import java.awt.Component;

/**
 *
 * @author nddmi
 */
public class MenuItem extends RoundedPanel {

    private JLabel label;
    private int index;
    private boolean isSubMenu;
    private boolean isSubMenuAble;
    private int length;
    private int subMenuIndex;
    private JLabel arrowIcon;

    private boolean selected;

    public void setLabelForeground(Color color) {
        label.setForeground(color);

    }

    /**
     * Creates new form MenuItem
     */
    public MenuItem(String text, Icon icon, int index, boolean isSubMenu, boolean isSubMenuAble) {
        this.label = new JLabel(text);
        label.setIcon(icon);
        label.setFont(new Font("Segoe UI", Font.BOLD, 14));

        setLayout(new GridLayout(1, 2, 30, 0));
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setIconTextGap(10);
        add(label);

        this.isSubMenu = isSubMenu;
        this.isSubMenuAble = isSubMenuAble;
        this.index = index;
        this.selected = false;
        setForeground(Color.BLACK);
        setBackground(Color.WHITE);

        if (!isSubMenu) {
            setBorder(new EmptyBorder(9, 25, 9, 10));
            label.setForeground(new Color(5, 5, 5));
            if (isSubMenuAble) {
                arrowIcon = new JLabel();
                arrowIcon.setText("");
                arrowIcon.setIcon(new ImageIcon(getClass().getResource("/icons8-down-arrow-23.png")));
                add(arrowIcon);
            }
        } else {
            setBorder(new EmptyBorder(9, 40, 9, 10));
            label.setForeground(new Color(51, 51, 51));
        }
    }

    public void initSubMenu(int subMenuIndex, int length) {
        this.subMenuIndex = subMenuIndex;
        this.length = length;
    }

    public boolean isSelected() {
        return selected;
    }

    public int getIndex() {
        return index;
    }

    public boolean isSubMenu() {
        return isSubMenu;
    }

    public boolean isSubMenuAble() {
        return this.isSubMenuAble;
    }

    public int getLength() {
        return length;
    }

    public int getSubMenuIndex() {
        return subMenuIndex;
    }

    public JLabel getArrowIcon() {
        return this.arrowIcon;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setIsSubMenu(boolean isSubMenu) {
        this.isSubMenu = isSubMenu;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public void setSubMenuIndex(int subMenuIndex) {
        this.subMenuIndex = subMenuIndex;
    }
}
