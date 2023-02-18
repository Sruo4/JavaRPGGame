package Game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GF extends JFrame {
    // 地图匹配标志
    public static int mapId = 1;

    public GF() {
        setLayout(null);
        this.setSize(1600, 1600); // 设置窗口大小
        this.setLocationRelativeTo(null); // 把窗口位置设置到屏幕中心
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 关闭窗口模式
        this.setResizable(false); // 窗口固定
    }

    public void printFrame() {
        Timer timer = new Timer();
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
        JButton jb_down = new JButton("下");
        JButton jb_left = new JButton("左");
        JButton jb_right = new JButton("右");
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
        jp1.add(jb_down);
        jp1.add(jb_left);
        jp1.add(jb_right);

        JPanel jp2 = new JPanel();
        jp2.setLayout(null);
        jp2.setBackground(Color.GREEN);
        jp2.setBounds(0, 50, 1600, 900);
        this.add(jp1);
        this.add(jp2);

        // 绘制地图1
        GP1 tp1 = new GP1();
        tp1.printP();
        jp2.removeAll();
        tp1.setBounds(0, 0, 1600, 900);
        jp2.add(tp1);
        revalidate();
        repaint();

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                GP1 tp1 = new GP1();
                mapId = 1;
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
                mapId = 2;
                tp1.printP();
                jp2.removeAll();
                tp1.setBounds(0, 0, 1600, 900);
                jp2.add(tp1);

                revalidate();
                repaint();
            }
        });

        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                GP3 tp1 = new GP3();
                mapId = 3;
                tp1.printP();
                jp2.removeAll();
                tp1.setBounds(0, 0, 1600, 900);
                jp2.add(tp1);

                revalidate();
                repaint();
            }
        });

        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                GP4 tp1 = new GP4();
                mapId = 4;
                tp1.printP();
                jp2.removeAll();
                tp1.setBounds(0, 0, 1600, 900);
                jp2.add(tp1);

                revalidate();
                repaint();
            }
        });

        jb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                GP5 tp1 = new GP5();
                mapId = 5;
                tp1.printP();
                jp2.removeAll();
                tp1.setBounds(0, 0, 1600, 900);
                jp2.add(tp1);

                revalidate();
                repaint();
            }
        });

        jb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                GP6 tp1 = new GP6();
                mapId = 6;
                tp1.printP();
                jp2.removeAll();
                tp1.setBounds(0, 0, 1600, 900);
                jp2.add(tp1);

                revalidate();
                repaint();
            }
        });

        jb7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                GP7 tp1 = new GP7();
                mapId = 7;
                tp1.printP();
                jp2.removeAll();
                tp1.setBounds(0, 0, 1600, 900);
                jp2.add(tp1);

                revalidate();
                repaint();
            }
        });

        jb8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                GP8 tp1 = new GP8();
                mapId = 8;
                tp1.printP();
                jp2.removeAll();
                tp1.setBounds(0, 0, 1600, 900);
                jp2.add(tp1);

                revalidate();
                repaint();
            }
        });

        jb9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                GP9 tp1 = new GP9();
                mapId = 9;
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
                System.out.print("up");
                Player.up = true;
                timer.schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        Player.up = false;
                    }
                }, 500);
            }
        });

        jb_down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("down");
                Player.down = true;
                timer.schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        Player.down = false;
                    }
                }, 500);
            }
        });

        jb_left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("left");
                Player.left = true;
                timer.schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        Player.left = false;
                    }
                }, 500);
            }
        });

        jb_right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("right");
                Player.right = true;
                timer.schedule(new java.util.TimerTask() {
                    @Override
                    public void run() {
                        Player.right = false;
                    }
                }, 500);
            }
        });

        this.setVisible(true);
    }
}
