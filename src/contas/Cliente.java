package contas;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endereco;
	private int numeroDeClientes;
	
	private static int NUMERO_CLIENTE = 1;
	
	public Cliente() {
		this.numeroDeClientes = NUMERO_CLIENTE++;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	

}
