package br.com.fiap.beans;

public class Pessoa {
	private String nome;
	private int idade;
	private double renda;
	private Endereco endereco;
	
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, int idade, double renda) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.renda = renda;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
