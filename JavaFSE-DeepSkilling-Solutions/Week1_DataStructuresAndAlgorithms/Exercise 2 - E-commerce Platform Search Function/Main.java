import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "TV", "Home")
        };

        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));

        int result1 = SearchService.linearSearch(products, "TV");
        int result2 = SearchService.binarySearch(products, "TV");

        System.out.println("Linear Search Index: " + result1);
        System.out.println("Binary Search Index: " + result2);
    }
}