package br.com.eco.ecoenergy.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "EQUIPAMENTO")
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "equipamento_seq")
    @SequenceGenerator(
            name = "equipamento_seq",
            sequenceName = "equipamento_seq",
            allocationSize = 1
    )

    @Column(name = "ID_EQUIPAMENTO")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "CONSUMO_PADRAO")
    private Double consumoPadrao;

    @Column(name = "CONSUMO_MAXIMO")
    private Double consumoMaximo;

    @Column(name = "ID_SETOR")
    private Long idSetor;

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getConsumoPadrao() {
        return consumoPadrao;
    }

    public void setConsumoPadrao(Double consumoPadrao) {
        this.consumoPadrao = consumoPadrao;
    }

    public Double getConsumoMaximo() {
        return consumoMaximo;
    }

    public void setConsumoMaximo(Double consumoMaximo) {
        this.consumoMaximo = consumoMaximo;
    }

    public Long getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(Long idSetor) {
        this.idSetor = idSetor;
    }
}