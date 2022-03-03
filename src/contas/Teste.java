package contas;

public class Teste {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente();
		joao.setNome("Joao");
		joao.setCpf("1078-87");
		joao.setEndereco("Acre");
		
        ContaCorrente ccJoao = new ContaCorrente();
        ccJoao.setTitular(joao);
        ccJoao.depositar(5000);
        ccJoao.sacar(500);
        ccJoao.extrato();
        
        System.out.println("---------");
		
		Cliente marcos = new Cliente();
		marcos.setNome("Marcos");
		marcos.setCpf("0864-56");
		marcos.setEndereco("Rondonia");
		
		ContaCorrente ccMarcos = new ContaCorrente();
		ccMarcos.setTitular(marcos);
		ccMarcos.depositar(2000);
		ccMarcos.sacar(200);
		ccMarcos.transferir(1000, ccJoao);
		ccMarcos.extrato();
		
		System.out.println();
		SomadorImposto somadorIposto = new SomadorImposto();
		somadorIposto.somaImposto(ccMarcos);
		somadorIposto.somaImposto(ccJoao);
		somadorIposto.totalImposto();
		


		
	}

}
