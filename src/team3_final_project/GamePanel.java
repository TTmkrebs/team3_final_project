package team3_final_project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GamePanel extends JPanel
{
    JButton back;    
    
    public GamePanel()
    {
        super();
        setBackground(Color.black);
        setLayout(new BorderLayout());
        
        ImageIcon campusMap = new ImageIcon("images/campus_map_2.png");
        JLabel map = new JLabel(campusMap);
        map.setBounds(0, 0, 740, 458);

        JPanel campuses = new JPanel();
        campuses.setLayout(new BorderLayout());
        campuses.setBackground(Color.black);
        campuses.setVisible(true);
        add(campuses,BorderLayout.CENTER);
        campuses.add(map);
        
        back = new JButton("Main Menu");
        add(back,BorderLayout.NORTH);
        
    }
}      