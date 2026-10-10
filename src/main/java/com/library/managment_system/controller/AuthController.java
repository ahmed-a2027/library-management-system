package com.library.managment_system.controller;

import com.library.managment_system.dto.LoginRequest;
import com.library.managment_system.dto.LoginResponse;
import com.library.managment_system.dto.RegisterRequest;
import com.library.managment_system.dto.RegisterResponse;
import com.library.managment_system.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public RegisterResponse register(@RequestBody @Valid RegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody @Valid LoginRequest request) {
        return authService.login(request);
    }
}
