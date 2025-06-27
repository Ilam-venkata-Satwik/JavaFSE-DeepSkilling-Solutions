 class Main {
    public static void main(String[] args) {
        InventorySystem system = new InventorySystem();

        Product p1 = new Product(101, "Mouse", 50, 499.99);
        Product p2 = new Product(102, "Keyboard", 30, 899.49);

        system.addProduct(p1);
        system.addProduct(p2);
        system.updateProduct(101, 70);
        system.displayAll();
        system.deleteProduct(102);
        system.displayAll();
    }
}