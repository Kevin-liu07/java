package shiyan;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tuiyou extends Frame implements ActionListener {
    TextField t1;
    TextField t2;
    Checkbox cb1,cb2,cb3,cb4;
    int num1=0,num2=0,num3=0,num4=0;
    Label piao1,piao2,piao3,piao4;
    Button b1,b2;
    public tuiyou(){
        this.setTitle("班级推优");
        this.setBackground(Color.lightGray);
        this.setLocation(200,200);
        this.setSize(500,600);
        this.setLayout(new BorderLayout());
        //北面
        Panel pn=new Panel();
        pn.setBackground(Color.green);
        pn.setLayout(new FlowLayout());
        Label l1=new Label("投票人数");
        Label l2=new Label("最大票数");
        t1=new TextField(10);
        t2=new TextField(10);
        pn.add(l1);
        pn.add(t1);
        pn.add(l2);
        pn.add(t2);
        add("North",pn);
        //西
        Panel pw=new Panel();
        add("West",pw);
        pw.setBackground(Color.cyan);
        pw.setLayout(new GridLayout(5,1));
        pw.add(new Label("候选人"));
        cb1=new Checkbox("王同学");
        cb2=new Checkbox("李同学");
        cb3=new Checkbox("刘同学");
        cb4=new Checkbox("魏同学");
        pw.add(cb1);
        pw.add(cb2);
        pw.add(cb3);
        pw.add(cb4);
        //东
        Panel pe=new Panel();
        add("East",pe);
        pe.setBackground(Color.orange);
        pe.setLayout(new GridLayout(5,1));
        pe.add(new Label("票数"));
        piao1=new Label("0 票");
        piao2=new Label("0 票");
        piao3=new Label("0 票");
        piao4=new Label("0 票");
        pe.add(piao1);
        pe.add(piao2);
        pe.add(piao3);
        pe.add(piao4);
        //南
        Panel ps=new Panel();
        add("South",ps);
        ps.setBackground(Color.white);
        ps.setLayout(new FlowLayout());
        b1=new Button("投票");
        b2=new Button("取消");
        ps.add(b1);
        ps.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            if(cb1.getState())num1++;
            if(cb2.getState())num2++;
            if(cb3.getState())num3++;
            if(cb4.getState())num4++;
            piao1.setText(num1+" 票");
            piao2.setText(num2+" 票");
            piao3.setText(num3+" 票");
            piao4.setText(num4+" 票");
            int num=num1+num2+num3+num4;
            t1.setText(num+"");
            int max1=Math.max(num1,num2);
            int max2=Math.max(max1,num3);
            int max3=Math.max(max2,num4);
            t2.setText(max3+"");
            Graphics g=getGraphics();
            g.setColor(Color.red);
            g.fillRect(70,200,num1*20,30);
            g.fillRect(70,300,num2*20,30);
            g.fillRect(70,400,num3*20,30);
            g.fillRect(70,500,num4*20,30);
        }
        else if(e.getSource()==b2){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new tuiyou();
    }
}
