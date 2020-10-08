package com.loja.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loja.games.model.produtoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<produtoModel, Long> {
	
	public List<produtoModel> findAllByNomeContainingIgnoreCase(String nome);

}