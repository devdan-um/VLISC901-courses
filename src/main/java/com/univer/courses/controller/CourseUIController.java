package com.univer.courses.controller;
import com.univer.courses.model.CourseRequest;
import com.univer.courses.model.CourseEntity;
import com.univer.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;
@Controller
@RequestMapping("/cursos")
public class CourseUIController {
    @Autowired
    private CourseRepository courseRepository;
    @GetMapping
    public String listarCursos(Model model) {
        Iterable<CourseEntity> iterable = courseRepository.findAll();
        List<CourseEntity> cursos = new ArrayList<>();
        iterable.forEach(cursos::add);
        model.addAttribute("cursos", cursos);
        return "cursos";
    }
    @GetMapping("/register")
    public String mostrarFormulario(Model model) {
        model.addAttribute("courseRequest", new CourseRequest());
        return "register";
    }
    @PostMapping
    public String guardarCurso(@ModelAttribute CourseRequest courseRequest) {
        CourseEntity curso = new CourseEntity();
        curso.setNombre(courseRequest.getNombre());
        curso.setFechaInicio(courseRequest.getFechaInicio());
        curso.setFechaConclusion(courseRequest.getFechaConclusion());
        courseRepository.save(curso);
        return "redirect:/cursos/success";
    }
    @GetMapping("/success")
    public String mostrarExito() {
        return "success";
    }
}