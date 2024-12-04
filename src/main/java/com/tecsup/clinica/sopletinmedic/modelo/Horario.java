package com.tecsup.clinica.sopletinmedic.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Horarios")
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_horarios;

    private java.sql.Date Fecha;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "Medicos_id_medicos")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "Id_horas")
    private Hora hora;
}
