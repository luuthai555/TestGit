import service.ProductService;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is main class");

        ProductService productService = new ProductService();
        productService.getProductList();
    }
}
