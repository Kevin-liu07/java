package Thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rungame extends JFrame implements ActionListener {
    public JButton bn = new JButton("开始比赛");
    public rungame() {
        this.setTitle("跑步比赛");
        this.setLocation(400, 200);
        this.setSize(1200, 600);
        this.setLayout(null);
        this.setVisible(true);
        add(bn);
        bn.setBounds(550, 500, 100, 30);
        bn.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bn) {
            gamestart gm1 = new gamestart(10, 80, 20);
            gamestart gm2 = new gamestart(10, 220, 18);
            gamestart gm3 = new gamestart(10, 360, 16);
            this.add(gm1);
            this.add(gm2);
            this.add(gm3);
            new Thread(gm1).start();
            new Thread(gm2).start();
            new Thread(gm3).start();
        }
    }

    public static void main(String[] args) {
        new rungame();
    }
}

class gamestart extends Panel implements Runnable {
    int v=0, maxv;
    int total = 0;
    JLabel l;
    public gamestart(int x, int y, int maxv) {
        this.maxv = maxv;
        this.setBounds(x, y, 1200, 120);
        l=new JLabel(total+"米");
        l.setBounds(1050,0,50,50);
        add(l);
        this.setVisible(true);
    }

    @Override
    public void run() {
        int cnt=0;
        Graphics g = getGraphics();
        g.setColor(Color.red);
        while (total < 1000) {
            if(cnt>5){
                v = (int) (Math.random() * maxv) + 1;
                cnt=0;
            }
            cnt++;
            total += v;
            try {
                g.fillRect(0, 50, total, 50);
                l.setText(total+"米");
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
