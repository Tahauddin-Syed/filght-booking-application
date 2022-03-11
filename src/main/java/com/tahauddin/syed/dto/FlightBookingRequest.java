package com.tahauddin.syed.dto;

import com.tahauddin.syed.entity.PassengerInfo;
import com.tahauddin.syed.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FlightBookingRequest {

    @NotNull(message = "passenger Info Cant be Null")
    private PassengerInfo passengerInfo;

    @NotNull(message = "payment Info Cant Be Null")
    private PaymentInfo paymentInfo;
}
