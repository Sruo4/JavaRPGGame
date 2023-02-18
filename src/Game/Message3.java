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

public class Message3 {
    public Message3() {
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
        jt2.setText("哈里马尔中尉：喂，你！小心点，这个地方有很多血荆棘教徒\n1.我是来帮忙解救公爵的。");

        jt1.addActionListener(new ActionListener() { // 监听器
            public void actionPerformed(ActionEvent e) {
                String s = jt1.getText();
                if (s.equals("1")) {
                    jt2.setText(
                            "我正好用得上你这样身经百战的战士，那些当地的守卫真是指望不上！公爵现在被血荆棘看押在灯塔顶，我本来想等援军到了再做打算的。你胆子不小，很好，增援到来之后，我们一定要把邪教徒一网打尽，一个都不能溜走。如果你的计划失败了，那我们只好事后去酒馆缅怀你的过往了。\n 1.雄狮卫为什么在这儿？");
                } else if (s.equals("11")) {
                    jt2.setText("我们被派来此处是为了向公爵提供更多保护，组织这样的事情发生。我们没能早点赶到实在是太糟了。本地守卫没有做好对付血荆棘的准备。\n1.再见。");
                } else if (s.equals("111")) {
                    jf.dispose();
                }
            }

        });
    }
}
