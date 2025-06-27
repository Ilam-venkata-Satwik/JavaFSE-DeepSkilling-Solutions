
package StrategyPatternExample;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.payAmount(250.0);

        context.setPaymentStrategy(new PayPalPayment());
        context.payAmount(450.0);
    }
}
