package com.techne.biometric_auth_service.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistroRequest {

    private String username;
    private String nombre;
    private String password;
}
