package com.tecsup.clinica.sopletinmedic.controlador;

import com.tecsup.clinica.sopletinmedic.modelo.CitaMedica;
import com.tecsup.clinica.sopletinmedic.repositorio.CitaMedicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class CitaMedicaController {

    @Autowired
    private CitaMedicaRepository citaMedicaRepository;

    @GetMapping("/citas")
    public List<CitaMedica> listarCitas() {
        return citaMedicaRepository.findAll();
    }

    @PostMapping("/citas")
    public CitaMedica registrarCita(@RequestBody CitaMedica citaMedica) {
        return citaMedicaRepository.save(citaMedica);
    }

    @GetMapping("/citas/{id}")
    public CitaMedica obtenerCitaPorId(@PathVariable Integer id) {
        return citaMedicaRepository.findById(id).orElseThrow(() -> new RuntimeException("Cita médica no encontrada"));
    }
}
