/**
 * Created by Wizard on 5/24/2017.
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;

public class TicTacToe extends JFrame {

    //Create instances of buttons and labels
    private JPanel panel;

    //Create frame size
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;


    //public static void Frame() {
    public TicTacToe() {

        //Create the board
        createBoard();

        //Set frame Size
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

    }

    //Creates the 3x3 board
    private void createBoard() {

        //Creates new JPanel
        panel = new JPanel();

        //Creates the 3x3 grid for buttons in the panel
        panel.setLayout(new GridLayout(3,3));

        //A loop to create the 9 buttons
        for(int i=0; i<=8;i++) {
            JButton buttoni = new JButton();
            panel.add(buttoni);
            buttoni.setEnabled(true);
        }

        //Adds the panel to the JFrame
        add(panel);
    }

    public static void X() {

    }

    public static void O() {

    }
}
