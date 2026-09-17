package com.techne.biometric_auth_service.entity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor 
@ToString(exclude = {"usuario"})
@Entity 
public class IntentoVerificacion {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    private Usuario usuario;

    @Column(nullable = false)
    private boolean intentoExitoso = false;

    @Column(nullable = false)
    private float confianza;
}
