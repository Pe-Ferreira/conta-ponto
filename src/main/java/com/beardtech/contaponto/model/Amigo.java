package com.beardtech.contaponto.model;

import javax.persistence.*;

@Entity
public class Amigo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nome;
    @Column
    private int pontosVitalicios;
    @Column
    private int pontosRevogaveis;

    public Amigo(String nome, int pontosRevogaveis, int pontosVitalicios){
        this.nome = nome;
        this.pontosRevogaveis = pontosRevogaveis;
        this.pontosVitalicios = pontosVitalicios;
    }

    public Amigo(){};

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

    public int getPontosVitalicios() {
        return pontosVitalicios;
    }

    public void setPontosVitalicios(int pontosVitalicios) {
        this.pontosVitalicios = pontosVitalicios;
    }

    public int getPontosRevogaveis() {
        return pontosRevogaveis;
    }

    public void setPontosRevogaveis(int pontosRevogaveis) {
        this.pontosRevogaveis = pontosRevogaveis;
    }
}
