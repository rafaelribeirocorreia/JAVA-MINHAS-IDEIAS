import java.util.Scanner;
public class Banco{
	private Double transferencia;
	private String nomeTransferencia;
	private String nomePix;
	private Double pix;
	
	Scanner scan = new Scanner(System.in);
	Painel painel = new Painel();
	
	public Conta criarConta(){
		
		System.out.println("\n");
		System.out.println("=================================");
		System.out.println("          BANCO SF          ");
		System.out.println("=================================");
		System.out.print("\tNome: ");
		String nome = scan.nextLine();
		System.out.print("\tSenha: ");
		String senha = scan.nextLine();
		Double saldo = 1500.0;
		Double limite = saldo/3;
		return new Conta(saldo, nome, senha, limite);
		
	}
	
	public boolean entraConta(Conta conta){
		
		System.out.println("\n");
		System.out.println("=================================");
		System.out.println("          BANCO SF          ");
		System.out.println("=================================");
		System.out.print("\tNome: ");
		String nome = scan.nextLine();
		System.out.print("\tSenha: ");
		String senha = scan.nextLine();

		boolean nomeCorreto = nome.equalsIgnoreCase(conta.getNome());
		boolean senhaCorreta = senha.equals(conta.getSenha());

		return nomeCorreto && senhaCorreta;
	}
	
	public boolean pixConfirm(Conta conta){
	
		System.out.print("Pra quem: ");
		this.nomePix = scan.nextLine();
		System.out.print("Valor PIX: ");
		this.pix = scan.nextDouble();
		scan.nextLine();
		
		if (pix > conta.getSaldo()){
			return false;
		}else{
			conta.setSaldo(conta.getSaldo() - pix);
			painel.limparTela();
			painel.comprovantePix(conta, pix, nomePix);
			System.out.println();
			scan.nextLine();
			return true;
		}
	}
	
	public boolean transferenciaConfirm(Conta conta){
		
		System.out.print("Pra quem: ");
		this.nomeTransferencia = scan.nextLine();
		System.out.print("Valor Transferencia: ");
		this.transferencia = scan.nextDouble();
		scan.nextLine();
		
		if (transferencia > conta.getSaldo()){
			return false;
		}else{
			conta.setSaldo(conta.getSaldo() - transferencia);
			painel.limparTela();
			painel.comprovanteTransferencia(conta, transferencia, nomeTransferencia);
			System.out.println();
			scan.nextLine();
			return true;
		}
	}
	
	public void contaVer (Conta conta){
		
		painel.limparTela();
		painel.contaInformacao(conta, pix, nomePix, transferencia, nomeTransferencia);
		System.out.println();
		scan.nextLine();
		
	}
	
}


