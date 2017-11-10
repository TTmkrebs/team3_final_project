package team3_final_project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GamePanel extends JPanel
{
    JButton back;
    ImageIcon campusMap;
    JLabel map;
    JLabel line1;
    
    public GamePanel()
    {
        super();
        setBackground(Color.black);
        setLayout(new BorderLayout());
        
        campusMap = new ImageIcon("images/campus_map_2.jpg");
        map = new JLabel();
        map.setIcon(campusMap);
 
        back = new JButton("Main Menu");
        add(back,BorderLayout.NORTH);
        
        line1 = new JLabel("Testing Game Panel",SwingConstants.CENTER);
        add(line1,BorderLayout.CENTER);
    }
}      