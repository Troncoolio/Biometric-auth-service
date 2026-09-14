package com.techne.biometric_auth_service.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 45)
    private String nombre;

    @Column(nullable = false, length = 30)
    private String rol;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false, length = 100)
    private String password;

    @OneToOne 
    @JoinColumn(name = "documentoIdentidad")
    private DocumentoIdentidad docId;

    @OneToMany
    private List<IntentoVerificacion> intentoVerificacion;



}
