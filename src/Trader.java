public class Trader {
    private String name;

    private Account account = new Account(89);

    Trader(String name, Account account){
        this.name = name;
        this.account = account;
    }

    public String toString() {
        return name + " " + account.toString();
    }


    public void addTrade(Trade trade) {
        this.account.setTradeValue(this.account.getTradeValue()+(trade.getPrice()*trade.getQuantity()));
    }
}
