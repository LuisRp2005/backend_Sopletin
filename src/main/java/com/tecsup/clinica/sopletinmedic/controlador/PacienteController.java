package com.tecsup.clinica.sopletinmedic.controlador;

import com.tecsup.clinica.sopletinmedic.modelo.Paciente;
import com.tecsup.clinica.sopletinmedic.repositorio.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class PacienteController {
    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping("/pacientes")
    public List<Paciente> listarPacientes() {
        return pacienteRepository.findAll();
    }

    @PostMapping("/pacientes")
    public Paciente crearPaciente(@RequestBody Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @GetMapping("/pacientes/{id}")
    public Paciente obtenerPacientePorId(@PathVariable Integer id) {
        return pacienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Paciente no encontrado"));
    }
}