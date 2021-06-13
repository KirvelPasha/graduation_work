package com.mmf.web.controller;

import com.mmf.service.interfaces.RoleMapService;
import com.mmf.service.dto.RoleMapDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roles")
public class RoleMapController {
    private final RoleMapService roleMapService;

    public RoleMapController(RoleMapService roleMapService) {
        this.roleMapService = roleMapService;
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody RoleMapDto roleMapDto) {
        roleMapService.save(roleMapDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody RoleMapDto roleMapDto) {
        roleMapService.delete(roleMapDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
