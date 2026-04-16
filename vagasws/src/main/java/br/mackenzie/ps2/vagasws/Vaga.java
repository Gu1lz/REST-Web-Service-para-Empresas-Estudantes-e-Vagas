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
public class Vaga{
    
    @Id
    private long id;
    private String titulo;
    private String descricao;
    private LocalDate publicacao;
    private boolean ativo;
    private long idEmpresa;

    public Vaga(String titulo, String descricao, LocalDate publicacao, boolean ativo, long idEmpresa) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.publicacao = publicacao;
        this.ativo = ativo;
        this.idEmpresa = idEmpresa;
    }
}