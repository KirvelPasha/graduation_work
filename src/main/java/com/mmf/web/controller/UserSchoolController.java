package com.mmf.web.controller;

import com.mmf.dao.entity.ModelUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schools")
public class UserSchoolController {
    @GetMapping
    public ResponseEntity<Void> getAll() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
