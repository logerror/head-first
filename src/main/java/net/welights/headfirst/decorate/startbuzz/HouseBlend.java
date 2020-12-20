package net.welights.headfirst.decorate.startbuzz;

/**
 * @author Administrator
 */
public class HouseBlend extends AbstractBeverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }
 
    @Override
    public double cost() {
        return 0.89;
    }
}

