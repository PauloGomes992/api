package br.com.meteora.api.produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroProduto(

    @NotBlank
    String nome,

    @NotBlank
    String tamanho,

    @NotBlank
    String modelo,

    @NotBlank
    String descricao,

    @NotBlank    
    String cor,

    @NotNull
    Fabricante fabricante,

    @NotNull
    double preco)
{ }

