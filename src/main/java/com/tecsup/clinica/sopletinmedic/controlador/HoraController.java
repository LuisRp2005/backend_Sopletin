package com.tecsup.clinica.sopletinmedic.controlador;

import com.tecsup.clinica.sopletinmedic.modelo.Hora;
import com.tecsup.clinica.sopletinmedic.repositorio.HoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class HoraController {

    @Autowired
    private HoraRepository horaRepository;

    @GetMapping("/horas")
    public List<Hora> listarHoras() {
        return horaRepository.findAll();
    }

    @PostMapping("/horas")
    public Hora crearHora(@RequestBody Hora hora) {
        return horaRepository.save(hora);
    }

    @GetMapping("/horas/{id}")
    public Hora obtenerHoraPorId(@PathVariable Integer id) {
        return horaRepository.findById(id).orElseThrow(() -> new RuntimeException("Hora no encontrada"));
    }
}
