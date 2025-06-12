package ObserverPattern;

class MobileApp implements Observer {
    public void update(String stockSymbol, double price) {
        System.out.println("[Mobile App] Stock Updated: " + stockSymbol + " @ Rs." + price);
    }
}
