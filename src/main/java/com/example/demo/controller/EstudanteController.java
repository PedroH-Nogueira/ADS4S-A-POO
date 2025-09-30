package com.example.demo.controller;
import com.example.demo.model.Estudante;
import com.example.demo.service.EstudanteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/Lista")
public class EstudanteController {
    private final EstudanteService estudanteService;

    public EstudanteController(EstudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @GetMapping
    public List<Estudante> getAll(){
        return estudanteService.getAll();
    }

    @GetMapping("/estudante/{id}")
    public Estudante getById(@PathVariable Long id){
        return estudanteService.getById(id);
    }

    @PostMapping
    public Estudante create(@RequestBody Estudante estudante){
        return estudanteService.save(estudante);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id){
        estudanteService.delete(id);
    }

}