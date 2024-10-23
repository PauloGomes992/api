package br.com.meteora.api.model.usuario;

import br.com.meteora.api.model.endereco.DadosEndereco;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroUsuario(

        @NotBlank
        String nome,

        @NotBlank
        String cpf,

        @NotNull
        char genero,

        @NotBlank
        String dataDeNascimento,

        @NotBlank
        @Email
        String email,

        @NotNull
        DadosEndereco endereco,

        @NotBlank
        String senha) {
}
