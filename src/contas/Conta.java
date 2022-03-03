package contas;

public abstract class Conta {
	
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente tirular;
	
	private static final int AGENCIA = 1;
	private static int NUMERO = 1;
	
	public Conta() {
		this.agencia = AGENCIA;
		this.numero = NUMERO++;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Cliente getTirular() {
		return tirular;
	}
	
	public void setTitular(Cliente titular) {
		this.tirular = titular;
	}
	
	public void sacar(double valor) {
		if(this.saldo < valor) {
		   System.out.println("saldo insuficiente");
		} else {
			this.saldo -= valor;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(double valor, Conta destino) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	public void extrato() {
		System.out.println("========Nome: " + this.getTirular().getNome() + "=========");
		System.out.println("Agencia: " + this.getAgencia());
		System.out.println("Numero da conta: " + this.getNumero());
		System.out.println("Saldo: " + this.getSaldo());
		
	}

	
	
	
}
