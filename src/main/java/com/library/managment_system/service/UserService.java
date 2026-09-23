package com.library.managment_system.service;

import com.library.managment_system.dto.RegisterRequest;
import com.library.managment_system.dto.RegisterResponse;
import com.library.managment_system.entity.User;
import com.library.managment_system.enums.UserRole;
import com.library.managment_system.exception.EmailAlreadyExistsException;
import com.library.managment_system.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {



}
