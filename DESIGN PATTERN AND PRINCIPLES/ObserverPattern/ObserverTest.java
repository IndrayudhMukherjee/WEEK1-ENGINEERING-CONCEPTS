package ObserverPattern;

class ObserverTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        market.setStock("TATAPOWER", 400.75);
        market.setStock("RELIANCE", 1439.20);
    }
}
