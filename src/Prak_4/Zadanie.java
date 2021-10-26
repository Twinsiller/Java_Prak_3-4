package Prak_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie extends JFrame
{
    public Club Real_Madrid = new Club("Real Madrid");
    public Club AC_Milan = new Club("AC Milan");

    JButton button_AC_Milan = new JButton("AC Milan");
    JButton button_Real_Madrid = new JButton("Real Madrid");

    public String Winner()
    {
        if (AC_Milan.getScore() > Real_Madrid.getScore())
        {
            return AC_Milan.getName();
        }
        else if (AC_Milan.getScore() < Real_Madrid.getScore())
        {
            return Real_Madrid.getName();
        }
        else
        {
            return "DRAW";
        }
    }




    Font fnt = new Font("Times new roman",Font.BOLD,20);

    Zadanie()
    {
        super("Score");
        setLayout(new FlowLayout());
        setSize(320,180);
        add(button_AC_Milan);
        add(button_Real_Madrid);

        JLabel labelResult = new JLabel("Result: " + AC_Milan.getScore() + " X " + Real_Madrid.getScore());
        JLabel labelLastScorer = new JLabel("Last Scorer: " + "N/A");
        Label labelWinner = new Label("Winner: " + Winner());

        button_AC_Milan.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    AC_Milan.setScore(AC_Milan.getScore() + 1);
                    //System.out.println(AC_Milan.getScore());
                    labelResult.setText("Result: " + AC_Milan.getScore() + " X " + Real_Madrid.getScore());
                    labelLastScorer.setText("Last Scorer: " + AC_Milan.getName());
                    labelWinner.setText("Winner: " + Winner());
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button_Real_Madrid.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {

                try
                {
                    Real_Madrid.setScore(Real_Madrid.getScore() + 1);
                    //System.out.println(Real_Madrid.getScore());
                    labelResult.setText("Result: " + AC_Milan.getScore() + " X " + Real_Madrid.getScore());
                    labelLastScorer.setText("Last Scorer: " + Real_Madrid.getName());
                    labelWinner.setText("Winner: " + Winner());

                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        //add(new JLabel("Result: " + AC_Milan.getScore() + " X " + Real_Madrid.getScore()));
        //add(new JLabel("Last Scorer: " ));
        //add(new Label("Winner: " + Winner()));
        add(labelResult);
        add(labelLastScorer);
        add(labelWinner);

        setVisible(true);
    }





    public static void main(String[]args)
    {
        new Zadanie();
    }
}

