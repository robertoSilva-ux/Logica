import java.util.Scanner;

public class Exec419{
    public static void main(String[] args) {
        int termos, anterior = 1, posterior = 1, soma = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de termos: ");
        termos = in.nextInt();

        System.out.print(anterior + ", " + posterior + ", ");

        while ((termos - 2) > 0){

               soma = posterior + anterior;
               anterior = posterior;   
               posterior = soma;    
               System.out.print(soma +", ");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
               termos --; 
        }
        System.out.println("\n");    
    }
}