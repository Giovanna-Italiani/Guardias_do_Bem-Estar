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
	private String email;
	private String telefone;
	private String cpf;
	private String cep;
	private String uf;
	private String cidade;
	private String endereco;
	private String numero;
	private String idade;
	private String sexo;
	private String nickname;
	private String senha;
	
	
	public User() {
	}
	public User(Integer id, String nome, String email, String telefone, String cpf, String cep, String uf, String cidade, 
			String endereco, String numero, String idade, String sexo, String nickname, String senha  ) {
		super();
		this.id = id;
		this.nome = nome; 
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.cep = cep;
		this.uf = uf;
		this.cidade = cidade;
		this.endereco = endereco;
		this.numero = numero;
		this.idade = idade;
		this.sexo = sexo;
		this.nickname = nickname;
		this.senha = senha;
	}
	
	
	//GETTER AND SETTERS
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
