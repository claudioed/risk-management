package dev.claudioed.domain.risk;

public class CheckoutData {

  public Checkout checkout;

  public Payment payment;

  @Override
  public String toString() {
    return "CheckoutData{" +
        "checkout=" + checkout +
        ", payment=" + payment +
        '}';
  }
}
