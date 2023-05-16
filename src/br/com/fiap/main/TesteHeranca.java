package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Pf;
import br.com.fiap.beans.Pj;

public class TesteHeranca {
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double decimal (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		Pj objPj = new Pj(
				texto("Digite o nome"),
				inteiro("Digite a idade"),
				decimal("Digite a renda"),
				texto("Digite a razao social"),
				texto("Digite o cnpj")
		);
		Pf objPf = new Pf(
				texto("Digite o nome"),
				inteiro("Digite a idade"),
				decimal("Digite a renda "),
				texto("Digite o rg"),
				texto("Digite o cpf")
		);
		Endereco objEndereco = new Endereco(
				texto("Digite o logradouro"),
				inteiro("Digite o numero")
		);
		
		System.out.println("===== PJ");
		System.out.println("Nome: " + objPj.getNome());
		System.out.println("Cnpj: " + objPj.getCnpj());
		
		System.out.println("\n===== PF");
		System.out.println("Nome: " + objPf.getNome());
		System.out.println("Cnpj: " + objPf.getCpf());
		
		System.out.println("\n===== Endereço");
		System.out.println("Logradouro: " + objEndereco.getLogradouro());
		System.out.println("Numero: " + objEndereco.getNumero());
	}
}
