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

public class Message6 {
    public Message6() {
        JTextField jt1 = new JTextField();// new一个文本框
        JTextArea jt2 = new JTextArea(); // new一个文本区
        JScrollPane jsp = new JScrollPane(jt2); // new一个滚条
        String title = "地图4";
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
        jt2.setText("公爵:我在这里，安然无恙的回到了这里，我要为这事谢谢你。\n1.你跟格洛丽亚谈过了吗？");

        jt1.addActionListener(new ActionListener() { // 监听器
            public void actionPerformed(ActionEvent e) {
                String s = jt1.getText();
                if (s.equals("1")) {
                    jt2.setText("嗯，我和她一样对凯姆洛恩心存担忧，必须得一举消灭这些狼人，希望你也能加入我们。\n1.同意");
                } else if (s.equals("11")) {
                    jt2.setText("格洛丽亚推测法奥楚的奸细就在我们之中，即使是这一刻·\n1.我该怎么揪出隐藏的狼人呢？");
                } else if (s.equals("111")) {
                    jt2.setText("格洛丽亚说这个护身符能用来揭露隐藏狼人的身份·她肯定可以告诉你更多情况·\n1.如果这儿有狼人的话．我会找出它们·\n2.再见");
                } else if (s.equals("1111") || s.equals("1112")) {
                    jf.dispose();
                }
            }

        });
    }
}
