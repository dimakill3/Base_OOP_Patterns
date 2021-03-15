package basepatterns.creational.Factory;

public class FactoryPattern {
    public FactoryPattern() {
    }

    public static void main(String[] args) {
        ProductFactory productFactory = createSomeFactory("bike");
        Product product = productFactory.CreateProduct();
        product.Price();
    }

    static ProductFactory createSomeFactory(String name) {
        if (name.equalsIgnoreCase("car")) {
            return new CarFactory();
        } else if (name.equalsIgnoreCase("bike")) {
            return new BikeFactory();
        } else {
            throw new RuntimeException(name + " is unknown product");
        }
    }
}