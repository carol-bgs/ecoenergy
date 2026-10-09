package br.com.eco.ecoenergy.repository;

import br.com.eco.ecoenergy.entity.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertaRepository
        extends JpaRepository<Alerta, Long> {
}
