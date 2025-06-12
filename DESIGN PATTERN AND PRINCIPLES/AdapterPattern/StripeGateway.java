package AdapterPattern;

class StripeGateway {
    public void stripeCharge(double value) {
        System.out.println("Stripe charged Rs." + value);
    }
}