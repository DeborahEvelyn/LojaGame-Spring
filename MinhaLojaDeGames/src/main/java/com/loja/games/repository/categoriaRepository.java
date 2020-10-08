package com.loja.games.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.games.model.categoriaModel;


public interface categoriaRepository extends JpaRepository<categoriaModel,Long> {
	
	public List<categoriaModel> findAllByCategoriaJogosContainingIgnoreCase(String categoriaJogos);
}