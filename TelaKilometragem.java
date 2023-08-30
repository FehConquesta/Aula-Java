package aula12_3_classeAbstrata;

/**
 * 
 * @author Fernando
 * Tela que mostra a kilometragem percorrida por um veículo
 *
 */

public class TelaKilometragem extends Tela{
	
	/* Atributo que guarda o valor da km do veículo */
	int km = 0;
	
	/**
	 * Construtor que inicializa o título da tela
	 */
	
	public TelaKilometragem() {
		super.setTitulo("Km atual");
	}
	
	
	/**
	 * Implementa o método abstrato obterInformacao da classe Tela
	 * Neste método buscaremos a km atual do veículo
	 */
	
	@Override
	public String obterInformacao() {
		km += 10;
		return String.valueOf(km) + "km";
	}

}
