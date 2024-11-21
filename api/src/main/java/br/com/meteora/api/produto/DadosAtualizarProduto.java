package br.com.meteora.api.produto;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarProduto(

                @NotNull Long id,
                String nome,
                String tamanho,
                String modelo,
                String descricao,
                double preco,
                String cor

) {

}
