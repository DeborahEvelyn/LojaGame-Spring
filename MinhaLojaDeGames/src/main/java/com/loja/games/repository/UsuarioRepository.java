package com.loja.games.repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loja.games.model.usuarioModel;

 

@Repository
public interface UsuarioRepository extends JpaRepository<usuarioModel, Long> {
	
	public List<usuarioModel> findAllByNomeContainingIgnoreCase(String nome);

}