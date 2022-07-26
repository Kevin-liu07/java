package Thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JFrame implements ActionListener,Runnable {
    Thread t1,t2,t3;
    JButton bn=new JButton("开始比赛");
    JLabel l1,l2,l3;
    int s1,s2,s3;
    int maxv=0;
    public test(){
        this.maxv=maxv;
        this.setTitle("跑步比赛");
        this.setLocation(400,200);
        this.setSize(1200,600);
        this.setLayout(null);
        this.setVisible(true);
        add(bn);
        bn.setBounds(450,500,100,30);
        bn.addActionListener(this);
        l1=new JLabel(s1+"米");
        l2=new JLabel(s2+"米");
        l3=new JLabel(s3+"米");
        l1.setBounds(1150,70,50,50);
        l2.setBounds(1150,210,50,50);
        l3.setBounds(1150,350,50,50);
        add(l1);
        add(l2);
        add(l3);

    }


    @Override
    public void run() {
        int total=0;
        int v;
        int y;
        if(maxv==20){
            y=130;
            while(total<1000) {
                v = (int) (Math.random() * maxv) + 1;
                total += v;
                Graphics g=getGraphics();
                g.setColor(Color.red);
                try{
                    g.fillRect(50,y,total,50);
                    s1=total;l1.setText(s1+"米");
                    Thread.sleep(100);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }else if(maxv==18){
            y=270;
            while(total<1000) {
                v = (int) (Math.random() * maxv) + 1;
                total += v;
                Graphics g=getGraphics();
                g.setColor(Color.red);
                try{
                    g.fillRect(50,y,total,50);
                    s2=total;l2.setText(s2+"米");
                    Thread.sleep(100);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }else{
            y=420;
            while(total<1000) {
                v = (int) (Math.random() * maxv) + 1;
                total += v;
                Graphics g=getGraphics();
                g.setColor(Color.red);
                try{
                    g.fillRect(50,y,total,50);
                    s3=total;l3.setText(s3+"米");
                    Thread.sleep(100);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bn){

        }
    }
    public static void main(String[] args) {
        new test();
    }
}