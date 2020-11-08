package net.welights.headfirst.strategy.behaviorimpl;

import net.welights.headfirst.strategy.behavior.QuackBehavior;

public class SqueakQuack implements QuackBehavior {
    public void quack() {
        System.out.println("squeak");
    }
}

