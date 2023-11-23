package com.complainmanagement.dtos;


import com.complainmanagement.dtos.enums.ComplainStatus;
import lombok.Builder;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import java.time.LocalDate;

@Builder
@Data
public class ComplainLogDto {

    private Long id;
    @Enumerated(EnumType.STRING)
    private ComplainStatus complainStatus;
    private LocalDate date;
    private UserDto assignedFrom;
    private UserDto assignedTo;
    @Lob
    private String description;
    private ComplainDto complain;

}
