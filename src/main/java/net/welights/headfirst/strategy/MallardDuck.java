package net.welights.headfirst.strategy;

import net.welights.headfirst.strategy.behaviorimpl.FlyWithWings;
import net.welights.headfirst.strategy.behaviorimpl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("real mallard duck");
    }
}
