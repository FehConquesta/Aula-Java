package aula16_Excecoes;

import java.util.Random;

public class VerificarIdade {
	
	public void verifica(int num) {
		if(num < 10) {
			throw new ArithmeticException();
		}else {
			System.out.println("Acesso permitido");
		}
	}
	
	public static void main(String[] args) {
		VerificarIdade vi = new VerificarIdade();
		
		Random r = new Random();
		
		for(int i=0; i<100; i++) {
			try {
				int n = r.nextInt(50);
				vi.verifica(n);
			}catch (ArithmeticException e) {
				System.out.println("Acesso Negado!");
			}
		}
		
		
		
	}
}
