package contas;

public class SomadorImposto {
	
	private double imposto;
	
	public double somaImposto(ContasTributaveis conta) {
		return this.imposto += conta.getImposto();
	}
	
	public void totalImposto() {
		System.out.println("Total de imposto somados: " + this.imposto);
	}

}
