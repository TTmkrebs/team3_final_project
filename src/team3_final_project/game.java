package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class game extends JPanel
{
    JButton back;
    
    public game()
    {
        super();
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        
        JLabel line1 = new JLabel("Testing testing",SwingConstants.CENTER);
        add(line1,BorderLayout.CENTER);
        
        back = new JButton("Main Menu");
        add(back,BorderLayout.PAGE_END);
    }
}
