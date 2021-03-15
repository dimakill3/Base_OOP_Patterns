package basepatterns.creational.Factory;

public class BikeFactory implements ProductFactory {
    public BikeFactory() {
    }

    public Product CreateProduct() {
        return new Bike();
    }
}