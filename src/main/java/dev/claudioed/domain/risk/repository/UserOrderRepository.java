package dev.claudioed.domain.risk.repository;

import dev.claudioed.domain.risk.AverageAmount;
import dev.claudioed.domain.risk.Order;
import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserOrderRepository {

  @Tool("get the last order for the given buyer document")
  public Order lastOrder(String document){
    return new Order("123", "USD", "200.00");
  }

  @Tool("get the average amount for the given buyer document")
  public AverageAmount averageAmount(String document){
    return new AverageAmount("2021-01", "1000.00", "USD");
  }

}
