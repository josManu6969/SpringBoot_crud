package com.universidad.service; // Define el paquete al que pertenece esta interfaz

import com.universidad.dto.EstudianteDTO; // Importa la clase EstudianteDTO del paquete dto

import java.util.List; // Importa la interfaz List para manejar listas

public interface IEstudianteService {
    List<EstudianteDTO> obtenerTodosLosEstudiantes();

    EstudianteDTO crearEstudiante(EstudianteDTO estudianteDTO);

    EstudianteDTO actualizarEstudiante(Long id, EstudianteDTO estudianteDTO);

    void eliminarEstudiante(Long id);

    EstudianteDTO obtenerEstudiantePorId(Long id); // Método adicional para obtener estudiante por ID.
}