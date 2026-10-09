package br.com.eco.ecoenergy.controller;

import br.com.eco.ecoenergy.entity.Equipamento;
import br.com.eco.ecoenergy.repository.EquipamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamentos")
public class EquipamentoController {

    @Autowired
    private EquipamentoRepository repository;

    // POST
    @PostMapping
    public Equipamento salvar(@RequestBody Equipamento equipamento) {
        return repository.save(equipamento);
    }

    // GET TODOS
    @GetMapping
    public List<Equipamento> listar() {
        return repository.findAll();
    }

    // GET POR ID
    @GetMapping("/{id}")
    public Equipamento buscarPorId(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipamento não encontrado"));
    }

    // PUT
    @PutMapping("/{id}")
    public Equipamento atualizar(
            @PathVariable Long id,
            @RequestBody Equipamento novoEquipamento) {

        Equipamento equipamento = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipamento não encontrado"));

        equipamento.setNome(novoEquipamento.getNome());
        equipamento.setConsumoPadrao(novoEquipamento.getConsumoPadrao());
        equipamento.setConsumoMaximo(novoEquipamento.getConsumoMaximo());
        equipamento.setIdSetor(novoEquipamento.getIdSetor());

        return repository.save(equipamento);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
