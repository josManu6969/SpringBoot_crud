package com.universidad.controller; 

import com.universidad.dto.EstudianteDTO; 
import com.universidad.service.IEstudianteService; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*;

import java.util.List; 

@RestController 
@RequestMapping("/api") 
public class EstudianteController { 

    private final IEstudianteService estudianteService; 

    @Autowired 
    public EstudianteController(IEstudianteService estudianteService) { 
        this.estudianteService = estudianteService; 
    }

    @GetMapping("/estudiantes") 
    public ResponseEntity<List<EstudianteDTO>> obtenerTodosLosEstudiantes() { 
        List<EstudianteDTO> estudiantes = estudianteService.obtenerTodosLosEstudiantes(); 
        return ResponseEntity.ok(estudiantes); 
    }
    
    @PutMapping("/estudiantes/{id}")
    public ResponseEntity<EstudianteDTO> actualizarEstudiante(@PathVariable Long id, @RequestBody EstudianteDTO estudianteDTO) {
    EstudianteDTO estudianteActualizado = estudianteService.actualizarEstudiante(id, estudianteDTO);
    return ResponseEntity.ok(estudianteActualizado);
}

    @GetMapping("/estudiantes/{id}")
    public ResponseEntity<EstudianteDTO> obtenerEstudiantePorId(@PathVariable Long id) {
    EstudianteDTO estudiante = estudianteService.obtenerEstudiantePorId(id);
    return ResponseEntity.ok(estudiante);
    }
    
    @PostMapping("/estudiantes")
    public ResponseEntity<EstudianteDTO> crearEstudiante(@RequestBody EstudianteDTO estudianteDTO) {
    EstudianteDTO estudianteCreado = estudianteService.crearEstudiante(estudianteDTO);
    return ResponseEntity.status(201).body(estudianteCreado);
    }

    @DeleteMapping("/estudiantes/{id}")
    public ResponseEntity<Void> eliminarEstudiante(@PathVariable Long id) {
    estudianteService.eliminarEstudiante(id);
    return ResponseEntity.noContent().build();
}
}