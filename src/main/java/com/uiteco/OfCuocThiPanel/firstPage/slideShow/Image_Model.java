package com.uiteco.OfCuocThiPanel.firstPage.slideShow;

import com.uiteco.components.RoundedImagePanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Image_Model extends JPanel{

    public RoundedImagePanel getRoundedImagePanel() {
        return roundedImagePanel;
    }

    public void setRoundedImagePanel(RoundedImagePanel roundedImagePanel) {
        this.roundedImagePanel = roundedImagePanel;
    }
    public RoundedImagePanel convertImage(ImageIcon image) {
       
            RoundedImagePanel roundedPanel = new RoundedImagePanel();
            roundedPanel.setImage((Icon)image);
            
            // Create a new RoundedImagePanel for each image
                    
            roundedPanel.setRoundBottomLeft(25);
            roundedPanel.setRoundBottomRight(25);
            roundedPanel.setRoundTopLeft(25);
            roundedPanel.setRoundTopRight(25);
            roundedPanel.setOpaque(false);

        return roundedPanel;
    }

    //private Image image; //serializable
    private RoundedImagePanel roundedImagePanel;
       
}