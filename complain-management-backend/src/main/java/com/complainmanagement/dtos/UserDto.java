package com.complainmanagement.dtos;

import com.complainmanagement.dtos.enums.PropertyType;
import com.complainmanagement.dtos.enums.UserStatus;
import com.complainmanagement.dtos.enums.UserType;
import com.complainmanagement.models.Address;
import com.complainmanagement.models.Role;
import lombok.Builder;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import java.util.HashSet;
import java.util.Set;

@Builder
@Data
public class UserDto {
    private Long id;
    private String firstname;
    private String lastname;

    private String email;

    private String password;
    private String phoneNumber;
    private String cnic;
    private Integer numberOfFamilyMembers;
    private AddressDto address;
    @Lob
    private String deviceToken;

    @Enumerated(EnumType.STRING)
    private PropertyType property;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    private Set<Role> roles = new HashSet<>();
    //   Enums for user Status
    @Enumerated(EnumType.STRING)
    private UserStatus status;
}
