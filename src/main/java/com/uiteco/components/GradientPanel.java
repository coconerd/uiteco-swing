/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uiteco.components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class GradientPanel extends JPanel {
    private static final int N = 32;
    public boolean fade = true;
    public boolean full = true;
    public Color color1;
    public Color color2;

    public GradientPanel() {
        color1 = this.getBackground();
        initPanel();
    }
    
    public GradientPanel(boolean _fade, boolean _full, Color color1, Color color2) {
        this.fade = _fade;
        this.full = _full;
        this.color1 = color1;
        this.color2 = color2;
        initPanel();
    }

    public static int getN() {
        return N;
    }

    public boolean isFade() {
        return fade;
    }

    public boolean isFull() {
        return full;
    }

    public Color getColor1() {
        return color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setFade(boolean fade) {
        this.fade = fade;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    
    
    
    
    private void initPanel() {
        this.setBorder(BorderFactory.createEmptyBorder(N, N, N, N));
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        if (color2 == null) {
            setColor2(isFade() ? color1.brighter() : Color.WHITE);
        }
        int w = getWidth();
        int h = this.full ? getHeight() : getHeight() / 2;
        GradientPaint gp = new GradientPaint(
            0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
}
