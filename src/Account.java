public class Account{
    private double tradeValue;

    Account(double tradeValue){
        this.tradeValue = tradeValue;
    }
    public  String toString() {
        return String.valueOf(tradeValue);
    }
    public void  setTradeValue(double v) {
        this.tradeValue = v;
    }
    public double getTradeValue() {
        return tradeValue;
    }
}
