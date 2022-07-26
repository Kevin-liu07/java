package shiyan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends Frame implements ActionListener {
    TextField t1;
    JPasswordField t2;
    Button bn1;
    Button bn2;
    public login(){
        this.setTitle("登录窗口");
        this.setBackground(Color.lightGray);
        this.setLocation(300,300);
        this.setSize(300,200);
        this.setLayout(null);
        Label l1=new Label("用户名:");
        Label l2=new Label("密码:");
        t1=new TextField("admin",20);
        t2=new JPasswordField("123",15);
        t2.setEchoChar('*');
        bn1=new Button("确定");
        bn2=new Button("取消");
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        l1.setBounds(70,70,50,30);
        l2.setBounds(70,100,50,30);
        t1.setBounds(120,70,100,20);
        t2.setBounds(120,100,100,20);
        bn1.setBounds(100,150,30,20);
        bn2.setBounds(150,150,30,20);
        this.add(l1);this.add(t1);
        this.add(l2);this.add(t2);
        this.add(bn1);
        this.add(bn2);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bn1){
            if(t1.getText().equals("admin")&& t2.getText().equals("123")){
                new enter();
            }
            else{
                JOptionPane.showMessageDialog(null,"用户名或密码错误","错误",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else
            System.exit(0);
    }

    public static void main(String[] args) {
        new login();
    }
}
