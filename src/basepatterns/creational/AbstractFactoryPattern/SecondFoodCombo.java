package basepatterns.creational.AbstractFactoryPattern;

import basepatterns.creational.AbstractFactoryPattern.RichFoodCombo.RichFoodComboFactory;

public class SecondFoodCombo {
    public SecondFoodCombo() {
    }

    public static void main(String[] args) {
        FoodCombo foodCombo = new RichFoodComboFactory();
        Salad salad = foodCombo.getSalad();
        Soup soup = foodCombo.getSoup();
        MainCourse mainCourse = foodCombo.getMainCourse();
        salad.saladPrice();
        soup.soupPrice();
        mainCourse.mainCoursePrice();
    }
}