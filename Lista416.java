import java.util.Scanner;

public class Lista416 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, expo = 0 , expoente, resultado = 1;

        System.out.println("Informe um número e o expoente: ");
        numero = in.nextInt();
        expoente = in.nextInt();
        expo = expoente;
        if (expo == 0) {
            resultado = 1;
        } else {
            while (expo > 0){
                resultado *= numero;
                expo--;
            }
        }

        System.out.println(numero +"^"+expoente+" = " +resultado);

        in.close();
    }

}