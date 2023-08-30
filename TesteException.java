package aula16_Excecoes;

public class TesteException {

	public static void main(String[] args) {
		VerificaException ve = new VerificaException("fIAP");
		
		try {
			ve.verificaTexto();
		} catch (VerificaLetraFException e) {
			System.out.println("A letra F não existe na FRASE");
			e.printStackTrace();
			e.
		}
		
	}


}
