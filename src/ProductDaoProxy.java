public class ProductDaoProxy implements ProductDao{

    private final ProductDao productDao;

    public ProductDaoProxy(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Product findById(Long id) {
        System.out.println("Logic of proxy before find ...");
        Product p = this.productDao.findById(id);
        System.out.println("Logic of proxy after find ...");
        return p;
    }

    @Override
    public Product save(Product product) {
        System.out.println("Logic of proxy before save ...");
        Product p = this.productDao.save(product);
        System.out.println("Logic of proxy after save ...");
        return p;
    }
}
