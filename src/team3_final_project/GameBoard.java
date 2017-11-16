package team3_final_project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GameBoard extends JPanel
{
    //back button
    JButton backMainMenu;    
    
    public GameBoard(String charName)
    {
        //setup new panel type
        super();
        setBackground(Color.black);
        setLayout(new BorderLayout());
        
        //setup map image
        ImageIcon campusMap = new ImageIcon("images/campus_map_2.png");
        JLabel map = new JLabel(campusMap);
        
        add(map, BorderLayout.CENTER);

        
        //COMMENT COMMENT
    }
}      