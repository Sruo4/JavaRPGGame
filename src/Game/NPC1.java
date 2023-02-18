package Game;

import java.awt.Graphics;
import java.awt.Rectangle;

public class NPC1 extends Hero {
    //剧情对话型NPC

    //识别参数
    public int id;

    public NPC1(String img, int x, int y, GP gp,int id) {
        super(img, y, y, gp, img, img, img, img);
        this.id = id;
    }

    @Override
    public void paintSelf(Graphics g) {
        g.drawImage(img, x, y, null);
    }

    @Override
    public Rectangle getRec() {
        return new Rectangle(x, y, width, height);
    }
    
}