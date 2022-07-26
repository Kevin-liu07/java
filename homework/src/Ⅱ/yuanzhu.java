package Ⅱ;

public class yuanzhu implements Inter{
    public double r;
    public double h;

    public yuanzhu(double r,double h) {
        this.r = r;
        this.h=h;
    }

    @Override
    public void area() {
        System.out.println("面积为："+String.format("%.2f",2*Math.PI*r*h+Math.PI*r*r*2));
    }

    @Override
    public void v() {
        System.out.println("体积为："+String.format("%.2f",Math.PI*r*r*h));
    }
}
