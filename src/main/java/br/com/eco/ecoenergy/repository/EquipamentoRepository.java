package br.com.eco.ecoenergy.repository;

import br.com.eco.ecoenergy.entity.Equipamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {
}
