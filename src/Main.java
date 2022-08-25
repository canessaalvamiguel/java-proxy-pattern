public class Main {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDaoImpl();
        ProductDao productDaoProxy = new ProductDaoProxy(productDao);

        productDaoProxy.findById(2L);

        System.out.println("\n \n");

        productDaoProxy.save(new Product(3L, "Product Name"));
    }
}
