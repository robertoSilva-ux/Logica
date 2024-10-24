import java.util.Scanner;

public class Lista46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Digite um valor entre 1 e 10: ");
            valor = in.nextInt();

        } while (valor < 1|| valor > 10);

        System.out.println("O valor lido foi: " + valor);

        in.close();
    }

}