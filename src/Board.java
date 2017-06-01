import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Martin Hernandez on 5/25/2017.
 * Creates the tic tac toe board
 */

public class Board extends JPanel {

    //Creates the 3x3 board
    public Board() {

        //Creates the 3x3 grid for buttons in the panel
        this.setLayout(new GridLayout(3,3));

        //Create JLabels for buttons
        //Use this for Header
        //JLabel button = new JLabel();

        //A create the 9 buttons
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JButton button6 = new JButton();
        JButton button7 = new JButton();
        JButton button8 = new JButton();
        JButton button9 = new JButton();

        //Enable button
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);

        //Add Click to buttons
        Click c1 = new Click(button1);
        Click c2 = new Click(button2);
        Click c3 = new Click(button3);
        Click c4 = new Click(button4);
        Click c5 = new Click(button5);
        Click c6 = new Click(button6);
        Click c7 = new Click(button7);
        Click c8 = new Click(button8);
        Click c9 = new Click(button9);


        //Add Action Listeners
        button1.addActionListener(c1);
        button2.addActionListener(c2);
        button3.addActionListener(c3);
        button4.addActionListener(c4);
        button5.addActionListener(c5);
        button6.addActionListener(c6);
        button7.addActionListener(c7);
        button8.addActionListener(c8);
        button9.addActionListener(c9);


        //Add button to panel
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.setVisible(true);
    }
}
