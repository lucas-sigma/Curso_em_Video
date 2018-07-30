package exercicio;

public class Pessoa {
	private String nome, sexo;
	private int idade;
	
	public Pessoa(String nome, String sexo, int idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}

	
	// M�todos P�blicos
	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
	}
	
	
	// M�todos Especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
