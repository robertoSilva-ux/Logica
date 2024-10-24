import java.util.Scanner;
import java.util.Random;

public class teste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();

        int maiorPontuacao = 0, rodada = 0, escolha;
        boolean continuar = true;

        while (continuar) {
            rodada++;
            int vinteum = 0;
            System.out.println("Você é o jogador " + rodada);

            while (vinteum < 21) {
                System.out.println("1 - Parar, 2 - Baixa, 3 - Média, 4 - Alta");
                escolha = in.nextInt();

                if (escolha == 1) {
                    break;
                } else if (escolha == 2) {
                    vinteum += aleatorio.nextInt(5) + 1;
                } else if (escolha == 3) {
                    vinteum += aleatorio.nextInt(4) + 6;
                } else if (escolha == 4) {
                    vinteum += aleatorio.nextInt(4) + 10;
                } else {
                    System.out.println("Opção inválida.");
                }

                System.out.println("Sua pontuação atual: " + vinteum);
            }

            if (vinteum == 21) {
                System.out.println("Parabéns, jogador " + rodada + "! Você venceu!");
                continuar = false;
            } else if (vinteum > 21) {
                System.out.println("Você perdeu, jogador " + rodada + ".");
            } else {
                if (vinteum > maiorPontuacao) {
                    maiorPontuacao = vinteum;
                }
            }

            System.out.println("Novo Jogador? (1 - Sim, 0 - Não)");
            continuar = in.nextInt() == 1;
        }

        System.out.println("Fim do jogo.");
        System.out.println("A maior pontuação foi: " + maiorPontuacao);
        in.close();
    }   
}