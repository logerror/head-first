package net.welights.headfirst.decorate.startbuzz.condiment;

import net.welights.headfirst.decorate.startbuzz.AbstractBeverage;
import net.welights.headfirst.decorate.startbuzz.AbstractCondimentDecorator;

/**
 * @author Administrator
 */
public class Mocha extends AbstractCondimentDecorator {
    AbstractBeverage beverage;
 
    public Mocha(AbstractBeverage beverage) {
        this.beverage = beverage;
    }
 
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
 
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
