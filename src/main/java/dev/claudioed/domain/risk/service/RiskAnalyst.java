package dev.claudioed.domain.risk.service;

import dev.claudioed.domain.risk.CheckoutData;
import dev.claudioed.domain.risk.repository.UserOrderRepository;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService(tools = {UserOrderRepository.class})
public interface RiskAnalyst {

  @SystemMessage("""
            You are a bank account fraud scoring AI. You have to score frauds in transactions.
            """)
  @UserMessage("""
            Your task is to define some scoring rules to qualify payment transactions. It means you will give points to a transaction based on some transaction attributes and customer history.
            
            The scoring rules are as follows:
              1. Get the last order of the customer {{document}}.
              2. Get the average transaction amount of the customer {{document}}.
              3. If the transaction currency is different that last order currency. Add 10 points.
              4. If the transaction amount is greater than the average transaction amount. Add 20 points.
              5. If the transaction seller is the same that the last order. Add 5 points.
              6. If the transaction amount is the same that the last order. Add 10 points.
            
            Your task is to calculate total points for a transaction. Follow the instructions below:
            
              1. Sum all the points for the transaction. Do it step by step.
              2. Make Sure that total points are correct
              3. Give the list of each rule and the total points given to the transaction in json format.
            
            CheckoutData: {{checkoutData}}
  
            Your response must be just the raw JSON document, without ```json, ``` or anything else.
            """)
  String score(String document, CheckoutData checkoutData);

}
