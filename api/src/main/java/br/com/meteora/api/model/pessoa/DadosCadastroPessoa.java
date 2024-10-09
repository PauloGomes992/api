package br.com.meteora.api.model.pessoa;

public record DadosCadastroPessoa(
        String nome,
        String CPF,
        char genero,
        String dataDeNascimento,
        String email,
        String endereco,
        String senha
) {

}
