package funcionarios;

public class Teste {

	public static void main(String[] args) {
		
		DevSistemas dev = new DevSistemas();
		dev.setNome("Edivan");
		dev.setCpf("9865-654");
		dev.setSalario(10000);
		dev.setSenha(2222);
		dev.autentica(2222);
		dev.informacoesFuncionario();
		
		System.out.println();
		System.out.println();
		Designer des = new  Designer();
		des.setNome("Marcos");
		des.setCpf("9865-854");
		des.setSalario(6000);;
		des.informacoesFuncionario();
		
		System.out.println();
		SomadorBonificacao somador = new SomadorBonificacao();
		somador.somaValorTotalBonificacao(des);
		somador.somaValorTotalBonificacao(dev);
		
		System.out.println(somador.getValorTotalBonificacao());
	}

}
