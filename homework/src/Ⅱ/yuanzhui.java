package Ⅱ;

public class yuanzhui implements Inter {
    public double r;
    public double l;
    public double h;

    public yuanzhui(double r, double h,double l) {
        this.r = r;
        this.h=h;
        this.l = l;
    }

    @Override
    public void v() {
        System.out.println("体积为：" + String.format("%.2f",Math.PI * r * r * h / 3));
    }

    @Override
    public void area() {
        double s=Math.PI*r*r+Math.PI*r*l;
        System.out.println("面积为："+String.format("%.2f",s));
    }
}
