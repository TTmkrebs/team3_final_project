package team3_final_project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ChoicesPanel extends JPanel implements ActionListener
{
    /* declare bBackMainMenu button to display MainPanel */
    private JButton bBackMainMenu;
    /* declare bPlayGame button */
    private JButton bPlayGame;
    /* declare char1 button */
    private JButton char1;
    /* declare char2 button */
    private JButton char2;
    /* declare char3 button */
    private JButton char3;
    /* declare charText display */
    private JTextField charText;
    
    /* declare theme1 button */
    private JButton theme1;
    private ImageIcon psuSports;
    /* declare theme2 button */
    private JButton theme2;
    private ImageIcon psuAcademics;
    /* declare theme3 button */
    private JButton theme3;
    private ImageIcon psuHistory;
    /* declare themeText display */
    private JTextField themeText;
    
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
        psuSports = new ImageIcon("images/themes/psusports.png");
        theme1 = new JButton(psuSports);
        theme1.addActionListener(this);
        add(theme1);
        theme1.setBounds(new Rectangle(125, 400, 150, 150));
        theme1.setEnabled(false);
        
        psuAcademics = new ImageIcon("images/themes/psuacademics.png");
        theme2 = new JButton(psuAcademics);
        theme2.addActionListener(this);
        add(theme2);
        theme2.setBounds(new Rectangle(325, 400, 150, 150));
        theme2.setEnabled(false);
        
        psuHistory = new ImageIcon("images/themes/psuhistory.png");
        theme3 = new JButton(psuHistory);
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
        if(inChar.equals("char1")) { charText.setText("Football Player");}
        if(inChar.equals("char2")) { charText.setText("Student");}
        if(inChar.equals("char3")) { charText.setText("Mascot");}
    }
    
    public String getCharacter()
    {
        return charText.getText();
    }
    
    public void setTheme(String inTheme)
    {
        if(inTheme.equals("theme1")) { themeText.setText("PSU Sports");}
        if(inTheme.equals("theme2")) { themeText.setText("PSU Academics");}
        if(inTheme.equals("theme3")) { themeText.setText("PSU History");}
    }
    
    public String getTheme()
    {
        return themeText.getText();
    }
    
    public ImageIcon getThemeIcon(String inTheme)
    {
        if(inTheme.equals("PSU Sports")){return psuSports;}
        if(inTheme.equals("PSU Academics")){return psuAcademics;}
        else{return psuHistory;}
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
        
        if(charText.getText() != null)
        {
            theme1.setEnabled(true);
            theme2.setEnabled(true);
            theme3.setEnabled(true);
        }
        if(charText.getText() != null && themeText.getText() != null)
        {
            bPlayGame.setEnabled(true);
        }
    }
}
