package com.example.teste.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="fornecedores")
public class Fornecedor{
	@Id
	public Integer pessoa_id;
	public String cnpj;
}
