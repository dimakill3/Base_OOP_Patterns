package basepatterns.creational.Builder;

public class Director {
    ProductBuilder builder;

    public void setBuilder(ProductBuilder builder){
        this.builder = builder;
    }

    Product buildProduct(){
        builder.createProduct();
        builder.buildName();
        builder.buildProductType();
        builder.buildPrice();
        return  builder.getProduct();
    }
}
