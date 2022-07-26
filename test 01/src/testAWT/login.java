package testAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class logins implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("successful");
    }
}
class logouts implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}

public class login extends Frame {
    public login() {
        this.setTitle("登录程序");
        this.setLocation(300, 300);
        this.setSize(300, 200);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        Label l1 = new Label("user");
        this.add(l1);
        TextField tx = new TextField(20);
        this.add(tx);
        Label l2 = new Label("password");
        this.add(l2);
        TextField tx2 = new TextField(20);
        this.add(tx2);
        Button b1 = new Button("log in");
        b1.addActionListener(new logins());
        this.add(b1);
        Button b2 = new Button("log out");
        b2.addActionListener(new logouts());
        this.add(b2);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new login();

    }

}
