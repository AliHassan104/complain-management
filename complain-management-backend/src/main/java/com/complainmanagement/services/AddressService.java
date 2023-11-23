package com.complainmanagement.services;

import com.complainmanagement.dtos.AddressDto;

import java.util.List;

public interface AddressService {

    public List<AddressDto> getAllAddressDto();

    public AddressDto getAddressById(Long id);

    public void deleteAddressById(Long id);

    public AddressDto addAddress(AddressDto addressDto);

    public AddressDto updateAddress(AddressDto addressDto);

}
