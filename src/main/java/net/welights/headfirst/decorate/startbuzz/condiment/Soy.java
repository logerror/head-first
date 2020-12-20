package net.welights.headfirst.decorate.startbuzz.condiment;

import net.welights.headfirst.decorate.startbuzz.AbstractBeverage;
import net.welights.headfirst.decorate.startbuzz.AbstractCondimentDecorator;

public class Soy extends AbstractCondimentDecorator {
    AbstractBeverage beverage;

    public Soy(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
