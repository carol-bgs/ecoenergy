package br.com.eco.ecoenergy.service;

import br.com.eco.ecoenergy.entity.Equipamento;
import br.com.eco.ecoenergy.repository.EquipamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipamentoService {

    private final EquipamentoRepository repository;

    public EquipamentoService(EquipamentoRepository repository) {
        this.repository = repository;
    }

    public List<Equipamento> listarTodos() {
        return repository.findAll();
    }

    public Equipamento salvar(Equipamento equipamento) {
        return repository.save(equipamento);
    }

    public Equipamento buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipamento não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}