package com.mmf.web;

import com.mmf.dao.entity.ModelUser;
import com.mmf.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Integer> save(@RequestBody ModelUser modelUser) {
        return new ResponseEntity<>(userService.save(modelUser), HttpStatus.CREATED);
    }
}