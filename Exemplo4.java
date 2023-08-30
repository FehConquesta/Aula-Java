package aula16_Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Exemplo4 {
	
	public static int calculaQuociente(int numerador, int denominador) 
			throws ArithmeticException{
		
		return numerador/denominador;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean continua = true;
		
		do {
			
			try {
				System.out.println("Numerador: ");
				int numerador = input.nextInt();
				
				System.out.println("Denominador: ");
				int denominador = input.nextInt();
				
				int resultado = calculaQuociente(numerador, denominador);
				System.out.println("Resultado: " + resultado);
				
				continua = false;
						
			}catch (ArithmeticException e) {
				System.err.println("Divisão por ZERO!");
				e.printStackTrace();
			}catch (InputMismatchException e) {
				System.err.println("Não é permitido inserir "
						+ "letras - insira um número!");
				input.next();
			}catch (NullPointerException e) {
				System.out.println("Objeto NULO");
			}finally {
				System.out.println("Fim do bloco try-catch");
			}
			
		}while(continua);
		
		input.close();
	}
	
}
