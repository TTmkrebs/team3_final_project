package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlayerIcon extends JPanel
{
    public PlayerIcon()
    {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(100,100));
        
        JLabel icon = new JLabel();
        icon.setLayout(new BorderLayout());
        icon.setIcon(new ImageIcon("images/general/paw_print_black.png"));
        add(icon);
    }

}      