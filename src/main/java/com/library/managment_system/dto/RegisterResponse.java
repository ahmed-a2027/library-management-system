package com.library.managment_system.dto;

import com.library.managment_system.enums.UserRole;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class RegisterResponse {

    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private UserRole role;
}
