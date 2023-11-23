package com.complainmanagement.dtos;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Builder
@Data
public class AddressDto {
    private Long id;
    private String houseNumber;
    private String floorNumber;
    private String city;
}
