package com.techne.biometric_auth_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techne.biometric_auth_service.entity.DocumentoIdentidad;


public interface DocumentoIdentidadRepository extends JpaRepository<DocumentoIdentidad, Long> {

}
