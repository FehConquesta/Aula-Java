package aula12_heranca;

import java.util.Date;

public class TestePessoa {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Aluno1", "123.123.123-23", new Date(), "rm123", "ADS", 1300);
		
		
		System.out.println("Aluno: " + aluno.toString() + "\nCurso: " + aluno.getCurso() + 
				"\nMensalidade: " + aluno.getMensalidade());
		
		aluno.getCpf();
		aluno.getNome();
		
		Pessoa p = new Pessoa("Pessoa1", "321.321.321.32", new Date());
		
	}
	
}
