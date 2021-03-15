package basepatterns.creational.Builder;

public class Product {
    private String name;
    private ProductType productType;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setProductType(ProductType foodType) {
        this.productType = foodType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", foodType=" + productType +
                ", price=" + price +
                '}';
    }
}
