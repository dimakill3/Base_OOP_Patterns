package basepatterns.creational.AbstractFactoryPattern;

import basepatterns.creational.AbstractFactoryPattern.HeartyFoodCombo.HeartyFoodComboFactory;

public class FirstFoodCombo {
    public FirstFoodCombo() {
    }

    public static void main(String[] args) {
        FoodCombo foodCombo = new HeartyFoodComboFactory();
        Salad salad = foodCombo.getSalad();
        Soup soup = foodCombo.getSoup();
        MainCourse mainCourse = foodCombo.getMainCourse();
        salad.saladPrice();
        soup.soupPrice();
        mainCourse.mainCoursePrice();
    }
}