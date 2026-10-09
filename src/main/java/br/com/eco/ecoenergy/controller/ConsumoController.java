package br.com.eco.ecoenergy.controller;

import br.com.eco.ecoenergy.entity.ConsumoEnergia;
import br.com.eco.ecoenergy.repository.ConsumoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consumos")

public class ConsumoController {

    private final ConsumoRepository repository;

    public ConsumoController(ConsumoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ConsumoEnergia> listar() {
        return repository.findAll();
    }

    @PostMapping
    public ConsumoEnergia salvar(@RequestBody ConsumoEnergia consumo) {
        return repository.save(consumo);
    }
}