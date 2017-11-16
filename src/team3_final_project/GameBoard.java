package team3_final_project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GameBoard extends JPanel
{
    /* declare bBackMainMenu button to display MainPanel */
    JButton bBackMainMenu;    
    
    public GameBoard(String charName)
    {
        /* setup GameBoard */
        super();
        setBackground(Color.black);
        setLayout(new BorderLayout());
        
        /* setup campusMap image */
        ImageIcon campusMap = new ImageIcon("images/campus_map_2.png");
        JLabel map = new JLabel(campusMap);
        /* add campusMap image */
        add(map, BorderLayout.CENTER);

    }
}      