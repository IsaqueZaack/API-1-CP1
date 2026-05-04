package br.com.fiap.api_1.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity

@Table(name="animais")
public class Animal {
    @Id
    private Long id;

    @Column(name="nome_animal", length = 100, 
    columnDefinition ="char(100)", nullable = true)
    private String nome;
    private String tipo;
    private String cor;
    private int idade;

    public Animal() {

    }
}
