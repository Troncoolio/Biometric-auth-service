package com.techne.biometric_auth_service.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.techne.biometric_auth_service.entity.IntentoVerificacion;

public interface IntentoVerificacionRepository extends JpaRepository<IntentoVerificacion, Long>{

}
