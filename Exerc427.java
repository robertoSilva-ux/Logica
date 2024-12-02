import java.util.Scanner;

public class Exerc427 {
    public static void main(String[] args) {
        int numero, ciclos, dobro, soma, antecessor = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Infome um número e quantas vezes será processado");
        numero = in.nextInt();
        ciclos = in.nextInt();

        dobro = numero * 2;

        for (int i = 0; i < ciclos; i++){

            soma = antecessor + dobro;
            System.out.print("Dobro =  " + dobro + "\t Soma com antecessor = " + soma+ "\n");
            antecessor = dobro;
            dobro = dobro * 2;

        }

    in.close();
    }
    
}
