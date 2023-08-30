package aula12_3_classeAbstrata;

import java.util.ArrayList;

/**
 * 
 * @author Fernando
 *
 *Classe utilizada para testar a Tela Kilometragem
 */

public class TesteTelaKm {

	public static void main(String[] args) {
		Tela tk = new TelaKilometragem();
		tk.imprimir();
		
		System.out.println("=======================");
		tk.imprimir();
	}
}
