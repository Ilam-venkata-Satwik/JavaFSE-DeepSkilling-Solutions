import java.util.HashMap;

public class InventorySystem {
    HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    public void updateProduct(int id, int qty) {
        if (inventory.containsKey(id)) {
            inventory.get(id).quantity = qty;
        }
    }

    public void deleteProduct(int id) {
        inventory.remove(id);
    }

    public void displayAll() {
        for (Product p : inventory.values()) {
            System.out.println(p.productId + " - " + p.productName + " - Qty: " + p.quantity);
        }
    }
}