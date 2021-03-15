package basepatterns.creational.AbstractFactoryPattern.RichFoodCombo;

import basepatterns.creational.AbstractFactoryPattern.Salad;

public class Okroshka implements Salad {
    public Okroshka() {
    }

    public void saladPrice() {
        System.out.println("Okroshka price is 100 rub");
    }
}