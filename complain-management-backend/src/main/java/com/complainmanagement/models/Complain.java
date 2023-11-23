package com.complainmanagement.models;

import com.complainmanagement.dtos.enums.ComplainStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Builder
@Data

@Entity
@Table(name = "complain")
public class Complain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "address", referencedColumnName = "id")
    private Address address;

    @Lob
    @Column
    private String description;

    private String picture;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;

    @JsonFormat(pattern="HH:mm:ss")
    private LocalTime time;

    @Enumerated(EnumType.STRING)
    private ComplainStatus complainStatus = ComplainStatus.IN_REVIEW;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "complain_type_id", referencedColumnName = "id")
    private ComplainType complainType;

    @OneToMany(mappedBy = "complain",cascade = CascadeType.REMOVE)
    private List<ComplainLog> complainLogs;



}