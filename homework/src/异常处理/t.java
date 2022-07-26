package 异常处理;

import javax.swing.*;

public class t {
    public static void main(String[] args) {
        double t;
        double f=-1;
        f=method();
        while(f<0){
            JOptionPane.showMessageDialog(null,"重新输入数据");
            f=method();
        }
        t=(5.0/9.0)*(f-32);
        JOptionPane.showMessageDialog(null,String.format("%.2fC",t));
    }
    public static double method(){
        String s= JOptionPane.showInputDialog("输入华氏度温度");
        double f=-1;
        try{
            f=Double.parseDouble(s);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"格式异常");
            f=-1;
        }
        return f;
    }
}
