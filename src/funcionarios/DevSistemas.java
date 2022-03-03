package funcionarios;
public class DevSistemas extends Funcionario implements FuncionarioBonificavel, ColaboradorAutenticavel {
	
	private GerenciadorSenha gerenciador;
	
	public DevSistemas() {
		this.gerenciador = new GerenciadorSenha();
	}

	@Override
	public double getBonificacao() {
		//System.out.println("chamando o metodo de bonificacao do dev.");
		return super.getSalario() * 0.2;
	}

	@Override
	public void setSenha(int senha) {
		this.gerenciador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		this.gerenciador.autentica(senha);
		return false;
	}

}
