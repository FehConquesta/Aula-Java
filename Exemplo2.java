package aula16_Excecoes;

import java.util.Random;

public class Exemplo2 {
	
	public static void main(String[] args) {
		
		int a=0, b=0, c=0;
		Random r = new Random();
		
		for(int i=0; i<100; i++) {
			
			try {
				b = r.nextInt();
				c = r.nextInt();
				System.out.printf("b: %d | c: %d\n", b,c);
				a = 1234 / (b/c);
				System.out.println("A: " + a);
			} catch (ArithmeticException e) {
				System.out.println("ERRO - Exemplo2.main()");
				e.printStackTrace();
			}
			System.out.println("Fora do bloco try-catch");
		}
	}
}
