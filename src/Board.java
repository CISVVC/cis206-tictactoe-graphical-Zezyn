import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Martin Hernandez on 5/25/2017.
 * Creates the tic tac toe board
 */

public class Board extends JPanel {


    public static String xORo = null;

    //Creates the 3x3 board
    public Board() {

        String empty = null;
        //String xORo = "O";
        xORo = Game.changePlayer(xORo);

        //Creates the 3x3 grid for buttons in the panel
        this.setLayout(new GridLayout(3,3));

        //Create JLabels for buttons
        JLabel button = new JLabel();

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

        //Add Action Listeners
        Click c1 = new Click(button);
        button1.addActionListener(c1);

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

    public void ChangeLabel() {

    }
}
