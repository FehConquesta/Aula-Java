package aula12_3_classeAbstrata;

public abstract class Tela {
	
	/**
	 * Classe abstrata que possui os métodos básicos para
	 * as telas do computador de bordo de um veículo
	 */
	
	private String titulo;
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	//método abstrato obterInformação
	public abstract String obterInformacao();
	
	public void imprimir() {
		System.out.println(this.titulo);
		System.out.println("\t" + obterInformacao());
	}
}
