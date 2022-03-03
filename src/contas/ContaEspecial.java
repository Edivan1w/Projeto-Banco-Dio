package contas;

public class ContaEspecial extends Conta implements ContasTributaveis {

	
	
	@Override
	public void sacar(double valor) {
		double novoValor = valor = 0.1;
		super.sacar(novoValor);
	}
	
	@Override
	public double getImposto() {
		return 10;
	}

}
