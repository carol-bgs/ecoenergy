package br.com.eco.ecoenergy.controller;

import br.com.eco.ecoenergy.entity.Alerta;
import br.com.eco.ecoenergy.repository.AlertaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alertas")

public class AlertaController {

    private final AlertaRepository repository;

    public AlertaController(AlertaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Alerta> listar() {
        return repository.findAll();
    }
}