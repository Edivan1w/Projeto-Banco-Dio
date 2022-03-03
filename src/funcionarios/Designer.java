package funcionarios;
public class Designer extends Funcionario implements FuncionarioBonificavel {
	
	
	@Override
	public double getBonificacao() {
		//System.out.println("chamando o metodo de bonificacao do designer.");
		return 100;
		
	}

}
