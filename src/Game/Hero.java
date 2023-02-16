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
    int flag1 = 0;
    NPC1 tmpNpc1;


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
        if (hitMan(x, y - speed)) {
            flag1++;
        }
        setImg(upImg);
        direction = Direction.UP;
    }

    public void downward() {
        if (!moveToBorder(x, y + speed)) {
            this.y += speed;
        }
        if (hitMan(x, y + speed)) {
            flag1 ++;
        }
        setImg(downImg);
        direction = Direction.DOWN;
    }

    public void leftward() {
        if (!moveToBorder(x - speed, y)) {
            this.x -= speed;
        }
        if (hitMan(x - speed, y)) {
            flag1++;
        }
        setImg(leftImg);
        direction = Direction.LEFT;
    }

    public void rightward() {
        if (!moveToBorder(x + speed, y)&& !hitMan(x + speed, y)) {
            this.x += speed;
        }
        if (hitMan(x + speed, y)) {
            this.x -= speed;
            flag1++;
        }
        setImg(rightImg);
        direction = Direction.RIGHT;
    }

    public void setImg(String img) {
        this.img = Toolkit.getDefaultToolkit().getImage(img);
    }

    //npc接触检测
    public boolean hitMan(int x, int y) {
        ArrayList<NPC1> npc1_s = this.gp.npc1list;
        Rectangle next = new Rectangle(x, y, width, height);
        for (NPC1 npc : npc1_s) {
            if (next.intersects(npc.getRec())) {
                flag1++;
            }
        }
        if (flag1 == 1) {
            new Message(tmpNpc1);
            flag1++;
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
        } else if (y + height > this.gp.getHeight()) {
            return true;
        }
        return false;
    }

    public abstract void paintSelf(Graphics g);

    public abstract Rectangle getRec();
}
