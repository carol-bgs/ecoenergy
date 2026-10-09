package br.com.eco.ecoenergy.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "consumo_energia")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ConsumoEnergia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double quantidadeConsumo;

    private LocalDateTime dataConsumo;

    @ManyToOne
    @JoinColumn(name = "equipamento_id")
    private Equipamento equipamento;
}