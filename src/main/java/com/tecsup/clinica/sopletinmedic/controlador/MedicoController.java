package com.tecsup.clinica.sopletinmedic.controlador;

import com.tecsup.clinica.sopletinmedic.modelo.Medico;
import com.tecsup.clinica.sopletinmedic.repositorio.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping("/medicos")
    public List<Medico> listarMedicos() {
        return medicoRepository.findAll();
    }

    @PostMapping("/medicos")
    public Medico crearMedico(@RequestBody Medico medico) {
        return medicoRepository.save(medico);
    }

    @GetMapping("/medicos/{id}")
    public Medico obtenerMedicoPorId(@PathVariable Integer id) {
        return medicoRepository.findById(id).orElseThrow(() -> new RuntimeException("Médico no encontrado"));
    }
}
