package net.welights.headfirst.strategy.behaviorimpl;

import net.welights.headfirst.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("i can't fly");
    }
}
