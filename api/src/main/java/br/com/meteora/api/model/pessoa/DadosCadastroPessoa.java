package br.com.meteora.api.model.pessoa;

public record DadosCadastroPessoa(
        String nome,
        String cpf,
        char genero,
        String dataDeNascimento,
        String email,
        String endereco,
        String senha
) {

}
