package AdapterPattern;

class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter();
        paypal.processPayment(10000.00);

        PaymentProcessor stripe = new StripeAdapter();
        stripe.processPayment(8751.50);
    }
}

