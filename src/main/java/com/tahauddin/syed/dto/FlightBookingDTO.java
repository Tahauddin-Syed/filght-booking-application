package com.tahauddin.syed.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FlightBookingDTO {

    private String id;

    private String username;

    private String email;

    private String source;

    private String destination;

    private String fare;
}
