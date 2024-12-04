package com.tecsup.clinica.sopletinmedic.repositorio;

import com.tecsup.clinica.sopletinmedic.modelo.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Integer> {}