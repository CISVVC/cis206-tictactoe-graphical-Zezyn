import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;

/**
 * Created by Martin Hernandez on 5/25/2017.
 * Creates the tic tac toe board
 */

public class Board extends JPanel {

    //JPanel for board
    JPanel board = new JPanel();

    //JPanel for Game Status
    JPanel playerStatus = new JPanel();

    //JLabel for Game Status
    JLabel status = new JLabel();

    //Global buttons
    JButton B1, B2, B3, B4, B5, B6, B7, B8, B9;

    //Create instances of Click
    Click c1, c2, c3, c4, c5, c6, c7, c8, c9;

    //Create instance of game engine
    Game game;

    //Creates the 3x3 board
    public Board() {

        //Creates layout for main window
        this.setLayout(new BorderLayout(10,10));

        //Creates the 3x3 grid for buttons in the panel
        GridLayout grid = new GridLayout(3,3);

        //Creates layout for board
        board.setLayout(grid);

        //Calls the method to create the buttons
        createButtons();

        //Calls method to create status JLabel
        createStatus();
    }

    public void createStatus() {
        //Creates initial Label with Player 1
        status.setText("Player 1");
        //Adds to playerstatus Jpanel
        playerStatus.add(status, BorderLayout.CENTER);
        //adds to main JPanel
        this.add(playerStatus, BorderLayout.NORTH);
    }

    public void setPlayer(String player) {
        //Change JLabel text for Player
                                        //Why doesn't this work?
        //status.setText(player);

        status.setText("Testing");
    }

    public void createButtons() {
        //A create the 9 buttons
        B1 = new JButton("1");
        B2 = new JButton("2");
        B3 = new JButton("3");
        B4 = new JButton("4");
        B5 = new JButton("5");
        B6 = new JButton("6");
        B7 = new JButton("7");
        B8 = new JButton("8");
        B9 = new JButton("9");

        //Enable button
        B1.setEnabled(true);
        B2.setEnabled(true);
        B3.setEnabled(true);
        B4.setEnabled(true);
        B5.setEnabled(true);
        B6.setEnabled(true);
        B7.setEnabled(true);
        B8.setEnabled(true);
        B9.setEnabled(true);

        //Add Click to buttons
        c1 = new Click(B1);
        c2 = new Click(B2);
        c3 = new Click(B3);
        c4 = new Click(B4);
        c5 = new Click(B5);
        c6 = new Click(B6);
        c7 = new Click(B7);
        c8 = new Click(B8);
        c9 = new Click(B9);

        //Add Action Listeners
        B1.addActionListener(c1);
        B2.addActionListener(c2);
        B3.addActionListener(c3);
        B4.addActionListener(c4);
        B5.addActionListener(c5);
        B6.addActionListener(c6);
        B7.addActionListener(c7);
        B8.addActionListener(c8);
        B9.addActionListener(c9);

        //Add B to panel
        board.add(B1);
        board.add(B2);
        board.add(B3);
        board.add(B4);
        board.add(B5);
        board.add(B6);
        board.add(B7);
        board.add(B8);
        board.add(B9);

        //Adds board to main panel and makes visible
        this.add(board);
        this.setVisible(true);
    }
}