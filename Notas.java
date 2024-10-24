import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        float menorNota = 0;
        float maiorNota = 0;

        System.out.print("Digite a nota da primeira avaliação: ");
        float nota1 = sc.nextFloat();

        System.out.print("Digite a nota da segunda avaliação: ");
        float nota2 = sc.nextFloat();

        System.out.print("Digite a nota da avaliação optativa (-1 se não fez): ");
        float notaOptativa = sc.nextFloat();

        // Encontrar a menor nota entre as duas primeiras avaliações
        if (nota1 < nota2){
           
            menorNota = nota1;
            maiorNota = nota2;
        
        }else{

            menorNota = nota2;
            maiorNota = nota1;

        }

        // Se a nota optativa for válida, substitui a menor nota
        if (notaOptativa >= 0) {
            menorNota = notaOptativa;
        }

        // Calcular a média
        float media = (maiorNota+menorNota) / 2;

        // Verificar a situação do aluno
        if (media >= 6.0) {
            System.out.println("Aprovado! Média: " + media);
        } else if (media < 3.0) {
            System.out.println("Reprovado! Média: " + media);
        } else {
            System.out.println("Em exame! Média: " + media);
        }

        sc.close();
    }
}