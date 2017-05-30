/**
 * Created by Martin on 5/29/2017.
 */
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Click implements ActionListener {

    JButton button;
    Game game;
    public Click(JButton label) { this.button = button; this.game = game; }

    public void actionPerformed(ActionEvent e)
    {
        /*
        if (label.equals("X") || label.equals(" ")) {
            label.setText("O");
            System.out.println("Making an O");

        } else {
            label.setText("Testing");
            System.out.println("Making an X");
        }*/

        //Game.changePlayer(Board.xORo);

        //label.setText("X");

        this.button.setText("X");
    }
}
