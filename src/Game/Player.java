package Game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Player extends Hero {
    public Player(String img, int x, int y, GP gp, String upImg, String downImg, String leftImg,
            String rightImg) {
        super(img, x, y, gp, upImg, downImg, leftImg, rightImg);
    }

    static boolean up = false;
    static boolean down = false;
    static boolean left = false;
    static boolean right = false;
    int upcnt = 350, downcnt = 470, leftcnt = 250, rightcnt = 1300;
    //一次性碰撞标志
    int flagg = 0;

    public void move() {
        if (left) {
            leftward();
        } else if (right) {
            rightward();
        } else if (up) {
            upward();
        } else if (down) {
            downward();
        }
    }

    @Override
    public void paintSelf(Graphics g) {
        g.drawImage(img, x, y, null);
        move();
    }

    @Override
    public Rectangle getRec() {
        return new Rectangle(x, y, width, height);
    }
}
