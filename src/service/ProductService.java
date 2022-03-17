package service;

import model.Product;
import repo.ProductRepo;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    private ProductRepo productRepo;

    public ProductService() {
        this.productRepo = new ProductRepo();
    }
    public List<Product> getProductList(){
        List<Product> productList = productRepo.getProductList();
        if(productList.isEmpty()){
            System.out.println("Not have any product");
            return null;
        }
        productList.forEach(p-> System.out.println(p.toString()));
        return productList;
    }

    public Product findById(int id){
        if(id == 0){
            System.out.println("Cannot found product with id "+ id );
        }
        return productRepo.findById(id);
    }

    public void deleteById(int id){
        if(id == 0){
            System.out.println("Cannot found product with id "+ id );
            return;
        }
        productRepo.deleteById(id);
    }
    public void saveProduct(Product product){
        productRepo.saveProduct(product);
    }

}
