package ObserverPattern;

class WebApp implements Observer {
    public void update(String stockSymbol, double price) {
        System.out.println("[Web App] Stock Updated: " + stockSymbol + " @ Rs." + price);
    }
}