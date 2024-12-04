package com.tecsup.clinica.sopletinmedic.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_medicos;

    private String NOMBRE;
    private String APELLIDO_PATERNO;
    private String APELLIDO_MATERNO;
    private String CORREO_ELECTRONICO;
    private String PERFIL;
    private String EDUCACION;

    @ManyToOne
    @JoinColumn(name = "Especialidades_id_Especialidades")
    private Especialidad especialidad;
}