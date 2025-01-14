package com.spring3.oauth.jwt.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusRequestDTO {

    private String orderId;
    private String orderInfo;
    private String transactionNo;
    private String transDate;
    private Long amount;
}
