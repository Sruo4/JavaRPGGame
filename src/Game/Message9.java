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

public class Message9{
    public Message9(){
        JTextField jt1=new JTextField();//new一个文本框
        JTextArea jt2=new JTextArea(); //new一个文本区
        JScrollPane jsp=new JScrollPane(jt2); //new一个滚条
        String title = "地图5";
        JFrame jf=new JFrame(title);
        Container container=jf.getContentPane();
        container.setBackground(Color.yellow); //容器的背景色
        jf.setVisible(true); //窗体可见
        jf.setSize(600, 400);//窗体大小
        jf.setLayout(new BorderLayout()); //边界布局
        jf.add(BorderLayout.NORTH,jt1);//文本框边界顶部放置
        jt1.setBackground(Color.yellow);
        jf.add(BorderLayout.CENTER,jt2);//文本框边界中间放置
        jt2.setBackground(Color.gray);

        // NPC1对话
        jt2.setText("格洛丽亚：公爵被感染了吗？我正担心这一点，不过我希望我错了，我一直在盯着他，以防发生什么变化。\n1.我们得做点什么。");
        
        jt1.addActionListener(new ActionListener() { // 监听器
            public void actionPerformed(ActionEvent e) {
                String s = jt1.getText();
                if (s.equals("1")) {
                    jt2.setText("法奥楚一直在阻挡我的路，这个失败落在了我的脑海里，但我们现在可以解决这个问題了，我得死，你需要拿走我的血。1.什么？");
                }else if (s.equals("11")) {
                    jt2.setText("我们在浪费时间！我需要死，这样你就能拿走我的血。如果时间持续，主人的血就能治愈他的生物，你知道我是法奥楚的后代，如果公爵喝了我的血，他就会治愈诅咒。\n1.凯姆洛恩需要要公爵，对不起格洛丽亚，但你得死。\n2.不，不是这样的，我们需要你活着，我会处理公爵的。希望你的态度不会让其他人遭到不幸。不过我想我还是会活下来的，趁还来得及，赶紧走吧，我会在公爵家和你碰头。");
                }else if (s.equals("111")||s.equals("1121")) {
                    jf.dispose();
                }else if (s.equals("112")) {
                    jt2.setText("1.再见");
                }
            }

        });
    }
}

