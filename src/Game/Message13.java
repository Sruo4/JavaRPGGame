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

public class Message13 {
    public Message13() {
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
        jt2.setText("你知道吗，我以前和你一样也是个冒险家，直到我的膝盖中了一箭。\n1.。。。再见\n2.你在这里就是为了说这个?");

        jt1.addActionListener(new ActionListener() { // 监听器
            public void actionPerformed(ActionEvent e) {
                String s = jt1.getText();
                if (s.equals("1") || s.equals("21") || s.equals("22")) {
                    jf.dispose();
                } else if (s.equals("2")) {
                    jt2.setText("当然不是，传说鸡神已经降临人间，现在正藏在人群之中，找到他，你会得到惊喜。\n1.没兴趣，再见 \n2.我会去的");
                }
            }

        });
    }
}
