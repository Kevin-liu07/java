package test;

public class extend {
    public static void main(String[] args) {
        son son1=new son("lkw",18,3331);
    }
}
class extendss {
    public int age;
    public String name;

    public extendss(String name, int age){
        this.age=age;
        this.name=name;
        System.out.println("父类被调用");
    }
}
class son extends extendss{
    public double salary;

    public son(String name, int age, double salary){
        super(name,age);
        this.salary=salary;
        System.out.println("子类被调用");
    }
}