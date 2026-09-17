package com.techne.biometric_auth_service.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor 
@AllArgsConstructor 
@ToString(exclude = {"usuario"})
@Entity 
public class DocumentoIdentidad {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "docId")
    private Usuario usuario;

    @Column(nullable = false, unique = true)
    private int numeroDocumento;

    @Column(nullable = false, length = 40)
    private String tipo;

    @Column(nullable = false, length = 50)
    private String url;
}
