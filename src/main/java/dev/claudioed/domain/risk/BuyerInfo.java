package dev.claudioed.domain.risk;

public class BuyerInfo {

  public String document;

  public String name;

  @Override
  public String toString() {
    return "BuyerInfo{" +
        "document='" + document + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
