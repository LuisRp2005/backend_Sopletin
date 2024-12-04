package com.tecsup.clinica.sopletinmedic.controlador;

import com.tecsup.clinica.sopletinmedic.modelo.Horario;
import com.tecsup.clinica.sopletinmedic.repositorio.HorarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class HorarioController {

    @Autowired
    private HorarioRepository horarioRepository;

    @GetMapping("/horarios")
    public List<Horario> listarHorarios() {
        return horarioRepository.findAll();
    }

    @PostMapping("/horarios")
    public Horario crearHorario(@RequestBody Horario horario) {
        return horarioRepository.save(horario);
    }

    @GetMapping("/horarios/{id}")
    public Horario obtenerHorarioPorId(@PathVariable Integer id) {
        return horarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Horario no encontrado"));
    }
}
