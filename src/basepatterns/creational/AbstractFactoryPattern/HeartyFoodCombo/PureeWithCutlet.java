package basepatterns.creational.AbstractFactoryPattern.HeartyFoodCombo;

import basepatterns.creational.AbstractFactoryPattern.MainCourse;

public class PureeWithCutlet implements MainCourse {
    public PureeWithCutlet() {
    }

    public void mainCoursePrice() {
        System.out.println("Puree with cutlet price is 150 rub.");
    }
}