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

public class Message{
    public Message(Hero hero){
        JTextField jt1=new JTextField();//new一个文本框
        JTextArea jt2=new JTextArea(); //new一个文本区
        JScrollPane jsp=new JScrollPane(jt2); //new一个滚条
        String title = "Hello";
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
        jt2.setText("海娜：你醒了？我知道被人敲晕抗走的滋味不好受，休息一下，缓过神来再说。\n 1.这是哪里？\n 2.你打扰到我睡觉了，快起开，让我再睡一会儿");
        
        jt1.addActionListener(new ActionListener() { // 监听器
            public void actionPerformed(ActionEvent e) {
                String s = jt1.getText();
                if (s.equals("1")) {
                    jt2.setText("这里是斯凯省的监狱旁的树林\n 1.我怎么会在这里？\n 2.你刚才说我被敲晕了，怎么回事");
                } else if (s.equals("2")) {
                    jt2.setText("懒惰的人想必没什么用处，去死吧\n 1.好吧");
                } else if (s.equals("11") || s.equals("12")) {
                    jt2.setText("据我所知，当时你正在非法穿越国界，被士兵们抓到后却和他们一起被我们国家肆虐的狼人袭击了\n 1.狼人？\n2.这算什么狗血剧情啊喂？");
                }else if(s.equals("112")|| s.equals("122")){
                    jt2.setText("放心，更狗血的还在后面呢！你可以帮我阻止那些杀人不眨眼的家伙吗？\n 1.同意");
                }else if (s.equals("111")||s.equals("121")) {
                    jt2.setText("对，就是那些杀人不眨眼的家伙，你可以帮我阻止他们吗？\n 1.同意");
                } else if (s.equals("1111") || s.equals("1121") || s.equals("1211") || s.equals("1221")) {
                    jt2.setText("奥尔德说狼人已经占领了凯姆洛恩，公爵已经逃走了。\n我没有能力帮到他，但或许你可以，奥尔德的韦勒管家可能知道更多信息，你可以先去找他。\n 1.前往凯姆洛恩 \n2.再见");
                } else if (s.equals("11111") || s.equals("11211") || s.equals("12111") || s.equals("12211")|| s.equals("11112") || s.equals("11212") || s.equals("12112") || s.equals("12212")
                        || s.equals("21")) {
                    jf.dispose();
                }
            }

        });
    }
}

