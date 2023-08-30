package aula16_Excecoes;

import java.io.File;
import java.io.FileReader;

//Classe FileReader - leitor de dados de um arquivo
// Se o arquivo especificado não existir? Então, um FileNotFoundException ocorrerá


public class FileNotFound_Demo {
	public static void main(String[] args) {
		File file = new File("E://file.txt");
		FileReader fr = new FileReader(file);
		
		/* checked exceptions - checked by compiler (tempo de complicação)
		 * O compilador notifica com IOException, através do FileNotFoundException
		 * 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unhandled exception type FileNotFoundException

	at aula16_Excecoes.FileNotFound_Demo.main(FileNotFound_Demo.java:13)

		 */
		
		
		//-----------------
		//unchecked excepetions - ocorre em tempo de execução (Runtime Exceptions)
		// inclui: erros de programação, como erro de lógica ou uso impróprio de API
		// São ignorados em tempo de compilação
		//Exemplo: Declaração de um array de 5 posições e tentar chamar a posição 6
		// --> ArrayIndexOutOfBoundsException
		
		int[] num = {1, 2, 3};
		System.out.println(num[5]);
		
		/*
		 * Output:
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	at Exceptions.Unchecked_Demo.main(Unchecked_Demo.java:8)
		 */
		
		/*
		 * Não existe exceções para tudo
		 * Erros são geralmente ignorados porque raramente fazemos algo sobre um erro
		 * Exemplo: se um stack overflow ocorrer, um erro será lançado e ignorado em tempo de compilação
		 * 
		 */
		
		
		//Hierarquia de Exceções
		/*
		 * Todas as classes de exceções são subtipos de java.lang.Exception
		 * A classe Exception é uma subclasse da classe Throwable 
		 * Outras classes de Exception são subclasses de Error, que são derivadas da classe Throwable
		 * 
		 * Erros são condições anormais que ocorrem em caso de falhas severas e não são capturadas pelos programas JAva
		 *  - Normalmente gerados em tempo de execução (runtime environment)
		 *  - Exemplo: JVM está fora da memória, normalmente os progrmas não conseguem se recuperar de erros
		 *  
		 *  FIGURA - HIERARQUIA DE EXCEPTIONS
		 */
		
		
		
		//EXCEPTION METHODS
		
		
		
	}
}
