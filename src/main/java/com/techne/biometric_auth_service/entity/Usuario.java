package com.techne.biometric_auth_service.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor 
@ToString(exclude = {"intentosVerificacion", "docId"})
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
    @JoinColumn(name = "documento_identidad")
    private DocumentoIdentidad docId;

    @OneToMany(mappedBy = "usuario")
    private List<IntentoVerificacion> intentosVerificacion;



}
