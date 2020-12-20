package net.welights.headfirst.decorate.startbuzz.condiment;

import net.welights.headfirst.decorate.startbuzz.AbstractBeverage;
import net.welights.headfirst.decorate.startbuzz.AbstractCondimentDecorator;

public class Whip extends AbstractCondimentDecorator {
    AbstractBeverage beverage;
 
    public Whip(AbstractBeverage beverage) {
        this.beverage = beverage;
    }
 
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
 
    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
