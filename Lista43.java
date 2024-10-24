package Logica;
import java.util.Scanner;

public class Lista43 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numero, cont = 1, divisor = 0;
		
		
		System.out.println("Informe N, para testar se é primo");
		numero = in.nextInt();
		
		
		while (cont <= numero) {
				
			if (numero % cont == 0 ) {
			
				System.out.println(" tem divisão exata por " + cont);
				divisor ++;
				
			}
		
			cont++;
		}
		
		if (divisor <= 2) {
			
			System.out.println("é primo");
			
		} else {
			
			System.out.println("não é primo");

			
		}
		
	}

}
