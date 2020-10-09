package com.loja.games.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loja.games.model.categoriaModel;

@Repository
public interface categoriaRepository extends JpaRepository<categoriaModel,Long> {
	
	public List<categoriaModel> findAllByNomeContainingIgnoreCase(String nome);
}