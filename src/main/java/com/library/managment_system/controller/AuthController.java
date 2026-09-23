package com.library.managment_system.controller;

import com.library.managment_system.dto.RegisterRequest;
import com.library.managment_system.dto.RegisterResponse;
import com.library.managment_system.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping
    public RegisterResponse register(@RequestBody RegisterRequest request) {
        return authService.register(request);
    }
}
