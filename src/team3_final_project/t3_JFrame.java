package team3_final_project;

import javax.swing.*;

public class t3_JFrame extends JFrame
{
    public t3_JFrame()
    {
        super("Java: Putting It All Together");

        t3_JPanel jP = new t3_JPanel();
        add(jP, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 800);
        setVisible(true);
        setResizable(false);
    }
}
