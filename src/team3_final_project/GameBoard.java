package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class GameBoard extends JPanel
{
    Image background;
    
    public GameBoard(Image image)
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