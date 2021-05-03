package com.mmf.web.controller;

import com.mmf.service.RoleMapService;
import com.mmf.service.dto.RoleMapDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/roles")
public class RoleMapController {
    private final RoleMapService roleMapService;

    public RoleMapController(RoleMapService roleMapService) {
        this.roleMapService = roleMapService;
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody RoleMapDto roleMapDto) {
//        roleMapService.
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
