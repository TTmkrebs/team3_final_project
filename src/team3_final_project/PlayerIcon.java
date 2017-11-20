package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlayerIcon extends JPanel
{
    ImageIcon pawPrint;
    public PlayerIcon()
    {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(100,100));
        
        pawPrint = new ImageIcon("images/general/paw_print_black.png");
        JLabel pawIcon = new JLabel();
        pawIcon.setLayout(new BorderLayout());
        pawIcon.setIcon(pawPrint);
        add(pawIcon);
    }

}      