package org.test.Test.Beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TermDepositsRequestBean {

    String Value1;
    String Value2;

     @JsonProperty("FundingAccountDetails")
    AmountAndCuurency FundingAccountDetails;
  }
