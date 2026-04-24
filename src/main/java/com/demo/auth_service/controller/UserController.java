package com.demo.auth_service.controller;

import com.demo.auth_service.dto.UserResponse;
import com.demo.auth_service.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/me")
    public ResponseEntity<UserResponse> getCurrentUser() {
        return ResponseEntity.ok(userService.getCurrentUser());
    }
    @PutMapping("/me")
    public ResponseEntity<UserResponse> updateCurrentUser(
            @RequestParam String firstName,
            @RequestParam String lastName) {
        return ResponseEntity.ok(
                userService.updateCurrentUser(firstName, lastName)
        );
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<UserResponse> getUserById(@PathVariable UUID id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }



}
