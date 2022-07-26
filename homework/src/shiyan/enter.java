package shiyan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class enter extends Frame implements ActionListener {
    TextField id,name,bir,address;
    TextArea jianli;
    JRadioButton man,woman;
    Checkbox tuan1;
    JComboBox p;
    Button t1,t2;
    public enter(){
        this.setTitle("学生信息录入窗口");
        this.setBackground(Color.lightGray);
        this.setLocation(200,100);
        this.setSize(600,800);
        this.setLayout(null);
        this.setVisible(true);
        Label lid=new Label("学号");
        id=new TextField(10);
        Label lname=new Label("姓名");
        name=new TextField(10);
        Label sex=new Label("性别");
        man=new JRadioButton("男");
        woman=new JRadioButton("女");
        Label lbir=new Label("出生日期");
        bir=new TextField(10);
        Label tuan=new Label("团员否");
        tuan1=new Checkbox();
        Label zhuan =new Label("专业");
        String s[]={"计算机","自动化","人工智能"};
        p=new JComboBox(s);
        Label add=new Label("家庭地址");
        address=new TextField(40);
        Label jian=new Label("简历");
        jianli=new TextArea(20,40);
        t1=new Button("保存");
        t2=new Button("取消");
        t1.addActionListener(this);
        t2.addActionListener(this);
        this.add(lid);
        this.add(lname);
        this.add(sex);
        this.add(lbir);
        this.add(tuan);
        this.add(zhuan);
        this.add(add);
        this.add(jian);
        this.add(id);
        this.add(name);
        this.add(man);
        this.add(woman);
        this.add(bir);
        this.add(tuan1);
        this.add(p);
        this.add(address);
        this.add(jianli);
        this.add(t1);
        this.add(t2);
        lid.setBounds(50,50,40,30);
        id.setBounds(100,50,200,30);
        lname.setBounds(50,100,40,30);
        name.setBounds(100,100,200,30);
        sex.setBounds(50,150,40,30);
        man.setBounds(100,150,40,20);
        woman.setBounds(150,150,40,20);
        lbir.setBounds(50,200,50,30);
        bir.setBounds(110,200,150,30);
        tuan.setBounds(50,250,40,30);
        tuan1.setBounds(100,250,40,30);
        zhuan.setBounds(50,300,40,30);
        p.setBounds(100,300,100,30);
        add.setBounds(50,350,40,30);
        address.setBounds(100,350,400,30);
        jian.setBounds(50,400,40,30);
        jianli.setBounds(100,400,450,300);
        t1.setBounds(200,720,70,40);
        t2.setBounds(350,720,70,40);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==t1){
            jianli.append("学号：\t\t"+id.getText()+"\n\n");
            jianli.append("姓名：\t\t"+name.getText()+"\n\n");
            jianli.append("性别：\t\t"+((man.isSelected())?"男":"女")+"\n\n");
            jianli.append("出生日期：\t"+bir.getText()+"\n\n");
            jianli.append("是否为团员：\t"+((tuan1.getState())?"是":"否")+"\n\n");
            jianli.append("专业：\t\t"+p.getSelectedItem().toString()+"\n\n");
            jianli.append("家庭地址：\t"+address.getText()+"\n\n");
        }
        else{
            System.exit(0);
        }

    }
}
