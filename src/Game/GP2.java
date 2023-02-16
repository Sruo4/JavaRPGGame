package Game;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GP2 extends GP {
    JLabel jl1 = new JLabel(new ImageIcon("src\\Image\\map2.png"));

    public void printP() {
        this.setLayout(null);
        this.setBounds(0, 0, 1600, 900);
        jl1.setBounds(new Rectangle(0, 0, 1600, 900));

        this.add(jl1);
    }
}
