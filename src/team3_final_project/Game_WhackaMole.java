package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.TimerTask;

public class Game_WhackaMole extends JPanel implements ActionListener {

    JButton bStart, bBuckeye;                                                         //Declaring variables
    int score = 0;
    Timer tim;
    ImageIcon moleButton;
    int gameTime = 0;

    public Game_WhackaMole()
    {
        super();
        setBackground(Color.gray);
            
        bStart = new JButton("Start");                                              //Start button
        bStart.addActionListener(this);
        add(bStart);

        tim = new Timer(1000, this);

        bBuckeye = new JButton("Click me");                                           //Point button
        bBuckeye.addActionListener(this);
        add(bBuckeye);

        setLayout(null);                                                        //Setting layout and locations
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
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == bBuckeye){                                                        //Updates score keeper when point button is clicked
            ++score;                                                                //Score
        }

        if (obj == bStart){                                                        //If start button is clicked, timer starts
            tim.start();
            bStart.setVisible(false);
            bBuckeye.setVisible(true);
        }

        if (obj == tim){                                                       //Timer calculates two random numbers and
            int xNum = 0;                                                       //changes the boundries of point button
            int yNum = 0;

            double r = Math.random();                                           //declaring variable for random number
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
