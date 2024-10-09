package br.com.meteora.api.controller;

import org.springframework.web.bind.annotation.*;
import br.com.meteora.api.model.pessoa.DadosCadastroPessoa;

@RestController
@RequestMapping("/cadastro")
public class PessoaController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPessoa dados) {
        System.out.println(dados);
    }
}
