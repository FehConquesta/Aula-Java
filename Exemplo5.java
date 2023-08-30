package aula16_Excecoes;


public class Exemplo5 {
	
	public void caixaAlta() throws NullPointerException{
		String frase = "fiap";
		String novaFrase = null;
		
		novaFrase = frase.toUpperCase();
		System.out.println("Frase Original: " + frase);
		System.out.println("Frase em caixa alta: " + novaFrase);
	}
	
	
	public static void main(String[] args) {
		Exemplo5 ex = new Exemplo5();
		
		try {
			ex.caixaAlta();
		} catch (NullPointerException e) {
			System.out.println("Ocorreu um NullPointerException ao executar o métodoExemplo5.caixaAlta()");
			e.printStackTrace();
		}
		
	}
}
