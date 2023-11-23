package com.complainmanagement.models;

import com.complainmanagement.dtos.enums.ComplainStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@Data

@Entity
@Table(name = "complainlog")
public class ComplainLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private ComplainStatus complainStatus;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;
    @OneToOne
    private User assignedFrom;
    @OneToOne
    private User assignedTo;
    @Lob
    private String description;


    @ManyToOne
    @JoinColumn(name = "complain")
    @JsonIgnore
    @JsonIgnoreProperties
    private Complain complain;

}
