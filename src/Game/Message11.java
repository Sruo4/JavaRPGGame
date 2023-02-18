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

public class Message11 {
    // 结局标识
    public static int end = 0;

    public Message11() {
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
        jt2.setText("公爵：对不起，我应该告诉你的，我以为自己能战胜它，看来是我错了。\n1.我们知道你有诅咒");

        jt1.addActionListener(new ActionListener() { // 监听器
            public void actionPerformed(ActionEvent e) {
                String s = jt1.getText();
                if (s.equals("1")) {
                    jt2.setText(
                            "是的，我很明白,我只要一个人情,让我向妻子和女儿道别,\n他们就在里面,只需要一点时间,然后你可以做你必须做的事\n1.当然，我会在这里等你回来.\n2.我不能冒险,但我不会杀了你,格洛丽亚，抓住他。");
                } else if (s.equals("11")) {
                    jt2.setText("公爵夫人：不，你不能那么做！拜托了！谁来救救我！啊！！！！！！\n1.（和格洛丽亚谈话）");
                    end++;
                } else if (s.equals("12")) {
                    jt2.setText("公爵：为什么，为什么你会这么无情，我再也见不到我的家人了。\n1.（和格洛丽亚谈话）");
                } else if (s.equals("121") || s.equals("111")) {
                    jf.dispose();
                }
            }

        });
    }
}
