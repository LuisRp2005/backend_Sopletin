package com.tecsup.clinica.sopletinmedic.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Especialidades")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Especialidades;

    private String nombre_especialidad;
}