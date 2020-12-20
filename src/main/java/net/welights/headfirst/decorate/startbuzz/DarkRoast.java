package net.welights.headfirst.decorate.startbuzz;

public class DarkRoast extends AbstractBeverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
 
    @Override
    public double cost() {
        return 0.99;
    }
}

