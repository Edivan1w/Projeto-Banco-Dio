package funcionarios;

public class GerenciadorSenha {

	
	private int senha;

	
	public void setSenha(int senha) {
		this.senha = senha;	
	}

	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso permitido");
			return true;
		} else {
			System.out.println("Acesso negado");
			return false;
		}
		
	}
}
