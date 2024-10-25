import java.util.Scanner;

public class Lista411 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float dividendo, divisor = 0, quociente;


        System.out.println("informe o dividendo:");
        dividendo = in.nextFloat();

        while (divisor == 0){

            System.out.println("informe o divisor:");
            divisor = in.nextFloat();
            if (divisor == 0 ){

                System.out.println("Valor inválido:");
            }

        }

        quociente = dividendo / divisor;

        System.out.println("Quociente: " + quociente);
        



        in.close();
    }

}