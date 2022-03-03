package contas;

public class ContaCorrente extends Conta implements ContasTributaveis{

	@Override
	public void sacar(double valor) {
		double novoValor = valor + 0.20;
		super.sacar(novoValor);
	}

	@Override
	public double getImposto() {
		return 20;
	}
}
