import java.util.Scanner;

public class Lista44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("a - Extrato");
            System.out.println("b - Saque");
            System.out.println("c - Depósito");
            System.out.println("d - Sair");

            char opcao = Character.toLowerCase(scanner.nextLine().charAt(0));

            switch (opcao) {
                case 'a':
                    System.out.printf("Saldo Atual: R$ %.2f%n", saldo);
                    break;
                case 'b':
                    System.out.print("Informe o valor do saque: R$ ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso.");
                    }
                    break;
                case 'c':
                    System.out.print("Informe o valor do depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case 'd':
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}