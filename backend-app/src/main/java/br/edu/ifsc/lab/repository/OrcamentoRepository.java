package br.edu.ifsc.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifsc.lab.domain.Orcamento;

/*
 * Classe capaz de acessar o BD,fazer as consultas para acessar os dados da tabela Orcamento
 * JpaRepository tipo especial do Spring capaz de acessar os dados com base em um tipo que você 
 * passar que no caso é Orcamento,e também deve colocar qual o tipo do atributo identificador desse obejto
 * que no caso é Integer
 */
@Repository
public interface OrcamentoRepository extends JpaRepository<Orcamento, Integer> {

}