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

public class Message4 {
    public Message4() {
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
        jt2.setText("公爵：赞美诸神，你终于来了，谢谢你，朋友，但我不是邪教徒唯一的囚犯。\n1.血荆棘还绑架了谁？");

        jt1.addActionListener(new ActionListener() { // 监听器
            public void actionPerformed(ActionEvent e) {
                String s = jt1.getText();
                if (s.equals("1")) {
                    jt2.setText("我听到了邪教徒说的话，他们有一个囚犯，\n是狼人首領法奥楚的威胁，他们计划处决她。\n如果她真的是个威胁，那我们一定要救她·\n1. 好吧，我会去的(去地图四)。");
                } else if (s.equals("11")) {
                    jf.dispose();
                }
            }

        });
    }
}
