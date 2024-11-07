import java.util.Scanner;

public class Exec418 {
    public static void main(String[] args) {
        int idade = 1, maior = 0, menor = Integer.MAX_VALUE, quantidade = 0;
        float soma = 0, media = 0;
        Scanner in = new Scanner(System.in);

        while (idade != 0) {
            System.out.println("Informe a idade: (zero para sair)");
            idade = in.nextInt();

            if (idade > 0) { 
                soma += idade;
                quantidade++;

                if (idade > maior) {
                    maior = idade;
                }
                if (idade < menor) {
                    menor = idade;
                }
            }
        }

        if (quantidade > 0) { 
            media = soma / quantidade;
            System.out.println(quantidade + " idades foram informadas");
            System.out.println("A idade média foi " + media);
            System.out.println("A menor idade foi " + menor);
            System.out.println("A maior idade foi " + maior);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }

        in.close();
    }
}