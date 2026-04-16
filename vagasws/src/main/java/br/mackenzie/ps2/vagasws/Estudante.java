package br.mackenzie.ps2.vagasws;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Estudante {
    @Id
    private long id;
    private String nome;
    private String email;
    private LocalDate nascimento;
    private int anoIngresso;

    public Estudante(String nome, String email, LocalDate nascimento, int anoIngresso) {
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.anoIngresso = anoIngresso;
    }
}