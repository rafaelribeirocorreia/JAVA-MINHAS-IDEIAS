import java.util.Scanner;
public class Menu{
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Painel painel = new Painel();
		Banco banco = new Banco();
		Conta conta = null;
		
		int opcao = -1;

        while (opcao != 3) {
			
			painel.limparTela();
			painel.painelMenu();
            opcao = scan.nextInt();
            scan.nextLine();
		
			switch (opcao){
				case 1:
					painel.limparTela();
					conta = banco.criarConta();
				
					break;
				case 2:
				if (conta == null){
					painel.limparTela();
					System.out.println ("Não existem nem uma contra criada!");
					break;
				}else{			
					painel.limparTela();
					boolean login = banco.entraConta(conta);
					if (login){
						
						int opcaoConta = -1;
						while (opcaoConta != 5) {
							painel.limparTela();
							painel.painelConta(conta);
							opcaoConta = scan.nextInt();
							scan.nextLine();
							switch (opcaoConta)
							{
								case 1:
									painel.limparTela();
									painel.painelSaldo(conta);
									if (!banco.pixConfirm(conta)){
										System.out.println ("Sem saldo para o PIX!");
									}				
									break;
								case 2:
									painel.limparTela();
									painel.painelSaldo(conta);
									if (!banco.transferenciaConfirm(conta)){
										System.out.println ("Sem saldo para a TRANSFERENCIA!");
									}
									break;
								case 3:
									painel.limparTela();
									banco.contaVer(conta);						
									break;
								case 4:
									painel.limparTela();
									painel.painelCartao(conta);
									System.out.println();
									scan.nextLine();
									break;
								case 5:
									break;
							}
						}
					}else{
						System.out.println ("Nome ou Senha incorretas!");
					}
					
				}
				case 3:
					System.out.println ("\nTchau, Obrigado por usar o Banco SF");
						break;
			}
		}
	}
}


