import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número maior que 1: ");
        int numero = sc.nextInt();
        
        System.out.println("Fatores primos de " + numero + ":");
        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.print(i + " ");
                numero /= i;
            }
        }
        
        sc.close();
    }
}
