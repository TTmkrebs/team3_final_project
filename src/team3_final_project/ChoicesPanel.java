package team3_final_project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ChoicesPanel extends JPanel implements ActionListener
{
    /* declare bBackMainMenu button to display MainPanel */
    JButton bBackMainMenu;
    /* declare bPlayGame button */
    JButton bPlayGame;
    /* declare char1 button */
    JButton char1;
    /* declare char2 button */
    JButton char2;
    /* declare char3 button */
    JButton char3;
    /* declare charText display */
    JTextField charText;
    /* declare variable to hold character selection value */
    String character;
    
    /* declare theme1 button */
    JButton theme1;
    /* declare theme2 button */
    JButton theme2;
    /* declare theme3 button */
    JButton theme3;
    /* declare themeText display */
    JTextField themeText;
    /* declare variable to hold theme selection value */
    String theme;    
    
    public ChoicesPanel()
    {
        /* setup ChoicesPanel */
        super();
        setBackground(Color.cyan);
        setLayout(null);
        
        /* create and add bPlayGame button */
        bPlayGame = new JButton("Play Game");
        add(bPlayGame);
        bPlayGame.setBounds(new Rectangle(575,625,200,25));
        bPlayGame.setEnabled(false);
        
        /* create and add bBackMainMenu button */
        bBackMainMenu = new JButton("Main Menu");
        add(bBackMainMenu);
        bBackMainMenu.setBounds(new Rectangle(50,625,200,25));
        
        /* add label for characters */
        JLabel charLabel = new JLabel("Select Character:");
        add(charLabel);
        charLabel.setBounds(new Rectangle(350,50,200,25));
        
        /* create characters */
        ImageIcon footballPlayer = new ImageIcon("images/characters/footballplayer.png");
        char1 = new JButton(footballPlayer);
        char1.addActionListener(this);
        add(char1);
        char1.setBounds(new Rectangle(125,100,150,150));
        
        ImageIcon student = new ImageIcon("images/characters/student.png");
        char2 = new JButton(student);
        char2.addActionListener(this);
        add(char2);
        char2.setBounds(new Rectangle(325,100,150,150));
        
        ImageIcon psuMascot = new ImageIcon("images/characters/mascot.jpg");
        char3 = new JButton(psuMascot);
        char3.addActionListener(this);
        add(char3);
        char3.setBounds(new Rectangle(525,100,150,150));
        
        /* create character selection display */
        JLabel charTextLabel = new JLabel("Chosen Character:");
        add(charTextLabel);
        charTextLabel.setBounds(new Rectangle(350,275,150,25));
        charText = new JTextField(20);
        charText.setEditable(false);
        add(charText);
        charText.setBounds(new Rectangle(325,300,150,25));
        
        /* add label for themes */
        JLabel themeLabel = new JLabel("Select Theme:");
        add(themeLabel);
        themeLabel.setBounds(new Rectangle(360,350,200,25));
        
        /* create themes */
        ImageIcon academics = new ImageIcon("images/themes/psuacademics.png");
        theme1 = new JButton(academics);
        theme1.addActionListener(this);
        add(theme1);
        theme1.setBounds(new Rectangle(125, 400, 150, 150));
        
        ImageIcon sports = new ImageIcon("images/themes/psusports.png");
        theme2 = new JButton(sports);
        theme2.addActionListener(this);
        add(theme2);
        theme2.setBounds(new Rectangle(325, 400, 150, 150));
        
        ImageIcon history = new ImageIcon("images/themes/psuhistory.png");
        theme3 = new JButton(history);
        theme3.addActionListener(this);
        add(theme3);
        theme3.setBounds(new Rectangle(525, 400, 150, 150));
        
        /* create character selection display */
        JLabel themeTextLabel = new JLabel("Chosen Theme:");
        add(themeTextLabel);
        themeTextLabel.setBounds(new Rectangle(355, 555, 150, 25));
        themeText = new JTextField(20);
        themeText.setEditable(false);
        add(themeText);
        themeText.setBounds(new Rectangle(325, 580, 150, 25));
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if(obj == char1)
        {
            character = "Football Player";
            charText.setText(character);
        }
        if(obj == char2)
        {
            character = "Student";
            charText.setText(character);
        }
        if(obj == char3)
        {
            character = "Mascot";
            charText.setText(character);
        }
        
        if(obj == theme1)
        {
            theme = "PSU Academics";
            themeText.setText(theme);
        }
        if(obj == theme2)
        {
            theme = "PSU Sports";
            themeText.setText(theme);
        }
        if(obj == theme3)
        {
            theme = "PSU History";
            themeText.setText(theme);
        }
        
        if(character != null && theme != null)
        {
            bPlayGame.setEnabled(true);
        }
    }
}
