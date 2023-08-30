package aula16_Excecoes;

public class VerificaLetraFException extends Exception{
	

	@Override
	public String getMessage() {
		return "Não existe a letra F no texto";
	}
}
