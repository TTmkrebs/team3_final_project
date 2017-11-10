package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class ChoicesPanel extends JPanel
{
    JButton back;
    JButton bPlayGame;
    
    public ChoicesPanel()
    {
        super();
        setBackground(Color.cyan);
        setLayout(new BorderLayout());
        
        JLabel line1 = new JLabel("Testing Choices Panel",SwingConstants.CENTER);
        add(line1,BorderLayout.CENTER);
        
        bPlayGame = new JButton("Play Game");
        add(bPlayGame,BorderLayout.AFTER_LAST_LINE);
        
        back = new JButton("Main Menu");
        add(back,BorderLayout.PAGE_END);
    }
}
