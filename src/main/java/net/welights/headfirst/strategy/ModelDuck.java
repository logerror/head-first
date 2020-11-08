package net.welights.headfirst.strategy;

import net.welights.headfirst.strategy.behaviorimpl.FlyNoWay;
import net.welights.headfirst.strategy.behaviorimpl.FlyWithWings;
import net.welights.headfirst.strategy.behaviorimpl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("real model duck");
    }
}
