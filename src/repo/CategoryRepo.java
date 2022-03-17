package repo;

import model.Category;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CategoryRepo {
    static List<Category> categoryList = new ArrayList<>();
    static {
        categoryList.add(new Category(1,"Iphone"));
        categoryList.add(new Category(2,"Samsung"));
    }

    public List<Category> getProductList(){
        return categoryList;
    }

    public Category findById(int id){
        return categoryList.stream().filter(s-> s.getId() == id).findFirst().get();
    }

    public void deleteById(int id){
        categoryList = categoryList.stream().filter(s-> s.getId()!=id).collect(Collectors.toList());
    }

    public void saveProduct(Category category){
        categoryList.add(category);
    }
}
