package Game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GF extends JFrame{
    public void printFrame() {
        this.setLayout(null);
        this.setSize(1600, 950); // 设置窗口大小
        this.setLocationRelativeTo(null); // 把窗口位置设置到屏幕中心
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 关闭窗口模式
        this.setResizable(false); // 窗口固定

        JPanel jp1 = new JPanel();
        jp1.setBounds(0, 0, 1600, 50);

        JButton jb1 = new JButton("地图1");
        JButton jb2 = new JButton("地图2");
        JButton jb3 = new JButton("地图3");
        JButton jb4 = new JButton("地图4");
        JButton jb5 = new JButton("地图5");
        JButton jb6 = new JButton("地图6");
        JButton jb7 = new JButton("地图7");
        JButton jb8 = new JButton("地图8");
        JButton jb9 = new JButton("地图9");
        JButton jb_up = new JButton("上");
        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);
        jp1.add(jb4);
        jp1.add(jb5);
        jp1.add(jb6);
        jp1.add(jb7);
        jp1.add(jb8);
        jp1.add(jb9);
        jp1.add(jb_up);

        JPanel jp2 = new JPanel();
        jp2.setLayout(null);
        jp2.setBackground(Color.GREEN);
        jp2.setBounds(0, 50, 1600, 900);
        this.add(jp1);
        this.add(jp2);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                GP1 tp1 = new GP1();
                tp1.printP();
                jp2.removeAll();
                tp1.setBounds(0, 0, 1600, 900);
                jp2.add(tp1);

                revalidate();
                repaint();
            }
        });
        jb2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                GP2 tp1 = new GP2();
                tp1.printP();
                jp2.removeAll();
                tp1.setBounds(0, 0, 1600, 900);
                jp2.add(tp1);

                revalidate();
                repaint();
            }
        });

        jb_up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("left");
                Player.right = true;
            }
        });

        this.setVisible(true);
    }
}
