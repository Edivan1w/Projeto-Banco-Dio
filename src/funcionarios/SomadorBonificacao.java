package funcionarios;

public class SomadorBonificacao {
	
	private double somador;
	
	public void somaValorTotalBonificacao(FuncionarioBonificavel somador) {
	  this.somador = this.somador + somador.getBonificacao();
	}

	public double getValorTotalBonificacao() {
		return this.somador;
	}
}
