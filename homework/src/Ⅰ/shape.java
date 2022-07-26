package Ⅰ;

import java.awt.*;
public abstract class shape{
    int x,y;
    Color c;
    public abstract void area();
    public abstract void draw(Graphics g);
    public shape(){

    }
}
class Square extends shape{
    public int x,y;
    public int a,b;
    public Square(int x,int y,int a,int b){
        this.x=x;
        this.y=y;
        this.a=a;
        this.b=b;
    }
    public void draw(Graphics g){
        g.setColor(Color.black);
        g.drawRect(x,y,a,b);
    }
    public void area(){
        System.out.println(a*b);
    }
}
class Triangle extends shape{
    int x,y,x2,y2,x3,y3;
    int a,b;//底和高
    public Triangle(int x,int y,int x2,int y2,int x3,int y3,int a,int b){
        this.x=x;
        this.x2=x2;
        this.x3=x3;
        this.y=y;
        this.y2=y2;
        this.y3=y3;
        this.a=a;
        this.b=b;
    }
    public void area(){
        System.out.println(a*b/2);
    }
    public void draw(Graphics g){
        g.setColor(Color.blue);
        g.drawLine(x,y,x2,y2);
        g.drawLine(x,y,x3,y3);
        g.drawLine(x3,y3,x2,y2);
    }
}

class Rectangle extends Square{
    public int x,y;
    public int a,b;
    public Rectangle(int x,int y,int a,int b){
        super(x,y,a,b);
        this.x=x;
        this.y=y;
        this.a=a;
        this.b=b;
    }
    public void area(){
        System.out.println(a*b);
    }
    public void draw(Graphics g){
        g.setColor(Color.green);
        g.drawRect(x,y,a,b);
    }
}
class Oval extends shape{
    public int x,y;
    public int r;
    public Oval(int x,int y,int r){
        this.x=x;
        this.y=y;
        this.r=r;
    }
    public void draw(Graphics g){
        g.setColor(Color.yellow);
        g.drawArc(x,y,r,r,0,360);
    }
    public void area(){
        System.out.println(String.format("%.3f",Math.PI*r*r));
    }
}
