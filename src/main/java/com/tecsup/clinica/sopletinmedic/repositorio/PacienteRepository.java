package com.tecsup.clinica.sopletinmedic.repositorio;

import com.tecsup.clinica.sopletinmedic.modelo.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {}