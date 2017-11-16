package team3_final_project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ChoicesPanel extends JPanel implements ActionListener
{
    //back button
    JButton back;
    //play button
    JButton bPlayGame;
    //char1 button
    JButton char1;
    //char2 button
    JButton char2;
    //char3 button
    JButton char3;
    //character text display
    JTextField charText;
    //character selection
    String character;
    
    public ChoicesPanel()
    {
        //setup choices panel
        super();
        setBackground(Color.cyan);
        setLayout(null);
        
        //create and add play game button
        bPlayGame = new JButton("Play Game");
        add(bPlayGame);
        bPlayGame.setBounds(new Rectangle(50,625,200,25));
        bPlayGame.setEnabled(false);
        
        //create and add back button
        back = new JButton("Main Menu");
        add(back);
        back.setBounds(new Rectangle(575,625,200,25));
        
        //add label for characters
        JLabel charLabel = new JLabel("Select Character:");
        add(charLabel);
        charLabel.setBounds(new Rectangle(350,50,200,25));
        
        //create characters
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
        
        //Create character selection display
        JLabel charTextLabel = new JLabel("Chosen Character");
        add(charTextLabel);
        charTextLabel.setBounds(new Rectangle(350,275,150,25));
        charText = new JTextField(20);
        charText.setEditable(false);
        add(charText);
        charText.setBounds(new Rectangle(325,300,150,25));
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
        
        if(character != null)
        {
            bPlayGame.setEnabled(true);
        }
    }
}
