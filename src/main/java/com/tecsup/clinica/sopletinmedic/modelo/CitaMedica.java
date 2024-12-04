package com.tecsup.clinica.sopletinmedic.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Citas_Medicas")
public class CitaMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcitas_medicas;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_medicos")
    private Medico medico;

    private java.sql.Timestamp fecha;
    private java.sql.Time hora;
}

