package shiyan8;
import java.awt.*;
import java.awt.event.*;
class winclose extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(-1);
    }
}
public class sin extends Frame implements ActionListener,TextListener
{
    Button b1=new Button("绘制图像");
    Label l1=new Label("y=Sin(ax+b∏)");
    Label l2=new Label("请输入a的值(初始为1)：");
    Label l3=new Label("请输入b的值(初始为0)：");
    Label l4=new Label("输入提醒");
    Label l5=new Label("输入提醒");
    TextField t1=new TextField();
    TextField t2=new TextField();
    double a=1,b=0;
    private Canvas c;
    sin()
    {

        this.setSize(1200, 1200);
        this.setTitle("画Sin曲线");
        this.add(l1);
        l1.setBounds(10, 60, 80, 30);
        this.add(l2);
        l2.setBounds(10, 110, 120, 20);
        this.add(t1);
        t1.setBounds(150, 110, 80, 20);
        t1.addTextListener(this);
        this.add(l3);
        l3.setBounds(10, 160, 120, 20);
        this.add(t2);
        t2.setBounds(150, 160, 80, 20);
        t2.addTextListener(this);
        this.add(b1);
        b1.setBounds(30, 200, 100, 40);
        this.add(l4);
        b1.addActionListener(this);
        l4.setBounds(300, 110, 80, 20);
        this.add(l5);
        l5.setBounds(300, 160, 80, 20);

        this.c=new SinCanvas();
        add(c);
        this.setVisible(true);
        winclose  wh=new winclose();
        this.addWindowListener(wh);
    }
    private class SinCanvas extends Canvas
    {

        public void paint(Graphics g)
        {
            super.paint(g);
            g.setColor(Color.BLACK);
            g.drawLine(0, 500, 1200, 500);
            g.drawLine(500, 0, 500, 1200);
            for(int i=0;i<=500;i=i+100)
                g.drawString(String.valueOf((float)((i-500)/250.0))+"∏", i, 495);
            for(int i=500;i<=1000;i=i+100)
                g.drawString(String.valueOf((float)((i-500)/250.0))+"∏", i, 495);
            g.drawString("1",505,200);
            g.drawString("-1",505,800);
            for(int i=0;i<5000;i++)  //画的长一点，改变a，b后可以显示
            {
                double y1,y2,a1,a2,a3;
                a1=i*Math.PI/500;
                a2=(i+1)*Math.PI/500;

                y1=Math.sin(a1*a)*300+500;
                y2=Math.sin(a2*a)*300+500;
                g.drawLine((int)(500+i/2+b*250), (int)y1, (int)(500+(i+1)/2+b*250), (int)y2);//从（500，500）零点往x轴正方向画
                y1=500-Math.sin(a1*a)*300;
                y2=500-Math.sin(a2*a)*300;
                g.drawLine((int)(500-i/2+b*250), (int)y1, (int)(500-(i+1)/2+b*250), (int)y2);//从（500，500）零点往x轴负方向画
            }
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            System.out.println(a);
            System.out.println(b);
            this.c.repaint();
        }
    }
    public void textValueChanged(TextEvent e)
    {
        String a1=this.t1.getText();
        try
        {
            a=Double.parseDouble(a1);
            this.l4.setText("输入数据正常！");
        }
        catch(NumberFormatException ex)
        {
            this.l4.setText("输入数据错误！");
        }
        String b1=this.t2.getText();
        try
        {
            b=Double.parseDouble(b1);
            this.l5.setText("输入数据正常！");
        }
        catch(NumberFormatException ex)
        {
            this.l5.setText("输入数据错误！");
        }

    }
    public static void main(String[] args)
    {
        new sin();
    }
}


