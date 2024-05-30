package com.guardias_do_bemestar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "voluntario")
public class Voluntario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String endereco;
	private String sexo;
	private String cpf;
	private String email;
	private String senha;
	private String nickname;
	private String area_de_atuacao;
	
	
	//Construtores
	public Voluntario () {
	}
	public Voluntario(Integer id, String email, String password, String nickname, String profissao, 
			String nome, String endereco, String sexo, String cpf, String senha, String area_de_atuacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.sexo = sexo;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.nickname = nickname;
		this.area_de_atuacao = area_de_atuacao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getArea_de_atuacao() {
		return area_de_atuacao;
	}
	public void setArea_de_atuacao(String area_de_atuacao) {
		this.area_de_atuacao = area_de_atuacao;
	}
	//Getters and Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
 	}

}
