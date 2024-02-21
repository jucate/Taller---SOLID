package co.com.hyunseda.market.service;

import java.util.List;

public interface iProductRepository {
    boolean save(Product newProduct);
    Product findById(Long id);
    Product findByName(String name);
    boolean edit(Long id, Product product);
    boolean delete(Long id);
    public List<Product> findAll();
    List<Product> list();
    List<Product> findProductsByCategoryId(Long id);
}
