package com.guardias_do_bemestar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String endereco;
	private Integer idade;
	private String sexo;
	private String email;
	private Integer cpf;
	private String senha;
	private String nickname;
	
	
	//Construtores
	public User() {
	}
	public User(Integer id, String email, String password, String nickname, String nome, String endereco, Integer idade, 
			String sexo, Integer cpf ) {
		super();
		this.id = id;
		this.nome = nome; 
		this.endereco = endereco;
		this.idade = idade;
		this.sexo = sexo;
		this.email = email;
		this.cpf = cpf;
		this.senha = password;
		this.nickname = nickname;
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
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
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
	public String getPassword() {
		return senha;
	}
	public void setPassword(String password) {
		this.senha = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
 	}

}
