package com.tahauddin.syed.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="PAYMENT_INFO_TABLE")
public class PaymentInfo {

    @Id
    @GeneratedValue(generator = "paymentId")
    @GenericGenerator(name="paymentId", strategy = "org.hibernate.id.UUIDGenerator")
    private String paymentId;

    @NotBlank
    private String accountNumber;

    @NotBlank
    private Double amount;

    @NotBlank
    private String cardType;

    private Long passengerId;


}
