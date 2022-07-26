package shiyan;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class car extends Frame implements ActionListener {
    Button b1,b2,b3,b4;
    int x=475,y=300;
    Panel p;
    public car() {
        this.setTitle("移动小车");
        this.setLocation(500,100);
        this.setSize(1000,800);
        this.setBackground(Color.lightGray);
        this.setLayout(null);
        this.setVisible(true);
        b1=new Button("向上");
        b2=new Button("向左");
        b3=new Button("向右");
        b4=new Button("向下");
        b1.setBounds(500,600,50,50);
        b2.setBounds(450,650,50,50);
        b3.setBounds(550,650,50,50);
        b4.setBounds(500,700,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        p=new Panel(){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.setColor(Color.red);
                g.drawRect(30,30,50,30);
                g.drawOval(30,60,15,15);
                g.drawOval(65,60,15,15);
            }
        };
        this.add(p);
        p.setBounds(x,y,100,100);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            y-=50;
            p.setBounds(x,y,100,100);
        }
        else if(e.getSource()==b2){
            x-=50;
            p.setBounds(x,y,100,100);
        }
        else if(e.getSource()==b3){
            x+=50;
            p.setBounds(x,y,100,100);
        }
        else if(e.getSource()==b4){
            y+=50;
            p.setBounds(x,y,100,100);
        }
    }

    public static void main(String[] args) {
        car c=new car();
        c.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
