package br.com.fila;

public class Pessoa {
	String nome;

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return this.nome ;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
