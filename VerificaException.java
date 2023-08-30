package aula16_Excecoes;

public class VerificaException {
	
	private String texto;
	
	public VerificaException(String t) {
		this.texto = t;
	}
	
	public void verificaTexto() throws VerificaLetraFException{
		if(!texto.contains("F") && !texto.contains("f")) {
			throw new VerificaLetraFException();
		}else {
			System.out.println("Nenhum erro encontrado!");
		}
	}
	
}
