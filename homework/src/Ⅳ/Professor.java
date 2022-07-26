package Ⅳ;

public class Professor extends Teacher implements Caculateable{
    public Professor(String id,String name,int yearwork){
        this.id=id;
        this.name=name;
        this.yearwork=yearwork;
    }
    @Override
    public int getGrade() {
        if(yearwork<400)return 0;
        else if(yearwork<500)return 1;
        else if(yearwork<800)return 2;
        else return 3;
    }

    @Override
    public int getYearEarn() {
        if (this.getGrade() == 0) return -2000;
        else if (this.getGrade() == 1) return (yearwork - 400) * 70;
        else if (this.getGrade() == 2) return (yearwork - 400) * 90;
        else return (yearwork - 400) * 100;
    }
}
