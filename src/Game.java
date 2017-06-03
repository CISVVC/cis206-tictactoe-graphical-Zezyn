/**
 * Created by Martin on 5/29/2017.
 * This is the game engine for TIC TAC TOE
 */

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.WindowEvent;

public class Game {

    static Board board;

    //Global Variables
    static String playerMark; //Used to keep track of players x or o
    static int player = 2; //Used to keep track of player 1 or 2
    static String[] winnerCheck = new String[10]; //Used to keep track of button number
    static int count = 1; //Used to keep count in winnerCheck


    public static String changePlayer() {
        //Checks to see if player 1 is active and changes the players mark for player 2's turn
        if (player == 1 || player == 0) { playerMark = "O"; player = 2; }
        else { playerMark = "X"; player = 1; }
        showPlayer();
        return playerMark;
    }

    public static void showPlayer() {
        //Converts integer to String
        String playerNumber = Integer.toString(player);

        //Sends to board to change JLabel
        //board.setPlayer(playerNumber);

        //This prints out player number to console
        System.out.println("Player: " + playerNumber);
    }

    public static void checkWinner(Object d) {

        //Parses the object into an integer
        count = Integer.parseInt(d.toString());

        //Adds int to winnerCheck array by parses object to a string
        winnerCheck[count] = d.toString();

        //Used to check variables
        /*for(String buttonNumber : winnerCheck) {
            System.out.println(winnerCheck[count] + " " + count + " " + buttonNumber);
        }*/

            //Check for winner in top row;
            if(winnerCheck[1] == "1" && winnerCheck[2] == "2" && winnerCheck[3] == "3")
                {
                    System.out.println("Player: " + player + " Winner top row");
                    JFrame test = new JFrame("You won");
                    //Set frame Size
                    test.setSize(400,400);
                    //Set frame title
                    test.setTitle("Tic Tac Toe");
                    //Set frame close operation
                    test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    //Set frame visible
                    test.setVisible(true);
                    JLabel test2 = new JLabel("Player " + player + " Wins!");
                    test.add(test2, BorderLayout.CENTER);
                }
            //Check winner in middle row
            else if(winnerCheck[4] == "4" && winnerCheck[5] == "5" && winnerCheck[6] == "6")
                { System.out.println("Winner mid row"); }
            //Check winner bottom row
            else if(winnerCheck[7] == "7" && winnerCheck[8] == "8" && winnerCheck[9] == "9")
                { System.out.println("Winner bottom row"); }
            //Check winner left column
            else if(winnerCheck[1] == "1" && winnerCheck[4] == "4" && winnerCheck[7] == "7")
                { System.out.println("Winner left col"); }
            //Check winner middle column
            else if(winnerCheck[2] == "2" && winnerCheck[5] == "5" && winnerCheck[8] == "8")
                { System.out.println("Winner mid col"); }
            //Check winner right column
            else if(winnerCheck[3] == "3" && winnerCheck[6] == "6" && winnerCheck[9] == "9")
                { System.out.println("Winner right col"); }
            //Check winner right to left diagonal
            else if(winnerCheck[1] == "1" && winnerCheck[5] == "5" && winnerCheck[9] == "9")
                { System.out.println("Winner left to right diag"); }
            //Check winner left to right diagonal
            else if(winnerCheck[7] == "7" && winnerCheck[5] == "5" && winnerCheck[3] == "3")
                { System.out.println("Winner right to left diag"); }

    }
}