package cn.lollipop.design.mode.strategy;

import lombok.Data;

@Data
public class Duck {

    private QuackBehavior quackBehavior;

    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }
}