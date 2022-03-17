package repo;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRepo {
    static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"Iphone 11",76.1));
        productList.add(new Product(2,"Samsung S8",100.1));
        productList.add(new Product(3,"Vivo 3",65.1));
        productList.add(new Product(4,"Huewei Mate",44.1));
        productList.add(new Product(5,"Vinsmart I",65.1));
        productList.add(new Product(6,"Oppo X",12.1));
    }

    public List<Product> getProductList(){
        return productList;
    }

    public Product findById(int id){
        return productList.stream().filter(s-> s.getId() == id).findFirst().get();
    }

    public void deleteById(int id){
        productList = productList.stream().filter(s-> s.getId()!=id).collect(Collectors.toList());
    }

    public void saveProduct(Product product){
        productList.add(product);
    }
}
