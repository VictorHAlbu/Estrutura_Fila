package br.com.fila;


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila lista = new Fila();
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		Pessoa pessoa5 = new Pessoa();
		
		
		pessoa1.setNome("Hugo");
		pessoa2.setNome("VH");
		pessoa3.setNome("Albuquerqque");
		pessoa4.setNome("Davi ");
		pessoa5.setNome("Lionel MEssi");
		
		lista.adiciona(pessoa1);
		System.out.println(lista);
		lista.adiciona(pessoa2);
		System.out.println(lista);
		lista.adiciona(pessoa3);
		System.out.println(lista);
		lista.adiciona(pessoa4);
		System.out.println(lista);
		lista.adiciona(pessoa5);
		System.out.println(lista);
		
		
		lista.removeDoComeco();
		System.out.println("Pessoa: "+ pessoa1+" Saiu da da fila");
		System.out.println(lista);
		lista.removeDoComeco();
		System.out.println("Pessoa: "+ pessoa2+" Saiu da da fila");
		System.out.println(lista);
		lista.removeDoComeco();
		lista.removeDoComeco();

		System.out.println(lista.tamanho());
		System.out.println(lista);
		
		System.out.println(lista.tamanho());
	}
}
