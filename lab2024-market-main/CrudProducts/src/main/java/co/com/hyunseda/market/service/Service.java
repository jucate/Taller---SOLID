package co.com.hyunseda.market.service;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private iProductRepository repository;
    private iCategory repositoryCategory;

    public Service(iProductRepository repository){
        this.repository = repository;
    }
    public Service(iCategory repository){
        this.repositoryCategory = repository;
    }

    public boolean saveProduct(Product newProduct) {
        return repository.save(newProduct);
    }
    public boolean editProduct(Long productId, Product prod){
        return repository.edit(productId, prod);
    }
    public Product findProductById(Long id){
        return repository.findById(id);
    }
    public boolean deleteProduct(Long id){
        return repository.delete(id);
    }
    public List<Product> listProducts(){
        List<Product> products = new ArrayList<>();
        products = repository.list();
        return products;
    }

    public List<Product> findAllProducts() {
        List<Product> products = new ArrayList<>();
        products = repository.findAll();
        return products;
    }
    public Product findProductByName(String name){
        return repository.findByName(name);
    }
    //cruds category
    public boolean saveCategory(Category newCategory) {
        return repositoryCategory.save(newCategory);
    }
    public boolean editCategory(Long categoryId, Category cat){
        return repositoryCategory.edit(categoryId, cat);
    }
    public Category findCategoryById(Long id){
        return repositoryCategory.findByCategoryId(id);
    }
    public Category findCategoryByName(String name){
        return repositoryCategory.findByName(name);
    }
    public boolean deleteCategory(Long id){
        return repositoryCategory.delete(id);
    }
    public List<Category> listCategorys(){
        List<Category> categorys = new ArrayList<>();
        categorys = repositoryCategory.list();
        return categorys;
    }
    public List<Category> findAllCategorys() {
        List<Category> categorys = new ArrayList<>();
        categorys = repositoryCategory.findAll();
        return categorys;
    }
    public List<Product> findProductsByCategoryById(Long id){
        return repository.findProductsByCategoryId(id);
    }
}
