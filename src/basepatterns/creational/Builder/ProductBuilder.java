package basepatterns.creational.Builder;

public abstract class ProductBuilder {
    Product product;

    void createProduct(){
        product = new Product();
    }

    abstract void buildName();
    abstract void buildProductType();
    abstract void buildPrice();

    Product getProduct(){
        return product;
    }
}
