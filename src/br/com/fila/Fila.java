package br.com.fila;


public class Fila {
	
	private Celula primeira;
	private Celula ultima;
	private int QtdDeElementos;	
	
	public Pessoa [] fila = new Pessoa[100];
	
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;
		if (QtdDeElementos == 0) {
			this.ultima = this.primeira;
		}
		this.QtdDeElementos++;
	}
	
	
	public void adiciona(Object elemento){
		if (this.QtdDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		}else {
			Celula nova = new Celula(elemento);
			this.ultima.setProximo(nova);
			this.ultima = nova;
			this.QtdDeElementos++;
		}
	}
	
	
	
	public int removeDoComeco() {
		if (QtdDeElementos == 0) {
			System.out.println("sua lista esta vazia");
		}
		Celula proxima = this.primeira.getProximo();
		proxima.setAnterior(null);
		this.primeira = this.primeira.getProximo();
		
		this.QtdDeElementos--;
		
		if(this.QtdDeElementos == 0) {
			
			
			this.ultima = null;
		
	}
		return QtdDeElementos;
}
	
	public int tamanho () {
		if (QtdDeElementos == 0) {
			
			System.out.println("SUA LISTA ESTÁ VAZIA");
		}
		return this.QtdDeElementos;
	}
	
	public String toString() {
		if (this.QtdDeElementos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		
		for (int i = 0; i < this.QtdDeElementos - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();
			
		}
		
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}
	
	
	
}
