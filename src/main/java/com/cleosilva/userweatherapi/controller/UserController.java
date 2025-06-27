package com.cleosilva.userweatherapi.controller;

import com.cleosilva.userweatherapi.dto.UserWithClimateDTO;
import com.cleosilva.userweatherapi.model.UserModel;
import com.cleosilva.userweatherapi.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserWithClimateDTO> findWithClimate(@PathVariable Long id){
        return ResponseEntity.ok(userService.findUserWithClimate(id));
    }

    @PostMapping
    public ResponseEntity<UserModel> save(@RequestBody UserModel user){
        return ResponseEntity.ok(userService.save(user));
    }
}
