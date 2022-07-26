package Thread;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class time1 implements Runnable {
    public void run() {
        int h = 0, m = 0, s = 0;
        for (h = 0; h < 12; h++) {
            for (m = 0; m < 60; m++) {
                for (s = 0; s < 60; s++) {
                    try {
                        if (phone.canshu1 == true) {
                            phone.t1.setText(h + ":" + m + ":" + s);
                            Thread.sleep(1000);

                        } else {
                            return;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //每隔一秒休眠
                }
            }
        }

    }
}//线程1
class time2 implements Runnable {
    public void run() {
        int h = 0, m = 0, s = 0;
        for (h = 0; h < 12; h++) {
            for (m = 0; m < 60; m++) {
                for (s = 0; s < 60; s++) {
                    try {
                        if (phone.canshu2== true) {
                            phone.t2.setText(h + ":" + m + ":" + s);
                            Thread.sleep(1000);

                        } else {
                            return;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //每隔一秒休眠
                }
            }
        }

    }
}//线程2
class time3 implements Runnable {
    public void run() {
        int h = 0, m = 0, s = 0;
        for (h = 0; h < 12; h++) {
            for (m = 0; m < 60; m++) {
                for (s = 0; s < 60; s++) {
                    try {
                        if (phone.canshu3 == true) {
                            phone.t3.setText(h + ":" + m + ":" + s);
                            Thread.sleep(1000);

                        } else {
                            return;
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //每隔一秒休眠
                }
            }
        }

    }
}//线程3


class Caozuo1 implements ActionListener {
    JTextField xianshi;
    JButton queren;

    public void setJButton(JButton queren) {
        this.queren = queren;
    }
    public void setJTextFiled(JTextField xianshi) {
        this.xianshi = xianshi;
    }

    public void actionPerformed(ActionEvent e) {
        if (phone.canshu1== true) {
            phone.canshu1 = false;
            queren.setText("开始打电话");
        } else {
            phone.canshu1 = true;
            queren.setText("停止打电话");
        }

        time1 d = new time1();
        Thread t1 = new Thread(d);
        t1.start();


    }


}
class Caozuo2 implements ActionListener {
    JTextField xianshi;
    JButton queren;

    public void setJButton(JButton queren) {
        this.queren = queren;
    }
    public void setJTextFiled(JTextField xianshi) {
        this.xianshi = xianshi;
    }

    public void actionPerformed(ActionEvent e) {
        if (phone.canshu2== true) {
            phone.canshu2 = false;
            queren.setText("开始打电话");
        } else {
            phone.canshu2 = true;
            queren.setText("停止打电话");
        }

        time2 d = new time2();
        Thread t2 = new Thread(d);
        t2.start();


    }


}
class Caozuo3 implements ActionListener {
    JTextField xianshi;
    JButton queren;

    public void setJButton(JButton queren) {
        this.queren = queren;
    }
    public void setJTextFiled(JTextField xianshi) {
        this.xianshi = xianshi;
    }

    public void actionPerformed(ActionEvent e) {
        if (phone.canshu3== true) {
            phone.canshu3 = false;
            queren.setText("开始打电话");
        } else {
            phone.canshu3 = true;
            queren.setText("停止打电话");
        }

        time3 d = new time3();
        Thread t3 = new Thread(d);
        t3.start();


    }


}

public class phone extends JFrame {
    public static boolean canshu1 = false;
    public static boolean canshu2 = false;
    public static boolean canshu3 = false;
    public static JTextField t1 = new JTextField(8);
    public static JTextField t2 = new JTextField(8);
    public static JTextField t3 = new JTextField(8);

    public phone() {
        super("打电话模拟程序");
        this.setBounds(200, 200, 500, 500);
        this.setVisible(true);
        this.setLayout(new GridLayout(3, 1));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JButton b1 = new JButton("开始打电话");
        JButton b2 = new JButton("开始打电话");
        JButton b3 = new JButton("开始打电话");

        p1.add(t1);
        p2.add(t2);
        p3.add(t3);
        p1.add(b1);
        p2.add(b2);
        p3.add(b3);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        //页面布局//
        Caozuo1 caoZuo1 = new Caozuo1();
        caoZuo1.setJTextFiled(t1);
        caoZuo1.setJButton(b1);
        b1.addActionListener(caoZuo1);

        Caozuo2 caoZuo2 = new Caozuo2();
        caoZuo2.setJTextFiled(t2);
        caoZuo2.setJButton(b2);
        b2.addActionListener(caoZuo2);

        Caozuo3 caoZuo3 = new Caozuo3();
        caoZuo3.setJTextFiled(t3);
        caoZuo3.setJButton(b3);
        b3.addActionListener(caoZuo3);
    }

    public static void main(String[] args) {
        phone p = new phone();
    }
}