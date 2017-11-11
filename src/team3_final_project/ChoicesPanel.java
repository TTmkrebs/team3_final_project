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
        
//        JLabel line1 = new JLabel("Testing Choices Panel",SwingConstants.CENTER);
//        add(line1,BorderLayout.CENTER);
        
        bPlayGame = new JButton("Play Game");
        add(bPlayGame,BorderLayout.SOUTH);
        
        back = new JButton("Main Menu");
        add(back,BorderLayout.NORTH);
        
        
        JPanel character1 = new JPanel();
        character1.setLayout(new BorderLayout());
        character1.setBackground (Color.yellow);
        character1.setPreferredSize (new Dimension(250, 150));
        JButton button1 = new JButton ("Character 1");
        character1.add (button1,BorderLayout.CENTER);
        
        JPanel character2 = new JPanel();
        character2.setLayout(new BorderLayout());
        character2.setBackground (Color.green);
        character2.setPreferredSize (new Dimension(250, 150));
        JButton button2 = new JButton ("Character 2");
        character2.add (button2,BorderLayout.CENTER);
        
        JPanel character3 = new JPanel();
        character3.setLayout(new BorderLayout());
        character3.setBackground (Color.orange);
        character3.setPreferredSize (new Dimension(250, 150));
        JButton button3 = new JButton ("Character 3");
        character3.add (button3,BorderLayout.CENTER);
        
        JPanel characters = new JPanel();
        characters.setVisible(true);
//        add(characters,BorderLayout.CENTER);
        
        characters.add(character1);
        characters.add(character2);
        characters.add(character3);
        
        JPanel theme1 = new JPanel();
        theme1.setLayout(new BorderLayout());
        theme1.setBackground (Color.yellow);
        theme1.setPreferredSize (new Dimension(250, 150));
        JButton button4 = new JButton ("Theme 1");
        theme1.add (button4,BorderLayout.CENTER);
        
        JPanel theme2 = new JPanel();
        theme2.setLayout(new BorderLayout());
        theme2.setBackground (Color.green);
        theme2.setPreferredSize (new Dimension(250, 150));
        JButton button5 = new JButton ("Theme 2");
        theme2.add (button5,BorderLayout.CENTER);
        
        JPanel theme3 = new JPanel();
        theme3.setLayout(new BorderLayout());
        theme3.setBackground (Color.orange);
        theme3.setPreferredSize (new Dimension(250, 150));
        JButton button6 = new JButton ("Theme 3");
        theme3.add (button6,BorderLayout.CENTER);
        
        JPanel themes = new JPanel();
        themes.setVisible(true);
//        add(themes,BorderLayout.CENTER);
        
        themes.add(theme1);
        themes.add(theme2);
        themes.add(theme3);
        
        JPanel mainChoices = new JPanel();
        mainChoices.setLayout(new GridLayout());
        mainChoices.setVisible(true);
        mainChoices.add(characters);
        mainChoices.add(themes);
        add(mainChoices,BorderLayout.CENTER);
    }
}
