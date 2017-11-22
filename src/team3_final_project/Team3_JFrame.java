package team3_final_project;

import java.awt.Color;
import javax.swing.*;

public class Team3_JFrame extends JFrame
{
    public Team3_JFrame()
    {
        super("Team 3 - Penn State Explorer");
        
        Team3_JPanel panel = new Team3_JPanel();
        add(panel,"Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,700);
        setVisible(true);
        setResizable(false);
        setBackground(Color.green);
    }
}
