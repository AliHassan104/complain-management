package com.complainmanagement.controllers;

import com.complainmanagement.dtos.PermissionDto;
import com.complainmanagement.services.PermissionService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class PermissionController {
    private final PermissionService permissionService;

    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @GetMapping("/permission")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<List<PermissionDto>> getAllPermission() {
        List<PermissionDto> permissionDtoList = permissionService.getAll();
        return ResponseEntity.ok(permissionDtoList);
    }

    @GetMapping("/permission/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<PermissionDto> getPermissionById(@PathVariable Long id) {
        PermissionDto permissionDto = permissionService.findById(id);
        return ResponseEntity.ok(permissionDto);
    }
}
