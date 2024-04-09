package dev.claudioed.adapter;

import dev.claudioed.domain.risk.CheckoutData;
import dev.claudioed.domain.risk.service.RiskAnalyst;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/risk-scoring")
public class RiskManagementResource {

  private final RiskAnalyst riskAnalyst;

  public RiskManagementResource(RiskAnalyst riskAnalyst) {
    this.riskAnalyst = riskAnalyst;
  }
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public String riskScore(CheckoutData checkoutData) {
    return this.riskAnalyst.score(checkoutData.checkout.buyerInfo.document,checkoutData);
  }

}
