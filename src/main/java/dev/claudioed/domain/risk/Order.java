package dev.claudioed.domain.risk;

public class Order {

  public String sellerId;

  public String currency;

  public String amount;

  public Order() {
  }
  public Order(String sellerId, String currency, String amount) {
    this.sellerId = sellerId;
    this.currency = currency;
    this.amount = amount;
  }

}
