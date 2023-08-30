package aula15_1_arrayObjetos;

public class GerenciadorContatosArrayList_Teste {
	public static void main(String[] args) {
	
		GerenciadorContatosArrayList gc = new GerenciadorContatosArrayList();
		gc.adicionar(new Contato("Silas", "123"));
		gc.adicionar(new Contato("Caique","321"));
		gc.adicionar(new Contato("Giulia", "543"));
		
		gc.mostrar();
		
		gc.remover(2);
		
		gc.mostrar();
	
	}
}
