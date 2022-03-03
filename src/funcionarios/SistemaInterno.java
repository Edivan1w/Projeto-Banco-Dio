

package funcionarios;

public class SistemaInterno {

	private int senha = 2222;
	
	
	public void autentica(ColaboradorAutenticavel funcionario) {
		boolean autenticou = funcionario.autentica(this.senha);
		if(autenticou) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Acesso negado");
		}
	}
	
	
}
