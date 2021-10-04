import java.util.Scanner;

public class Trade {
    private String id, symbol;
    private int quantity;
    private double price;

    public String toString() {
        return id + ", " + symbol + ", " + quantity + ", " + price;
    }

    Trade(String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }


    public void setPrice(double price) throws IllegalArgumentException {
        if (price < 0) {
            this.price = 38.00;
            throw new IllegalArgumentException("W'agyimi dodo, Default price set to 38.0");

        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public static <e> void main(String[] args) {

       Trade trade = new Trade("TCL4", "AAPL", 3);
        try {
            trade.setPrice(9);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Trader trader = new Trader("Keziah", new Account(6));
        trader.addTrade(trade);

        System.out.println(trader.toString());
    }


}
