package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {

    // Endpoint GET: retourne un simple message
    @GetMapping
    public ResponseEntity<String> getTestMessage() {
        return ResponseEntity.ok("TestController is working!");
    }

    // Endpoint POST: accepte un paramètre dans le corps de la requête
    @PostMapping
    public ResponseEntity<String> postTestMessage(@RequestBody String message) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Received message: " + message);
    }

}
