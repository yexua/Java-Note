package cn.lollipop.design.mode.decorator;

public class CommonCar implements Car {

    @Override
    public void move() {
        System.out.println("在地上跑");
    }
}
