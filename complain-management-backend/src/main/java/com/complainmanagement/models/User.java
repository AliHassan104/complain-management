package com.complainmanagement.models;

import com.complainmanagement.dtos.enums.PropertyType;
import com.complainmanagement.dtos.enums.UserStatus;
import com.complainmanagement.dtos.enums.UserType;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Builder
@Data

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phoneNumber;
    private String cnic;
    private Integer numberOfFamilyMembers;

    @Lob
    private String deviceToken;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    //  owner/tenant
    @Enumerated(EnumType.STRING)
    private PropertyType property;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "address", referencedColumnName = "id")
    private Address address;

    @ManyToMany
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id") ,
            inverseJoinColumns = @JoinColumn(name = "role_id"))

    private Set<Role> roles = new HashSet<>();

}

