package com.loja.games.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class categoriaModel {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column 
	private String categoriaJogos;
	
	@Column 
	private String categoriaColecionaveis;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoriaJogos() {
		return categoriaJogos;
	}

	public void setCategoriaJogos(String categoriaJogos) {
		this.categoriaJogos = categoriaJogos;
	}

	public String getCategoriaColecionaveis() {
		return categoriaColecionaveis;
	}

	public void setCategoriaColecionaveis(String categoriaColecionaveis) {
		this.categoriaColecionaveis = categoriaColecionaveis;
	}

}