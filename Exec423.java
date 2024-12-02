import java.util.Scanner;

public class Exec423 {
    public static void main(String[] args) {
        

        float massaInicial = 0, massaLimite, decaimento;
        int tempo = 0, segundos;
        decaimento = 0.25f;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe a massa inciail:");
        massaInicial = in.nextFloat();
        while (massaInicial > 0.10){

            massaInicial = massaInicial * (1-decaimento);
            tempo ++;
            System.out.println(massaInicial);
        }

        segundos = tempo * 30;
        System.out.println("O tempo para que a massa seja menor do que 10g é de " +segundos  + " segundos.");


    }


}








