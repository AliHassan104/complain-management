package com.complainmanagement.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDto {
    private Long id;
    private String name;
}
