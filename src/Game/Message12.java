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

public class Message12 {
    public Message12() {
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
        if (Message11.end == 1) {
            jt2.setText("格洛丽亚:我说什么？你会为你的态度付出代价。 \n1.完成(游戏结束)。");
            jt1.addActionListener(new ActionListener() { // 监听器
                public void actionPerformed(ActionEvent e) {
                    String s = jt1.getText();
                    if (s.equals("1")) {
                        System.exit(0);
                    }
                }

            });
        } else {
            jt2.setText("这有点出乎意料，你怎么改主意了？\n1.我们不能杀死公爵，凯姆洛恩需要他");
            jt1.addActionListener(new ActionListener() { // 监听器
                public void actionPerformed(ActionEvent e) {
                    String s = jt1.getText();
                    if (s.equals("1")) {
                        jt2.setText("你真的是个老软蛋·通常情况下，我绝不会词养狼人当宠物·\n但这次事件中，或许你是对的·如果我们能治愈公爵，肯定比杀了他要好  \n1.完成(游戏结束)。");
                    } else if (s.equals("11")) {
                        System.exit(0);
                    }
                }
            });
        }
    }
}
