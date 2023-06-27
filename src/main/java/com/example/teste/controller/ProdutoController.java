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

import com.example.teste.model.Produto;
import com.example.teste.model.ProdutoDAO;

@RestController
@RequestMapping("produto")
@CrossOrigin(origins = "*")
public class ProdutoController {

	@Autowired
	private ProdutoDAO dao;

	@GetMapping
	public List<Produto> obterTodos() {
		return dao.findAll();
	}

	@GetMapping("/{id}")
	public Produto getFornecedor(@PathVariable int id) {
		Optional<Produto> fornecedorResponse = dao.findById(id);
		return fornecedorResponse.get();
	}

	@PostMapping
	public void incluir(@RequestBody Produto p) {
		dao.save(p);
	}

	@DeleteMapping("{id}")
	public void excluir(@PathVariable("id") Integer codigo) {
		dao.deleteById(codigo);
	}

	@PutMapping("{id}")
	public void atualizar(@PathVariable("id") Integer codigo, @RequestBody Produto p) {
		dao.save(p);
	}
}