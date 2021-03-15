package basepatterns.creational.AbstractFactoryPattern.RichFoodCombo;

import basepatterns.creational.AbstractFactoryPattern.Soup;

public class Hodgepodge implements Soup {
    public Hodgepodge() {
    }

    public void soupPrice() {
        System.out.println("Hodgepodge price is 200 rub.");
    }
}