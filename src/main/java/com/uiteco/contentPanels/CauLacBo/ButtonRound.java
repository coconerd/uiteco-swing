package com.uiteco.contentPanels.CauLacBo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class ButtonRound extends JButton {

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
    
    public int getboderSize() {
        return boderSize;
    }

    public void setboderSize(int boderSize) {
        this.boderSize = boderSize;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public ButtonRound() {
        Start();
    }
    
    public ButtonRound(boolean Disable) {
        this.Disable = Disable;
        
        Start();
    }

    private void Start()
    {
        //  Init Color

        setColor(Color.WHITE);
        colorOver = new Color(179, 250, 160);
        colorClick = new Color(152, 184, 144);
        borderColor = new Color(30, 136, 56);
        
        DisableborderColor = new Color(150,150,150);
        
        setContentAreaFilled(false);
        
        if (!Disable)
        {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent me) {
                    setBackground(colorOver);
                    over = true;
                }

                @Override
                public void mouseExited(MouseEvent me) {
                    setBackground(color);
                    over = false;

                }

                @Override
                public void mousePressed(MouseEvent me) {
                    setBackground(colorClick);
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                    if (over) {
                        setBackground(colorOver);
                    } else {
                        setBackground(color);
                    }
                }
            });
        }
        else
        {
            setBackground(new Color(220,220,220));
        }
    }
    
    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private Color DisableborderColor;
    private int boderSize = 0;
    private int radius = 0;
    private boolean Disable = false;

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //  Paint Border
        
        if(!Disable)
            g2.setColor(borderColor);
        else
            g2.setColor(DisableborderColor);   
        
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius + boderSize * 2, radius + boderSize * 2);
        g2.setColor(getBackground());
        //  Border set 2 Pix
        
        
        g2.fillRoundRect(2 + boderSize, 2 + boderSize, getWidth() - 4 - boderSize * 2, getHeight() - 4 - boderSize * 2, radius, radius);
        super.paintComponent(grphcs);
    }
}