package dev.claudioed.domain.risk;

public class AverageAmount {

  public String month;

  public String amount;

  public String currency;

  public AverageAmount() {
  }

  public AverageAmount(String month, String amount, String currency) {
    this.month = month;
    this.amount = amount;
    this.currency = currency;
  }

}
