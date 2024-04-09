package dev.claudioed.domain.risk;

public class Checkout {

  public String id;

  public CardInfo cardInfo;

  public BuyerInfo buyerInfo;

  public String idempotencyKey;

  public String at;

  @Override
  public String toString() {
    return "Checkout{" +
        "id='" + id + '\'' +
        ", cardInfo=" + cardInfo +
        ", buyerInfo=" + buyerInfo +
        ", idempotencyKey='" + idempotencyKey + '\'' +
        ", at='" + at + '\'' +
        '}';
  }

}
