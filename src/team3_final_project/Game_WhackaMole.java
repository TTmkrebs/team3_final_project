package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.TimerTask;

public class Game_WhackaMole extends JPanel implements ActionListener 
{
    /* declare variables */
    JButton bStart, bBuckeye;
    int score = 0;
    Timer tim;
    ImageIcon moleButton;
    int gameTime = 0;

    public Game_WhackaMole()
    {
        super();
        setBackground(Color.gray);
            
        /* create start button */
        bStart = new JButton("Start");
        bStart.addActionListener(this);
        add(bStart);

        tim = new Timer(1000, this);
        /* create point button */
        bBuckeye = new JButton("Click me");
        bBuckeye.addActionListener(this);
        add(bBuckeye);

        /*set layout and locations */
        setLayout(null);
        bStart.setBounds(new Rectangle(15, 15, 75, 50));
        bBuckeye.setBounds(new Rectangle(200, 50, 85, 75));

        
        moleButton = new ImageIcon("images/icons/buckeye.png");
        bBuckeye.setIcon(moleButton);
        bBuckeye.setVisible(false);
        
    }
    
    public void endGame()
    {
        tim.stop();
        bBuckeye.setVisible(false);
        bStart.setText("Game Over");
        bStart.setEnabled(false);
        bStart.setBounds(new Rectangle(15, 15, 125, 50));
        bStart.setVisible(true);   
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Object obj = e.getSource();
        /* update score keeper when point button is clicked */
        if (obj == bBuckeye)
        {
            ++score;
        }
        /* if start button is clicked, timer starts */
        if (obj == bStart)
        {
            tim.start();
            bStart.setVisible(false);
            bBuckeye.setVisible(true);
        }
        /* timer calculates two random numbers and changes the boundaries of point button */
        if (obj == tim)
        {
            int xNum = 0;
            int yNum = 0;
            /* create random numbers */
            double r = Math.random();
            xNum = (int) (r * 450.0);
            double s = Math.random();
            yNum = (int) (s * 450.0);

            bBuckeye.setBounds(new Rectangle(xNum, yNum, 100, 75));
            
            ++gameTime;
            if(gameTime == 11)
            {
                endGame();
            }
        }
    }
}