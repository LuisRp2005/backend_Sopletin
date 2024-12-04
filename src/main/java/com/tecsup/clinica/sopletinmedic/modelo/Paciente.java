package com.tecsup.clinica.sopletinmedic.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_paciente;

    private String DNI;
    private String NOMBRE;
    private String APELLIDO_PATERNO;
    private String APELLIDO_MATERNO;
    private Integer EDAD;
    private String CELULAR;
    private String CORREO_ELECTRONICO;
    private String DIRECCION;
    private String CONTRASEÑA;
}
