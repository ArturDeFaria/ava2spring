package com.example.teste.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pessoa {
	
	@Id
	public Integer id;
	public String nome;
	public String telefone;
	public String email;

}
