package net.welights.headfirst.strategy.behaviorimpl;

import net.welights.headfirst.strategy.behavior.FlyBehavior;

public class FlyRockedPowered implements FlyBehavior {

    public void fly() {
        System.out.println("i'm flying with rocket");
    }
}
