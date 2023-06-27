package com.example.teste.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {
	@Id
	public Integer id;
	public String nome,descricao;

}
