package br.com.eco.ecoenergy.repository;

import br.com.eco.ecoenergy.entity.ConsumoEnergia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumoRepository
        extends JpaRepository<ConsumoEnergia, Long> {
}