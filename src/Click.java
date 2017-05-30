/**
 * Created by Martin on 5/29/2017.
 */
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Click implements ActionListener {

    JLabel label;
    public Click(JLabel label) {
        this.label = label;
    }

    public void actionPerformed(ActionEvent e)
    {
        if (label.equals("X") || label.equals(" ")) {
            label.setText("O");
            System.out.println(label);
        } else {
            label.setText("Testing");
            System.out.println("X");
        }
    }
}
