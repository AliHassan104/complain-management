package com.complainmanagement.dtos;


import com.complainmanagement.dtos.enums.ComplainStatus;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Builder
@Data
public class ComplainDto {

    private Long id;
    private String description;
    private String picture;
    private UserDto user;
    private ComplainTypeDto complainType;
    private ComplainStatus complainStatus = ComplainStatus.IN_REVIEW;
    private LocalDate date;
    private LocalTime time;
    private List<ComplainLogDto> complainLog;

}
