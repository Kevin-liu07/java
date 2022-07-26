package shiyan8;

import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class testpiano extends Frame implements ActionListener {
    Image img;
    AudioClip ac[]=new AudioClip[7];
    Button btn[]=new Button[17];
    public testpiano(){
        setTitle("钢琴");
        setLocation(200,200);
        setSize(600,300);
        setVisible(true);
        ImageIcon icon=new ImageIcon("D:\\Github-Code\\java\\homework\\src\\shiyan8\\keyBoard.jpg");
        img=icon.getImage();
        for (int i = 0; i < 7; i++) {
            char ch=(char)('a'+i);
            String strfile="D:\\Github-Code\\java\\homework\\src\\shiyan8\\"+ch+"1.wav";
            URL url=null;
            try {
                url = new URL("file:///" + strfile);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            ac[i]=Applet.newAudioClip(url);
        }
        this.setLayout(null);
        Panel p=new Panel();
        p.setBounds(0,100,550,200);
        p.setLayout(new GridLayout(1,17));
        //p.setPreferredSize(new Dimension(400,300));
        add(p);
        for (int i = 0; i < 17; i++) {
            char ch=(char)('a'+i);
            btn[i]=new Button(ch+"");
            p.add(btn[i]);
            int a=(int)(Math.random()*255);
            int b=(int)(Math.random()*255);
            int c=(int)(Math.random()*255);
            btn[i].setBackground(new Color(a,b,c));
            btn[i].addActionListener(this);
        }
    }
    public void paint(Graphics g){
        g.drawImage(img,0,0,this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 17; i++) {
            if(e.getSource()==btn[i]){
                int j=i%7;
                ac[j].play();
                break;
            }
        }
    }

    public static void main(String[] args) {
        new testpiano();
    }
}
