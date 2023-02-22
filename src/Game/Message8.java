package Game;

import java.util.Random;
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

public class Message8 {
    Random random = new Random();// 默认构造方法
    int boss_skill = random.nextInt(0, 3);

    public Message8() {
        System.out.print(boss_skill);
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
        jt2.setText("法奥楚：速速与我决战(猜拳)\n 1.来吧");

        if (Hero.flaga >= 1) {
            jt1.addActionListener(new ActionListener() { // 监听器
                public void actionPerformed(ActionEvent e) {
                    String s = jt1.getText();
                    if (s.equals("1")) {
                        jt2.setText("系统提示：你猜的内容是（石头，剪刀，布）？\n 1.石头 2.剪刀 3.布");
                    } else if (s.equals("11")) {
                        if (boss_skill == 0) {
                            jt2.setText("系统提示：法奥楚出了石头 你赢了（鸡神光环加持下，平局为玩家赢）\n1.确定");
                        } else if (boss_skill == 2) {
                            jt2.setText("系统提示：法奥楚出了布 你输了\n 0.结束游戏");
                        } else if (boss_skill == 1) {
                            jt2.setText("系统提示：法奥楚出了剪刀 你赢了\n1.确定");
                        }
                    } else if (s.equals("12")) {
                        if (boss_skill == 0) {
                            jt2.setText("系统提示：法奥楚出了石头 你输了\n 0.结束游戏");
                        } else if (boss_skill == 2) {
                            jt2.setText("系统提示：法奥楚出了布 你赢了\n1.确定");
                        } else if (boss_skill == 1) {
                            jt2.setText("系统提示：法奥楚出了剪刀 你赢了（鸡神光环加持下，平局为玩家赢）\n1.确定");
                        }
                    } else if (s.equals("13")) {
                        if (boss_skill == 0) {
                            jt2.setText("系统提示：法奥楚出了石头 你赢了\n1.确定");
                        } else if (boss_skill == 2) {
                            jt2.setText("系统提示：法奥楚出了布 你赢了（鸡神光环加持下，平局为玩家赢）\n1.确定");
                        } else if (boss_skill == 1) {
                            jt2.setText("系统提示：法奥楚出了剪刀 你输了\n 0.结束游戏");
                        }
                    } else if (s.equals("110") || s.equals("120") || s.equals("130")) {
                        System.exit(0);
                    } else if (s.equals("111") || s.equals("121") || s.equals("131")) {
                        jt2.setText("法奥楚：傻瓜！你们的公爵受到了海尔辛的诅咒！他会毁掉他所爱的一切！\n1.与格洛丽亚谈谈");
                    } else if (s.equals("1111") || s.equals("1211") || s.equals("1311")) {
                        jf.dispose();
                    }
                }
            });
        } else {
            jt1.addActionListener(new ActionListener() { // 监听器
                public void actionPerformed(ActionEvent e) {
                    String s = jt1.getText();
                    if (s.equals("1")) {
                        jt2.setText("系统提示：你猜的内容是（石头，剪刀，布）？\n 1.石头 2.剪刀 3.布");
                    } else if (s.equals("11")) {
                        if (boss_skill == 0) {
                            jt2.setText("系统提示：法奥楚出了石头 你输了（无光环加持，平局为玩家输）\n 0.结束游戏");
                        } else if (boss_skill == 2) {
                            jt2.setText("系统提示：法奥楚出了布 你输了\n 0.结束游戏");
                        } else if (boss_skill == 1) {
                            jt2.setText("系统提示：法奥楚出了剪刀 你赢了\n1.确定");
                        }
                    } else if (s.equals("12")) {
                        if (boss_skill == 0) {
                            jt2.setText("系统提示：法奥楚出了石头 你输了\n 0.结束游戏");
                        } else if (boss_skill == 2) {
                            jt2.setText("系统提示：法奥楚出了布 你赢了\n1.确定");
                        } else if (boss_skill == 1) {
                            jt2.setText("系统提示：法奥楚出了剪刀 你输了（无光环加持，平局为玩家输）\n 0.结束游戏");
                        }
                    } else if (s.equals("13")) {
                        if (boss_skill == 0) {
                            jt2.setText("系统提示：法奥楚出了石头 你赢了\n1.确定");
                        } else if (boss_skill == 2) {
                            jt2.setText("系统提示：法奥楚出了布 你输了（无光环加持，平局为玩家输）\n 0.结束游戏");
                        } else if (boss_skill == 1) {
                            jt2.setText("系统提示：法奥楚出了剪刀 你输了\n 0.结束游戏");
                        }
                    } else if (s.equals("110") || s.equals("120") || s.equals("130")) {
                        System.exit(0);
                    } else if (s.equals("111") || s.equals("121") || s.equals("131")) {
                        jt2.setText("法奥楚：傻瓜！你们的公爵受到了海尔辛的诅咒！他会毁掉他所爱的一切！\n1.与格洛丽亚谈谈");
                    } else if (s.equals("1111") || s.equals("1211") || s.equals("1311")) {
                        jf.dispose();
                    }
                }
            });
        }

    }
}
