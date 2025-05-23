package br.com.bancodigital.dao;

import br.com.bancodigital.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoDao extends JpaRepository<Cartao, Long> {
    boolean existsByNumero(Long numero);
}
