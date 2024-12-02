import java.util.Scanner;

public class Lista421 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pares = 0, impares = 0, numero = 0, maior = 0, menor =Integer.MAX_VALUE, qtPar = 0, qtImpar = 0, mediaPar, mediaImpar;

        while (numero >= 0){
            System.out.println("Informe 1 número (negativo para sair): ");
            numero = in.nextInt();
            if (numero%2 == 0){
                pares += numero;
                qtPar++;
                if (numero > maior){
                    maior = numero;
                }
            } else if (numero > 0){
                impares +=numero;
                qtImpar++;
                if (numero < menor){
                    menor = numero;
                }
            }
        }

        mediaImpar = impares / qtImpar;
        mediaPar = pares / qtPar;
        System.out.println("A média dos impares é "+ mediaImpar);
        System.out.println("A média dos pares é " + mediaPar);
        System.out.println("O maior par foi "+maior + " e o menor impar foi "+menor);
    }  
}