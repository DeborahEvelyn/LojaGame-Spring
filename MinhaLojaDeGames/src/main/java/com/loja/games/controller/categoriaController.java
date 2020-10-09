package com.loja.games.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.games.model.categoriaModel;
import com.loja.games.repository.categoriaRepository;




@RestController
@CrossOrigin("*")
@RequestMapping("/categoria")
public class categoriaController {
	
	@Autowired
	private categoriaRepository repository;
	
	@GetMapping
	public List<categoriaModel> getAll() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<categoriaModel> findByIdCategoria(@PathVariable Long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	
	}	
	@GetMapping("/categoria/{id}")
	public ResponseEntity<List<categoriaModel>> GetByCategoria(@PathVariable String nome) {
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping 
	public ResponseEntity<categoriaModel> post(@RequestBody categoriaModel categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<categoriaModel> put(@PathVariable Long id, @RequestBody categoriaModel categoria) {
		categoria.setId(id);
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
	
	
	


