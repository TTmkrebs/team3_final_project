package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class instructions extends JPanel
{
    JButton back;
    
    public instructions()
    {
        super();
        setBackground(Color.lightGray);
        setLayout(null);
        
        back = new JButton("Main Menu");
        add(back);
        back.setBounds(new Rectangle(325,700,150,25));
    }
}
