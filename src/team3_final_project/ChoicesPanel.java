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
    /* declare variable to character information */
    Player player1;
    
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
        ImageIcon psuAcademics = new ImageIcon("images/themes/psuacademics.png");
        theme1 = new JButton(psuAcademics);
        theme1.addActionListener(this);
        add(theme1);
        theme1.setBounds(new Rectangle(125, 400, 150, 150));
        theme1.setEnabled(false);
        
        ImageIcon psuHistory = new ImageIcon("images/themes/psuhistory.png");
        theme2 = new JButton(psuHistory);
        theme2.addActionListener(this);
        add(theme2);
        theme2.setBounds(new Rectangle(325, 400, 150, 150));
        theme2.setEnabled(false);
        
        ImageIcon psuSports = new ImageIcon("images/themes/psusports.png");
        theme3 = new JButton(psuSports);
        theme3.addActionListener(this);
        add(theme3);
        theme3.setBounds(new Rectangle(525, 400, 150, 150));
        theme3.setEnabled(false);
        
        /* create character selection display */
        JLabel themeTextLabel = new JLabel("Chosen Theme:");
        add(themeTextLabel);
        themeTextLabel.setBounds(new Rectangle(355, 555, 150, 25));
        themeText = new JTextField(20);
        themeText.setEditable(false);
        add(themeText);
        themeText.setBounds(new Rectangle(325, 580, 150, 25));
    }
    
    public Player getPlayer()
    {
        Player temp = null;
        
        if(player1 != null)
        {
            temp = player1;
        }
        
        return temp;
    }
    
    public JButton getBackButton()
    {
        return bBackMainMenu;
    }
    
    public JButton getPlayButton()
    {
        return bPlayGame;
    }
    
    public void setCharacter(String inChar)
    {
        if(inChar.equals("char1")) { player1 = new Player("Football Player");}
        if(inChar.equals("char2")) { player1 = new Player("Student");}
        if(inChar.equals("char3")) { player1 = new Player("Mascot");}
        charText.setText(player1.getCharacter());
    }
    
    public void setTheme(String inTheme)
    {
        player1.setTheme(inTheme);
        if(player1.getTheme().equals("theme1")) { themeText.setText("Theme 1");}
        if(player1.getTheme().equals("theme2")) { themeText.setText("Theme 2");}
        if(player1.getTheme().equals("theme3")) { themeText.setText("Theme 3");}
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        
        /* set character */
        if(obj == char1) { setCharacter("char1");}
        if(obj == char2) { setCharacter("char2");}
        if(obj == char3) { setCharacter("char3");}
        
        /* set theme */
        if(obj == theme1) { setTheme("theme1");}
        if(obj == theme2) { setTheme("theme2");}
        if(obj == theme3) { setTheme("theme3");}
        
        if(player1 != null)
        {
            theme1.setEnabled(true);
            theme2.setEnabled(true);
            theme3.setEnabled(true);
        }
        if(player1.getCharacter() != null && player1.getTheme() != null)
        {
            bPlayGame.setEnabled(true);
        }
    }
}
