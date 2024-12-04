package com.tecsup.clinica.sopletinmedic.repositorio;

import com.tecsup.clinica.sopletinmedic.modelo.Hora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoraRepository extends JpaRepository<Hora, Integer> {}
