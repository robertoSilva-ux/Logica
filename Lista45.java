import java.util.Scanner;

public class Lista45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        double nota = 0, media = 0;
        
        while (i < 5){

            System.out.println("Informe a nota");
            nota = in.nextDouble();
            media += nota;
            i++;
        }

        System.out.printf(" Média final %.2f%n", media /= 5);
        in.close();
    }
}