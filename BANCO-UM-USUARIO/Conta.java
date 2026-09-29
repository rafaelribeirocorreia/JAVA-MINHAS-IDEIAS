public class Conta{
	
	private Double saldo;
	private String nome;
	private String senha;
	private Double limite;
	
	public Conta(Double saldo, String nome, String senha, Double limite) {
		this.saldo = 1500.0;
		this.nome = nome;
		this.senha = senha;
		this.limite = saldo / 3;
	}
	
	public Double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(Double saldo){
		this.saldo = saldo;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getSenha(){
		return senha;
	}
	
	public void setSenha(String senha){
		this.senha = senha;
	}
	
	public Double getLimite(){
		return limite;
	}
	
	public void setLimite(Double limite){
		this.limite = limite;
	}
}

