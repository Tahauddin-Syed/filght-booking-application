package com.tahauddin.syed.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="PASSENGER_INFO_TABLE")
public class PassengerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "User Name Can't be Null")
    @Size(min = 3, message = "User Name Should be at least 3 Characters")
    private String name;

    @Email
    @NotBlank(message = "Email Can't be Null")
    private String email;

    @NotBlank(message = "Source Can't be Null")
    @Size(min = 4, message = "Source Should be At least 4 characters")
    private String source;

    @NotBlank(message = "Destination Can't be Null")
    @Size(min = 4, message = "Destination Should be At least 4 characters")
    private String destination;

    @NotBlank(message = "Travel Date Can't be Null")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date travelDate;

    @NotBlank(message = "Pickup time Can't be Null")
    private LocalTime pickupTime;

    @NotBlank(message = "Email Can't be Null")
    private LocalTime arrivalTime;

    @NotNull(message = "Email Can't be Null")
    private Double fare;
}
