package Ⅲ;

public class 出租车 implements 收费,调节温度{
    @Override
    public void pay() {
        System.out.println("出租车已付费");
    }

    @Override
    public void AdjustTemp() {
        System.out.println("出租车温度已调节到正常范围");
    }
}
