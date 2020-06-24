package com.marcioladislau.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.marcioladislau.cursomc.domain.Produto;

@Repository
@Transactional
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
