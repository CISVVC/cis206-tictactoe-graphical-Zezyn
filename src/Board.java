import javax.swing.*;
import java.awt.*;

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
        JLabel but1 = new JLabel(" ");

        //A loop to create the 9 buttons
        JButton button1 = new JButton(" ");
        JButton button2 = new JButton(" ");
        JButton button3 = new JButton(" ");
        JButton button4 = new JButton(" ");
        JButton button5 = new JButton(" ");
        JButton button6 = new JButton(" ");
        JButton button7 = new JButton(" ");
        JButton button8 = new JButton(" ");
        JButton button9 = new JButton(" ");

        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);

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
