package com.tecsup.clinica.sopletinmedic.repositorio;

import com.tecsup.clinica.sopletinmedic.modelo.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Integer> {}
