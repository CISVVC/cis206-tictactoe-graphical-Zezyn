/**
 * Created by Wizard on 5/24/2017.
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class GUI {
    public static void Frame() {
    //public GUI() {
        JFrame frame = new JFrame();

        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        createBoard(frame);
    }

    public static void createBoard(JFrame frame) {

        JButton button1 = new JButton(" ");
        JButton button2 = new JButton(" ");
        JButton button3 = new JButton(" ");
        JButton button4 = new JButton(" ");
        JButton button5 = new JButton(" ");
        JButton button6 = new JButton(" ");
        JButton button7 = new JButton(" ");
        JButton button8 = new JButton(" ");
        JButton button9 = new JButton(" ");

        JPanel panel = new JPanel();

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);

        frame.add(panel);
    }

    public static void createX() {

    }

    public static void createO() {

    }
}
