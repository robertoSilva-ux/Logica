package Logica;
import java.util.Scanner;

public class Lista44 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double saldo = 0, valor;
		char opcao = 'i';
		
		while (opcao != 'd' ) {
			
			System.out.println("Informe a opção desejada \n"
			 		+ "a - extato \n"
					+ "b - saque \n"
					+ "c - deposito\n"
					+ "d - sair");
			
			opcao = in.nextLine().charAt(0);
			
			
			if (opcao == 'a') { //extrato
		
				System.out.printf("Saldo Atual : R$ %.2f%n", saldo);
				
			} else if (opcao == 'b'){ //saque
				
				System.out.println("Informe o valor do saque");
				valor = in.nextDouble();
				saldo = saldo - valor;
				System.out.println("Contando as céduas ... Pronto!");	
				
				
			} else if (opcao == 'c') { //deposito
				
				System.out.println("Informe o valor depositado:");
				valor = in.nextDouble();
				saldo = saldo + valor;
				
				
			}else {
				
				System.out.println("opção inválida, tente outra vez.");
				
			}
			
			}	
		
		in.close();
		
	}

}
