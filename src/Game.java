/**
 * Created by Martin on 5/29/2017.
 * This is the game engine for TIC TAC TOE
 */

import javax.swing.JLabel;

public class Game {

    //Global Variables
    static String playerMark; //Used to keep track of players x or o
    static int player = 0; //Used to keep track of player 1 or 2
    static String[] winnerCheck = new String[10]; //Used to keep track of button number
    static int count = 1; //Used to keep count in winnerCheck


    public static String changePlayer() {
        //Checks to see if player 1 is active and changes the players mark for player 2's turn
        if (player == 1 || player == 0) { playerMark = "O"; player = 2; }
        else { playerMark = "X"; player = 1; }
        return playerMark;
    }

    public void showPlayer() {
        //JLabel player = new JLabel(String.valueOf(this.player));
        System.out.println(player);
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
                { System.out.println("Winner top row"); }
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