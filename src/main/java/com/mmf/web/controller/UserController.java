package com.mmf.web.controller;

import com.mmf.dao.entity.ModelUser;
import com.mmf.service.interfaces.UserService;
import com.mmf.service.dto.EmailSendDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    private final WebClient.Builder webClientBuilder;

    @Autowired
    public UserController(UserService userService, WebClient.Builder webClientBuilder) {
        this.userService = userService;
        this.webClientBuilder = webClientBuilder;
    }

    @GetMapping
    public ResponseEntity<List<ModelUser>> getAll() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Integer> save(@RequestBody ModelUser modelUser) {
        return new ResponseEntity<>(userService.save(modelUser), HttpStatus.CREATED);
    }

    @PostMapping(value = "/sendemail")
    public ResponseEntity<Void> sendEmail(@RequestBody EmailSendDto emailSendDto) {
        Mono<EmailSendDto> emailSendDtoMono = Mono.just(emailSendDto);
        webClientBuilder.build()
                .post()
                .uri("http://localhost:8082/emails")
                .body(emailSendDtoMono, EmailSendDto.class)
                .retrieve()
                .bodyToMono(Void.class)
                .block();

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
