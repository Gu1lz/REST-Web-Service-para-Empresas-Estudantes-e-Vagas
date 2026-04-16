package br.mackenzie.ps2.vagasws;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Empresa {
    @Id
    private long id;
    private String nome;
    private String cnpj;
    private String emailContato;
    public Empresa(String nome, String cnpj, String emailContato) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.emailContato = emailContato;
    }
}
