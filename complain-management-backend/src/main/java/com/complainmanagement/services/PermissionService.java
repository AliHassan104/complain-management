package com.complainmanagement.services;


import com.complainmanagement.dtos.PermissionDto;

import java.util.List;

public interface PermissionService {
    List<PermissionDto> getAll();
    PermissionDto findById(Long id);
}
