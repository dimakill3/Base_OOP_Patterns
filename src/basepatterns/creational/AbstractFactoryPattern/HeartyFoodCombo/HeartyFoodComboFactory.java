package basepatterns.creational.AbstractFactoryPattern.HeartyFoodCombo;

import basepatterns.creational.AbstractFactoryPattern.*;

public class HeartyFoodComboFactory implements FoodCombo {
    public HeartyFoodComboFactory() {
    }

    public Salad getSalad() {
        return new Venigret();
    }

    public Soup getSoup() {
        return new Borsh();
    }

    public MainCourse getMainCourse() {
        return new PureeWithCutlet();
    }
}
