package basepatterns.creational.Builder;

public class KosherProductBuilder extends ProductBuilder{
    @Override
    void buildName() {
        product.setName("Кошерный продукт");
    }

    @Override
    void buildProductType() {
        product.setProductType(ProductType.KOSHER);
    }

    @Override
    void buildPrice() {
        product.setPrice(500);
    }
}
