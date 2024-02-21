package co.com.hyunseda.market.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    @Test
    void save() {
        iProductRepository repository = Factory.getInstance().getRepository("default");
        Service service = new Service(repository);
        Category newCategory = new Category((long)1,"Fruta");
        Product newProduct = new Product();
        newProduct.setName("Pera");
        newProduct.setProductId((long)1);
        newProduct.setCategoryId((long)1);
        assertTrue(service.saveProduct(newProduct));
    }

    @Test
    void list() {
    }

    @Test
    void findAll() {
    }

    @Test
    void edit() {
    }

    @Test
    void delete() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByName() {
    }

    @Test
    void findProductsByCategoryId() {
    }
}