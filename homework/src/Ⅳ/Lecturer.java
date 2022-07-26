package Ⅳ;

public class Lecturer extends Teacher implements Caculateable {
    public Lecturer(String id,String name,int yearwork){
        this.id=id;
        this.name=name;
        this.yearwork=yearwork;
    }
    @Override
    public int getGrade() {
        if (yearwork < 300) return 0;
        else if (yearwork < 400) return 1;
        else if (yearwork < 600) return 2;
        else return 3;
    }

    @Override
    public int getYearEarn() {
        if (this.getGrade() == 0) return -1000;
        else if (this.getGrade() == 1) return (yearwork - 300) * 50;
        else if (this.getGrade() == 2) return (yearwork - 300) * 70;
        else return (yearwork - 300) * 90;
    }
}
