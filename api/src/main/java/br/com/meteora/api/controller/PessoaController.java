package br.com.meteora.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.meteora.api.model.pessoa.DadosCadastroPessoa;
import br.com.meteora.api.model.pessoa.PessoaModel;
import br.com.meteora.api.model.pessoa.PessoaRepository;

@RestController
@RequestMapping("/cadastro")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPessoa dados) {
        // System.out.println(dados);
        repository.save(new PessoaModel(dados));
    }
}
