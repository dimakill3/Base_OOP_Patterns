package basepatterns.creational.Builder;

public class VeganProductBuilder extends ProductBuilder{
    @Override
    void buildName() {
        product.setName("Веганский продукт");
    }

    @Override
    void buildProductType() {
        product.setProductType(ProductType.VEGAN);
    }

    @Override
    void buildPrice() {
        product.setPrice(300);
    }
}
