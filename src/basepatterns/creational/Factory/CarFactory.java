package basepatterns.creational.Factory;

public class CarFactory implements ProductFactory {
    public CarFactory() {
    }

    public Product CreateProduct() {
        return new Car();
    }
}