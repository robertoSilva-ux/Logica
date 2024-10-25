import java.util.Scanner;

public class Lista412 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int multiplo = 1, divisor = 5;

        

        while ( !(multiplo % divisor == 0) ){


            System.out.println("Informe o valor a ser testado:");
            multiplo = in.nextInt();

        }




       
        



        in.close();
    }

}