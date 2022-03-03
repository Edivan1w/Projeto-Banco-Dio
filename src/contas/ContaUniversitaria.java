package contas;

public class ContaUniversitaria extends Conta implements ContasTributaveis{

	
	
	@Override
	public void sacar(double valor) {
		double novoValor = valor + 0.02;
		super.sacar(novoValor);
	}
	
	@Override
	public double getImposto() {
		return 4;
	}

}
