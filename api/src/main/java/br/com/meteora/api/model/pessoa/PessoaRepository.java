package br.com.meteora.api.model.pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel,Long> {
    
}
