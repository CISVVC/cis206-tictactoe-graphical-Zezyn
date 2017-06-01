/**
 * Created by Martin on 5/29/2017.
 */
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Click implements ActionListener {

    JButton button;
    Game game;

    public Click(JButton button) { this.button = button; this.game = game; }

    public void actionPerformed(ActionEvent e) {
        this.button.setText(Game.changePlayer());
    }
}
