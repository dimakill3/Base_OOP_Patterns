package basepatterns.creational.Singleton;

public class Hero {
    private static Hero hero;
    private static String name;

    private Hero() {
    }

    public static synchronized Hero getHero() {
        if (hero == null) {
            hero = new Hero();
            name = "Arthur";
        }

        return hero;
    }

    public void getName() {
        System.out.println("Hero's name is " + name);
    }
}