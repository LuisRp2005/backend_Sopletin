package com.tecsup.clinica.sopletinmedic.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Horas")
public class Hora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_horas;

    private java.sql.Time hora;
}
