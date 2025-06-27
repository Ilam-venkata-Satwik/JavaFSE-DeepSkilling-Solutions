package ObserverPatternExample;

public class WebApp implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("WebApp Notification -> " + stockName + ": $" + stockPrice);
    }
}
