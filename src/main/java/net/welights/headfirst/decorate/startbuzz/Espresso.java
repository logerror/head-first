package net.welights.headfirst.decorate.startbuzz;

/**
 * @author Administrator
 */
public class Espresso extends AbstractBeverage {
  
    public Espresso() {
        description = "Espresso";
    }
  
    @Override
    public double cost() {
        return 1.99;
    }
}

