package cn.lollipop.design.principle.singleresponsibility.classlevel;

public class FlyBird {
    private String name;

    public FlyBird(String name) {
        this.name = name;
    }

    public void moveMode() {
        System.out.println("在天上飞");
    }
}
