package Game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;

import javax.swing.JPanel;

public abstract class Hero {
    // 图片
    public Image img;

    // 坐标
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

    // 界面

    // npc接触标志
    public int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0, flag5 = 0, flag6 = 0, flag7 = 0, flag8 = 0, flag9 = 0,
            flag10 = 0,
            flag11 = 0, flag12 = 0;

    public static int flaga = 0;

    public int flagb = 0;

    // 构造函数
    public Hero(String img, int x, int y, GP gp, String upImg, String downImg, String leftImg,
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
        if (!moveToBorder(x + speed, y) && !hitMan(x + speed, y)) {
            this.x += speed;
        }
        setImg(rightImg);
        direction = Direction.RIGHT;
    }

    public void setImg(String img) {
        this.img = Toolkit.getDefaultToolkit().getImage(img);
    }

    // npc接触检测
    public boolean hitMan(int x, int y) {
        NPC1 npc1 = this.gp.npc_1;
        NPC1 npc2 = this.gp.npc_2;
        NPC1 npc3 = this.gp.npc_3;
        NPC1 npc4 = this.gp.npc_4;
        NPC1 npc5 = this.gp.npc_5;
        NPC1 npc6 = this.gp.npc_6;
        NPC1 npc7 = this.gp.npc_7;
        NPC1 npc8 = this.gp.npc_8;
        NPC1 npc9 = this.gp.npc_9;
        NPC1 npc10 = this.gp.npc_10;
        NPC1 npc11 = this.gp.npc_11;
        NPC1 npc12 = this.gp.npc_12;
        NPC1 npca = this.gp.npc_a;
        NPC1 npcb = this.gp.npc_b;

        Rectangle next = new Rectangle(x, y, width, height);
        // map1npc1
        if (next.intersects(npc1.getRec()) && GF.mapId == 1) {
            flag1++;
        }
        if (flag1 == 1) {
            new Message();
            flag1++;
            return true;
        }
        // map2npc2
        if (next.intersects(npc2.getRec()) && GF.mapId == 2) {
            flag2++;
        }
        if (flag2 == 1) {
            new Message2();
            flag2++;
            return true;
        }
        // map3npc3
        if (next.intersects(npc3.getRec()) && GF.mapId == 3) {
            flag3++;
        }
        if (flag3 == 1) {
            new Message3();
            flag3++;
            return true;
        }
        // map3npc4
        if (next.intersects(npc4.getRec()) && GF.mapId == 3) {
            flag4++;
        }
        if (flag4 == 1) {
            new Message4();
            flag4++;
            return true;
        }
        // map4npc5
        if (next.intersects(npc5.getRec()) && GF.mapId == 4) {
            flag5++;
        }
        if (flag5 == 1) {
            new Message5();
            flag5++;
            return true;
        }
        // map4npca
        if (next.intersects(npca.getRec()) && GF.mapId == 4) {
            flaga++;
        }
        if (flaga == 1) {
            final String f1 = "src\\BGM\\chick.wav";
            BGM Chick = new BGM();
            Chick.play(f1);
            flaga++;
            return true;
        }

        if (next.intersects(npcb.getRec()) && GF.mapId == 1) {
            flagb++;
        }
        if (flagb == 1) {
            new Message13();
            flagb++;
            return true;
        }

        // map5npc6
        if (next.intersects(npc6.getRec()) && GF.mapId == 5) {
            flag6++;
        }
        if (flag6 == 1) {
            new Message6();
            flag6++;
            return true;
        }
        // map6npc7
        if (next.intersects(npc7.getRec()) && GF.mapId == 6) {
            flag7++;
        }
        if (flag7 == 1) {
            new Message7();
            flag7++;
            return true;
        }
        // map7npc8
        if (next.intersects(npc8.getRec()) && GF.mapId == 7) {
            flag8++;
        }
        if (flag8 == 1) {
            new Message8();
            flag8++;
            return true;
        }
        // map7npc9
        if (next.intersects(npc9.getRec()) && GF.mapId == 7) {
            flag9++;
        }
        if (flag9 == 1) {
            new Message9();
            flag9++;
            return true;
        }
        // map8npc10
        if (next.intersects(npc10.getRec()) && GF.mapId == 8) {
            flag10++;
        }
        if (flag10 == 1) {
            new Message10();
            flag10++;
            return true;
        }
        // map9npc11
        if (next.intersects(npc11.getRec()) && GF.mapId == 9) {
            flag11++;
        }
        if (flag11 == 1) {
            new Message11();
            flag11++;
            return true;
        }
        // map9npc12
        if (next.intersects(npc12.getRec()) && GF.mapId == 9) {
            flag12++;
        }
        if (flag12 == 1) {
            new Message12();
            flag12++;
            return true;
        }
        return false;
    }

    // 边界检测
    public boolean moveToBorder(int x, int y) {
        if (x < 0) {
            return true;
        } else if (x + width > this.gp.getWidth()) {
            return true;
        } else if (y < 0) {
            return true;
        } else if (y + height + 70 > this.gp.getHeight()) {
            return true;
        }
        return false;
    }

    public abstract void paintSelf(Graphics g);

    public abstract Rectangle getRec();
}
