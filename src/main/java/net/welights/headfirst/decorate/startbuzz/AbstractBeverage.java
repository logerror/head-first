package net.welights.headfirst.decorate.startbuzz;

/**
 * @author Administrator
 */
public abstract class AbstractBeverage {
    String description = "Unknown Beverage";
  
    public String getDescription() {
        return description;
    }
 
    public abstract double cost();
}
