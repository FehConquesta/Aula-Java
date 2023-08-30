package aula15_1_arrayObjetos;

import java.util.Scanner;

public class GerenciadorContatos {
	
	private Contato[] contatos; //declarando o array
	private Scanner input;
	
	//Construtor
	public GerenciadorContatos(int t) {
		System.out.println("Lista Criada: " + t + " elementos");
		System.out.println("=================================");
		
		contatos = new Contato[t]; //instanciando a lista contatos
	}
	
	
	public Contato criarContato() {
		System.out.println("*-*  Criando um Contato  *-*");
		System.out.println("=================================");
		input = new Scanner(System.in);
		
		//Entrada usuário
		System.out.println("Nome: ");
		String nome = input.next();
		System.out.println("Telefone: ");
		String telefone = input.next();
		
		Contato contato = new Contato(nome, telefone);
		return contato;
	}
	
	
	public void adicionarContatos() {
		System.out.println("*-*  Adicionando Contatos na Lista  *-*");
		System.out.println("=======================================");
		
		for(int i=0; i<contatos.length; i++) {
			//adicionando o Contato no vetor contatos
			contatos[i] = criarContato();
		}
	}
	
	
	public void mostrarContatos() {
		System.out.println("*-*  Mostrar os Contatos da Lista  *-*");
		System.out.println("=======================================");
		
		for(int i=0; i<contatos.length; i++) {
			
			System.out.println(contatos[i].toString());
			
//			System.out.println("Nome: " + contatos[i].getNome());
//			System.out.println("Telefone: " + contatos[i].getTelefone());
//			System.out.println("--------------------------------------");
		}
	}
	
	//TO DO
	// Criar um método para buscar um contato
	// Criar um método para apagar um contato
	
}
