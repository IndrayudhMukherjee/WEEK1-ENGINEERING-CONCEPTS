package ObserverPattern;

import java.util.*;
class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockSymbol;
    private double price;

    public void setStock(String stockSymbol, double price) {
        this.stockSymbol = stockSymbol;
        this.price = price;
        notifyObservers();
    }

    public void register(Observer o) {
        observers.add(o);
    }

    public void deregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockSymbol, price);
        }
    }
}
