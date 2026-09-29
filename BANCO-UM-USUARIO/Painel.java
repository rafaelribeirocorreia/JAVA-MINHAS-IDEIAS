
public class Painel{
	
	public static void limparTela() {
    try {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
    } catch (Exception e) {
        System.out.println("Não foi possível limpar a tela.");
    }
}
	
	public void painelMenu(){
		
		System.out.println("\n");
		System.out.println("=================================");
		System.out.println("          BANCO SF          ");
		System.out.println("=================================");
		System.out.println();
		System.out.println("        1 - Criar conta");
		System.out.println("        2 - Entrar");
		System.out.println("        3 - Sair");
		System.out.println();
		System.out.println("=================================");
		System.out.print("Digite uma opção: ");
    
	}
	
	public void painelConta(Conta conta){
		
		System.out.println("\n");
		System.out.println("=================================");
		System.out.println(" SF");
		System.out.println("=================================");
		System.out.println();
		System.out.println("            " + conta.getNome().split(" ")[0]);
		System.out.println();
		System.out.println("          R$ " + conta.getSaldo());
		System.out.println();
		System.out.println("=================================");
		System.out.println();
		System.out.println("        1 - PIX");
		System.out.println("        2 - Transferências");
		System.out.println("        3 - Conta");
		System.out.println("        4 - Cartão");
		System.out.println("        5 - Sair");
		System.out.println();
		System.out.println("=================================");
		System.out.print("Digite uma opção: ");
    
	}
	
	public void painelSaldo(Conta conta){
		
		System.out.println("\n");
		System.out.println("=================================");
		System.out.println(" SF");
		System.out.println("=================================");
		System.out.println();
		System.out.println("            Saldo");
		System.out.println();
		System.out.println("             R$ " + conta.getSaldo());
		System.out.println();
		System.out.println("=================================");
    
	}
	
	public void comprovantePix(Conta conta, double pix, String nomePix) {

		System.out.println();
		System.out.println("=================================");
		System.out.println(" SF");
		System.out.println("=================================");
		System.out.println();
		System.out.println("        PIX");
		System.out.println();
		System.out.println("De: " + conta.getNome());
		System.out.println("Valor:   R$ " + pix);
		System.out.println();
		System.out.println("Para: " + nomePix);
		System.out.println("        PIX REALIZADO");
		System.out.println();
		System.out.println("=================================");
		System.out.println("Pressione ENTER para voltar...");
		System.out.println("=================================");
	}
	
	public void comprovanteTransferencia (Conta conta, double transferencia, String nomeTranferencia){
		
		System.out.println();
		System.out.println("=================================");
		System.out.println(" SF");
		System.out.println("=================================");
		System.out.println();
		System.out.println("        TRANSFERÊNCIA");
		System.out.println();
		System.out.println("A transferência será realizada");
		System.out.println("em até 3 dias úteis.");
		System.out.println();
		System.out.println("De: " + conta.getNome());
		System.out.println("Valor:   R$ " + transferencia);
		System.out.println();
		System.out.println("Para: " + nomeTranferencia);
		System.out.println("        PIX REALIZADO");
		System.out.println();
		System.out.println("=================================");
		System.out.println("Pressione ENTER para voltar...");
		System.out.println("=================================");
    
	}
	
	public void contaInformacao (Conta conta, double pix, String nomePix, double transferencia, String nomeTranferencia){
		
		System.out.println();
		System.out.println("=================================");
		System.out.println(" SF");
		System.out.println("=================================");
		System.out.println();
		System.out.println("        INFORMAÇÕES DA CONTA");
		System.out.println();
		System.out.println("Titular: " + conta.getNome());
		System.out.println("Saldo:   R$ " + conta.getSaldo());
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Último PIX:");
		System.out.println("Para: " + nomePix);
		System.out.println("R$ " + pix);
		System.out.println();
		System.out.println("Última transferência:");
		System.out.println("Para: " + nomeTranferencia);
		System.out.println("R$ " + transferencia);
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("=================================");
		System.out.println("Pressione ENTER para voltar...");
		System.out.println("=================================");
		
	}
	
	public void painelCartao(Conta conta) {

		System.out.println();
		System.out.println("=================================");
		System.out.println(" SF");
		System.out.println("=================================");
		System.out.println();
		System.out.println("             CARTÃO");
		System.out.println();
		System.out.println("Titular: " + conta.getNome());
		System.out.println();
		System.out.println("Limite disponível:");
		System.out.println("R$ " + conta.getLimite());
		System.out.println();
		System.out.println("=================================");
		System.out.println("Pressione ENTER para voltar...");
		System.out.println("=================================");
		
	}
}

