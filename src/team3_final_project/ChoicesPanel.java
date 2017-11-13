package team3_final_project;

import java.awt.*;
import javax.swing.*;

public class ChoicesPanel extends JPanel
{
    //back button
    JButton back;
    //play button
    JButton bPlayGame;
    
    public ChoicesPanel()
    {
        //setup choices panel
        super();
        setBackground(Color.cyan);
        setLayout(new BorderLayout());
        
//        JLabel line1 = new JLabel("Testing Choices Panel",SwingConstants.CENTER);
//        add(line1,BorderLayout.CENTER);
        
        //create and add play game button
        bPlayGame = new JButton("Play Game");
        add(bPlayGame,BorderLayout.SOUTH);
        
        //create and add back button
        back = new JButton("Main Menu");
        add(back,BorderLayout.NORTH);
        
        //create characters
        JPanel character1 = new JPanel();
        character1.setLayout(new BorderLayout());
        character1.setBackground (Color.yellow);
        character1.setPreferredSize (new Dimension(250, 150));
        ImageIcon footballPlayer = new ImageIcon("images/footballplayer.png");
        JButton button1 = new JButton (footballPlayer);
        character1.add (button1,BorderLayout.CENTER);
        
        JPanel character2 = new JPanel();
        character2.setLayout(new BorderLayout());
        character2.setBackground (Color.green);
        character2.setPreferredSize (new Dimension(250, 150));
        ImageIcon student = new ImageIcon("images/student.png");
        JButton button2 = new JButton (student);
        character2.add (button2,BorderLayout.CENTER);
        
        JPanel character3 = new JPanel();
        character3.setLayout(new BorderLayout());
        character3.setBackground (Color.orange);
        character3.setPreferredSize (new Dimension(250, 150));
        ImageIcon psuMascot = new ImageIcon("images/Penn State Mascot.jpg");
        JButton button3 = new JButton (psuMascot);
        character3.add (button3,BorderLayout.CENTER);
        
        //create and add characters panel
        JPanel characters = new JPanel();
        characters.setVisible(true);
//        add(characters,BorderLayout.CENTER);
        
        characters.add(character1);
        characters.add(character2);
        characters.add(character3);
        
        //setup themes
        JPanel theme1 = new JPanel();
        theme1.setLayout(new BorderLayout());
        theme1.setBackground (Color.yellow);
        theme1.setPreferredSize (new Dimension(250, 150));
        ImageIcon psuFootball = new ImageIcon("images/footballtheme.png");
        JButton button4 = new JButton (psuFootball);
        theme1.add (button4,BorderLayout.CENTER);
        
        JPanel theme2 = new JPanel();
        theme2.setLayout(new BorderLayout());
        theme2.setBackground (Color.green);
        theme2.setPreferredSize (new Dimension(250, 150));
        ImageIcon psuAcademics = new ImageIcon("images/academicstheme.png");
        JButton button5 = new JButton (psuAcademics);
        theme2.add (button5,BorderLayout.CENTER);
        
        JPanel theme3 = new JPanel();
        theme3.setLayout(new BorderLayout());
        theme3.setBackground (Color.orange);
        theme3.setPreferredSize (new Dimension(250, 150));
        ImageIcon psuFun = new ImageIcon("images/funtheme.png");
        JButton button6 = new JButton (psuFun);
        theme3.add (button6,BorderLayout.CENTER);
        
        //create and add themes panel
        JPanel themes = new JPanel();
        themes.setVisible(true);
//        add(themes,BorderLayout.CENTER);
        
        themes.add(theme1);
        themes.add(theme2);
        themes.add(theme3);
        
        //create and add main choices panel
        JPanel mainChoices = new JPanel();
        mainChoices.setLayout(new GridLayout());
        mainChoices.setVisible(true);
        mainChoices.add(characters);
        mainChoices.add(themes);
        add(mainChoices,BorderLayout.CENTER);
    }
}
