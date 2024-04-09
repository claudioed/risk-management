package dev.claudioed.domain.risk;

public class Payment {

  public String id;

  public String currency;

  public String amount;

  public String status;

  public SellerInfo sellerInfo;

  public String idempotencyKey;

  @Override
  public String toString() {
    return "Payment{" +
        "id='" + id + '\'' +
        ", currency='" + currency + '\'' +
        ", amount='" + amount + '\'' +
        ", status='" + status + '\'' +
        ", sellerInfo=" + sellerInfo +
        ", idempotencyKey='" + idempotencyKey + '\'' +
        '}';
  }

}
