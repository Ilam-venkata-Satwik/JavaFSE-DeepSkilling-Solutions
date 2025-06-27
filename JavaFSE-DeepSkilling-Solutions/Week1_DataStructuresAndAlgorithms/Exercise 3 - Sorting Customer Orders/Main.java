 class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 1200.50),
            new Order(2, "Bob", 700.75),
            new Order(3, "Charlie", 950.00)
        };

        QuickSort.sort(orders, 0, orders.length - 1);

        for (Order o : orders)
            System.out.println(o.orderId + " - " + o.customerName + " - $" + o.totalPrice);
    }
}