package aula15_1_arrayObjetos;

import java.util.ArrayList;

/**
 * 
 * @author Fernando
 *
 * - Array dinâmico
 * - Pode ser alterado em tempo de execução
 * - Framework Collection
 * - Java.util
 */

public class GerenciadorContatosArrayList {

	private ArrayList<Contato> contatos; //declaração do ArrayList
	
	//Construtor
	public GerenciadorContatosArrayList() {
		System.out.println("Lista foi criada!");

		//instanciando o ArrayList
		contatos = new ArrayList<Contato>();
	}
	
	
	public void adicionar(Contato c) {
		contatos.add(c);
		System.out.println(c.getNome() + " adicinado na lista!");
	}
	
	public String remover(int i) {
		Contato c = contatos.get(i);
		contatos.remove(i);
		return c.getNome();
	}
	
	public Contato remover(Contato c) {
		contatos.remove(c);
		return c;
	}
	
	public void mostrar() {
		//foreach
		System.out.println("foreach");
		System.out.println("---------------");
		for (Contato contato : contatos) {
			System.out.println(contato.toString());
		}
		
		System.out.println("-----------------------");
		
		//for "tradicional"
		System.out.println("for tradicional");
		for(int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i).toString());
		}
	}
	
	/**
	 * TO DO
	 * - Criar um método para criar um Contato
	 * - Criar um método para atualizar um Contato
	 */
	
	
}
