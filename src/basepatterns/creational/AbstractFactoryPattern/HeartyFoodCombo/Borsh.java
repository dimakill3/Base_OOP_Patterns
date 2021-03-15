package basepatterns.creational.AbstractFactoryPattern.HeartyFoodCombo;

import basepatterns.creational.AbstractFactoryPattern.Soup;

public class Borsh implements Soup {
    public Borsh() {
    }

    public void soupPrice() {
        System.out.println("borsh price is 100 rub.");
    }
}