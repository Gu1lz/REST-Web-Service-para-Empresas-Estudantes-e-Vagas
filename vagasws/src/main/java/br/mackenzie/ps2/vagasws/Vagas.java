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
public class Vaga {
    private long id;
    private String titulo;
    private String descricao;
    private LocalDate publicacao;
    private boolean ativo;
    private long idEmpresa;

    // Construtor personalizado (sem o ID, comum para criação de novas vagas)
    public Vaga(String titulo, String descricao, LocalDate publicacao, boolean ativo, long idEmpresa) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.publicacao = publicacao;
        this.ativo = ativo;
        this.idEmpresa = idEmpresa;
    }
}