package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class PlayerIcon extends JPanel
{
    Image background;
    
    public PlayerIcon(Image image)
    {       
        background = image;
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(background,0,0,this);
    }
}      