package basepatterns.creational.AbstractFactoryPattern.RichFoodCombo;

import basepatterns.creational.AbstractFactoryPattern.FoodCombo;
import basepatterns.creational.AbstractFactoryPattern.MainCourse;
import basepatterns.creational.AbstractFactoryPattern.Salad;
import basepatterns.creational.AbstractFactoryPattern.Soup;

public class RichFoodComboFactory implements FoodCombo {
    public RichFoodComboFactory() {
    }

    public Salad getSalad() {
        return new Okroshka();
    }

    public Soup getSoup() {
        return new Hodgepodge();
    }

    public MainCourse getMainCourse() {
        return new FrenchMeat();
    }
}