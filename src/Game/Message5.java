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

public class Message5 {
    public Message5() {
        JTextField jt1 = new JTextField();// new一个文本框
        JTextArea jt2 = new JTextArea(); // new一个文本区
        JScrollPane jsp = new JScrollPane(jt2); // new一个滚条
        String title = "地图3";
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
        jt2.setText("格洛丽亚：我的处决者来了？你看上去弱的连斧子都挥不动，更别提处理那些流出来的鲜血了·  \n1. 为血荆省下你的侮辱吧·我是来救你的·");

        jt1.addActionListener(new ActionListener() { // 监听器
            public void actionPerformed(ActionEvent e) {
                String s = jt1.getText();
                if (s.equals("1")) {
                    jt2.setText("太棒了·给我松绑·我们会杀了这些血荆的狗，然后去找法奥楚和他的狼人·\n1.塞巴斯安公想先和你谈谈·");
                } else if (s.equals("11")) {
                    jt2.setText("塞巴斯蒂安？我们没时间“““哦，好吧·我们会和公爵谈谈的·那我们走吧·没时间浪费了·1.别动．我这就给你松绑 2你对法奥楚有什么样的威胁？");
                } else if (s.equals("112")) {
                    jt2.setText("这么说吧，我有些内部消息可以帮助我们做掉这条癞皮狗·现在赶紧给我松绑·1.给他松绑");
                } else if (s.equals("111") || s.equals("1121")) {
                    jf.dispose();
                }
            }

        });
    }
}
