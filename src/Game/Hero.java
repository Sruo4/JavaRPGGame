package Game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;

import javax.swing.JPanel;

public abstract class Hero{
    //图片
    public Image img;

    //坐标
    public int x;
    public int y;

    // 界面
    public GP gp;

    // 角色矩形的尺寸
    public static int width = 45;
    public static int height = 45;
    // 角色移动速度
    static int speed = 3;
    // 角色方向
    private Direction direction = Direction.DOWN;
    // 四向图片
    private String upImg;
    private String downImg;
    private String leftImg;
    private String rightImg;

    //界面

    //npc接触标志
    int flag1 = 0,flag2= 0;


    // 构造函数
    public Hero(String img, int x, int y,GP gp, String upImg, String downImg, String leftImg,
            String rightImg) {
        this.img = Toolkit.getDefaultToolkit().getImage(img);
        this.x = x;
        this.y = y;
        this.gp = gp;
        this.upImg = upImg;
        this.downImg = downImg;
        this.leftImg = leftImg;
        this.rightImg = rightImg;
    }

    public void upward() {
        if (!moveToBorder(x, y - speed)) {
            this.y -= speed;
        }
        setImg(upImg);
        direction = Direction.UP;
    }

    public void downward() {
        if (!moveToBorder(x, y + speed)) {
            this.y += speed;
        }
        setImg(downImg);
        direction = Direction.DOWN;
    }

    public void leftward() {
        if (!moveToBorder(x - speed, y)) {
            this.x -= speed;
        }
        setImg(leftImg);
        direction = Direction.LEFT;
    }

    public void rightward() {
        if (!moveToBorder(x + speed, y)&& !hitMan(x + speed, y)) {
            this.x += speed;
        }
        setImg(rightImg);
        direction = Direction.RIGHT;
    }

    public void setImg(String img) {
        this.img = Toolkit.getDefaultToolkit().getImage(img);
    }

    //npc接触检测
    public boolean hitMan(int x, int y) {
        NPC1 npc1 = this.gp.npc_1;
        NPC1 npc2 = this.gp.npc_2;
        Rectangle next = new Rectangle(x, y, width, height);

        if (next.intersects(npc1.getRec())) {
            flag1++;
        }
        if (flag1 == 1) {
            new Message();
            flag1++;
            return true;
        }
        //npc2
        if (next.intersects(npc2.getRec())) {
                flag2++;
        }
        if (flag2 == 1) {
            new Message2();
            flag2++;
            return true;
        }
        return false;
    }

    //边界检测
    public boolean moveToBorder(int x, int y) {
        if (x < 0) {
            return true;
        } else if(x+width>this.gp.getWidth()) {
            return true;
        } else if (y<0) {
            return true;
        } else if (y + height+70 > this.gp.getHeight()) {
            return true;
        }
        return false;
    }

    public abstract void paintSelf(Graphics g);

    public abstract Rectangle getRec();
}
