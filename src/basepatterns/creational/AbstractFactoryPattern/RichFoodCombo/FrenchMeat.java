package basepatterns.creational.AbstractFactoryPattern.RichFoodCombo;

import basepatterns.creational.AbstractFactoryPattern.MainCourse;

public class FrenchMeat implements MainCourse {
    public FrenchMeat() {
    }

    public void mainCoursePrice() {
        System.out.println("French meat price is 200 rub.");
    }
}