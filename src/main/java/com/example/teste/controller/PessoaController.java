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


import com.example.teste.model.Pessoa;
import com.example.teste.model.PessoaDAO;

@RestController
@RequestMapping("/pessoa")
@CrossOrigin(origins = "*")
public class PessoaController {
	
	@Autowired
	private PessoaDAO dao;
	
	@GetMapping
	public  List<Pessoa> obterTodos() {
		return dao.findAll();
		
	}
	@GetMapping("/{id}")
	public Pessoa getPessoa(@PathVariable int id) {
		Optional<Pessoa> pessoaResponse =  dao.findById(id);		
		return pessoaResponse.get();		
		
	}
	
	@PostMapping
	public void incluir(@RequestBody Pessoa p) {
		dao.save(p);
	}
	
	@PutMapping("{id}")
	public void atualizar(@PathVariable("id") Integer id,@RequestBody Pessoa p) {
		dao.save(p);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable("id") Integer id) {
		dao.deleteById(id);
	}

}
