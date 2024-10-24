import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor a ser sacado: ");
        int valor = sc.nextInt();
        
        // Notas disponíveis
        int[] notas = {100, 50, 20, 10, 5, 2};
        
        // Calcular a quantidade de notas
        for (int nota : notas) {
            int quantidadeNotas = valor / nota;
            valor %= nota;
            if (quantidadeNotas > 0) {
                System.out.println(quantidadeNotas + " nota(s) de R$ " + nota);
            }
        }
        
        sc.close();
    }
}