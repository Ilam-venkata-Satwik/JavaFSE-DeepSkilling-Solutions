public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter();
        paypal.processPayment(100.0);

        PaymentProcessor stripe = new StripeAdapter();
        stripe.processPayment(200.0);
    }
}
