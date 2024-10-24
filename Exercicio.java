import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe 1 números: ");
        float numero = input.nextFloat();


        if (numero > 0){

            System.out.println("positivo");
        }

        else if (numero < 0) {

            System.out.println("negativo");
            
        }
        
        else {

            System.out.println("Zero");


        }
       
        input.close();

    } 

}