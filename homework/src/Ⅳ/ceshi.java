package Ⅳ;

public class ceshi {
    public static void main(String[] args) {
        Lecturer l=new Lecturer("2020010394","张三",500);
        System.out.println("等级："+l.getGrade());
        System.out.println("奖金："+l.getYearEarn());

        Professor p=new Professor("2020010404","李四",700);
        System.out.println("等级："+p.getGrade());
        System.out.println("奖金："+p.getYearEarn());
    }
}
