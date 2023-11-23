package com.complainmanagement.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ComplainTypeDto {
    private Long id;

    private String name;
}
