package com.example.teste.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="produtos")
public class Produto {
	@Id
	public Integer id;	
	public Integer fornecedor_pessoa_id,categorias_id;
	public String nome,descricao;
	public Double preco;
}
