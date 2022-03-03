package funcionarios;

public class Gerente extends Funcionario implements ColaboradorAutenticavel {
	
	private GerenciadorSenha gerenciador;
	
	public Gerente() {
		this.gerenciador = new GerenciadorSenha();
	}
	

	@Override
	public void setSenha(int senha) {
	    this.gerenciador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.gerenciador.autentica(senha);

	}	
}
