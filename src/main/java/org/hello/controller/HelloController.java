package org.hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        String response = "pong!";
        log.info("ping response={}", response);
        return ResponseEntity.ok(response);
    }

}
