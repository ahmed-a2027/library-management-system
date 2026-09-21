package com.library.managment_system.controller;

import com.library.managment_system.dto.RegisterRequest;
import com.library.managment_system.dto.RegisterResponse;
import com.library.managment_system.entity.User;
import com.library.managment_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public RegisterResponse createUser(@RequestBody RegisterRequest request) {
        return userService.createUser(request);
    }
}
