package com.tecsup.clinica.sopletinmedic.repositorio;

import com.tecsup.clinica.sopletinmedic.modelo.CitaMedica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaMedicaRepository extends JpaRepository<CitaMedica, Integer> {}
