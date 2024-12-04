package com.tecsup.clinica.sopletinmedic.controlador;

import com.tecsup.clinica.sopletinmedic.modelo.Especialidad;
import com.tecsup.clinica.sopletinmedic.repositorio.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class EspecialidadController {

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @GetMapping("/especialidades")
    public List<Especialidad> listarEspecialidades() {
        return especialidadRepository.findAll();
    }

    @PostMapping("/especialidades")
    public Especialidad crearEspecialidad(@RequestBody Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

    @GetMapping("/especialidades/{id}")
    public Especialidad obtenerEspecialidadPorId(@PathVariable Integer id) {
        return especialidadRepository.findById(id).orElseThrow(() -> new RuntimeException("Especialidad no encontrada"));
    }
}
