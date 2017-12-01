package team3_final_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game_WhackaMole extends JPanel implements ActionListener {

    JButton b1, b2, b3;                                                         //Declaring variables
    int counter;
    int i = 0;
    String score;
    Timer tim;
    ImageIcon moleButton;

    public Game_WhackaMole() {
        super();
        setBackground(Color.BLACK);
            
        b1 = new JButton("Start");                                              //Start button
        b1.addActionListener(this);
        add(b1);

        tim = new Timer(1000, this);

        b2 = new JButton("Click me");                                           //Point button
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("Score: 0");                                           //Score keeper
        b3.addActionListener(this);
        add(b3);

        setLayout(null);                                                        //Setting layout and locations
        b1.setBounds(new Rectangle(15, 15, 75, 50));
        b2.setBounds(new Rectangle(200, 50, 85, 75));

        
        moleButton = new ImageIcon("images/icons/buckeye.png");
        b2.setIcon(moleButton);
        
        long start = System.currentTimeMillis();
        long end = start + 10*1000;
        while (System.currentTimeMillis() < end);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == b2) {                                                        //Updates score keeper when point button is clicked
            ++i;                                                                //Score

        }

        if (obj == b1) {                                                        //If start button is clicked, timer starts

            tim.start();
            
        }

        if (obj == tim) {                                                       //Timer calculates two random numbers and
            int xNum = 0;                                                       //changes the boundries of point button
            int yNum = 0;

            double r = Math.random();                                           //declaring variable for random number
            xNum = (int) (r * 450.0);
            double s = Math.random();
            yNum = (int) (s * 550.0);

            b2.setBounds(new Rectangle(xNum, yNum, 100, 75));
          

        }
        
    }

}
