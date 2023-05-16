package br.com.fiap.beans;

public class Pj extends Pessoa {
	private String razaoSocial;
	private String cnpj;
	
	public Pj() {
		super();
	}
	public Pj(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	public Pj(String nome, int idade, double renda, String razaoSocial, String cnpj) {
		super(nome, idade, renda);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
