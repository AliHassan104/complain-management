package com.complainmanagement.services.implementation;

import com.complainmanagement.dtos.AddressDto;
import com.complainmanagement.models.Address;
import com.complainmanagement.repositories.AddressRepository;
import com.complainmanagement.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImplementation implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<AddressDto> getAllAddressDto() {
        return null;
    }

    @Override
    public AddressDto getAddressById(Long id) {
        return null;
    }

    @Override
    public void deleteAddressById(Long id) {

    }

    @Override
    public AddressDto addAddress(AddressDto addressDto) {
        return null;
    }

    @Override
    public AddressDto updateAddress(AddressDto addressDto) {
        return null;
    }
    
    public Address dto(AddressDto addressDto){
        return Address.builder()
                .id(addressDto.getId())
                .city(addressDto.getCity())
                .houseNumber(addressDto.getHouseNumber())
                .floorNumber(addressDto.getFloorNumber())
                .build();

    }

    public AddressDto toDto(Address address){
        return  AddressDto.builder()
                .id(address.getId())
                .city(address.getCity())
                .houseNumber(address.getHouseNumber())
                .floorNumber(address.getFloorNumber())
                .build();

    }

    public List<AddressDto> addressListToAddressDtoList(List<Address> address){
        return address.stream()
                .map(_address -> toDto(_address))
                .collect(Collectors.toList());
    }

}
