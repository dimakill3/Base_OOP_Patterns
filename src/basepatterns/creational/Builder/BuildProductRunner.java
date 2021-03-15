package basepatterns.creational.Builder;

public class BuildProductRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new KosherProductBuilder());
        Product product = director.buildProduct();
        System.out.println(product);
    }
}
