package shiyan8;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
public class applet extends Applet {
    Image img;
    AudioClip audio;
    public void init(){
        img=this.getImage(this.getCodeBase(),"keyBoard.jpg");
        audio=this.getAudioClip(this.getCodeBase(),"a1s.wav");
    }
    public void start(){
        audio.play();
    }
    public void paint(Graphics g){
        g.drawImage(img,0,0,this);
    }
}
