package AdapterPattern;

class PayPalGateway {
    public void makePayment(double amt) {
        System.out.println("Processing PayPal payment of Rs." + amt);
    }
}