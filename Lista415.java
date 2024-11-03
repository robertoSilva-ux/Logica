import java.util.Scanner;

public class Lista415 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int divisor = 0, numero, n = 1;
        
        System.out.println("Escreva um número:");
        numero = in.nextInt();

        while (n <= numero){
            if (numero % n == 0){
                divisor ++;
            }
        n++;
        }

        if (divisor == 2){
            System.out.println("é primo");
        } else {
            System.out.println("não é primo");
        }

        in.close();
    }

}