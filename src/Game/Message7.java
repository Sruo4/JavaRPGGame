package Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Message7 {
    public Message7() {
        JTextField jt1 = new JTextField();// new一个文本框
        JTextArea jt2 = new JTextArea(); // new一个文本区
        JScrollPane jsp = new JScrollPane(jt2); // new一个滚条
        String title = "地图5";
        JFrame jf = new JFrame(title);
        Container container = jf.getContentPane();
        container.setBackground(Color.yellow); // 容器的背景色
        jf.setVisible(true); // 窗体可见
        jf.setSize(600, 400);// 窗体大小
        jf.setLayout(new BorderLayout()); // 边界布局
        jf.add(BorderLayout.NORTH, jt1);// 文本框边界顶部放置
        jt1.setBackground(Color.yellow);
        jf.add(BorderLayout.CENTER, jt2);// 文本框边界中间放置
        jt2.setBackground(Color.gray);

        // NPC1对话
        jt2.setText(
                "格洛丽亚：我知道你是为什么而来的，不过关于我是从哪里搞到那个护符的话題，\n我们还是下次再谈好了,小心些,狼人们可不愿意让别人发现他们的秘密。\n1.护符是怎么运作的？\n2.你好像很了解狼人。");

        jt1.addActionListener(new ActionListener() { // 监听器
            public void actionPerformed(ActionEvent e) {
                String s = jt1.getText();
                if (s.equals("1") || s.equals("2")) {
                    jt2.setText("我不是专家，但海尔辛是蝎尾蜥的魔神,护符上有海尔辛的呼唤,\n狼人无法抵抗它的召唤一它力量使他们渴示自己的真正本性,挺有用的，对吧？\n1.海尔辛？");
                } else if (s.equals("11") || s.equals("21")) {
                    jt2.setText(
                            "你不会什么都不知道吧？海尔辛！万干神灵的创造者与守护者知道吗？海尔辛的呼唤......\n好吧，它会揭露事物的本质，展现出他们心中野蛮残忍的真实一面。\n1.你好像真的很了解狼人。");
                } else if (s.equals("111") || s.equals("211")) {
                    jt2.setText(
                            "好吧，好吧，这是黑暗真相，我和法奥楚有关，他是我的祖先，\n每一天，我和我的家族都生活在他的阴影之下，\n现在他回来了，所以我猎杀狼人一我要杀光他们，你准备好后就去山洞找我吧。\n1.再见");
                } else if (s.equals("1111") || s.equals("2111")) {
                    jf.dispose();
                }
            }

        });
    }
}
