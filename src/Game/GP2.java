package Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;
import java.awt.Rectangle;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GP2 extends GP {
    // JLabel jl1 = new JLabel(new ImageIcon("src\\Image\\map1.png"));
    Player player = new Player("src\\Image\\playerdown.png", 250, 350, this, "src\\Image\\playerup.png",
            "src\\Image\\playerdown.png", "src\\Image\\playerleft.png", "src\\Image\\playerright.png");

    UpdateThread ut;

    public void printP() {
        this.setLayout(null);
        this.setBounds(0, 0, 1600, 900);
        // jl1.setBounds(new Rectangle(0, 0, 1600, 900));

        // this.add(jl1);

        JPanel panel = new MyPanel();
        panel.setBounds(0, 0, 1600, 900);
        this.add(panel);
        panel.setLayout(null);

        // 多线程
        ut = new UpdateThread(panel);
        ut.start();
    }

    class MyPanel extends JPanel {
        public void paint(Graphics g) {
            // 绘制地图
            ImageIcon map1 = new ImageIcon("src\\Image\\map2.png");
            g.drawImage(map1.getImage(), 0, 0, null);
            // 绘制玩家
            player.paintSelf(g);

            // 绘制npc
            npc_2.paintSelf(g);
        }
    }
}
