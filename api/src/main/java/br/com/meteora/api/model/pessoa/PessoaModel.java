package br.com.meteora.api.model.pessoa;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "pessoas")
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private char genero;
    private String dataDeNascimento;
    private String email;
    private String endereco;
    private String senha;

    public PessoaModel(DadosCadastroPessoa dados) {
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.genero = dados.genero();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.email = dados.email();
        this.endereco = dados.endereco();
        this.senha = dados.senha();
    }
}
