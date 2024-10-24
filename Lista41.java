package Logica;
import java.util.Scanner;

public class Lista41 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n, cont = 0, soma = 0;
		
		
		System.out.println("Informe N, para calcular todas as somas");
		n = in.nextInt();
		
		
		while (n > cont) {
			cont++;
			soma = soma + cont;
			
		}
		
		System.out.println(soma);

	}

}
