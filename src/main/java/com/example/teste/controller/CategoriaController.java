package com.example.teste.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teste.model.Categoria;
import com.example.teste.model.CategoriaDAO;



@RestController
@RequestMapping("categoria")
@CrossOrigin(origins = "*")
public class CategoriaController {

	@Autowired
	private CategoriaDAO dao;

	@GetMapping
	public List<Categoria> obterTodos() {
		return dao.findAll();
	}

	@GetMapping("/{id}")
	public Categoria getCategoria(@PathVariable int id) {
		Optional<Categoria> categoriaResponse = dao.findById(id);
		return categoriaResponse.get();
	}

	@PostMapping
	public void incluir(@RequestBody Categoria c) {
		dao.save(c);
	}

	@DeleteMapping("{id}")
	public void excluir(@PathVariable("id") Integer codigo) {
		dao.deleteById(codigo);
	}

	@PutMapping("{id}")
		public void atualizar(@PathVariable("id") Integer codigo,@RequestBody Categoria c) {
			dao.save(c);
		}
}