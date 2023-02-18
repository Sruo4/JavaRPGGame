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

public class Message2{
    public Message2(){
        JTextField jt1=new JTextField();//new一个文本框
        JTextArea jt2=new JTextArea(); //new一个文本区
        JScrollPane jsp=new JScrollPane(jt2); //new一个滚条
        String title = "地图2";
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
        jt2.setText("韦勒管家：我们和凯姆洛恩的塞巴斯蒂安公爵......出了点......小状况。也许你愿意帮忙把公爵从危险中营救出来。\n1. 发生了什么？");
        
        jt1.addActionListener(new ActionListener() { // 监听器
            public void actionPerformed(ActionEvent e) {
                String s = jt1.getText();
                if (s.equals("1")) {
                    jt2.setText("我们笨手笨脚的城镇守卫玩忽职守，导致公爵被绑架了，这就是事情的真相，你看起来很有本事，以你的能力肯定能帮助我们，求你了。\n 1. 谁绑架了公爵？");
                } else if (s.equals("11")) {
                    jt2.setText("该死的血荆棘教徒！凯姆洛恩陷入一片混乱，公爵也遭人绑架，这帮邪教徒到底想做什么？还好雄狮卫及时赶到，如果你愿意帮忙，请去和哈里马尔中尉谈谈。\n1.哈里马尔中尉在哪");
                }else if(s.equals("111")){
                    jt2.setText("哈里马尔中尉去灯塔里侦察了，也继续血荆棘藏匿公爵的地点就在那里。\n1.再见");
                }else if (s.equals("1111")) {
                    jf.dispose();
                }
            }

        });
    }
}

