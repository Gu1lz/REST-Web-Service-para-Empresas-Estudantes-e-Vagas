package br.mackenzie.ps2.vagasws;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Estudante {
    private long id;
    private String nome;
    private String email;
    private LocalDate nascimento;
    private int anoIngresso;

    // Construtor sem ID (útil para persistência de dados)
    public Estudante(String nome, String email, LocalDate nascimento, int anoIngresso) {
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.anoIngresso = anoIngresso;
    }
}